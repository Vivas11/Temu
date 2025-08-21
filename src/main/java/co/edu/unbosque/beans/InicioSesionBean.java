
/**
 * Paquete que contiene los beans para la gestión de la sesión de usuario.
 */
package co.edu.unbosque.beans;


import java.io.Serializable;

import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 * Bean para el inicio de sesión de usuarios en la aplicación Temu.
 * Permite gestionar el proceso de autenticación y mantiene los datos de usuario.
 */
@Named(value = "loginbean")
@RequestScoped
public class InicioSesionBean implements Serializable {
	/**
	 * Identificador de versión para la serialización.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Nombre de usuario ingresado por el usuario.
	 */
	private String usuario;
	/**
	 * Contraseña ingresada por el usuario.
	 */
	private String contrasena;
	/**
	 * Servicio para la gestión de usuarios y autenticación.
	 */
	private UsuarioService usuarioService;
	
	/**
	 * Constructor que inicializa el servicio de usuario.
	 */
	public InicioSesionBean() {
		usuarioService = new UsuarioService();
	}
	
	/**
	 * Obtiene el nombre de usuario ingresado.
	 * @return nombre de usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Establece el nombre de usuario ingresado.
	 * @param usuario nombre de usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Obtiene la contraseña ingresada.
	 * @return contraseña
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Establece la contraseña ingresada.
	 * @param contrasena contraseña
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * Obtiene el servicio de usuario.
	 * @return servicio de usuario
	 */
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	/**
	 * Establece el servicio de usuario.
	 * @param usuarioService servicio de usuario
	 */
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	/**
	 * Inicia el proceso de autenticación del usuario.
	 * @return página principal si la autenticación es exitosa, null en caso contrario
	 */
	public String iniciarSesion() {
		if (usuarioService.iniciarSesion(new UsuarioDTO(usuario, contrasena, null, usuario, usuario, contrasena, contrasena))) {
			return "principal?faces-redirect=true";
		}
		return null;
	}
	
}

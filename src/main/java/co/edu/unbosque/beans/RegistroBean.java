/**
 * Paquete que contiene los beans para la gestión de registro de usuarios.
 */
package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.Date;

import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

/**
 * Bean para la gestión del registro de usuarios.
 */
@Named(value = "registrobean")
@RequestScoped
public class RegistroBean implements Serializable {
	/** Identificador de versión para la serialización */
	private static final long serialVersionUID = 1L;
	/** Nombre del usuario a registrar */
	private String nombre;
	/** Apellido del usuario a registrar */
	private String apellido;
	/** Fecha de nacimiento del usuario a registrar */
	private Date fechaDeNacimiento;
	/** Nombre de usuario a registrar */
	private String nombreUsuario;
	/** Correo electrónico a registrar */
	private String correo;
	/** Contraseña a registrar */
	private String contrasena;
	/** Confirmación de contraseña */
	private String contrasena2;
	/** Dirección a registrar */
	private String direccion;

	/** Servicio de usuario para operaciones de registro */
	private UsuarioService usuarioService;

	/**
	 * Constructor. Inicializa el servicio de usuario.
	 */
	public RegistroBean() {
		usuarioService = new UsuarioService();
	}

	/**
	 * Registra un nuevo usuario con los datos proporcionados.
	 * @return redirección si el registro es exitoso, null si falla
	 */
	public String registrarUsuario() {
		if (!contrasena.equals(contrasena2) || fechaDeNacimiento.after(new Date())) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Las contraseñas no coinciden o la fecha no es valida", null));
			return null;
		}

		UsuarioDTO nuevo = new UsuarioDTO(nombre, apellido, fechaDeNacimiento, nombreUsuario, correo, contrasena,
				direccion);

		if (usuarioService.registrar(nuevo)) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro exitoso", null));
			return "index?faces-redirect=true";
		}

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al registrar usuario", null));
		return null;
	}

	/**
	 * Obtiene el nombre del usuario.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del usuario.
	 * @param nombre Nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el apellido del usuario.
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Establece el apellido del usuario.
	 * @param apellido Apellido a establecer
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Obtiene la fecha de nacimiento del usuario.
	 * @return fechaDeNacimiento
	 */
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * Establece la fecha de nacimiento del usuario.
	 * @param fechaDeNacimiento Fecha a establecer
	 */
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * Obtiene el nombre de usuario.
	 * @return nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Establece el nombre de usuario.
	 * @param nombreUsuario Nombre de usuario a establecer
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * Obtiene el correo electrónico.
	 * @return correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Establece el correo electrónico.
	 * @param correo Correo a establecer
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Obtiene la contraseña.
	 * @return contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Establece la contraseña.
	 * @param contrasena Contraseña a establecer
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * Obtiene la dirección.
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece la dirección.
	 * @param direccion Dirección a establecer
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Obtiene el servicio de usuario.
	 * @return UsuarioService
	 */
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	/**
	 * Establece el servicio de usuario.
	 * @param usuarioService Servicio a establecer
	 */
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	/**
	 * Obtiene la confirmación de contraseña.
	 * @return contrasena2
	 */
	public String getContrasena2() {
		return contrasena2;
	}

	/**
	 * Establece la confirmación de contraseña.
	 * @param contrasena2 Confirmación de contraseña a establecer
	 */
	public void setContrasena2(String contrasena2) {
		this.contrasena2 = contrasena2;
	}
	
	public Date getFechaMaxima() {
	    return new Date(2025, 8, 21); // Devuelve la fecha actual
	}
}

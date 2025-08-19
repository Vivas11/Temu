package co.edu.unbosque.beans;


import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

//indica que es un bean
@Named(value = "loginbean")
@RequestScoped
public class InicioSesionBean {
	private String usuario;
	private String contrasena;
	
	private UsuarioService usuarioService;
	
	public InicioSesionBean() {
		usuarioService = new UsuarioService();
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	public String iniciarSesion() {
		if (usuarioService.iniciarSesion(new UsuarioDTO(usuario, contrasena, null, usuario, usuario, contrasena, contrasena))) {
			return "principal?faces-redirect=true";
		}
		return null;
	}
	
}

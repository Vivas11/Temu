package co.edu.unbosque.beans;

import java.util.Date;

import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

//indica que es un bean
@Named(value = "templatebean")

//ciclo de vida
@RequestScoped
public class TemplateBean {
	Boolean sesionIniciada;
	
	private UsuarioService usuarioService;
	
	public TemplateBean() {
		usuarioService = new UsuarioService();
		sesionIniciada = usuarioService.loggedIn();
	}

	public Boolean getSesionIniciada() {
		return sesionIniciada;
	}

	public void setSesionIniciada(Boolean sesionIniciada) {
		this.sesionIniciada = sesionIniciada;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
}

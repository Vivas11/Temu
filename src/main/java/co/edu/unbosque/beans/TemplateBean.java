package co.edu.unbosque.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

//indica que es un bean
@Named(value = "templatebean")

//ciclo de vida
@RequestScoped
public class TemplateBean implements Serializable {
	private static final long serialVersionUID = 1L;

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
	public String cerrarSesion() {
		System.out.println("a");
        System.out.println(ModelFacade.usuarioActual);
        ModelFacade.usuarioActual = null;
        System.out.println(ModelFacade.usuarioActual);
        return "/index.xhtml?faces-redirect=true";
    }

}

/**
 * Paquete que contiene los beans para la gestión de la plantilla y navegación global.
 */
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

/**
 * Bean para la gestión de la plantilla y navegación global.
 */
@Named(value = "templatebean")
@RequestScoped
public class TemplateBean implements Serializable {
	/** Identificador de versión para la serialización */
	private static final long serialVersionUID = 1L;

	/** Indica si la sesión está iniciada */
	private Boolean sesionIniciada;

	/** Servicio de usuario para operaciones globales */
	private UsuarioService usuarioService;

	/**
	 * Constructor. Inicializa el estado de la sesión y el servicio de usuario.
	 */
	public TemplateBean() {
		usuarioService = new UsuarioService();
		sesionIniciada = usuarioService.loggedIn();
	}

	/**
	 * Obtiene si la sesión está iniciada.
	 * @return true si la sesión está iniciada
	 */
	public Boolean getSesionIniciada() {
		return sesionIniciada;
	}

	/**
	 * Establece el estado de la sesión.
	 * @param sesionIniciada true si la sesión está iniciada
	 */
	public void setSesionIniciada(Boolean sesionIniciada) {
		this.sesionIniciada = sesionIniciada;
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
	 * @param usuarioService Servicio de usuario a establecer
	 */
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	/**
	 * Cierra la sesión del usuario actual y redirige al index.
	 * @return URL de redirección
	 */
	public String cerrarSesion() {
		// Elimina la sesión del usuario actual
		ModelFacade.usuarioActual = null;
		return "/index.xhtml?faces-redirect=true";
	}
}

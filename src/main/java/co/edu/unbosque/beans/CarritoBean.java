package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.service.ArticuloService;
import co.edu.unbosque.service.UsuarioService;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
@Named(value = "carritobean")
@ViewScoped
public class CarritoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	ArticuloService articuloService;
	UsuarioService usuarioService;
	
	int precioTotal;

	public CarritoBean() {
		articuloService = new ArticuloService();
		usuarioService = new UsuarioService();
	}
	
	public List<Articulo> getArticulos() {
		return ModelFacade.usuarioActual.getCarrito().getArticulosCarrito();
	}


	public void eliminarDelCarrito(Articulo art) {
		if (ModelFacade.usuarioActual == null) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Atencion",
					"Se debe iniciar sesion antes de continuar");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
			articuloService.eliminarDelCarrito(art);
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Producto añadido",
					art.getNombre() + " se eliminó del carrito.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

	}
	
	public void comprar() {
		if (!ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().isEmpty()) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Compra realizada",
					 " se realizó la compra por " + getPrecioTotal() + " pesos");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			usuarioService.realizarCompra();
		}
	}

	public ArticuloService getArticuloService() {
		return articuloService;
	}

	public void setArticuloService(ArticuloService articuloService) {
		this.articuloService = articuloService;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public float getPrecioTotal() {
		float p = 0;
		for (Articulo articulo : getArticulos()) {
			p+= articulo.getPrecio();
		}
		return p;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}

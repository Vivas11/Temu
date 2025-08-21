/**
 * Paquete que contiene los beans para la gestión del carrito de compras.
 */
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
/**
 * Bean para la gestión del carrito de compras del usuario.
 */
public class CarritoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** Servicio para operaciones sobre artículos */
	ArticuloService articuloService;
	/** Servicio para operaciones sobre usuario */
	UsuarioService usuarioService;
	/** Precio total del carrito */
	int precioTotal;

	/**
	 * Constructor. Inicializa los servicios de artículo y usuario.
	 */
	public CarritoBean() {
		articuloService = new ArticuloService();
		usuarioService = new UsuarioService();
	}
	
	/**
	 * Obtiene la lista de artículos en el carrito del usuario actual.
	 * @return lista de artículos
	 */
	public List<Articulo> getArticulos() {
		return ModelFacade.usuarioActual.getCarrito().getArticulosCarrito();
	}


	/**
	 * Elimina un artículo del carrito del usuario actual.
	 * @param art Artículo a eliminar
	 */
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
	
	/**
	 * Realiza la compra de los artículos en el carrito.
	 */
	public void comprar() {
		if (!ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().isEmpty()) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Compra realizada",
					 " se realizó la compra por " + getPrecioTotal() + " pesos");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			usuarioService.realizarCompra();
		}
	}

	/**
	 * Obtiene el servicio de artículo.
	 * @return ArticuloService
	 */
	public ArticuloService getArticuloService() {
		return articuloService;
	}

	/**
	 * Establece el servicio de artículo.
	 * @param articuloService Servicio a establecer
	 */
	public void setArticuloService(ArticuloService articuloService) {
		this.articuloService = articuloService;
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
	 * Obtiene el precio total de los artículos en el carrito.
	 * @return precio total
	 */
	public float getPrecioTotal() {
		float p = 0;
		for (Articulo articulo : getArticulos()) {
			p+= articulo.getPrecio();
		}
		return p;
	}

	/**
	 * Establece el precio total del carrito.
	 * @param precioTotal Precio total a establecer
	 */
	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
    
}

/**
 * Paquete que contiene los beans para la gestión del historial de compras.
 */
package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.service.ArticuloService;
import co.edu.unbosque.service.UsuarioService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
@Named(value = "historialbean")
@ViewScoped
/**
 * Bean para la gestión del historial de compras del usuario.
 */
public class HistorialBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** Servicio para operaciones sobre artículos */
	ArticuloService articuloService;
	/** Servicio para operaciones sobre usuario */
	UsuarioService usuarioService;
	

	/**
	 * Constructor. Inicializa los servicios de artículo y usuario.
	 */
	public HistorialBean() {
		articuloService = new ArticuloService();
		usuarioService = new UsuarioService();
	}
	
	/**
	 * Obtiene la lista de carritos del historial de compras del usuario actual.
	 * @return lista de carritos
	 */
	public ArrayList<Carrito> getCarritos() {
		return ModelFacade.usuarioActual.getHistorialCompras();
	}
	
	/**
	 * Obtiene la lista de artículos de un carrito específico.
	 * @param car Carrito del que se obtienen los artículos
	 * @return lista de artículos
	 */
	public ArrayList<Articulo> getArticulos(Carrito car){
		return car.getArticulosCarrito();
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
    
}

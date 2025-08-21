/**
 * Paquete que contiene los servicios para la gestión de artículos y operaciones relacionadas.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.ModelFacade;

/**
 * Servicio para operaciones sobre artículos, como añadir y eliminar del carrito.
 */
public class ArticuloService {
	/**
	 * Constructor por defecto.
	 */
	public ArticuloService() {
		// Constructor vacío
	}
	/**
	 * Añade un artículo al carrito del usuario actual.
	 * @param art Artículo a añadir
	 */
	public void anadirAlCarrito(Articulo art) {
		ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().add(art);
	}
	
	/**
	 * Elimina un artículo del carrito del usuario actual.
	 * @param art Artículo a eliminar
	 */
	public void eliminarDelCarrito(Articulo art) {
		ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().remove(art);
	}
}

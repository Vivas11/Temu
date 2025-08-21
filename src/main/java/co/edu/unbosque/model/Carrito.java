
/**
 * Paquete que contiene las clases del modelo de artículos y carrito de compras.
 */
package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * Clase que representa el carrito de compras de un usuario en la aplicación Temu.
 * Permite almacenar y gestionar los artículos seleccionados para la compra.
 */
public class Carrito {
	/**
	 * Lista de artículos que forman parte del carrito de compras.
	 */
	private ArrayList<Articulo> articulosCarrito = new ArrayList<>();
	
	/**
	 * Constructor por defecto que inicializa la lista de artículos del carrito.
	 */
	public Carrito() {
		articulosCarrito = new ArrayList<>();
	}

	/**
	 * Obtiene la lista de artículos en el carrito.
	 * @return lista de artículos
	 */
	public ArrayList<Articulo> getArticulosCarrito() {
		return articulosCarrito;
	}

	/**
	 * Establece la lista de artículos en el carrito.
	 * @param articulosCarrito lista de artículos
	 */
	public void setArticulosCarrito(ArrayList<Articulo> articulosCarrito) {
		this.articulosCarrito = articulosCarrito;
	}
	
	
}

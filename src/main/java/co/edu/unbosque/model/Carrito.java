package co.edu.unbosque.model;

import java.util.ArrayList;

public class Carrito {
	private ArrayList<Articulo> articulosCarrito;
	
	public Carrito() {
		articulosCarrito = new ArrayList<>();
	}

	public ArrayList<Articulo> getArticulosCarrito() {
		return articulosCarrito;
	}

	public void setArticulosCarrito(ArrayList<Articulo> articulosCarrito) {
		this.articulosCarrito = articulosCarrito;
	}
	
	
}

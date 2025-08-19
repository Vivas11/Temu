package co.edu.unbosque.service;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.ModelFacade;

public class ArticuloService {
	public ArticuloService() {
		// TODO Auto-generated constructor stub
	}
	public void anadirAlCarrito(Articulo art) {
		ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().add(art);
	}
	
	public void eliminarDelCarrito(Articulo art) {
		ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().remove(art);
	}
}

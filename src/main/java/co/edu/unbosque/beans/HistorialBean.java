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
public class HistorialBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	ArticuloService articuloService;
	UsuarioService usuarioService;
	

	public HistorialBean() {
		articuloService = new ArticuloService();
		usuarioService = new UsuarioService();
	}
	
	public ArrayList<Carrito> getCarritos() {
		return ModelFacade.usuarioActual.getHistorialCompras();
	}
	
	public ArrayList<Articulo> getArticulos(Carrito car){
		return car.getArticulosCarrito();
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
	
	
}

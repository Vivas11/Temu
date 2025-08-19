package co.edu.unbosque.service;

import java.util.ArrayList;

import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.UsuarioDTO;

public class UsuarioService {
	
	
	
	public UsuarioService() {
	}
	
	public boolean registrar(UsuarioDTO nuevo) {
		return ModelFacade.usuarioDAO.add(nuevo);
	}
	
	public boolean iniciarSesion(UsuarioDTO usuario) {
		System.out.println("NotLoggedIn");
		if(ModelFacade.usuarioDAO.encontrarUsuario(usuario.getNombre(), usuario.getContrasena()) != null) {
			ModelFacade.usuarioActual = ModelFacade.usuarioDAO.encontrarUsuario(usuario.getNombre(), usuario.getContrasena());
			System.out.println("LoggedIn");
			return true;
		}
		return false;
	}
	
	public Boolean loggedIn() {
		return (ModelFacade.usuarioActual != null);
	}
	
	public void realizarCompra() {
		Carrito carritoHistorial = new Carrito();
	    carritoHistorial.setArticulosCarrito(
	        new ArrayList<>(ModelFacade.usuarioActual.getCarrito().getArticulosCarrito())
	    );
		
		ModelFacade.usuarioActual.getHistorialCompras().add(carritoHistorial);
		ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().clear();
	}
}

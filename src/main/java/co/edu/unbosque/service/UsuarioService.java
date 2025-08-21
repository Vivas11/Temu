package co.edu.unbosque.service;

import java.util.ArrayList;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.util.mail.MailService;

public class UsuarioService {

	private MailService ms;

	public UsuarioService() {
	}

	public boolean registrar(UsuarioDTO nuevo) {
		return ModelFacade.usuarioDAO.add(nuevo);
	}

	public boolean iniciarSesion(UsuarioDTO usuario) {
		System.out.println("NotLoggedIn");
		if (ModelFacade.usuarioDAO.encontrarUsuario(usuario.getNombre(), usuario.getContrasena()) != null) {
			ModelFacade.usuarioActual = ModelFacade.usuarioDAO.encontrarUsuario(usuario.getNombre(),
					usuario.getContrasena());
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
		carritoHistorial
				.setArticulosCarrito(new ArrayList<>(ModelFacade.usuarioActual.getCarrito().getArticulosCarrito()));

		ModelFacade.usuarioActual.getHistorialCompras().add(carritoHistorial);

		String txt = "";
		txt+=("RECIBO DE COMPRA\n");
		txt+=("Gracias por comprar en TIMO\n\n");
		for (Articulo a : carritoHistorial.getArticulosCarrito()) {
			txt+=((a.getNombre())+(": ")+(a.getPrecio())+(" $COP\n"));
		}
		ms = new MailService();
		ms.createEmail(ModelFacade.usuarioActual.getCorreo(), "Compra en Timo", txt);
		ms.sendEmail();
		// Vaciar carrito
		ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().clear();
	}
}

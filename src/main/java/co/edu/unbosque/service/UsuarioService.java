/**
 * Paquete que contiene los servicios para la gestión de usuarios.
 */
package co.edu.unbosque.service;

import java.util.ArrayList;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.util.mail.MailService;

/**
 * Servicio para operaciones sobre usuarios: registro, inicio de sesión, compras, etc.
 */
public class UsuarioService {

	/** Servicio de correo para notificaciones y recibos de compra */
	private MailService ms;

	/**
	 * Constructor por defecto.
	 */
	public UsuarioService() {
	}

	/**
	 * Registra un nuevo usuario en la base de datos.
	 * @param nuevo UsuarioDTO a registrar
	 * @return true si el registro fue exitoso
	 */
	public boolean registrar(UsuarioDTO nuevo) {
		return ModelFacade.usuarioDAO.add(nuevo);
	}

	/**
	 * Inicia sesión con el usuario especificado.
	 * @param usuario UsuarioDTO con credenciales
	 * @return true si el inicio de sesión fue exitoso
	 */
	public boolean iniciarSesion(UsuarioDTO usuario) {
		// NotLoggedIn
		if (ModelFacade.usuarioDAO.encontrarUsuario(usuario.getNombre(), usuario.getContrasena()) != null) {
			ModelFacade.usuarioActual = ModelFacade.usuarioDAO.encontrarUsuario(usuario.getNombre(),
					usuario.getContrasena());
			// LoggedIn
			return true;
		}
		return false;
	}

	/**
	 * Verifica si hay un usuario logueado actualmente.
	 * @return true si hay usuario logueado
	 */
	public Boolean loggedIn() {
		return (ModelFacade.usuarioActual != null);
	}

	/**
	 * Realiza la compra actual, guarda el historial y envía el recibo por correo.
	 */
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

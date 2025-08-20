package co.edu.unbosque.service;

import java.util.ArrayList;
import java.util.Properties;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.UsuarioDTO;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class UsuarioService {// Datos de Mailtrap
	private final String username = "api"; // o smtp@mailtrap.io según la credencial
	private final String password = "TU_API_TOKEN"; // cambia por tu token
	private final String host = "live.smtp.mailtrap.io";
	private final String from = "no-reply@timo.com"; // puede ser cualquiera, ej: ventas@timo.com

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

		StringBuilder txt = new StringBuilder();
		txt.append("RECIBO DE COMPRA\n");
		txt.append("Gracias por comprar en TIMO\n\n");
		for (Articulo a : carritoHistorial.getArticulosCarrito()) {
			txt.append(a.getNombre()).append(": ").append(a.getPrecio()).append(" $COP\n");
		}

		// Configuración SMTP Mailtrap
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true"); // STARTTLS
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		// Crear la sesión
		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Crear mensaje
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(ModelFacade.usuarioActual.getCorreo()));
			message.setSubject("Compra en TIMO");
			message.setText(txt.toString());

			// Enviar
			Transport.send(message);
			System.out.println("Email enviado exitosamente con Mailtrap!");

		} catch (MessagingException e) {
			throw new RuntimeException("Error al enviar correo: " + e.getMessage(), e);
		}

		// Vaciar carrito
		ModelFacade.usuarioActual.getCarrito().getArticulosCarrito().clear();
	}
}

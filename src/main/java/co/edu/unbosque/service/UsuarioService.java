package co.edu.unbosque.service;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.UsuarioDTO;

public class UsuarioService {
	
	public UsuarioService() {
	}
	
	public void registrar(UsuarioDTO nuevo) {
		ModelFacade.usuarioDAO.add(nuevo);
	}
	
	public void iniciarSesion(UsuarioDTO usuario) {
		System.out.println("NotLoggedIn");
		if(ModelFacade.usuarioDAO.encontrarUsuario(usuario.getNombre(), usuario.getContrasena()) != null) {
			ModelFacade.usuarioActual = ModelFacade.usuarioDAO.encontrarUsuario(usuario.getNombre(), usuario.getContrasena());
			System.out.println("LoggedIn");
		}
	}
}

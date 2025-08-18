package co.edu.unbosque.beans;

import java.util.Date;

import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

//indica que es un bean
@Named(value = "registrobean")

//ciclo de vida
@RequestScoped
public class RegistroBean {
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private String nombreUsuario;
	private String correo;
	private String contrasena;
	private String contrasena2;
	private String direccion;
	
	private UsuarioService usuarioService;
	
	public RegistroBean() {
		usuarioService = new UsuarioService();
	}
	
	public void registrarUsuario() {
		UsuarioDTO nuevo = new UsuarioDTO(nombre, apellido, fechaDeNacimiento, nombreUsuario, correo, contrasena, direccion);  
		usuarioService.registrar(nuevo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public String getContrasena2() {
		return contrasena2;
	}

	public void setContrasena2(String contrasena2) {
		this.contrasena2 = contrasena2;
	}
	
}

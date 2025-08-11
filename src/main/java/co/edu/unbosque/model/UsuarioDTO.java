package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.Date;

public class UsuarioDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private String nombreUsuario;
	private String correo;
	private String contrasena;
	private String direccion;
	
	
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}


	public UsuarioDTO(String nombre, String apellido, Date fechaDeNacimiento, String nombreUsuario, String correo, String contrasena,
			String direccion) {
		super();
		Nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nombreUsuario = nombreUsuario;
		this.correo = correo;
		this.contrasena = contrasena;
		this.direccion = direccion;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
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


	public void setEdad(Date fechaDeNacimiento) {
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


	@Override
	public String toString() {
		return "Usuario [Nombre=" + Nombre + ", apellido=" + apellido + ", Fecha de Nacimiento=" + fechaDeNacimiento + ", nombreUsuario="
				+ nombreUsuario + ", correo=" + correo + ", contrasena=" + contrasena + ", direccion=" + direccion
				+ "]";
	}
	
	
	
	

}

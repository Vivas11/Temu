package co.edu.unbosque.beans;

public class Usuario {
	private String Nombre;
	private String apellido;
	private int edad;
	private String nombreUsuario;
	private String correo;
	private String contrasena;
	private String direccion;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(String nombre, String apellido, int edad, String nombreUsuario, String correo, String contrasena,
			String direccion) {
		super();
		Nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
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
		return "Usuario [Nombre=" + Nombre + ", apellido=" + apellido + ", edad=" + edad + ", nombreUsuario="
				+ nombreUsuario + ", correo=" + correo + ", contrasena=" + contrasena + ", direccion=" + direccion
				+ "]";
	}
	
	
	
	

}

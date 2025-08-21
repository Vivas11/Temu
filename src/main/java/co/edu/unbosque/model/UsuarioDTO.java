
/**
 * Paquete que contiene las clases del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que representa un usuario del sistema (DTO).
 * Implementa Serializable para permitir la serialización de sus objetos.
 */
public class UsuarioDTO implements Serializable {
	/**
	 * 
	 */
	/**
	 * Identificador de versión para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Nombre del usuario.
	 */
	private String nombre;

	/**
	 * Apellido del usuario.
	 */
	private String apellido;

	/**
	 * Fecha de nacimiento del usuario.
	 */
	private Date fechaDeNacimiento;

	/**
	 * Nombre de usuario para el login.
	 */
	private String nombreUsuario;

	/**
	 * Correo electrónico del usuario.
	 */
	private String correo;

	/**
	 * Contraseña del usuario.
	 */
	private String contrasena;

	/**
	 * Dirección del usuario.
	 */
	private String direccion;

	/**
	 * Constructor por defecto.
	 */
	public UsuarioDTO() {
		// Constructor vacío
	}

	/**
	 * Constructor con todos los atributos.
	 * @param nombre Nombre del usuario
	 * @param apellido Apellido del usuario
	 * @param fechaDeNacimiento Fecha de nacimiento
	 * @param nombreUsuario Nombre de usuario para el login
	 * @param correo Correo electrónico
	 * @param contrasena Contraseña
	 * @param direccion Dirección
	 */
	public UsuarioDTO(String nombre, String apellido, Date fechaDeNacimiento, String nombreUsuario, String correo,
			String contrasena, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nombreUsuario = nombreUsuario;
		this.correo = correo;
		this.contrasena = contrasena;
		this.direccion = direccion;
	}

	/**
	 * Obtiene el nombre del usuario.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del usuario.
	 * @param nombre Nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el apellido del usuario.
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Establece el apellido del usuario.
	 * @param apellido Apellido del usuario
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Obtiene la fecha de nacimiento del usuario.
	 * @return fechaDeNacimiento
	 */
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * Establece la fecha de nacimiento del usuario.
	 * @param fechaDeNacimiento Fecha de nacimiento
	 */
	public void setEdad(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * Obtiene el nombre de usuario para el login.
	 * @return nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Establece el nombre de usuario para el login.
	 * @param nombreUsuario Nombre de usuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * Obtiene el correo electrónico del usuario.
	 * @return correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Establece el correo electrónico del usuario.
	 * @param correo Correo electrónico
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Obtiene la contraseña del usuario.
	 * @return contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Establece la contraseña del usuario.
	 * @param contrasena Contraseña
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * Obtiene la dirección del usuario.
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece la dirección del usuario.
	 * @param direccion Dirección
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Devuelve una representación en cadena del objeto UsuarioDTO.
	 * @return Cadena con los valores de los atributos
	 */
	@Override
	public String toString() {
		return "Usuario [Nombre=" + nombre + ", apellido=" + apellido + ", Fecha de Nacimiento=" + fechaDeNacimiento
				+ ", nombreUsuario=" + nombreUsuario + ", correo=" + correo + ", contrasena=" + contrasena
				+ ", direccion=" + direccion + "]";
	}

}

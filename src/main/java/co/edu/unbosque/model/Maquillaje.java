
/**
 * Paquete que contiene las clases del modelo de maquillaje.
 */
package co.edu.unbosque.model;

/**
 * Clase abstracta que representa un maquillaje genérico en la aplicación Temu.
 * Hereda de Articulo y añade atributos comunes a los maquillajes.
 */
public abstract class Maquillaje extends Articulo {
	
	/**
	 * Color del maquillaje.
	 */
	private String color;
	/**
	 * Contenido en gramos del maquillaje.
	 */
	private float contenidoEnGramo;

	/**
	 * Constructor por defecto.
	 */
	public Maquillaje() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parámetros específicos de maquillaje.
	 * @param color Color del maquillaje
	 * @param contenidoEnGramo Contenido en gramos
	 */
	public Maquillaje(String color, float contenidoEnGramo) {
		super();
		this.color = color;
		this.contenidoEnGramo = contenidoEnGramo;
	}

	/**
	 * Constructor con todos los atributos del maquillaje.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param color Color
	 * @param contenidoEnGramo Contenido en gramos
	 */
	public Maquillaje(String nombre, int id, String descripcion, float precio, String imagen, String color,
			float contenidoEnGramo) {
		super(nombre, id, descripcion, precio, imagen);
		this.color = color;
		this.contenidoEnGramo = contenidoEnGramo;
	}

	/**
	 * Constructor con atributos básicos de artículo.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 */
	public Maquillaje(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el color del maquillaje.
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Establece el color del maquillaje.
	 * @param color color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Obtiene el contenido en gramos del maquillaje.
	 * @return contenido en gramos
	 */
	public float getContenidoEnGramo() {
		return contenidoEnGramo;
	}

	/**
	 * Establece el contenido en gramos del maquillaje.
	 * @param contenidoEnGramo contenido en gramos
	 */
	public void setContenidoEnGramo(float contenidoEnGramo) {
		this.contenidoEnGramo = contenidoEnGramo;
	}

	/**
	 * Devuelve una representación en cadena del maquillaje.
	 * @return cadena con los datos del maquillaje
	 */
	@Override
	public String toString() {
		return "Maquillaje [color=" + color + ", contenidoEnGramo=" + contenidoEnGramo + "]";
	}
}

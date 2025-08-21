
/**
 * Paquete que contiene las clases del modelo de artículos.
 */
package co.edu.unbosque.model;

/**
 * Clase abstracta que representa un artículo genérico en la aplicación Temu.
 * Proporciona atributos y métodos comunes para todos los tipos de artículos.
 */
public abstract class Articulo {
	
	/**
	 * Nombre del artículo.
	 */
	private String nombre;
	/**
	 * Identificador único del artículo.
	 */
	private int id;
	/**
	 * Descripción del artículo.
	 */
	private String descripcion;
	/**
	 * Precio del artículo.
	 */
	private float precio;
	/**
	 * URL o ruta de la imagen del artículo.
	 */
	private String imagen;

	/**
	 * Contador estático para la generación de IDs únicos.
	 */
	private static int contador = 1;
	
	/**
	 * Constructor por defecto.
	 */
	public Articulo() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * Constructor con parámetros para inicializar todos los atributos del artículo.
	 * @param nombre Nombre del artículo
	 * @param id Identificador único
	 * @param descripcion Descripción del artículo
	 * @param precio Precio del artículo
	 * @param imagen URL o ruta de la imagen
	 */
	public Articulo(String nombre, int id, String descripcion, float precio, String imagen) {
		super();
		this.nombre = nombre;
		this.id = contador++;
		this.descripcion = descripcion;
		this.precio = precio;
		this.imagen = imagen;
		contador++;
	}



	/**
	 * Obtiene el nombre del artículo.
	 * @return nombre del artículo
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * Establece el nombre del artículo.
	 * @param nombre nombre del artículo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * Obtiene el identificador único del artículo.
	 * @return id del artículo
	 */
	public int getId() {
		return id;
	}



	/**
	 * Establece el identificador único del artículo.
	 * @param id id del artículo
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * Obtiene la descripción del artículo.
	 * @return descripción del artículo
	 */
	public String getDescripcion() {
		return descripcion;
	}



	/**
	 * Establece la descripción del artículo.
	 * @param descripcion descripción del artículo
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	/**
	 * Obtiene el precio del artículo.
	 * @return precio del artículo
	 */
	public float getPrecio() {
		return precio;
	}



	/**
	 * Establece el precio del artículo.
	 * @param precio precio del artículo
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}



	/**
	 * Obtiene la imagen del artículo.
	 * @return imagen del artículo
	 */
	public String getImagen() {
		return imagen;
	}



	/**
	 * Establece la imagen del artículo.
	 * @param imagen imagen del artículo
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	/**
	 * Devuelve una representación en cadena del artículo.
	 * @return cadena con los datos del artículo
	 */
	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", id=" + id + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", imagen=" + imagen + "]";
	}



	
	
	
	
	
	

}

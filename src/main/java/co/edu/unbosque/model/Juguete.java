
/**
 * Paquete que contiene las clases del modelo de juguetes.
 */
package co.edu.unbosque.model;

/**
 * Clase abstracta que representa un juguete genérico en la aplicación Temu.
 * Hereda de Articulo y añade atributos comunes a los juguetes.
 */
public abstract class Juguete extends Articulo {

	/**
	 * Tamaño del juguete.
	 */
	private String tamano;
	/**
	 * Material del juguete.
	 */
	private String material;
	
	
	/**
	 * Constructor por defecto.
	 */
	public Juguete() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parámetros específicos de juguete.
	 * @param tamano Tamaño del juguete
	 * @param material Material del juguete
	 */
	public Juguete(String tamano, String material) {
		super();
		this.tamano = tamano;
		this.material = material;
	}

	/**
	 * Constructor con todos los atributos del juguete.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tamano Tamaño
	 * @param material Material
	 */
	public Juguete(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material) {
		super(nombre, id, descripcion, precio, imagen);
		this.tamano = tamano;
		this.material = material;
	}

	/**
	 * Constructor con atributos básicos de artículo.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 */
	public Juguete(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el tamaño del juguete.
	 * @return tamaño del juguete
	 */
	public String getTamano() {
		return tamano;
	}


	/**
	 * Establece el tamaño del juguete.
	 * @param tamano tamaño del juguete
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}


	/**
	 * Obtiene el material del juguete.
	 * @return material del juguete
	 */
	public String getMaterial() {
		return material;
	}


	/**
	 * Establece el material del juguete.
	 * @param material material del juguete
	 */
	public void setMaterial(String material) {
		this.material = material;
	}


	/**
	 * Devuelve una representación en cadena del juguete.
	 * @return cadena con los datos del juguete
	 */
	@Override
	public String toString() {
		return "Juguete [tamano=" + tamano + ", material=" + material + "]";
	}
	
	


	
	
	
	
	
	
	
}

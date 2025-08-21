
/**
 * Paquete que contiene las clases del modelo de peluches.
 */
package co.edu.unbosque.model;

/**
 * Clase abstracta que representa un peluche genérico en la aplicación Temu.
 * Hereda de Articulo y añade atributos comunes a los peluches.
 */
public abstract class Peluche extends Articulo {
	
	/**
	 * Tamaño del peluche.
	 */
	private String tamano;
	/**
	 * Color del peluche.
	 */
	private String color;
	/**
	 * Material del peluche.
	 */
	private String material;
	
	/**
	 * Constructor por defecto.
	 */
	public Peluche() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parámetros específicos de peluche.
	 * @param tamano Tamaño
	 * @param color Color
	 * @param material Material
	 */
	public Peluche(String tamano, String color, String material) {
		super();
		this.tamano = tamano;
		this.color = color;
		this.material = material;
	}

	/**
	 * Constructor con todos los atributos del peluche.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tamano Tamaño
	 * @param color Color
	 * @param material Material
	 */
	public Peluche(String nombre, int id, String descripcion, float precio, String imagen, String tamano, String color,
			String material) {
		super(nombre, id, descripcion, precio, imagen);
		this.tamano = tamano;
		this.color = color;
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
	public Peluche(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el tamaño del peluche.
	 * @return tamaño
	 */
	public String getTamano() {
		return tamano;
	}

	/**
	 * Establece el tamaño del peluche.
	 * @param tamano tamaño
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	/**
	 * Obtiene el color del peluche.
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Establece el color del peluche.
	 * @param color color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Obtiene el material del peluche.
	 * @return material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Establece el material del peluche.
	 * @param material material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Devuelve una representación en cadena del peluche.
	 * @return cadena con los datos del peluche
	 */
	@Override
	public String toString() {
		return "Peluche [tamano=" + tamano + ", color=" + color + ", material=" + material + "]";
	}
	
	
	
	
	
	
	

}

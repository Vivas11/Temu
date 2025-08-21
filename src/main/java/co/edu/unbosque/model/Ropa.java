
/**
 * Paquete que contiene las clases del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model;

/**
 * Clase abstracta que representa una prenda de ropa, extendiendo la clase Articulo.
 */
public abstract class Ropa extends Articulo {
	
	/**
	 * Tipo de prenda de ropa.
	 */
	private String tipoPrenda;

	/**
	 * Talla de la prenda de ropa.
	 */
	private String talla;

	/**
	 * Material de la prenda de ropa.
	 */
	private String material;
	
	/**
	 * Constructor por defecto.
	 */
	public Ropa() {
		// Constructor vacío
	}

	/**
	 * Constructor con tipo de prenda, talla y material.
	 * @param tipoPrenda Tipo de prenda
	 * @param talla Talla de la prenda
	 * @param material Material de la prenda
	 */
	public Ropa(String tipoPrenda, String talla, String material) {
		super();
		this.tipoPrenda = tipoPrenda;
		this.talla = talla;
		this.material = material;
	}

	/**
	 * Constructor con todos los atributos.
	 * @param nombre Nombre de la prenda
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tipoPrenda Tipo de prenda
	 * @param talla Talla
	 * @param material Material
	 */
	public Ropa(String nombre, int id, String descripcion, float precio, String imagen, String tipoPrenda, String talla,
			String material) {
		super(nombre, id, descripcion, precio, imagen);
		this.tipoPrenda = tipoPrenda;
		this.talla = talla;
		this.material = material;
	}

	/**
	 * Constructor con atributos de Articulo.
	 * @param nombre Nombre de la prenda
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 */
	public Ropa(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// Constructor vacío
	}

	/**
	 * Obtiene el tipo de prenda de ropa.
	 * @return tipoPrenda
	 */
	public String getTipoPrenda() {
		return tipoPrenda;
	}

	/**
	 * Establece el tipo de prenda de ropa.
	 * @param tipoPrenda Tipo de prenda
	 */
	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	/**
	 * Obtiene la talla de la prenda de ropa.
	 * @return talla
	 */
	public String getTalla() {
		return talla;
	}

	/**
	 * Establece la talla de la prenda de ropa.
	 * @param talla Talla de la prenda
	 */
	public void setTalla(String talla) {
		this.talla = talla;
	}

	/**
	 * Obtiene el material de la prenda de ropa.
	 * @return material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Establece el material de la prenda de ropa.
	 * @param material Material de la prenda
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Devuelve una representación en cadena del objeto Ropa.
	 * @return Cadena con los valores de los atributos
	 */
	@Override
	public String toString() {
		return "Ropa [tipoPrenda=" + tipoPrenda + ", talla=" + talla + ", material=" + material + "]";
	}
	
	
	
	

}


/**
 * Paquete que contiene las clases del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa una prenda de ropa para mujer, extendiendo la clase Ropa.
 * Implementa Serializable para permitir la serialización de sus objetos.
 */
public class RopaMujer extends Ropa implements Serializable {
	/**
	 * 
	 */
	/**
	 * Identificador de versión para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Largo de la prenda de ropa.
	 */
	private String largoPrenda;

	/**
	 * Constructor por defecto.
	 */
	public RopaMujer() {
		// Constructor vacío
	}

	/**
	 * Constructor con largo de prenda.
	 * @param largoPrenda Largo de la prenda
	 */
	public RopaMujer(String largoPrenda) {
		super();
		this.largoPrenda = largoPrenda;
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
	 * @param largoPrenda Largo de la prenda
	 */
	public RopaMujer(String nombre, int id, String descripcion, float precio, String imagen, String tipoPrenda,
			String talla, String material, String largoPrenda) {
		super(nombre, id, descripcion, precio, imagen, tipoPrenda, talla, material);
		this.largoPrenda = largoPrenda;
	}

	/**
	 * Constructor con atributos de Ropa.
	 * @param nombre Nombre de la prenda
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tipoPrenda Tipo de prenda
	 * @param talla Talla
	 * @param material Material
	 */
	public RopaMujer(String nombre, int id, String descripcion, float precio, String imagen, String tipoPrenda,
			String talla, String material) {
		super(nombre, id, descripcion, precio, imagen, tipoPrenda, talla, material);
		// Constructor vacío
	}

	/**
	 * Obtiene el largo de la prenda de ropa.
	 * @return largoPrenda
	 */
	public String getLargoPrenda() {
		return largoPrenda;
	}

	/**
	 * Establece el largo de la prenda de ropa.
	 * @param largoPrenda Largo de la prenda
	 */
	public void setLargoPrenda(String largoPrenda) {
		this.largoPrenda = largoPrenda;
	}

	/**
	 * Devuelve una representación en cadena del objeto RopaMujer.
	 * @return Cadena con los valores de los atributos
	 */
	@Override
	public String toString() {
		return "RopaMujer [largoPrenda=" + largoPrenda + "]";
	}

}

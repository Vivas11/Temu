/**
 * Paquete que contiene las clases del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Representa una prenda de ropa para hombre.
 */
public class RopaHombre  extends  Ropa 	implements Serializable{

	/** Identificador de versión para la serialización. */
	private static final long serialVersionUID = 1L;
	/** Tipo de corte de la prenda (por ejemplo, slim, regular). */
	private String corte;
	
	/**
	 * Constructor por defecto.
	 */
	public RopaHombre() { }

	/**
	 * Crea una instancia con el corte especificado.
	 * @param corte tipo de corte de la prenda
	 */
	public RopaHombre(String corte) {
		super();
		this.corte = corte;
	}

	/**
	 * Crea una prenda de ropa para hombre con todos los atributos.
	 * @param nombre nombre del artículo
	 * @param id identificador único
	 * @param descripcion descripción del artículo
	 * @param precio precio del artículo
	 * @param imagen URL o ruta de la imagen
	 * @param tipoPrenda tipo de prenda
	 * @param talla talla de la prenda
	 * @param material material principal
	 * @param corte tipo de corte
	 */
	public RopaHombre(String nombre, int id, String descripcion, float precio, String imagen, String tipoPrenda,
			String talla, String material, String corte) {
		super(nombre, id, descripcion, precio, imagen, tipoPrenda, talla, material);
		this.corte = corte;
	}

	/**
	 * Crea una prenda de ropa para hombre sin especificar el corte.
	 * @param nombre nombre del artículo
	 * @param id identificador único
	 * @param descripcion descripción del artículo
	 * @param precio precio del artículo
	 * @param imagen URL o ruta de la imagen
	 * @param tipoPrenda tipo de prenda
	 * @param talla talla de la prenda
	 * @param material material principal
	 */
	public RopaHombre(String nombre, int id, String descripcion, float precio, String imagen, String tipoPrenda,
			String talla, String material) {
		super(nombre, id, descripcion, precio, imagen, tipoPrenda, talla, material);
	}

	/**
	 * Obtiene el tipo de corte de la prenda.
	 * @return corte de la prenda
	 */
	public String getCorte() {
		return corte;
	}

	/**
	 * Establece el tipo de corte de la prenda.
	 * @param corte nuevo tipo de corte
	 */
	public void setCorte(String corte) {
		this.corte = corte;
	}

	@Override
	public String toString() {
		return "RopaHombre [corte=" + corte + "]";
	}
	
	
	
	
}

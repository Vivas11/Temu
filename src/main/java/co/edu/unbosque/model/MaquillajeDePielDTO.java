
/**
 * Paquete que contiene las clases DTO para maquillaje de piel.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * DTO para la transferencia de datos de maquillaje de piel.
 * Hereda de Maquillaje y añade atributos específicos de maquillaje de piel.
 */
public class MaquillajeDePielDTO extends Maquillaje implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Tipo de maquillaje de piel.
	 */
	private int tipo;
	/**
	 * Indica si el maquillaje de piel es ecoamigable.
	 */
	private boolean esEcoamigable;

	/**
	 * Constructor por defecto.
	 */
	public MaquillajeDePielDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parámetros específicos de maquillaje de piel.
	 * @param tipo Tipo de maquillaje
	 * @param esEcoamigable Si es ecoamigable
	 */
	public MaquillajeDePielDTO(int tipo, boolean esEcoamigable) {
		super();
		this.tipo = tipo;
		this.esEcoamigable = esEcoamigable;
	}
	
	/**
	 * Constructor con todos los atributos del maquillaje de piel.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param color Color
	 * @param contenidoEnGramo Contenido en gramos
	 * @param tipo Tipo de maquillaje
	 * @param esEcoamigable Si es ecoamigable
	 */
	public MaquillajeDePielDTO(String nombre, int id, String descripcion, float precio, String imagen, String color,
			float contenidoEnGramo, int tipo, boolean esEcoamigable) {
		super(nombre, id, descripcion, precio, imagen, color, contenidoEnGramo);
		this.tipo = tipo;
		this.esEcoamigable = esEcoamigable;
	}

	/**
	 * Constructor con atributos básicos de maquillaje.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param color Color
	 * @param contenidoEnGramo Contenido en gramos
	 */
	public MaquillajeDePielDTO(String nombre, int id, String descripcion, float precio, String imagen, String color,
			float contenidoEnGramo) {
		super(nombre, id, descripcion, precio, imagen, color, contenidoEnGramo);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el tipo de maquillaje de piel.
	 * @return tipo de maquillaje
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * Establece el tipo de maquillaje de piel.
	 * @param tipo tipo de maquillaje
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * Indica si el maquillaje de piel es ecoamigable.
	 * @return true si es ecoamigable, false si no
	 */
	public boolean isEsEcoamigable() {
		return esEcoamigable;
	}

	/**
	 * Establece si el maquillaje de piel es ecoamigable.
	 * @param esEcoamigable true si es ecoamigable, false si no
	 */
	public void setEsEcoamigable(boolean esEcoamigable) {
		this.esEcoamigable = esEcoamigable;
	}

	/**
	 * Devuelve una representación en cadena del maquillaje de piel.
	 * @return cadena con los datos del maquillaje de piel
	 */
	@Override
	public String toString() {
		return "MaquillaDepiel [tipo=" + tipo + ", esEcoamigable=" + esEcoamigable + "]";
	}

}

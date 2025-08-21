
/**
 * Paquete que contiene las clases del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un maquillaje capilar (DTO), extendiendo la clase Maquillaje.
 * Implementa Serializable para permitir la serialización de sus objetos.
 */
public class MaquillajeCapilarDTO extends Maquillaje implements Serializable{
	/**
	 * 
	 */
	/**
	 * Identificador de versión para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Indica si el maquillaje es resistente al agua.
	 */
	private boolean resistenciaAgua;

	/**
	 * Duración en horas del maquillaje capilar.
	 */
	private int duracionHora;
	
	/**
	 * Constructor por defecto.
	 */
	public MaquillajeCapilarDTO() {
		// Constructor vacío
	}

	/**
	 * Constructor con resistencia al agua y duración.
	 * @param resistenciaAgua Indica si es resistente al agua
	 * @param duracionHora Duración en horas
	 */
	public MaquillajeCapilarDTO(boolean resistenciaAgua, int duracionHora) {
		super();
		this.resistenciaAgua = resistenciaAgua;
		this.duracionHora = duracionHora;
	}

	/**
	 * Constructor con todos los atributos.
	 * @param nombre Nombre del maquillaje
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param color Color
	 * @param contenidoEnGramo Contenido en gramos
	 * @param resistenciaAgua Indica si es resistente al agua
	 * @param duracionHora Duración en horas
	 */
	public MaquillajeCapilarDTO(String nombre, int id, String descripcion, float precio, String imagen, String color,
			float contenidoEnGramo, boolean resistenciaAgua, int duracionHora) {
		super(nombre, id, descripcion, precio, imagen, color, contenidoEnGramo);
		this.resistenciaAgua = resistenciaAgua;
		this.duracionHora = duracionHora;
	}

	/**
	 * Constructor con atributos de Maquillaje.
	 * @param nombre Nombre del maquillaje
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param color Color
	 * @param contenidoEnGramo Contenido en gramos
	 */
	public MaquillajeCapilarDTO(String nombre, int id, String descripcion, float precio, String imagen, String color,
			float contenidoEnGramo) {
		super(nombre, id, descripcion, precio, imagen, color, contenidoEnGramo);
		// Constructor vacío
	}

	/**
	 * Indica si el maquillaje es resistente al agua.
	 * @return true si es resistente al agua, false en caso contrario
	 */
	public boolean isResistenciaAgua() {
		return resistenciaAgua;
	}

	/**
	 * Establece si el maquillaje es resistente al agua.
	 * @param resistenciaAgua true si es resistente al agua, false en caso contrario
	 */
	public void setResistenciaAgua(boolean resistenciaAgua) {
		this.resistenciaAgua = resistenciaAgua;
	}

	/**
	 * Obtiene la duración en horas del maquillaje capilar.
	 * @return duracionHora
	 */
	public int getDuracionHora() {
		return duracionHora;
	}

	/**
	 * Establece la duración en horas del maquillaje capilar.
	 * @param duracionHora Duración en horas
	 */
	public void setDuracionHora(int duracionHora) {
		this.duracionHora = duracionHora;
	}

	/**
	 * Devuelve una representación en cadena del objeto MaquillajeCapilarDTO.
	 * @return Cadena con los valores de los atributos
	 */
	@Override
	public String toString() {
		return "MaquillajeCapilar [resistenciaAgua=" + resistenciaAgua + ", duracionHora=" + duracionHora + "]";
	}
	
	
	

 
	
	
	
}

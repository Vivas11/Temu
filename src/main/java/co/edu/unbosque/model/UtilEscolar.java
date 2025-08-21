
/**
 * Paquete que contiene las clases del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un útil escolar, extendiendo la clase Papeleria.
 * Implementa Serializable para permitir la serialización de sus objetos.
 */
public class UtilEscolar extends Papeleria implements Serializable{
	/**
	 * 
	 */
	/**
	 * Identificador de versión para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Color del útil escolar.
	 */
	private String color;

	/**
	 * Edad recomendada para el uso del útil escolar.
	 */
	private int edadRecomendada;
	
	
	/**
	 * Constructor por defecto.
	 */
	public UtilEscolar() {
		// Constructor vacío
	}

	/**
	 * Constructor con color y edad recomendada.
	 * @param color Color del útil escolar
	 * @param edadRecomendada Edad recomendada para el uso
	 */
	public UtilEscolar(String color, int edadRecomendada) {
		super();
		this.color = color;
		this.edadRecomendada = edadRecomendada;
	}

	/**
	 * Constructor con todos los atributos.
	 * @param nombre Nombre del artículo
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tipo Tipo
	 * @param tamano Tamaño
	 * @param forma Forma
	 * @param color Color del útil escolar
	 * @param edadRecomendada Edad recomendada para el uso
	 */
	public UtilEscolar(String nombre, int id, String descripcion, float precio, String imagen, String tipo,
			String tamano, String forma, String color, int edadRecomendada) {
		super(nombre, id, descripcion, precio, imagen, tipo, tamano, forma);
		this.color = color;
		this.edadRecomendada = edadRecomendada;
	}

	/**
	 * Constructor con atributos de Papeleria.
	 * @param nombre Nombre del artículo
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tipo Tipo
	 * @param tamano Tamaño
	 * @param forma Forma
	 */
	public UtilEscolar(String nombre, int id, String descripcion, float precio, String imagen, String tipo,
			String tamano, String forma) {
		super(nombre, id, descripcion, precio, imagen, tipo, tamano, forma);
		// Constructor vacío
	}

	/**
	 * Obtiene el color del útil escolar.
	 * @return color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * Establece el color del útil escolar.
	 * @param color Color del útil escolar
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * Obtiene la edad recomendada para el uso del útil escolar.
	 * @return edadRecomendada
	 */
	public int getEdadRecomendada() {
		return edadRecomendada;
	}


	/**
	 * Establece la edad recomendada para el uso del útil escolar.
	 * @param edadRecomendada Edad recomendada
	 */
	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}


	/**
	 * Devuelve una representación en cadena del objeto UtilEscolar.
	 * @return Cadena con los valores de los atributos
	 */
	@Override
	public String toString() {
		return "UtilesEscolare [color=" + color + ", edadRecomendada=" + edadRecomendada + "]";
	}
	
	

	

}

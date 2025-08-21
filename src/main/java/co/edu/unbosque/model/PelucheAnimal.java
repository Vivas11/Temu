
/**
 * Paquete que contiene las clases del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un peluche de animal, extendiendo la clase Peluche.
 * Implementa Serializable para permitir la serialización de sus objetos.
 */
public class PelucheAnimal extends Peluche implements Serializable{
	/**
	 * 
	 */
	/**
	 * Identificador de versión para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Especie del animal representado por el peluche.
	 */
	private String especie;

	/**
	 * Indica si el peluche incluye sonido.
	 */
	private boolean sonidoIncluido;
	
	
	/**
	 * Constructor por defecto.
	 */
	public PelucheAnimal() {
		// Constructor vacío
	}
	
	/**
	 * Constructor con especie y sonido incluido.
	 * @param especie Especie del animal
	 * @param sonidoIncluido Indica si incluye sonido
	 */
	public PelucheAnimal(String especie, boolean sonidoIncluido) {
		super();
		this.especie = especie;
		this.sonidoIncluido = sonidoIncluido;
	}

	/**
	 * Constructor con todos los atributos.
	 * @param nombre Nombre del peluche
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tamano Tamaño
	 * @param color Color
	 * @param material Material
	 * @param especie Especie del animal
	 * @param sonidoIncluido Indica si incluye sonido
	 */
	public PelucheAnimal(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String color, String material, String especie, boolean sonidoIncluido) {
		super(nombre, id, descripcion, precio, imagen, tamano, color, material);
		this.especie = especie;
		this.sonidoIncluido = sonidoIncluido;
	}

	/**
	 * Constructor con atributos de Peluche.
	 * @param nombre Nombre del peluche
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tamano Tamaño
	 * @param color Color
	 * @param material Material
	 */
	public PelucheAnimal(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String color, String material) {
		super(nombre, id, descripcion, precio, imagen, tamano, color, material);
		// Constructor vacío
	}

	/**
	 * Obtiene la especie del animal representado por el peluche.
	 * @return especie
	 */
	public String getEspecie() {
		return especie;
	}


	/**
	 * Establece la especie del animal representado por el peluche.
	 * @param especie Especie del animal
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}


	/**
	 * Indica si el peluche incluye sonido.
	 * @return true si incluye sonido, false en caso contrario
	 */
	public boolean isSonidoIncluido() {
		return sonidoIncluido;
	}


	/**
	 * Establece si el peluche incluye sonido.
	 * @param sonidoIncluido true si incluye sonido, false en caso contrario
	 */
	public void setSonidoIncluido(boolean sonidoIncluido) {
		this.sonidoIncluido = sonidoIncluido;
	}


	/**
	 * Devuelve una representación en cadena del objeto PelucheAnimal.
	 * @return Cadena con los valores de los atributos
	 */
	@Override
	public String toString() {
		return "PelucheAnimal [especie=" + especie + ", sonidoIncluido=" + sonidoIncluido + "]";
	}
	
	
	
	
	

}


/**
 * Paquete que contiene las clases del modelo de juguetes y juegos de mesa.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un juego de mesa en la aplicación Temu.
 * Hereda de Juguete y añade atributos específicos de juegos de mesa.
 */
public class JuegoDeMesa extends Juguete implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Número de jugadores recomendados para el juego de mesa.
	 */
	private int numeroJugadore;
	/**
	 * Tipo de juego de mesa.
	 */
	private String tipoDeJuego;
	
	
	
	/**
	 * Constructor por defecto.
	 */
	public JuegoDeMesa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parámetros específicos de juego de mesa.
	 * @param numeroJugadore Número de jugadores
	 * @param tipoDeJuego Tipo de juego
	 */
	public JuegoDeMesa(int numeroJugadore, String tipoDeJuego) {
		super();
		this.numeroJugadore = numeroJugadore;
		this.tipoDeJuego = tipoDeJuego;
	}

	/**
	 * Constructor con todos los atributos del juego de mesa.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tamano Tamaño
	 * @param material Material
	 * @param numeroJugadore Número de jugadores
	 * @param tipoDeJuego Tipo de juego
	 */
	public JuegoDeMesa(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material, int numeroJugadore, String tipoDeJuego) {
		super(nombre, id, descripcion, precio, imagen, tamano, material);
		this.numeroJugadore = numeroJugadore;
		this.tipoDeJuego = tipoDeJuego;
	}

	/**
	 * Constructor con atributos básicos de juguete.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tamano Tamaño
	 * @param material Material
	 */
	public JuegoDeMesa(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material) {
		super(nombre, id, descripcion, precio, imagen, tamano, material);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el número de jugadores recomendados para el juego de mesa.
	 * @return número de jugadores
	 */
	public int getNumeroJugadore() {
		return numeroJugadore;
	}



	/**
	 * Establece el número de jugadores recomendados para el juego de mesa.
	 * @param numeroJugadore número de jugadores
	 */
	public void setNumeroJugadore(int numeroJugadore) {
		this.numeroJugadore = numeroJugadore;
	}



	/**
	 * Obtiene el tipo de juego de mesa.
	 * @return tipo de juego
	 */
	public String getTipoDeJuego() {
		return tipoDeJuego;
	}



	/**
	 * Establece el tipo de juego de mesa.
	 * @param tipoDeJuego tipo de juego
	 */
	public void setTipoDeJuego(String tipoDeJuego) {
		this.tipoDeJuego = tipoDeJuego;
	}



	/**
	 * Devuelve una representación en cadena del juego de mesa.
	 * @return cadena con los datos del juego de mesa
	 */
	@Override
	public String toString() {
		return "JuegoDeMesa [numeroJugadore=" + numeroJugadore + ", tipoDeJuego=" + tipoDeJuego + "]";
	}
	
	


	
	
	
	
	

}

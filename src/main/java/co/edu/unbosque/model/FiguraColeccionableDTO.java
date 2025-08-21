
/**
 * Paquete que contiene las clases DTO para figuras coleccionables.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * DTO para la transferencia de datos de una figura coleccionable.
 * Hereda de Juguete y añade atributos específicos de figuras coleccionables.
 */
public class FiguraColeccionableDTO extends Juguete implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Tipo de figura coleccionable.
	 */
	private String tipoDeFigura;
	/**
	 * Valor en mercado de la figura coleccionable.
	 */
	private float valorEnMercado;
	
	/**
	 * Constructor por defecto.
	 */
	public FiguraColeccionableDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parámetros específicos de figura coleccionable.
	 * @param tipoDeFigura Tipo de figura
	 * @param valorEnMercado Valor en mercado
	 */
	public FiguraColeccionableDTO(String tipoDeFigura, float valorEnMercado) {
		super();
		this.tipoDeFigura = tipoDeFigura;
		this.valorEnMercado = valorEnMercado;
	}

	/**
	 * Constructor con todos los atributos de la figura coleccionable.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tamano Tamaño
	 * @param material Material
	 * @param tipoDeFigura Tipo de figura
	 * @param valorEnMercado Valor en mercado
	 */
	public FiguraColeccionableDTO(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material, String tipoDeFigura, float valorEnMercado) {
		super(nombre, id, descripcion, precio, imagen, tamano, material);
		this.tipoDeFigura = tipoDeFigura;
		this.valorEnMercado = valorEnMercado;
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
	public FiguraColeccionableDTO(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material) {
		super(nombre, id, descripcion, precio, imagen, tamano, material);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el tipo de figura coleccionable.
	 * @return tipo de figura
	 */
	public String getTipoDeFigura() {
		return tipoDeFigura;
	}

	/**
	 * Establece el tipo de figura coleccionable.
	 * @param tipoDeFigura tipo de figura
	 */
	public void setTipoDeFigura(String tipoDeFigura) {
		this.tipoDeFigura = tipoDeFigura;
	}

	/**
	 * Obtiene el valor en mercado de la figura coleccionable.
	 * @return valor en mercado
	 */
	public float getValorEnMercado() {
		return valorEnMercado;
	}

	/**
	 * Establece el valor en mercado de la figura coleccionable.
	 * @param valorEnMercado valor en mercado
	 */
	public void setValorEnMercado(float valorEnMercado) {
		this.valorEnMercado = valorEnMercado;
	}

	/**
	 * Devuelve una representación en cadena de la figura coleccionable.
	 * @return cadena con los datos de la figura
	 */
	@Override
	public String toString() {
		return "FiguraColeccionable [tipoDeFigura=" + tipoDeFigura + ", valorEnMercado=" + valorEnMercado + "]";
	}
}

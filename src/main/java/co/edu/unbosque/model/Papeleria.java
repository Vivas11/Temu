
/**
 * Paquete que contiene las clases del modelo de papelería.
 */
package co.edu.unbosque.model;

/**
 * Clase abstracta que representa un artículo de papelería en la aplicación Temu.
 * Hereda de Articulo y añade atributos comunes a los útiles escolares y de oficina.
 */
public abstract class Papeleria extends Articulo {
	
	/**
	 * Tipo de artículo de papelería.
	 */
	private String tipo;
	/**
	 * Tamaño del artículo de papelería.
	 */
	private String tamano;
	/**
	 * Forma del artículo de papelería.
	 */
	private String forma;
	
	
	/**
	 * Constructor por defecto.
	 */
	public Papeleria() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructor con parámetros específicos de papelería.
	 * @param tipo Tipo de artículo
	 * @param tamano Tamaño
	 * @param forma Forma
	 */
	public Papeleria(String tipo, String tamano, String forma) {
		super();
		this.tipo = tipo;
		this.tamano = tamano;
		this.forma = forma;
	}


	/**
	 * Constructor con todos los atributos de papelería.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param tipo Tipo de artículo
	 * @param tamano Tamaño
	 * @param forma Forma
	 */
	public Papeleria(String nombre, int id, String descripcion, float precio, String imagen, String tipo, String tamano,
			String forma) {
		super(nombre, id, descripcion, precio, imagen);
		this.tipo = tipo;
		this.tamano = tamano;
		this.forma = forma;
	}


	/**
	 * Constructor con atributos básicos de artículo.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 */
	public Papeleria(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}


	/**
	 * Obtiene el tipo de artículo de papelería.
	 * @return tipo de artículo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * Establece el tipo de artículo de papelería.
	 * @param tipo tipo de artículo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 * Obtiene el tamaño del artículo de papelería.
	 * @return tamaño
	 */
	public String getTamano() {
		return tamano;
	}


	/**
	 * Establece el tamaño del artículo de papelería.
	 * @param tamano tamaño
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}


	/**
	 * Obtiene la forma del artículo de papelería.
	 * @return forma
	 */
	public String getForma() {
		return forma;
	}


	/**
	 * Establece la forma del artículo de papelería.
	 * @param forma forma
	 */
	public void setForma(String forma) {
		this.forma = forma;
	}


	/**
	 * Devuelve una representación en cadena del artículo de papelería.
	 * @return cadena con los datos del artículo
	 */
	@Override
	public String toString() {
		return "Papeleria [tipo=" + tipo + ", tamano=" + tamano + ", forma=" + forma + "]";
	}
	
	




	

}

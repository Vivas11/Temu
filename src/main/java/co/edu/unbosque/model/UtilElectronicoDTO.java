
/**
 * Paquete que contiene las clases del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un útil electrónico, extendiendo la clase Papeleria.
 * Implementa Serializable para permitir la serialización de sus objetos.
 */
public class UtilElectronicoDTO extends Papeleria implements Serializable{
	/**
	 * 
	 */
	/**
	 * Identificador de versión para la serialización.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Tipo de dispositivo electrónico.
	 */
	private String tipoDispositivo;

	/**
	 * Indica si la batería está incluida.
	 */
	private boolean bateriaIncluida;
	
	
	/**
	 * Constructor por defecto.
	 */
	public UtilElectronicoDTO() {
		// Constructor vacío
	}

	/**
	 * Constructor con tipo de dispositivo y batería incluida.
	 * @param tipoDispositivo Tipo de dispositivo electrónico
	 * @param bateriaIncluida Indica si la batería está incluida
	 */
	public UtilElectronicoDTO(String tipoDispositivo, boolean bateriaIncluida) {
		super();
		this.tipoDispositivo = tipoDispositivo;
		this.bateriaIncluida = bateriaIncluida;
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
	 * @param tipoDispositivo Tipo de dispositivo electrónico
	 * @param bateriaIncluida Indica si la batería está incluida
	 */
	public UtilElectronicoDTO(String nombre, int id, String descripcion, float precio, String imagen, String tipo,
			String tamano, String forma, String tipoDispositivo, boolean bateriaIncluida) {
		super(nombre, id, descripcion, precio, imagen, tipo, tamano, forma);
		this.tipoDispositivo = tipoDispositivo;
		this.bateriaIncluida = bateriaIncluida;
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
	public UtilElectronicoDTO(String nombre, int id, String descripcion, float precio, String imagen, String tipo,
			String tamano, String forma) {
		super(nombre, id, descripcion, precio, imagen, tipo, tamano, forma);
		// Constructor vacío
	}

	/**
	 * Obtiene el tipo de dispositivo electrónico.
	 * @return tipoDispositivo
	 */
	public String getTipoDispositivo() {
		return tipoDispositivo;
	}


	/**
	 * Establece el tipo de dispositivo electrónico.
	 * @param tipoDispositivo Tipo de dispositivo electrónico
	 */
	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}


	/**
	 * Indica si la batería está incluida.
	 * @return true si la batería está incluida, false en caso contrario
	 */
	public boolean isBateriaIncluida() {
		return bateriaIncluida;
	}


	/**
	 * Establece si la batería está incluida.
	 * @param bateriaIncluida true si la batería está incluida, false en caso contrario
	 */
	public void setBateriaIncluida(boolean bateriaIncluida) {
		this.bateriaIncluida = bateriaIncluida;
	}


	/**
	 * Devuelve una representación en cadena del objeto UtilElectronicoDTO.
	 * @return Cadena con los valores de los atributos
	 */
	@Override
	public String toString() {
		return "UtilesElectronico [tipoDispositivo=" + tipoDispositivo + ", bateriaIncluida=" + bateriaIncluida + "]";
	}
}

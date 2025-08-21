
/**
 * Paquete que contiene las clases del modelo de dispositivos electrónicos.
 */
package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un celular como dispositivo electrónico en la aplicación Temu.
 * Hereda de DispositivosElectronico y añade atributos específicos de celulares.
 */
public class Celular extends DispositivosElectronico implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Procesador del celular.
	 */
	private String procesador;
	/**
	 * Resolución de la cámara del celular.
	 */
	private int resolucionCamra;
	
	
	/**
	 * Constructor por defecto.
	 */
	public Celular() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * Constructor con parámetros específicos de celular.
	 * @param procesador Procesador del celular
	 * @param resolucionCamra Resolución de la cámara
	 */
	public Celular(String procesador, int resolucionCamra) {
		super();
		this.procesador = procesador;
		this.resolucionCamra = resolucionCamra;
	}


	/**
	 * Constructor con todos los atributos del celular.
	 * @param nombre Nombre del celular
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param marca Marca
	 * @param ram Memoria RAM
	 * @param almacenamiento Almacenamiento
	 * @param procesador Procesador
	 * @param resolucionCamra Resolución de la cámara
	 */
	public Celular(String nombre, int id, String descripcion, float precio, String imagen, String marca, int ram,
			int almacenamiento, String procesador, int resolucionCamra) {
		super(nombre, id, descripcion, precio, imagen, marca, ram, almacenamiento);
		this.procesador = procesador;
		this.resolucionCamra = resolucionCamra;
	}


	/**
	 * Constructor con atributos básicos de dispositivo electrónico.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param marca Marca
	 * @param ram Memoria RAM
	 * @param almacenamiento Almacenamiento
	 */
	public Celular(String nombre, int id, String descripcion, float precio, String imagen, String marca, int ram,
			int almacenamiento) {
		super(nombre, id, descripcion, precio, imagen, marca, ram, almacenamiento);
		// TODO Auto-generated constructor stub
	}


	/**
	 * Obtiene el procesador del celular.
	 * @return procesador
	 */
	public String getProcesador() {
		return procesador;
	}


	/**
	 * Establece el procesador del celular.
	 * @param procesador procesador
	 */
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	/**
	 * Obtiene la resolución de la cámara del celular.
	 * @return resolución de la cámara
	 */
	public int getResolucionCamra() {
		return resolucionCamra;
	}


	/**
	 * Establece la resolución de la cámara del celular.
	 * @param resolucionCamra resolución de la cámara
	 */
	public void setResolucionCamra(int resolucionCamra) {
		this.resolucionCamra = resolucionCamra;
	}


	/**
	 * Devuelve una representación en cadena del celular.
	 * @return cadena con los datos del celular
	 */
	@Override
	public String toString() {
		return "Celular [procesador=" + procesador + ", resolucionCamra=" + resolucionCamra + "]";
	}
}


/**
 * Paquete que contiene las clases del modelo de dispositivos electrónicos.
 */
package co.edu.unbosque.model;

/**
 * Clase abstracta que representa un dispositivo electrónico genérico.
 * Hereda de Articulo y añade atributos comunes a los dispositivos electrónicos.
 */
public abstract class DispositivosElectronico extends Articulo {

	/**
	 * Marca del dispositivo electrónico.
	 */
	private String marca;
	/**
	 * Memoria RAM del dispositivo electrónico.
	 */
	private int ram;
	/**
	 * Almacenamiento del dispositivo electrónico.
	 */
	private int almacenamiento;
	
	
	/**
	 * Constructor por defecto.
	 */
	public DispositivosElectronico() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * Constructor con parámetros específicos de dispositivo electrónico.
	 * @param marca Marca del dispositivo
	 * @param ram Memoria RAM
	 * @param almacenamiento Almacenamiento
	 */
	public DispositivosElectronico(String marca, int ram, int almacenamiento) {
		super();
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
	}

	/**
	 * Constructor con todos los atributos del dispositivo electrónico.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 * @param marca Marca
	 * @param ram Memoria RAM
	 * @param almacenamiento Almacenamiento
	 */
	public DispositivosElectronico(String nombre, int id, String descripcion, float precio, String imagen, String marca,
			int ram, int almacenamiento) {
		super(nombre, id, descripcion, precio, imagen);
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
	}

	/**
	 * Constructor con atributos básicos de artículo.
	 * @param nombre Nombre
	 * @param id Identificador
	 * @param descripcion Descripción
	 * @param precio Precio
	 * @param imagen Imagen
	 */
	public DispositivosElectronico(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}



	/**
	 * Obtiene la marca del dispositivo electrónico.
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * Establece la marca del dispositivo electrónico.
	 * @param marca marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * Obtiene la memoria RAM del dispositivo electrónico.
	 * @return memoria RAM
	 */
	public int getRam() {
		return ram;
	}


	/**
	 * Establece la memoria RAM del dispositivo electrónico.
	 * @param ram memoria RAM
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}


	/**
	 * Obtiene el almacenamiento del dispositivo electrónico.
	 * @return almacenamiento
	 */
	public int getAlmacenamiento() {
		return almacenamiento;
	}


	/**
	 * Establece el almacenamiento del dispositivo electrónico.
	 * @param almacenamiento almacenamiento
	 */
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}


	/**
	 * Devuelve una representación en cadena del dispositivo electrónico.
	 * @return cadena con los datos del dispositivo
	 */
	@Override
	public String toString() {
		return "DispositivosElectronico [marca=" + marca + ", ram=" + ram + ", almacenamiento=" + almacenamiento + "]";
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
}

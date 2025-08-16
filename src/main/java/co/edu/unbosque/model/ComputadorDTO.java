package co.edu.unbosque.model;

import java.io.Serializable;

public class ComputadorDTO extends DispositivosElectronico implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String procesador;
	private String tipo;
	private boolean tieneTargetaGrafica;
	
 	public ComputadorDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ComputadorDTO(String procesador, String tipo, boolean tieneTargetaGrafica) {
		super();
		this.procesador = procesador;
		this.tipo = tipo;
		this.tieneTargetaGrafica = tieneTargetaGrafica;
	}

	public ComputadorDTO(String nombre, int id, String descripcion, float precio, String imagen, String marca, int ram,
			int almacenamiento, String procesador, String tipo, boolean tieneTargetaGrafica) {
		super(nombre, id, descripcion, precio, imagen, marca, ram, almacenamiento);
		this.procesador = procesador;
		this.tipo = tipo;
		this.tieneTargetaGrafica = tieneTargetaGrafica;
	}

	public ComputadorDTO(String nombre, int id, String descripcion, float precio, String imagen, String marca, int ram,
			int almacenamiento) {
		super(nombre, id, descripcion, precio, imagen, marca, ram, almacenamiento);
		// TODO Auto-generated constructor stub
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isTieneTargetaGrafica() {
		return tieneTargetaGrafica;
	}

	public void setTieneTargetaGrafica(boolean tieneTargetaGrafica) {
		this.tieneTargetaGrafica = tieneTargetaGrafica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Computador [procesador=" + procesador + ", tipo=" + tipo + ", tieneTargetaGrafica="
				+ tieneTargetaGrafica + "]";
	}
	
	

}

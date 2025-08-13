package co.edu.unbosque.model;

import java.io.Serializable;

public class UtilElectronico extends Papeleria implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoDispositivo;
	private boolean bateriaIncluida;
	
	
	public UtilElectronico() {
		// TODO Auto-generated constructor stub
	}

	public UtilElectronico(String tipoDispositivo, boolean bateriaIncluida) {
		super();
		this.tipoDispositivo = tipoDispositivo;
		this.bateriaIncluida = bateriaIncluida;
	}

	public UtilElectronico(String nombre, int id, String descripcion, float precio, String imagen, String tipo,
			String tamano, String forma, String tipoDispositivo, boolean bateriaIncluida) {
		super(nombre, id, descripcion, precio, imagen, tipo, tamano, forma);
		this.tipoDispositivo = tipoDispositivo;
		this.bateriaIncluida = bateriaIncluida;
	}

	public UtilElectronico(String nombre, int id, String descripcion, float precio, String imagen, String tipo,
			String tamano, String forma) {
		super(nombre, id, descripcion, precio, imagen, tipo, tamano, forma);
		// TODO Auto-generated constructor stub
	}

	public String getTipoDispositivo() {
		return tipoDispositivo;
	}


	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}


	public boolean isBateriaIncluida() {
		return bateriaIncluida;
	}


	public void setBateriaIncluida(boolean bateriaIncluida) {
		this.bateriaIncluida = bateriaIncluida;
	}


	@Override
	public String toString() {
		return "UtilesElectronico [tipoDispositivo=" + tipoDispositivo + ", bateriaIncluida=" + bateriaIncluida + "]";
	}
	
	
	
	
	

	
	
	
}

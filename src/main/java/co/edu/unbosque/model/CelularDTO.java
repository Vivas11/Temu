package co.edu.unbosque.model;

import java.io.Serializable;

public class CelularDTO extends DispositivosElectronico implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String procesador;
	private int resolucionCamra;
	
	
	public CelularDTO() {
		// TODO Auto-generated constructor stub
	}


	public CelularDTO(String procesador, int resolucionCamra) {
		super();
		this.procesador = procesador;
		this.resolucionCamra = resolucionCamra;
	}


	public CelularDTO(String nombre, int id, String descripcion, float precio, String imagen, String marca, int ram,
			int almacenamiento, String procesador, int resolucionCamra) {
		super(nombre, id, descripcion, precio, imagen, marca, ram, almacenamiento);
		this.procesador = procesador;
		this.resolucionCamra = resolucionCamra;
	}


	public CelularDTO(String marca, int ram, int almacenamiento) {
		super(marca, ram, almacenamiento);
		// TODO Auto-generated constructor stub
	}


	public CelularDTO(String nombre, int id, String descripcion, float precio, String imagen, String marca, int ram,
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


	public int getResolucionCamra() {
		return resolucionCamra;
	}


	public void setResolucionCamra(int resolucionCamra) {
		this.resolucionCamra = resolucionCamra;
	}


	@Override
	public String toString() {
		return "Celular [procesador=" + procesador + ", resolucionCamra=" + resolucionCamra + "]";
	}
	
	


	

}

package co.edu.unbosque.model;

import java.io.Serializable;

public class PelucheAnimal extends Peluche implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String especie;
	private boolean sonidoIncluido;
	
	
	public PelucheAnimal() {
		// TODO Auto-generated constructor stub
	}
	
	public PelucheAnimal(String especie, boolean sonidoIncluido) {
		super();
		this.especie = especie;
		this.sonidoIncluido = sonidoIncluido;
	}

	public PelucheAnimal(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String color, String material, String especie, boolean sonidoIncluido) {
		super(nombre, id, descripcion, precio, imagen, tamano, color, material);
		this.especie = especie;
		this.sonidoIncluido = sonidoIncluido;
	}

	public PelucheAnimal(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String color, String material) {
		super(nombre, id, descripcion, precio, imagen, tamano, color, material);
		// TODO Auto-generated constructor stub
	}

	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public boolean isSonidoIncluido() {
		return sonidoIncluido;
	}


	public void setSonidoIncluido(boolean sonidoIncluido) {
		this.sonidoIncluido = sonidoIncluido;
	}


	@Override
	public String toString() {
		return "PelucheAnimal [especie=" + especie + ", sonidoIncluido=" + sonidoIncluido + "]";
	}
	
	
	
	
	

}

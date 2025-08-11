package co.edu.unbosque.model;

import java.io.Serializable;

public class PeluchePersonajeDTO extends Peluche implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String personaje;
	
	
	public PeluchePersonajeDTO() {
		// TODO Auto-generated constructor stub
	}


	public PeluchePersonajeDTO(String personaje) {
		super();
		this.personaje = personaje;
	}


	public PeluchePersonajeDTO(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String color, String material, String personaje) {
		super(nombre, id, descripcion, precio, imagen, tamano, color, material);
		this.personaje = personaje;
	}


	public PeluchePersonajeDTO(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String color, String material) {
		super(nombre, id, descripcion, precio, imagen, tamano, color, material);
		// TODO Auto-generated constructor stub
	}


	public PeluchePersonajeDTO(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}


	public PeluchePersonajeDTO(String tamano, String color, String material) {
		super(tamano, color, material);
		// TODO Auto-generated constructor stub
	}


	public String getPersonaje() {
		return personaje;
	}


	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}


	@Override
	public String toString() {
		return "PeluchePersonaje [personaje=" + personaje + "]";
	}
	
	
	
	
	

}

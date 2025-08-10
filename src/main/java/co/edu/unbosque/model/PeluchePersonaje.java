package co.edu.unbosque.model;

public class PeluchePersonaje extends Peluche {
	
	private String personaje;
	
	
	public PeluchePersonaje() {
		// TODO Auto-generated constructor stub
	}


	public PeluchePersonaje(String personaje) {
		super();
		this.personaje = personaje;
	}


	public PeluchePersonaje(String nombre, int id, String descripcion, float precio, String tamano, String color,
			String material, String personaje) {
		super(nombre, id, descripcion, precio, tamano, color, material);
		this.personaje = personaje;
	}


	public PeluchePersonaje(String nombre, int id, String descripcion, float precio, String tamano, String color,
			String material) {
		super(nombre, id, descripcion, precio, tamano, color, material);
		// TODO Auto-generated constructor stub
	}


	public PeluchePersonaje(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}


	public PeluchePersonaje(String tamano, String color, String material) {
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

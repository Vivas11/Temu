package co.edu.unbosque.model;

public class Maquillaje extends Articulo {
	
	private String  color;
	private float contenidoEnGramo;

	public Maquillaje() {
		// TODO Auto-generated constructor stub
	}

	public Maquillaje(String color, float contenidoEnGramo) {
		super();
		this.color = color;
		this.contenidoEnGramo = contenidoEnGramo;
	}

	public Maquillaje(String nombre, int id, String descripcion, float precio, String color, float contenidoEnGramo) {
		super(nombre, id, descripcion, precio);
		this.color = color;
		this.contenidoEnGramo = contenidoEnGramo;
	}

	public Maquillaje(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getContenidoEnGramo() {
		return contenidoEnGramo;
	}

	public void setContenidoEnGramo(float contenidoEnGramo) {
		this.contenidoEnGramo = contenidoEnGramo;
	}

	@Override
	public String toString() {
		return "Maquillaje [color=" + color + ", contenidoEnGramo=" + contenidoEnGramo + "]";
	}
	
	
}

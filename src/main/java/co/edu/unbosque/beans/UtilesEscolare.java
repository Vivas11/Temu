package co.edu.unbosque.beans;

public class UtilesEscolare extends Papeleria {
	private String color;
	private int edadRecomendada;
	
	
	public UtilesEscolare() {
		// TODO Auto-generated constructor stub
	}


	public UtilesEscolare(String color, int edadRecomendada) {
		super();
		this.color = color;
		this.edadRecomendada = edadRecomendada;
	}


	public UtilesEscolare(String nombre, int id, String descripcion, float precio, String tipo, String tamano,
			String forma, String color, int edadRecomendada) {
		super(nombre, id, descripcion, precio, tipo, tamano, forma);
		this.color = color;
		this.edadRecomendada = edadRecomendada;
	}


	public UtilesEscolare(String nombre, int id, String descripcion, float precio, String tipo, String tamano,
			String forma) {
		super(nombre, id, descripcion, precio, tipo, tamano, forma);
		// TODO Auto-generated constructor stub
	}


	public UtilesEscolare(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}


	public UtilesEscolare(String tipo, String tamano, String forma) {
		super(tipo, tamano, forma);
		// TODO Auto-generated constructor stub
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getEdadRecomendada() {
		return edadRecomendada;
	}


	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}


	@Override
	public String toString() {
		return "UtilesEscolare [color=" + color + ", edadRecomendada=" + edadRecomendada + "]";
	}
	
	
	
	

}

package co.edu.unbosque.model;

import java.io.Serializable;

public class UtilEscolarDTO extends Papeleria implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String color;
	private int edadRecomendada;
	
	
	public UtilEscolarDTO() {
		// TODO Auto-generated constructor stub
	}


	public UtilEscolarDTO(String color, int edadRecomendada) {
		super();
		this.color = color;
		this.edadRecomendada = edadRecomendada;
	}


	public UtilEscolarDTO(String nombre, int id, String descripcion, float precio, String imagen, String tipo,
			String tamano, String forma, String color, int edadRecomendada) {
		super(nombre, id, descripcion, precio, imagen, tipo, tamano, forma);
		this.color = color;
		this.edadRecomendada = edadRecomendada;
	}


	public UtilEscolarDTO(String nombre, int id, String descripcion, float precio, String imagen, String tipo,
			String tamano, String forma) {
		super(nombre, id, descripcion, precio, imagen, tipo, tamano, forma);
		// TODO Auto-generated constructor stub
	}


	public UtilEscolarDTO(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}


	public UtilEscolarDTO(String tipo, String tamano, String forma) {
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

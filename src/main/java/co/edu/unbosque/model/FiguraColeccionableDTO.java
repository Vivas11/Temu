package co.edu.unbosque.model;

import java.io.Serializable;

public class FiguraColeccionableDTO  extends Juguete implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoDeFigura;
	private float valorEnMercado;
	
	public FiguraColeccionableDTO() {
		// TODO Auto-generated constructor stub
	}

	public FiguraColeccionableDTO(String tipoDeFigura, float valorEnMercado) {
		super();
		this.tipoDeFigura = tipoDeFigura;
		this.valorEnMercado = valorEnMercado;
	}

	public FiguraColeccionableDTO(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material, String tipoDeFigura, float valorEnMercado) {
		super(nombre, id, descripcion, precio, imagen, tamano, material);
		this.tipoDeFigura = tipoDeFigura;
		this.valorEnMercado = valorEnMercado;
	}

	public FiguraColeccionableDTO(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material) {
		super(nombre, id, descripcion, precio, imagen, tamano, material);
		// TODO Auto-generated constructor stub
	}

	public String getTipoDeFigura() {
		return tipoDeFigura;
	}

	public void setTipoDeFigura(String tipoDeFigura) {
		this.tipoDeFigura = tipoDeFigura;
	}

	public float getValorEnMercado() {
		return valorEnMercado;
	}

	public void setValorEnMercado(float valorEnMercado) {
		this.valorEnMercado = valorEnMercado;
	}

	@Override
	public String toString() {
		return "FiguraColeccionable [tipoDeFigura=" + tipoDeFigura + ", valorEnMercado=" + valorEnMercado + "]";
	}
}

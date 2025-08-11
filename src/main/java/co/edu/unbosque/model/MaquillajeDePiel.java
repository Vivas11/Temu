package co.edu.unbosque.model;

import java.io.Serializable;

public class MaquillajeDePiel extends Maquillaje implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tipo;
	private boolean esEcoamigable;

	public MaquillajeDePiel() {
		// TODO Auto-generated constructor stub
	}

	public MaquillajeDePiel(int tipo, boolean esEcoamigable) {
		super();
		this.tipo = tipo;
		this.esEcoamigable = esEcoamigable;
	}

	public MaquillajeDePiel(String nombre, int id, String descripcion, float precio, String imagen, String color,
			float contenidoEnGramo, int tipo, boolean esEcoamigable) {
		super(nombre, id, descripcion, precio, imagen, color, contenidoEnGramo);
		this.tipo = tipo;
		this.esEcoamigable = esEcoamigable;
	}

	public MaquillajeDePiel(String color, float contenidoEnGramo) {
		super(color, contenidoEnGramo);
		// TODO Auto-generated constructor stub
	}

	public MaquillajeDePiel(String nombre, int id, String descripcion, float precio, String imagen, String color,
			float contenidoEnGramo) {
		super(nombre, id, descripcion, precio, imagen, color, contenidoEnGramo);
		// TODO Auto-generated constructor stub
	}

	public MaquillajeDePiel(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isEsEcoamigable() {
		return esEcoamigable;
	}

	public void setEsEcoamigable(boolean esEcoamigable) {
		this.esEcoamigable = esEcoamigable;
	}

	@Override
	public String toString() {
		return "MaquillaDepiel [tipo=" + tipo + ", esEcoamigable=" + esEcoamigable + "]";
	}

}

package co.edu.unbosque.model;

public class Papeleria extends Articulo {
	
	private String tipo;
	private String tamano;
	private String forma;
	
	
	public Papeleria() {
		// TODO Auto-generated constructor stub
	}


	public Papeleria(String tipo, String tamano, String forma) {
		super();
		this.tipo = tipo;
		this.tamano = tamano;
		this.forma = forma;
	}


	public Papeleria(String nombre, int id, String descripcion, float precio, String imagen, String tipo, String tamano,
			String forma) {
		super(nombre, id, descripcion, precio, imagen);
		this.tipo = tipo;
		this.tamano = tamano;
		this.forma = forma;
	}


	public Papeleria(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getTamano() {
		return tamano;
	}


	public void setTamano(String tamano) {
		this.tamano = tamano;
	}


	public String getForma() {
		return forma;
	}


	public void setForma(String forma) {
		this.forma = forma;
	}


	@Override
	public String toString() {
		return "Papeleria [tipo=" + tipo + ", tamano=" + tamano + ", forma=" + forma + "]";
	}
	
	




	

}

package co.edu.unbosque.model;

public class MaquillaDepiel extends Maquillaje {
	
	private int tipo;
	private boolean esEcoamigable;
	
	
	public MaquillaDepiel() {
		// TODO Auto-generated constructor stub
	}


	public MaquillaDepiel(int tipo, boolean esEcoamigable) {
		super();
		this.tipo = tipo;
		this.esEcoamigable = esEcoamigable;
	}


	public MaquillaDepiel(String nombre, int id, String descripcion, float precio, String color, float contenidoEnGramo,
			int tipo, boolean esEcoamigable) {
		super(nombre, id, descripcion, precio, color, contenidoEnGramo);
		this.tipo = tipo;
		this.esEcoamigable = esEcoamigable;
	}


	public MaquillaDepiel(String color, float contenidoEnGramo) {
		super(color, contenidoEnGramo);
		// TODO Auto-generated constructor stub
	}


	public MaquillaDepiel(String nombre, int id, String descripcion, float precio, String color,
			float contenidoEnGramo) {
		super(nombre, id, descripcion, precio, color, contenidoEnGramo);
		// TODO Auto-generated constructor stub
	}


	public MaquillaDepiel(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
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

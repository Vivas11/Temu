package co.edu.unbosque.beans;

public class JuegoDeMesa extends Juguete{
	
	private int numeroJugadore;
	private String tipoDeJuego;
	
	
	
	public JuegoDeMesa() {
		// TODO Auto-generated constructor stub
	}



	public JuegoDeMesa(int numeroJugadore, String tipoDeJuego) {
		super();
		this.numeroJugadore = numeroJugadore;
		this.tipoDeJuego = tipoDeJuego;
	}



	public JuegoDeMesa(String nombre, int id, String descripcion, float precio, String tamano, String material,
			int numeroJugadore, String tipoDeJuego) {
		super(nombre, id, descripcion, precio, tamano, material);
		this.numeroJugadore = numeroJugadore;
		this.tipoDeJuego = tipoDeJuego;
	}



	public JuegoDeMesa(String nombre, int id, String descripcion, float precio, String tamano, String material) {
		super(nombre, id, descripcion, precio, tamano, material);
		// TODO Auto-generated constructor stub
	}



	public JuegoDeMesa(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}



	public JuegoDeMesa(String tamano, String material) {
		super(tamano, material);
		// TODO Auto-generated constructor stub
	}



	public int getNumeroJugadore() {
		return numeroJugadore;
	}



	public void setNumeroJugadore(int numeroJugadore) {
		this.numeroJugadore = numeroJugadore;
	}



	public String getTipoDeJuego() {
		return tipoDeJuego;
	}



	public void setTipoDeJuego(String tipoDeJuego) {
		this.tipoDeJuego = tipoDeJuego;
	}



	@Override
	public String toString() {
		return "JuegoDeMesa [numeroJugadore=" + numeroJugadore + ", tipoDeJuego=" + tipoDeJuego + "]";
	}
	
	
	
	
	

}

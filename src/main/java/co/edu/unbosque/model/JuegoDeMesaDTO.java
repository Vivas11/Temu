package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegoDeMesaDTO extends Juguete implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroJugadore;
	private String tipoDeJuego;
	
	
	
	public JuegoDeMesaDTO() {
		// TODO Auto-generated constructor stub
	}

	public JuegoDeMesaDTO(int numeroJugadore, String tipoDeJuego) {
		super();
		this.numeroJugadore = numeroJugadore;
		this.tipoDeJuego = tipoDeJuego;
	}

	public JuegoDeMesaDTO(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material, int numeroJugadore, String tipoDeJuego) {
		super(nombre, id, descripcion, precio, imagen, tamano, material);
		this.numeroJugadore = numeroJugadore;
		this.tipoDeJuego = tipoDeJuego;
	}

	public JuegoDeMesaDTO(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material) {
		super(nombre, id, descripcion, precio, imagen, tamano, material);
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

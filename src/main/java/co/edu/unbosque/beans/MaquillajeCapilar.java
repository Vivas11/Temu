package co.edu.unbosque.beans;

public class MaquillajeCapilar extends Maquillaje{
	private boolean resistenciaAgua;
	private int duracionHora;
	
	public MaquillajeCapilar() {
		// TODO Auto-generated constructor stub
	}

	public MaquillajeCapilar(boolean resistenciaAgua, int duracionHora) {
		super();
		this.resistenciaAgua = resistenciaAgua;
		this.duracionHora = duracionHora;
	}

	public MaquillajeCapilar(String nombre, int id, String descripcion, float precio, String color,
			float contenidoEnGramo, boolean resistenciaAgua, int duracionHora) {
		super(nombre, id, descripcion, precio, color, contenidoEnGramo);
		this.resistenciaAgua = resistenciaAgua;
		this.duracionHora = duracionHora;
	}

	public MaquillajeCapilar(String color, float contenidoEnGramo) {
		super(color, contenidoEnGramo);
		// TODO Auto-generated constructor stub
	}

	public MaquillajeCapilar(String nombre, int id, String descripcion, float precio, String color,
			float contenidoEnGramo) {
		super(nombre, id, descripcion, precio, color, contenidoEnGramo);
		// TODO Auto-generated constructor stub
	}

	public MaquillajeCapilar(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	public boolean isResistenciaAgua() {
		return resistenciaAgua;
	}

	public void setResistenciaAgua(boolean resistenciaAgua) {
		this.resistenciaAgua = resistenciaAgua;
	}

	public int getDuracionHora() {
		return duracionHora;
	}

	public void setDuracionHora(int duracionHora) {
		this.duracionHora = duracionHora;
	}

	@Override
	public String toString() {
		return "MaquillajeCapilar [resistenciaAgua=" + resistenciaAgua + ", duracionHora=" + duracionHora + "]";
	}
	
	
	
	
	

 
	
	
	
}

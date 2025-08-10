package co.edu.unbosque.model;

public class Computador extends DispositivosElectronico{
	private int procesador;
	private String tipo;
	private boolean tieneTargetaGrafica;
	
	
	public Computador() {
		// TODO Auto-generated constructor stub
	}


	public Computador(int procesador, String tipo, boolean tieneTargetaGrafica) {
		super();
		this.procesador = procesador;
		this.tipo = tipo;
		this.tieneTargetaGrafica = tieneTargetaGrafica;
	}


	public Computador(String nombre, int id, String descripcion, float precio, String marca, int ram,
			int almacenamiento, int procesador, String tipo, boolean tieneTargetaGrafica) {
		super(nombre, id, descripcion, precio, marca, ram, almacenamiento);
		this.procesador = procesador;
		this.tipo = tipo;
		this.tieneTargetaGrafica = tieneTargetaGrafica;
	}


	public Computador(String marca, int ram, int almacenamiento) {
		super(marca, ram, almacenamiento);
		// TODO Auto-generated constructor stub
	}


	public Computador(String nombre, int id, String descripcion, float precio, String marca, int ram,
			int almacenamiento) {
		super(nombre, id, descripcion, precio, marca, ram, almacenamiento);
		// TODO Auto-generated constructor stub
	}


	public Computador(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}


	public int getProcesador() {
		return procesador;
	}


	public void setProcesador(int procesador) {
		this.procesador = procesador;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public boolean isTieneTargetaGrafica() {
		return tieneTargetaGrafica;
	}


	public void setTieneTargetaGrafica(boolean tieneTargetaGrafica) {
		this.tieneTargetaGrafica = tieneTargetaGrafica;
	}


	@Override
	public String toString() {
		return "Computador [procesador=" + procesador + ", tipo=" + tipo + ", tieneTargetaGrafica="
				+ tieneTargetaGrafica + "]";
	}
	
	
	


	
	
	

}

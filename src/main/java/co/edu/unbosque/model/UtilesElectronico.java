package co.edu.unbosque.model;

public class UtilesElectronico extends Papeleria{
	private String tipoDispositivo;
	private boolean bateriaIncluida;
	
	
	public UtilesElectronico() {
		// TODO Auto-generated constructor stub
	}


	public UtilesElectronico(String tipoDispositivo, boolean bateriaIncluida) {
		super();
		this.tipoDispositivo = tipoDispositivo;
		this.bateriaIncluida = bateriaIncluida;
	}


	public UtilesElectronico(String nombre, int id, String descripcion, float precio, String tipo, String tamano,
			String forma, String tipoDispositivo, boolean bateriaIncluida) {
		super(nombre, id, descripcion, precio, tipo, tamano, forma);
		this.tipoDispositivo = tipoDispositivo;
		this.bateriaIncluida = bateriaIncluida;
	}


	public UtilesElectronico(String nombre, int id, String descripcion, float precio, String tipo, String tamano,
			String forma) {
		super(nombre, id, descripcion, precio, tipo, tamano, forma);
		// TODO Auto-generated constructor stub
	}


	public UtilesElectronico(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}


	public UtilesElectronico(String tipo, String tamano, String forma) {
		super(tipo, tamano, forma);
		// TODO Auto-generated constructor stub
	}


	public String getTipoDispositivo() {
		return tipoDispositivo;
	}


	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}


	public boolean isBateriaIncluida() {
		return bateriaIncluida;
	}


	public void setBateriaIncluida(boolean bateriaIncluida) {
		this.bateriaIncluida = bateriaIncluida;
	}


	@Override
	public String toString() {
		return "UtilesElectronico [tipoDispositivo=" + tipoDispositivo + ", bateriaIncluida=" + bateriaIncluida + "]";
	}
	
	
	

	
	
	
}

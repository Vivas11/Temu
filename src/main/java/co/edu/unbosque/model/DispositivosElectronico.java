package co.edu.unbosque.model;

public abstract class DispositivosElectronico  extends Articulo{

	private String marca;
	private int ram;
	private int almacenamiento;
	
	
	public DispositivosElectronico() {
		// TODO Auto-generated constructor stub
	}


	public DispositivosElectronico(String marca, int ram, int almacenamiento) {
		super();
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
	}


	public DispositivosElectronico(String nombre, int id, String descripcion, float precio, String imagen, String marca,
			int ram, int almacenamiento) {
		super(nombre, id, descripcion, precio, imagen);
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getAlmacenamiento() {
		return almacenamiento;
	}


	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}


	@Override
	public String toString() {
		return "DispositivosElectronico [marca=" + marca + ", ram=" + ram + ", almacenamiento=" + almacenamiento + "]";
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
}

package co.edu.unbosque.model;

public abstract class Juguete  extends Articulo{

	private String tamano;
	private String material;
	
	
	public Juguete() {
		// TODO Auto-generated constructor stub
	}

	public Juguete(String tamano, String material) {
		super();
		this.tamano = tamano;
		this.material = material;
	}

	public Juguete(String nombre, int id, String descripcion, float precio, String imagen, String tamano,
			String material) {
		super(nombre, id, descripcion, precio, imagen);
		this.tamano = tamano;
		this.material = material;
	}

	public Juguete(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}

	public String getTamano() {
		return tamano;
	}


	public void setTamano(String tamano) {
		this.tamano = tamano;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "Juguete [tamano=" + tamano + ", material=" + material + "]";
	}
	
	


	
	
	
	
	
	
	
}

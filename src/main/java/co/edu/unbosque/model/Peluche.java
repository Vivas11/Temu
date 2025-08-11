package co.edu.unbosque.model;

public abstract class Peluche extends Articulo{
	
	private String tamano;
	private String color;
	private String material;
	
	public Peluche() {
		// TODO Auto-generated constructor stub
	}

	public Peluche(String tamano, String color, String material) {
		super();
		this.tamano = tamano;
		this.color = color;
		this.material = material;
	}

	public Peluche(String nombre, int id, String descripcion, float precio, String imagen, String tamano, String color,
			String material) {
		super(nombre, id, descripcion, precio, imagen);
		this.tamano = tamano;
		this.color = color;
		this.material = material;
	}

	public Peluche(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Peluche [tamano=" + tamano + ", color=" + color + ", material=" + material + "]";
	}
	
	
	
	
	
	
	

}

package co.edu.unbosque.model;

public abstract  class Ropa extends Articulo {
	
	private String tipoPrenda;
	private String talla;
	private String material;
	
	public Ropa() {
		// TODO Auto-generated constructor stub
	}

	public Ropa(String tipoPrenda, String talla, String material) {
		super();
		this.tipoPrenda = tipoPrenda;
		this.talla = talla;
		this.material = material;
	}

	public Ropa(String nombre, int id, String descripcion, float precio, String imagen, String tipoPrenda, String talla,
			String material) {
		super(nombre, id, descripcion, precio, imagen);
		this.tipoPrenda = tipoPrenda;
		this.talla = talla;
		this.material = material;
	}

	public Ropa(String nombre, int id, String descripcion, float precio, String imagen) {
		super(nombre, id, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}

	public String getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Ropa [tipoPrenda=" + tipoPrenda + ", talla=" + talla + ", material=" + material + "]";
	}
	
	
	
	

}

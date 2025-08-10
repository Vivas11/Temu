package co.edu.unbosque.model;

public class RopaMujer extends Ropa{
	private String largoPrenda;
	
	public RopaMujer() {
		// TODO Auto-generated constructor stub
	}

	public RopaMujer(String largoPrenda) {
		super();
		this.largoPrenda = largoPrenda;
	}

	public RopaMujer(String nombre, int id, String descripcion, float precio, String tipoPrenda, String talla,
			String material, String largoPrenda) {
		super(nombre, id, descripcion, precio, tipoPrenda, talla, material);
		this.largoPrenda = largoPrenda;
	}

	public RopaMujer(String nombre, int id, String descripcion, float precio, String tipoPrenda, String talla,
			String material) {
		super(nombre, id, descripcion, precio, tipoPrenda, talla, material);
		// TODO Auto-generated constructor stub
	}

	public RopaMujer(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	public RopaMujer(String tipoPrenda, String talla, String material) {
		super(tipoPrenda, talla, material);
		// TODO Auto-generated constructor stub
	}

	public String getLargoPrenda() {
		return largoPrenda;
	}

	public void setLargoPrenda(String largoPrenda) {
		this.largoPrenda = largoPrenda;
	}

	@Override
	public String toString() {
		return "RopaMujer [largoPrenda=" + largoPrenda + "]";
	}
	
	
	

}

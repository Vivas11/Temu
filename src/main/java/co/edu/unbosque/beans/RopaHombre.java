package co.edu.unbosque.beans;

public class RopaHombre  extends  Ropa{

	private String corte;
	
	public RopaHombre() {
		// TODO Auto-generated constructor stub
	}

	public RopaHombre(String corte) {
		super();
		this.corte = corte;
	}

	public RopaHombre(String nombre, int id, String descripcion, float precio, String tipoPrenda, String talla,
			String material, String corte) {
		super(nombre, id, descripcion, precio, tipoPrenda, talla, material);
		this.corte = corte;
	}

	public RopaHombre(String nombre, int id, String descripcion, float precio, String tipoPrenda, String talla,
			String material) {
		super(nombre, id, descripcion, precio, tipoPrenda, talla, material);
		// TODO Auto-generated constructor stub
	}

	public RopaHombre(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	public RopaHombre(String tipoPrenda, String talla, String material) {
		super(tipoPrenda, talla, material);
		// TODO Auto-generated constructor stub
	}

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}

	@Override
	public String toString() {
		return "RopaHombre [corte=" + corte + "]";
	}
	
	
}

package co.edu.unbosque.model;

public class FiguraColeccionable  extends Juguete{
	
	private String tipoDeFigura;
	private float valorEnMercado;
	
	public FiguraColeccionable() {
		// TODO Auto-generated constructor stub
	}

	public FiguraColeccionable(String tipoDeFigura, float valorEnMercado) {
		super();
		this.tipoDeFigura = tipoDeFigura;
		this.valorEnMercado = valorEnMercado;
	}

	public FiguraColeccionable(String nombre, int id, String descripcion, float precio, String tamano, String material,
			String tipoDeFigura, float valorEnMercado) {
		super(nombre, id, descripcion, precio, tamano, material);
		this.tipoDeFigura = tipoDeFigura;
		this.valorEnMercado = valorEnMercado;
	}

	public FiguraColeccionable(String nombre, int id, String descripcion, float precio, String tamano,
			String material) {
		super(nombre, id, descripcion, precio, tamano, material);
		// TODO Auto-generated constructor stub
	}

	public FiguraColeccionable(String nombre, int id, String descripcion, float precio) {
		super(nombre, id, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	public FiguraColeccionable(String tamano, String material) {
		super(tamano, material);
		// TODO Auto-generated constructor stub
	}

	public String getTipoDeFigura() {
		return tipoDeFigura;
	}

	public void setTipoDeFigura(String tipoDeFigura) {
		this.tipoDeFigura = tipoDeFigura;
	}

	public float getValorEnMercado() {
		return valorEnMercado;
	}

	public void setValorEnMercado(float valorEnMercado) {
		this.valorEnMercado = valorEnMercado;
	}

	@Override
	public String toString() {
		return "FiguraColeccionable [tipoDeFigura=" + tipoDeFigura + ", valorEnMercado=" + valorEnMercado + "]";
	}
	
	
	
	
	
	

}

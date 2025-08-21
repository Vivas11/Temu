package co.edu.unbosque.model;

public abstract class  Articulo {
	
	private String nombre;
	private int id;
	private String descripcion;
	private float precio;
	private String imagen;
	

    private static int contador = 1;
	
	public Articulo() {
		// TODO Auto-generated constructor stub
	}



	public Articulo(String nombre, int id, String descripcion, float precio, String imagen) {
		super();
		this.nombre = nombre;
        this.id = contador++;
		this.descripcion = descripcion;
		this.precio = precio;
		this.imagen = imagen;
		contador++;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", id=" + id + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", imagen=" + imagen + "]";
	}



	
	
	
	
	
	

}

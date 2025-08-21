/**
 * Paquete que contiene los beans para la gestión de artículos electrónicos.
 */
package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.service.ArticuloService;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
@Named(value = "electronicabean")
@ViewScoped
/**
 * Bean para la gestión de la vista de artículos electrónicos.
 */
public class ElectronicaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	/** Página actual de la paginación */
	private int paginaActual = 1;
	/** Cantidad de artículos por página */
	private int articulosPorPagina = 5;
	/** Lista de artículos electrónicos */
	ArrayList<Articulo> electronica;
	/** Servicio para operaciones sobre artículos */
	private ArticuloService articuloService;

	/**
	 * Constructor. Inicializa el servicio de artículo.
	 */
	public ElectronicaBean() {
		articuloService = new ArticuloService();
	}
	
	/**
	 * Obtiene la lista paginada de artículos electrónicos.
	 * @return lista de artículos electrónicos
	 */
	public List<Articulo> getArticulos() {
		electronica = ModelFacade.obtenerArticulosElectronica();

		int inicio = (paginaActual - 1) * articulosPorPagina;
		int fin = Math.min(inicio + articulosPorPagina, electronica.size());

		if (inicio > electronica.size()) {
			return new ArrayList<>();
		}

		return electronica.subList(inicio, fin);
	}

	/**
	 * Obtiene el total de páginas para la paginación.
	 * @return total de páginas
	 */
	public int getTotalPaginas() {
		int total = electronica.size();
		return (int) Math.ceil((double) total / articulosPorPagina);
	}

	/**
	 * Obtiene la página actual.
	 * @return página actual
	 */
	public int getPaginaActual() {
		return paginaActual;
	}

	/**
	 * Establece la página actual.
	 * @param paginaActual Página a establecer
	 */
	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}

	/**
	 * Avanza a la siguiente página.
	 * @return null
	 */
	public String siguientePagina() {
		if (paginaActual < getTotalPaginas()) {
			paginaActual++;
		}
		return null;
	}

	/**
	 * Retrocede a la página anterior.
	 * @return null
	 */
	public String paginaAnterior() {
		if (paginaActual > 1) {
			paginaActual--;
		}
		return null;
	}

	/**
	 * Agrega un artículo al carrito del usuario actual.
	 * @param art Artículo a agregar
	 */
	public void agregarAlCarrito(Articulo art) {
		if (ModelFacade.usuarioActual == null) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Atencion",
					"Se debe iniciar sesion antes de continuar");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
			articuloService.anadirAlCarrito(art);
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Producto añadido",
					art.getNombre() + " se añadió al carrito.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

	}
}

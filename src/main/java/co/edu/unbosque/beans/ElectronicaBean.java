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
public class ElectronicaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private int paginaActual = 1;
	private int articulosPorPagina = 5;
	ArrayList<Articulo> electronica;
	
	private ArticuloService articuloService;

	public ElectronicaBean() {
		articuloService = new ArticuloService();
	}
	
	public List<Articulo> getArticulos() {
		electronica = ModelFacade.obtenerArticulosElectronica();

		int inicio = (paginaActual - 1) * articulosPorPagina;
		int fin = Math.min(inicio + articulosPorPagina, electronica.size());

		if (inicio > electronica.size()) {
			return new ArrayList<>();
		}

		return electronica.subList(inicio, fin);
	}

	public int getTotalPaginas() {
		int total = electronica.size();
		return (int) Math.ceil((double) total / articulosPorPagina);
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}

	public String siguientePagina() {
		if (paginaActual < getTotalPaginas()) {
			paginaActual++;
		}
		return null;
	}

	public String paginaAnterior() {
		if (paginaActual > 1) {
			paginaActual--;
		}
		return null;
	}

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

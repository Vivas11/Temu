/**
 * Paquete que contiene los beans para la gestión de artículos y operaciones relacionadas.
 */
package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.Celular;
import co.edu.unbosque.model.CelularDTO;
import co.edu.unbosque.model.Computador;
import co.edu.unbosque.model.ComputadorDTO;
import co.edu.unbosque.model.FiguraColeccionable;
import co.edu.unbosque.model.FiguraColeccionableDTO;
import co.edu.unbosque.model.JuegoDeMesa;
import co.edu.unbosque.model.JuegoDeMesaDTO;
import co.edu.unbosque.model.MaquillajeCapilar;
import co.edu.unbosque.model.MaquillajeCapilarDTO;
import co.edu.unbosque.model.MaquillajeDePiel;
import co.edu.unbosque.model.MaquillajeDePielDTO;
import co.edu.unbosque.model.PelucheAnimal;
import co.edu.unbosque.model.PelucheAnimalDTO;
import co.edu.unbosque.model.PeluchePersonaje;
import co.edu.unbosque.model.PeluchePersonajeDTO;
/**
 * Bean para la gestión de artículos en la aplicación Temu.
 * Permite agregar, eliminar y listar artículos de diferentes tipos.
 */
import co.edu.unbosque.model.RopaHombre;
import co.edu.unbosque.model.RopaHombreDTO;
import co.edu.unbosque.model.RopaMujer;
import co.edu.unbosque.model.RopaMujerDTO;
import co.edu.unbosque.model.UtilElectronico;
import co.edu.unbosque.model.UtilElectronicoDTO;
import co.edu.unbosque.model.UtilEscolar;
import co.edu.unbosque.model.UtilEscolarDTO;
import co.edu.unbosque.model.persistence.DataMapper;
import co.edu.unbosque.service.CelularService;
import co.edu.unbosque.service.ComputadorService;
import co.edu.unbosque.service.FiguraColeccionableService;
import co.edu.unbosque.service.JuegoDeMesaService;
import co.edu.unbosque.service.MaquillajeCapilarService;
import co.edu.unbosque.service.MaquillajeDePielService;
import co.edu.unbosque.service.PelucheAnimalService;
import co.edu.unbosque.service.PeluchePersonajeService;
import co.edu.unbosque.service.RopaHombreService;
import co.edu.unbosque.service.RopaMujerService;
import co.edu.unbosque.service.UtilElectronicoService;
import co.edu.unbosque.service.UtilEscolarService;
import jakarta.inject.Named;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;

@Named(value = "gestionbean")
@ViewScoped
public class GestionBean implements Serializable {
	private static final long serialVersionUID = 1L;

	// Propiedades
//    private Object articuloNuevo; // Será del tipo DTO correspondiente
	private String tipoArticuloNuevo;
	private List<Articulo> todosArticulos;

	private String nombre;
	private String descripcion;
	private int precio;
	private String imagen;

	// Celular
	private String marca;
	private int ram;
	private int almacenamiento;
	private String procesador;
	private int resolucionCamra;

	// Computador
	private String tipo;
	private Boolean tieneTargetaGrafica;

	// FiguraColeccionable
	/**
	 * Tipo de figura coleccionable.
	 */
	private String tipoDeFigura;
	/**
	 * Valor en mercado de la figura.
	 */
	private Float valorEnMercado;
	/**
	 * Tamaño de la figura.
	 */
	private String tamano;
	/**
	 * Material de la figura.
	 */
	private String material;

	// JuegoDeMesa
	/**
	 * Número de jugadores.
	 */
	private int numeroJugadore;
	/**
	 * Tipo de juego de mesa.
	 */
	private String tipoDeJuego;
	/**
	 * Tamaño del juego de mesa.
	 */
	private String tamanoJuego;
	/**
	 * Material del juego de mesa.
	 */
	private String materialJuego;

	// MaquillajeCapilar
	/**
	 * Indica si es resistente al agua.
	 */
	private Boolean resistenciaAgua;
	/**
	 * Duración en horas.
	 */
	private int duracionHora;
	/**
	 * Color del maquillaje capilar.
	 */
	private String color;
	/**
	 * Contenido en gramos.
	 */
	private float contenidoEnGramo;

	// MaquillajeDePiel
	/**
	 * Tipo de maquillaje de piel.
	 */
	private int tipoMaquillaje;
	/**
	 * Indica si es ecoamigable.
	 */
	private Boolean esEcoamigable;
	/**
	 * Color de piel.
	 */
	private String colorPiel;
	/**
	 * Contenido en gramos de maquillaje de piel.
	 */
	private float contenidoEnGramoPiel;

	// PelucheAnimal
	/**
	 * Especie del peluche animal.
	 */
	private String especie;
	/**
	 * Indica si tiene sonido incluido.
	 */
	private Boolean sonidoIncluido;
	/**
	 * Color del peluche animal.
	 */
	private String colorPelucheAnimal;
	/**
	 * Tamaño del peluche animal.
	 */
	private String tamanoPeluche;
	/**
	 * Material del peluche animal.
	 */
	private String materialPeluche;

	// PeluchePersonaje
	/**
	 * Personaje del peluche.
	 */
	private String personaje;
	/**
	 * Color del peluche personaje.
	 */
	private String colorPeluchePersonaje;
	/**
	 * Tamaño del peluche personaje.
	 */
	private String tamanoPersonaje;
	/**
	 * Material del peluche personaje.
	 */
	private String materialPersonaje;

	// RopaHombre
	/**
	 * Corte de la ropa de hombre.
	 */
	private String corte;
	/**
	 * Tipo de prenda de ropa de hombre.
	 */
	private String tipoPrenda;
	/**
	 * Talla de la ropa de hombre.
	 */
	private String talla;
	/**
	 * Material de la ropa de hombre.
	 */
	private String materialRopaHombre;

	// RopaMujer
	/**
	 * Largo de la prenda de ropa de mujer.
	 */
	private String largoPrenda;
	/**
	 * Tipo de prenda de ropa de mujer.
	 */
	private String tipoPrendaMujer;
	/**
	 * Talla de la ropa de mujer.
	 */
	private String tallaMujer;
	/**
	 * Material de la ropa de mujer.
	 */
	private String materialRopaMujer;

	// UtilElectronico
	/**
	 * Tipo de dispositivo electrónico.
	 */
	private String tipoDispositivo;
	/**
	 * Indica si la batería está incluida.
	 */
	private Boolean bateriaIncluida;
	/**
	 * Forma del dispositivo electrónico.
	 */
	private String forma;
	/**
	 * Tamaño del dispositivo electrónico.
	 */
	private String tamanoElectronico;

	// UtilEscolar
	/**
	 * Color del útil escolar.
	 */
	private String colorUtilEscolar;
	/**
	 * Edad recomendada para el útil escolar.
	 */
	private int edadRecomendada;
	/**
	 * Forma del útil escolar.
	 */
	private String formaEscolar;
	/**
	 * Tamaño del útil escolar.
	 */
	private String tamanoEscolar;

//    public GestionBean() {
//        articuloNuevo = null;
//        cargarArticulos();
//
//    }
//
//    public void setArticuloNuevo(Articulo articuloNuevo) {
//        this.articuloNuevo = articuloNuevo;
//    }

	/**
	 * Constructor que inicializa la lista de artículos y los carga.
	 */
	public GestionBean() {
		todosArticulos = new ArrayList<>();
		cargarArticulos();
	}

	/**
	 * Obtiene el tipo de artículo nuevo a agregar.
	 * @return tipo de artículo
	 */
	public String getTipoArticuloNuevo() {
		return tipoArticuloNuevo;
	}

	/**
	 * Establece el tipo de artículo nuevo a agregar.
	 * @param tipoArticuloNuevo tipo de artículo
	 */
	public void setTipoArticuloNuevo(String tipoArticuloNuevo) {
		this.tipoArticuloNuevo = tipoArticuloNuevo;
	}
	
	

	/**
	 * Obtiene el tamaño de la figura.
	 * @return tamaño
	 */
	public String getTamano() {
		return tamano;
	}

	/**
	 * Establece el tamaño de la figura.
	 * @param tamano tamaño
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	/**
	 * Obtiene el material de la figura.
	 * @return material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Establece el material de la figura.
	 * @param material material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Obtiene el tamaño del juego de mesa.
	 * @return tamaño del juego
	 */
	public String getTamanoJuego() {
		return tamanoJuego;
	}

	/**
	 * Establece el tamaño del juego de mesa.
	 * @param tamanoJuego tamaño del juego
	 */
	public void setTamanoJuego(String tamanoJuego) {
		this.tamanoJuego = tamanoJuego;
	}

	/**
	 * Obtiene el material del juego de mesa.
	 * @return material del juego
	 */
	public String getMaterialJuego() {
		return materialJuego;
	}

	/**
	 * Establece el material del juego de mesa.
	 * @param materialJuego material del juego
	 */
	public void setMaterialJuego(String materialJuego) {
		this.materialJuego = materialJuego;
	}

	/**
	 * Obtiene el color del maquillaje capilar.
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Establece el color del maquillaje capilar.
	 * @param color color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Obtiene el contenido en gramos del maquillaje capilar.
	 * @return contenido en gramos
	 */
	public float getContenidoEnGramo() {
		return contenidoEnGramo;
	}

	/**
	 * Establece el contenido en gramos del maquillaje capilar.
	 * @param contenidoEnGramo contenido en gramos
	 */
	public void setContenidoEnGramo(float contenidoEnGramo) {
		this.contenidoEnGramo = contenidoEnGramo;
	}

	/**
	 * Obtiene el color de piel para maquillaje de piel.
	 * @return color de piel
	 */
	public String getColorPiel() {
		return colorPiel;
	}

	/**
	 * Establece el color de piel para maquillaje de piel.
	 * @param colorPiel color de piel
	 */
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	/**
	 * Obtiene el contenido en gramos para maquillaje de piel.
	 * @return contenido en gramos
	 */
	public float getContenidoEnGramoPiel() {
		return contenidoEnGramoPiel;
	}

	/**
	 * Establece el contenido en gramos para maquillaje de piel.
	 * @param contenidoEnGramoPiel contenido en gramos
	 */
	public void setContenidoEnGramoPiel(float contenidoEnGramoPiel) {
		this.contenidoEnGramoPiel = contenidoEnGramoPiel;
	}

	/**
	 * Obtiene el tamaño del peluche animal.
	 * @return tamaño del peluche
	 */
	public String getTamanoPeluche() {
		return tamanoPeluche;
	}

	/**
	 * Establece el tamaño del peluche animal.
	 * @param tamanoPeluche tamaño del peluche
	 */
	public void setTamanoPeluche(String tamanoPeluche) {
		this.tamanoPeluche = tamanoPeluche;
	}

	/**
	 * Obtiene el material del peluche animal.
	 * @return material del peluche
	 */
	public String getMaterialPeluche() {
		return materialPeluche;
	}

	/**
	 * Establece el material del peluche animal.
	 * @param materialPeluche material del peluche
	 */
	public void setMaterialPeluche(String materialPeluche) {
		this.materialPeluche = materialPeluche;
	}

	/**
	 * Obtiene el tamaño del peluche personaje.
	 * @return tamaño del personaje
	 */
	public String getTamanoPersonaje() {
		return tamanoPersonaje;
	}

	/**
	 * Establece el tamaño del peluche personaje.
	 * @param tamanoPersonaje tamaño del personaje
	 */
	public void setTamanoPersonaje(String tamanoPersonaje) {
		this.tamanoPersonaje = tamanoPersonaje;
	}

	/**
	 * Obtiene el material del peluche personaje.
	 * @return material del personaje
	 */
	public String getMaterialPersonaje() {
		return materialPersonaje;
	}

	/**
	 * Establece el material del peluche personaje.
	 * @param materialPersonaje material del personaje
	 */
	public void setMaterialPersonaje(String materialPersonaje) {
		this.materialPersonaje = materialPersonaje;
	}

	/**
	 * Obtiene el tipo de prenda de ropa de hombre.
	 * @return tipo de prenda
	 */
	public String getTipoPrenda() {
		return tipoPrenda;
	}

	/**
	 * Establece el tipo de prenda de ropa de hombre.
	 * @param tipoPrenda tipo de prenda
	 */
	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	/**
	 * Obtiene la talla de la ropa de hombre.
	 * @return talla
	 */
	public String getTalla() {
		return talla;
	}

	/**
	 * Establece la talla de la ropa de hombre.
	 * @param talla talla
	 */
	public void setTalla(String talla) {
		this.talla = talla;
	}

	/**
	 * Obtiene el material de la ropa de hombre.
	 * @return material
	 */
	public String getMaterialRopaHombre() {
		return materialRopaHombre;
	}

	/**
	 * Establece el material de la ropa de hombre.
	 * @param materialRopaHombre material
	 */
	public void setMaterialRopaHombre(String materialRopaHombre) {
		this.materialRopaHombre = materialRopaHombre;
	}

	/**
	 * Obtiene el tipo de prenda de ropa de mujer.
	 * @return tipo de prenda
	 */
	public String getTipoPrendaMujer() {
		return tipoPrendaMujer;
	}

	/**
	 * Establece el tipo de prenda de ropa de mujer.
	 * @param tipoPrendaMujer tipo de prenda
	 */
	public void setTipoPrendaMujer(String tipoPrendaMujer) {
		this.tipoPrendaMujer = tipoPrendaMujer;
	}

	/**
	 * Obtiene la talla de la ropa de mujer.
	 * @return talla
	 */
	public String getTallaMujer() {
		return tallaMujer;
	}

	/**
	 * Establece la talla de la ropa de mujer.
	 * @param tallaMujer talla
	 */
	public void setTallaMujer(String tallaMujer) {
		this.tallaMujer = tallaMujer;
	}

	/**
	 * Obtiene el material de la ropa de mujer.
	 * @return material
	 */
	public String getMaterialRopaMujer() {
		return materialRopaMujer;
	}

	/**
	 * Establece el material de la ropa de mujer.
	 * @param materialRopaMujer material
	 */
	public void setMaterialRopaMujer(String materialRopaMujer) {
		this.materialRopaMujer = materialRopaMujer;
	}

	/**
	 * Obtiene la forma del dispositivo electrónico.
	 * @return forma
	 */
	public String getForma() {
		return forma;
	}

	/**
	 * Establece la forma del dispositivo electrónico.
	 * @param forma forma
	 */
	public void setForma(String forma) {
		this.forma = forma;
	}

	/**
	 * Obtiene el tamaño del dispositivo electrónico.
	 * @return tamaño
	 */
	public String getTamanoElectronico() {
		return tamanoElectronico;
	}

	/**
	 * Establece el tamaño del dispositivo electrónico.
	 * @param tamanoElectronico tamaño
	 */
	public void setTamanoElectronico(String tamanoElectronico) {
		this.tamanoElectronico = tamanoElectronico;
	}

	/**
	 * Obtiene la forma del útil escolar.
	 * @return forma
	 */
	public String getFormaEscolar() {
		return formaEscolar;
	}

	/**
	 * Establece la forma del útil escolar.
	 * @param formaEscolar forma
	 */
	public void setFormaEscolar(String formaEscolar) {
		this.formaEscolar = formaEscolar;
	}

	/**
	 * Obtiene el tamaño del útil escolar.
	 * @return tamaño
	 */
	public String getTamanoEscolar() {
		return tamanoEscolar;
	}

	/**
	 * Establece el tamaño del útil escolar.
	 * @param tamanoEscolar tamaño
	 */
	public void setTamanoEscolar(String tamanoEscolar) {
		this.tamanoEscolar = tamanoEscolar;
	}

	/**
	 * Carga todos los artículos de los diferentes servicios en la lista.
	 */
	public void cargarArticulos() {
		
		todosArticulos = new ArrayList<>();
		todosArticulos.addAll(new CelularService().getAll());
		todosArticulos.addAll(new ComputadorService().getAll());
		todosArticulos.addAll(new FiguraColeccionableService().getAll());
		todosArticulos.addAll(new JuegoDeMesaService().getAll());
		todosArticulos.addAll(new MaquillajeCapilarService().getAll());
		todosArticulos.addAll(new MaquillajeDePielService().getAll());
		todosArticulos.addAll(new PelucheAnimalService().getAll());
		todosArticulos.addAll(new PeluchePersonajeService().getAll());
		todosArticulos.addAll(new RopaHombreService().getAll());
		todosArticulos.addAll(new RopaMujerService().getAll());
		todosArticulos.addAll(new UtilElectronicoService().getAll());
		todosArticulos.addAll(new UtilEscolarService().getAll());
	}

	/**
	 * Obtiene la lista de todos los artículos.
	 * @return lista de artículos
	 */
	public List<Articulo> getTodosArticulos() {
		return todosArticulos;
	}

	public void anadirObjeto() {
		if (tipoArticuloNuevo == null || tipoArticuloNuevo.isEmpty()) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Seleccione un tipo de artículo y complete los campos", null));
			return;
		}
		try {
			switch (tipoArticuloNuevo) {
			case "Celular": {
				CelularDTO dto = new CelularDTO(nombre, 0, descripcion, precio, imagen, marca, ram, almacenamiento,
						procesador, resolucionCamra);
				new CelularService().add(dto);
				break;
			}
			case "Computador": {
				ComputadorDTO dto = new ComputadorDTO(nombre, 0, descripcion, precio, imagen, marca, ram,
						almacenamiento, procesador, tipo, tieneTargetaGrafica != null ? tieneTargetaGrafica : false);
				new ComputadorService().add(dto);
				break;
			}
			case "FiguraColeccionable": {
				FiguraColeccionableDTO dto = new FiguraColeccionableDTO(nombre, 0, descripcion, precio, imagen,
						tamano, material, tipoDeFigura, valorEnMercado);
				new FiguraColeccionableService().add(dto);
				break;
			}
			case "JuegoDeMesa": {
				JuegoDeMesaDTO dto = new JuegoDeMesaDTO(nombre, 0, descripcion, precio, imagen, tamanoJuego, materialJuego,
						numeroJugadore, tipoDeJuego);
				new JuegoDeMesaService().add(dto);
				break;
			}
			case "MaquillajeCapilar": {
				MaquillajeCapilarDTO dto = new MaquillajeCapilarDTO(nombre, 0, descripcion, precio, imagen, color,
						contenidoEnGramo, resistenciaAgua != null ? resistenciaAgua : false, duracionHora);
				new MaquillajeCapilarService().add(dto);
				break;
			}
			case "MaquillajeDePiel": {
				MaquillajeDePielDTO dto = new MaquillajeDePielDTO(nombre, 0, descripcion, precio, imagen, colorPiel, contenidoEnGramoPiel,
						tipoMaquillaje, esEcoamigable != null ? esEcoamigable : false);
				new MaquillajeDePielService().add(dto);
				break;
			}
			case "PelucheAnimal": {
				PelucheAnimalDTO dto = new PelucheAnimalDTO(nombre, 0, descripcion, precio, imagen, tamanoPeluche,
						colorPelucheAnimal, materialPeluche, especie, sonidoIncluido != null ? sonidoIncluido : false);
				new PelucheAnimalService().add(dto);
				break;
			}
			case "PeluchePersonaje": {
				PeluchePersonajeDTO dto = new PeluchePersonajeDTO(nombre, 0, descripcion, precio, imagen, tamanoPersonaje,
						colorPeluchePersonaje, materialPersonaje, personaje);
				new PeluchePersonajeService().add(dto);
				break;
			}
			case "RopaHombre": {
				RopaHombreDTO dto = new RopaHombreDTO(nombre, 0, descripcion, precio, imagen, tipoPrenda, talla,
						materialRopaHombre, corte);
				new RopaHombreService().add(dto);
				break;
			}
			case "RopaMujer": {
				RopaMujerDTO dto = new RopaMujerDTO(nombre, 0, descripcion, precio, imagen, tipoPrendaMujer, tallaMujer,
						materialRopaMujer, largoPrenda);
				new RopaMujerService().add(dto);
				break;
			}
			case "UtilElectronico": {
				UtilElectronicoDTO dto = new UtilElectronicoDTO(nombre, 0, descripcion, precio, imagen, tipo,
						tamanoElectronico, forma, tipoDispositivo, bateriaIncluida != null ? bateriaIncluida : false);
				new UtilElectronicoService().add(dto);
				break;
			}
			case "UtilEscolar": {
				UtilEscolarDTO dto = new UtilEscolarDTO(nombre, 0, descripcion, precio, imagen, tipo,
						tamanoEscolar, formaEscolar, colorUtilEscolar, edadRecomendada);
				new UtilEscolarService().add(dto);
				break;
			}
			default:
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Tipo de artículo no soportado", null));
				return;
			}
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Artículo añadido correctamente", null));
			cargarArticulos();
//            articuloNuevo = null;
//            tipoArticuloNuevo = null;
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Error al añadir el artículo: " + e.getMessage(), null));
		}
	}

	public void eliminarObjeto(Articulo art) {
		if (art instanceof Celular) {
			CelularDTO dto = DataMapper.celularToCelularDTO((Celular) art);
			new CelularService().delete(dto);
		} else if (art instanceof Computador) {
			ComputadorDTO dto = DataMapper.computadorToComputadorDTO((Computador) art);
			new ComputadorService().delete(dto);
		} else if (art instanceof FiguraColeccionable) {
			FiguraColeccionableDTO dto = DataMapper
					.figuraColeccionableToFiguraColeccionableDTO((FiguraColeccionable) art);
			new FiguraColeccionableService().delete(dto);
		} else if (art instanceof JuegoDeMesa) {
			JuegoDeMesaDTO dto = DataMapper.juegoDeMesaToJuegoDeMesaDTO((JuegoDeMesa) art);
			new JuegoDeMesaService().delete(dto);
		} else if (art instanceof MaquillajeCapilar) {
			MaquillajeCapilarDTO dto = DataMapper.maquillajeCapilarToMaquillajeCapilarDTO((MaquillajeCapilar) art);
			new MaquillajeCapilarService().delete(dto);
		} else if (art instanceof MaquillajeDePiel) {
			MaquillajeDePielDTO dto = DataMapper.maquillajeDePielToMaquillajeDePielDTO((MaquillajeDePiel) art);
			new MaquillajeDePielService().delete(dto);
		} else if (art instanceof PelucheAnimal) {
			PelucheAnimalDTO dto = DataMapper.pelucheAnimalToPelucheAnimalDTO((PelucheAnimal) art);
			new PelucheAnimalService().delete(dto);
		} else if (art instanceof PeluchePersonaje) {
			PeluchePersonajeDTO dto = DataMapper.peluchePersonajeToPeluchePersonajeDTO((PeluchePersonaje) art);
			new PeluchePersonajeService().delete(dto);
		} else if (art instanceof RopaHombre) {
			RopaHombreDTO dto = DataMapper.ropaHombreToRopaHombreDTO((RopaHombre) art);
			new RopaHombreService().delete(dto);
		} else if (art instanceof RopaMujer) {
			RopaMujerDTO dto = DataMapper.ropaMujerToRopaMujerDTO((RopaMujer) art);
			new RopaMujerService().delete(dto);
		} else if (art instanceof UtilElectronico) {
			UtilElectronicoDTO dto = DataMapper.utilElectronicoToUtilElectronicoDTO((UtilElectronico) art);
			new UtilElectronicoService().delete(dto);
		} else if (art instanceof UtilEscolar) {
			UtilEscolarDTO dto = DataMapper.utilEscolarToUtilEscolarDTO((UtilEscolar) art);
			new UtilEscolarService().delete(dto);
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Tipo de artículo no soportado", null));
			return;
		}
		cargarArticulos();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Artículo eliminado correctamente"));
	}

//	public Object getArticuloNuevo() {
//		return articuloNuevo;
//	}
//
//	public void setArticuloNuevo(Object articuloNuevo) {
//		this.articuloNuevo = articuloNuevo;
//	}

	/**
	 * Obtiene el nombre del artículo.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del artículo.
	 * @param nombre nombre del artículo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la descripción del artículo.
	 * @return descripción
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Establece la descripción del artículo.
	 * @param descripcion descripción del artículo
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Obtiene el precio del artículo.
	 * @return precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del artículo.
	 * @param precio precio del artículo
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Obtiene la imagen del artículo.
	 * @return imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * Establece la imagen del artículo.
	 * @param imagen imagen del artículo
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * Obtiene la marca del celular.
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Establece la marca del celular.
	 * @param marca marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Obtiene la memoria RAM del celular.
	 * @return RAM
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * Establece la memoria RAM del celular.
	 * @param ram RAM
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * Obtiene el almacenamiento del celular.
	 * @return almacenamiento
	 */
	public int getAlmacenamiento() {
		return almacenamiento;
	}

	/**
	 * Establece el almacenamiento del celular.
	 * @param almacenamiento almacenamiento
	 */
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	/**
	 * Obtiene el procesador del celular.
	 * @return procesador
	 */
	public String getProcesador() {
		return procesador;
	}

	/**
	 * Establece el procesador del celular.
	 * @param procesador procesador
	 */
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	/**
	 * Obtiene la resolución de la cámara del celular.
	 * @return resolución de cámara
	 */
	public int getResolucionCamra() {
		return resolucionCamra;
	}

	/**
	 * Establece la resolución de la cámara del celular.
	 * @param resolucionCamra resolución de cámara
	 */
	public void setResolucionCamra(int resolucionCamra) {
		this.resolucionCamra = resolucionCamra;
	}

	/**
	 * Obtiene el tipo de computador.
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Establece el tipo de computador.
	 * @param tipo tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Obtiene si el computador tiene tarjeta gráfica.
	 * @return true si tiene tarjeta gráfica, false si no
	 */
	public Boolean getTieneTargetaGrafica() {
		return tieneTargetaGrafica;
	}

	/**
	 * Establece si el computador tiene tarjeta gráfica.
	 * @param tieneTargetaGrafica true si tiene tarjeta gráfica, false si no
	 */
	public void setTieneTargetaGrafica(Boolean tieneTargetaGrafica) {
		this.tieneTargetaGrafica = tieneTargetaGrafica;
	}

	/**
	 * Obtiene el tipo de figura coleccionable.
	 * @return tipo de figura
	 */
	public String getTipoDeFigura() {
		return tipoDeFigura;
	}

	/**
	 * Establece el tipo de figura coleccionable.
	 * @param tipoDeFigura tipo de figura
	 */
	public void setTipoDeFigura(String tipoDeFigura) {
		this.tipoDeFigura = tipoDeFigura;
	}

	/**
	 * Obtiene el valor en mercado de la figura coleccionable.
	 * @return valor en mercado
	 */
	public Float getValorEnMercado() {
		return valorEnMercado;
	}

	/**
	 * Establece el valor en mercado de la figura coleccionable.
	 * @param valorEnMercado valor en mercado
	 */
	public void setValorEnMercado(Float valorEnMercado) {
		this.valorEnMercado = valorEnMercado;
	}

	/**
	 * Obtiene el número de jugadores del juego de mesa.
	 * @return número de jugadores
	 */
	public int getNumeroJugadore() {
		return numeroJugadore;
	}

	/**
	 * Establece el número de jugadores del juego de mesa.
	 * @param numeroJugadore número de jugadores
	 */
	public void setNumeroJugadore(int numeroJugadore) {
		this.numeroJugadore = numeroJugadore;
	}

	/**
	 * Obtiene el tipo de juego de mesa.
	 * @return tipo de juego
	 */
	public String getTipoDeJuego() {
		return tipoDeJuego;
	}

	/**
	 * Establece el tipo de juego de mesa.
	 * @param tipoDeJuego tipo de juego
	 */
	public void setTipoDeJuego(String tipoDeJuego) {
		this.tipoDeJuego = tipoDeJuego;
	}

	/**
	 * Obtiene si el maquillaje capilar es resistente al agua.
	 * @return true si es resistente, false si no
	 */
	public Boolean getResistenciaAgua() {
		return resistenciaAgua;
	}

	/**
	 * Establece si el maquillaje capilar es resistente al agua.
	 * @param resistenciaAgua true si es resistente, false si no
	 */
	public void setResistenciaAgua(Boolean resistenciaAgua) {
		this.resistenciaAgua = resistenciaAgua;
	}

	/**
	 * Obtiene la duración en horas del maquillaje capilar.
	 * @return duración en horas
	 */
	public int getDuracionHora() {
		return duracionHora;
	}

	/**
	 * Establece la duración en horas del maquillaje capilar.
	 * @param duracionHora duración en horas
	 */
	public void setDuracionHora(int duracionHora) {
		this.duracionHora = duracionHora;
	}

	/**
	 * Obtiene el tipo de maquillaje de piel.
	 * @return tipo de maquillaje
	 */
	public int getTipoMaquillaje() {
		return tipoMaquillaje;
	}

	/**
	 * Establece el tipo de maquillaje de piel.
	 * @param tipoMaquillaje tipo de maquillaje
	 */
	public void setTipoMaquillaje(int tipoMaquillaje) {
		this.tipoMaquillaje = tipoMaquillaje;
	}

	/**
	 * Obtiene si el maquillaje de piel es ecoamigable.
	 * @return true si es ecoamigable, false si no
	 */
	public Boolean getEsEcoamigable() {
		return esEcoamigable;
	}

	/**
	 * Establece si el maquillaje de piel es ecoamigable.
	 * @param esEcoamigable true si es ecoamigable, false si no
	 */
	public void setEsEcoamigable(Boolean esEcoamigable) {
		this.esEcoamigable = esEcoamigable;
	}

	/**
	 * Obtiene la especie del peluche animal.
	 * @return especie
	 */
	public String getEspecie() {
		return especie;
	}

	/**
	 * Establece la especie del peluche animal.
	 * @param especie especie
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	/**
	 * Obtiene si el peluche animal tiene sonido incluido.
	 * @return true si tiene sonido, false si no
	 */
	public Boolean getSonidoIncluido() {
		return sonidoIncluido;
	}

	/**
	 * Establece si el peluche animal tiene sonido incluido.
	 * @param sonidoIncluido true si tiene sonido, false si no
	 */
	public void setSonidoIncluido(Boolean sonidoIncluido) {
		this.sonidoIncluido = sonidoIncluido;
	}

	/**
	 * Obtiene el color del peluche animal.
	 * @return color
	 */
	public String getColorPelucheAnimal() {
		return colorPelucheAnimal;
	}

	/**
	 * Establece el color del peluche animal.
	 * @param colorPelucheAnimal color
	 */
	public void setColorPelucheAnimal(String colorPelucheAnimal) {
		this.colorPelucheAnimal = colorPelucheAnimal;
	}

	/**
	 * Obtiene el personaje del peluche personaje.
	 * @return personaje
	 */
	public String getPersonaje() {
		return personaje;
	}

	/**
	 * Establece el personaje del peluche personaje.
	 * @param personaje personaje
	 */
	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}

	/**
	 * Obtiene el color del peluche personaje.
	 * @return color
	 */
	public String getColorPeluchePersonaje() {
		return colorPeluchePersonaje;
	}

	/**
	 * Establece el color del peluche personaje.
	 * @param colorPeluchePersonaje color
	 */
	public void setColorPeluchePersonaje(String colorPeluchePersonaje) {
		this.colorPeluchePersonaje = colorPeluchePersonaje;
	}

	/**
	 * Obtiene el corte de la ropa de hombre.
	 * @return corte
	 */
	public String getCorte() {
		return corte;
	}

	/**
	 * Establece el corte de la ropa de hombre.
	 * @param corte corte
	 */
	public void setCorte(String corte) {
		this.corte = corte;
	}

	/**
	 * Obtiene el largo de la prenda de ropa de mujer.
	 * @return largo de prenda
	 */
	public String getLargoPrenda() {
		return largoPrenda;
	}

	/**
	 * Establece el largo de la prenda de ropa de mujer.
	 * @param largoPrenda largo de prenda
	 */
	public void setLargoPrenda(String largoPrenda) {
		this.largoPrenda = largoPrenda;
	}

	/**
	 * Obtiene el tipo de dispositivo electrónico.
	 * @return tipo de dispositivo
	 */
	public String getTipoDispositivo() {
		return tipoDispositivo;
	}

	/**
	 * Establece el tipo de dispositivo electrónico.
	 * @param tipoDispositivo tipo de dispositivo
	 */
	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}

	/**
	 * Obtiene si el dispositivo electrónico tiene batería incluida.
	 * @return true si tiene batería, false si no
	 */
	public Boolean getBateriaIncluida() {
		return bateriaIncluida;
	}

	/**
	 * Establece si el dispositivo electrónico tiene batería incluida.
	 * @param bateriaIncluida true si tiene batería, false si no
	 */
	public void setBateriaIncluida(Boolean bateriaIncluida) {
		this.bateriaIncluida = bateriaIncluida;
	}

	/**
	 * Obtiene el color del útil escolar.
	 * @return color
	 */
	public String getColorUtilEscolar() {
		return colorUtilEscolar;
	}

	/**
	 * Establece el color del útil escolar.
	 * @param colorUtilEscolar color
	 */
	public void setColorUtilEscolar(String colorUtilEscolar) {
		this.colorUtilEscolar = colorUtilEscolar;
	}

	/**
	 * Obtiene la edad recomendada para el útil escolar.
	 * @return edad recomendada
	 */
	public int getEdadRecomendada() {
		return edadRecomendada;
	}

	/**
	 * Establece la edad recomendada para el útil escolar.
	 * @param edadRecomendada edad recomendada
	 */
	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	/**
	 * Establece la lista de todos los artículos.
	 * @param todosArticulos lista de artículos
	 */
	public void setTodosArticulos(List<Articulo> todosArticulos) {
		this.todosArticulos = todosArticulos;
	}

}

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
	private String tipoDeFigura;
	private Float valorEnMercado;
	private String tamano;
	private String material;

	// JuegoDeMesa
	private int numeroJugadore;
	private String tipoDeJuego;
	private String tamanoJuego;
	private String materialJuego;

	// MaquillajeCapilar
	private Boolean resistenciaAgua;
	private int duracionHora;
	private String color;
	private float contenidoEnGramo;

	// MaquillajeDePiel
	private int tipoMaquillaje;
	private Boolean esEcoamigable;
	private String colorPiel;
	private float contenidoEnGramoPiel;

	// PelucheAnimal
	private String especie;
	private Boolean sonidoIncluido;
	private String colorPelucheAnimal;
	private String tamanoPeluche;
	private String materialPeluche;

	// PeluchePersonaje
	private String personaje;
	private String colorPeluchePersonaje;
	private String tamanoPersonaje;
	private String materialPersonaje;

	// RopaHombre
	private String corte;
	private String tipoPrenda;
	private String talla;
	private String materialRopaHombre;

	// RopaMujer
	private String largoPrenda;
	private String tipoPrendaMujer;
	private String tallaMujer;
	private String materialRopaMujer;

	// UtilElectronico
	private String tipoDispositivo;
	private Boolean bateriaIncluida;
	private String forma;
	private String tamanoElectronico;

	// UtilEscolar
	private String colorUtilEscolar;
	private int edadRecomendada;
	private String formaEscolar;
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

	public GestionBean() {
		todosArticulos = new ArrayList<>();
		cargarArticulos();
	}

	public String getTipoArticuloNuevo() {
		return tipoArticuloNuevo;
	}

	public void setTipoArticuloNuevo(String tipoArticuloNuevo) {
		this.tipoArticuloNuevo = tipoArticuloNuevo;
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

	public String getTamanoJuego() {
		return tamanoJuego;
	}

	public void setTamanoJuego(String tamanoJuego) {
		this.tamanoJuego = tamanoJuego;
	}

	public String getMaterialJuego() {
		return materialJuego;
	}

	public void setMaterialJuego(String materialJuego) {
		this.materialJuego = materialJuego;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getContenidoEnGramo() {
		return contenidoEnGramo;
	}

	public void setContenidoEnGramo(float contenidoEnGramo) {
		this.contenidoEnGramo = contenidoEnGramo;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public float getContenidoEnGramoPiel() {
		return contenidoEnGramoPiel;
	}

	public void setContenidoEnGramoPiel(float contenidoEnGramoPiel) {
		this.contenidoEnGramoPiel = contenidoEnGramoPiel;
	}

	public String getTamanoPeluche() {
		return tamanoPeluche;
	}

	public void setTamanoPeluche(String tamanoPeluche) {
		this.tamanoPeluche = tamanoPeluche;
	}

	public String getMaterialPeluche() {
		return materialPeluche;
	}

	public void setMaterialPeluche(String materialPeluche) {
		this.materialPeluche = materialPeluche;
	}

	public String getTamanoPersonaje() {
		return tamanoPersonaje;
	}

	public void setTamanoPersonaje(String tamanoPersonaje) {
		this.tamanoPersonaje = tamanoPersonaje;
	}

	public String getMaterialPersonaje() {
		return materialPersonaje;
	}

	public void setMaterialPersonaje(String materialPersonaje) {
		this.materialPersonaje = materialPersonaje;
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

	public String getMaterialRopaHombre() {
		return materialRopaHombre;
	}

	public void setMaterialRopaHombre(String materialRopaHombre) {
		this.materialRopaHombre = materialRopaHombre;
	}

	public String getTipoPrendaMujer() {
		return tipoPrendaMujer;
	}

	public void setTipoPrendaMujer(String tipoPrendaMujer) {
		this.tipoPrendaMujer = tipoPrendaMujer;
	}

	public String getTallaMujer() {
		return tallaMujer;
	}

	public void setTallaMujer(String tallaMujer) {
		this.tallaMujer = tallaMujer;
	}

	public String getMaterialRopaMujer() {
		return materialRopaMujer;
	}

	public void setMaterialRopaMujer(String materialRopaMujer) {
		this.materialRopaMujer = materialRopaMujer;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamanoElectronico() {
		return tamanoElectronico;
	}

	public void setTamanoElectronico(String tamanoElectronico) {
		this.tamanoElectronico = tamanoElectronico;
	}

	public String getFormaEscolar() {
		return formaEscolar;
	}

	public void setFormaEscolar(String formaEscolar) {
		this.formaEscolar = formaEscolar;
	}

	public String getTamanoEscolar() {
		return tamanoEscolar;
	}

	public void setTamanoEscolar(String tamanoEscolar) {
		this.tamanoEscolar = tamanoEscolar;
	}

	public void cargarArticulos() {
		System.out.println("AAAAAAAAAAAA");
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
				System.out.println("[DEBUG] Añadiendo CelularDTO con id: " + dto.getId());
				new CelularService().add(dto);
				break;
			}
			case "Computador": {
				ComputadorDTO dto = new ComputadorDTO(nombre, 0, descripcion, precio, imagen, marca, ram,
						almacenamiento, procesador, tipo, tieneTargetaGrafica != null ? tieneTargetaGrafica : false);
				System.out.println("[DEBUG] Añadiendo ComputadorDTO con id: " + dto.getId());
				new ComputadorService().add(dto);
				break;
			}
			case "FiguraColeccionable": {
				FiguraColeccionableDTO dto = new FiguraColeccionableDTO(nombre, 0, descripcion, precio, imagen,
						tamano, material, tipoDeFigura, valorEnMercado);
				System.out.println("[DEBUG] Añadiendo FiguraColeccionableDTO con id: " + dto.getId());
				new FiguraColeccionableService().add(dto);
				break;
			}
			case "JuegoDeMesa": {
				JuegoDeMesaDTO dto = new JuegoDeMesaDTO(nombre, 0, descripcion, precio, imagen, tamanoJuego, materialJuego,
						numeroJugadore, tipoDeJuego);
				System.out.println("[DEBUG] Añadiendo JuegoDeMesaDTO con id: " + dto.getId());
				new JuegoDeMesaService().add(dto);
				break;
			}
			case "MaquillajeCapilar": {
				MaquillajeCapilarDTO dto = new MaquillajeCapilarDTO(nombre, 0, descripcion, precio, imagen, color,
						contenidoEnGramo, resistenciaAgua != null ? resistenciaAgua : false, duracionHora);
				System.out.println("[DEBUG] Añadiendo MaquillajeCapilarDTO con id: " + dto.getId());
				new MaquillajeCapilarService().add(dto);
				break;
			}
			case "MaquillajeDePiel": {
				MaquillajeDePielDTO dto = new MaquillajeDePielDTO(nombre, 0, descripcion, precio, imagen, colorPiel, contenidoEnGramoPiel,
						tipoMaquillaje, esEcoamigable != null ? esEcoamigable : false);
				System.out.println("[DEBUG] Añadiendo MaquillajeDePielDTO con id: " + dto.getId());
				new MaquillajeDePielService().add(dto);
				break;
			}
			case "PelucheAnimal": {
				PelucheAnimalDTO dto = new PelucheAnimalDTO(nombre, 0, descripcion, precio, imagen, tamanoPeluche,
						colorPelucheAnimal, materialPeluche, especie, sonidoIncluido != null ? sonidoIncluido : false);
				System.out.println("[DEBUG] Añadiendo PelucheAnimalDTO con id: " + dto.getId());
				new PelucheAnimalService().add(dto);
				break;
			}
			case "PeluchePersonaje": {
				PeluchePersonajeDTO dto = new PeluchePersonajeDTO(nombre, 0, descripcion, precio, imagen, tamanoPersonaje,
						colorPeluchePersonaje, materialPersonaje, personaje);
				System.out.println("[DEBUG] Añadiendo PeluchePersonajeDTO con id: " + dto.getId());
				new PeluchePersonajeService().add(dto);
				break;
			}
			case "RopaHombre": {
				RopaHombreDTO dto = new RopaHombreDTO(nombre, 0, descripcion, precio, imagen, tipoPrenda, talla,
						materialRopaHombre, corte);
				System.out.println("[DEBUG] Añadiendo RopaHombreDTO con id: " + dto.getId());
				new RopaHombreService().add(dto);
				break;
			}
			case "RopaMujer": {
				RopaMujerDTO dto = new RopaMujerDTO(nombre, 0, descripcion, precio, imagen, tipoPrendaMujer, tallaMujer,
						materialRopaMujer, largoPrenda);
				System.out.println("[DEBUG] Añadiendo RopaMujerDTO con id: " + dto.getId());
				new RopaMujerService().add(dto);
				break;
			}
			case "UtilElectronico": {
				UtilElectronicoDTO dto = new UtilElectronicoDTO(nombre, 0, descripcion, precio, imagen, tipo,
						tamanoElectronico, forma, tipoDispositivo, bateriaIncluida != null ? bateriaIncluida : false);
				System.out.println("[DEBUG] Añadiendo UtilElectronicoDTO con id: " + dto.getId());
				new UtilElectronicoService().add(dto);
				break;
			}
			case "UtilEscolar": {
				UtilEscolarDTO dto = new UtilEscolarDTO(nombre, 0, descripcion, precio, imagen, tipo,
						tamanoEscolar, formaEscolar, colorUtilEscolar, edadRecomendada);
				System.out.println("[DEBUG] Añadiendo UtilEscolarDTO con id: " + dto.getId());
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
		System.out.println("[DEBUG] Iniciando proceso de eliminación");
		if (art instanceof Celular) {
			System.out.println("[DEBUG] Eliminando Celular: " + art + " con id: " + art.getId());
			CelularDTO dto = DataMapper.celularToCelularDTO((Celular) art);
			System.out.println("[DEBUG] CelularDTO: " + dto + " con id: " + dto.getId());
			new CelularService().delete(dto);
		} else if (art instanceof Computador) {
			System.out.println("[DEBUG] Eliminando Computador: " + art + " con id: " + art.getId());
			ComputadorDTO dto = DataMapper.computadorToComputadorDTO((Computador) art);
			System.out.println("[DEBUG] ComputadorDTO: " + dto + " con id: " + dto.getId());
			new ComputadorService().delete(dto);
		} else if (art instanceof FiguraColeccionable) {
			System.out.println("[DEBUG] Eliminando FiguraColeccionable: " + art + " con id: " + art.getId());
			FiguraColeccionableDTO dto = DataMapper
					.figuraColeccionableToFiguraColeccionableDTO((FiguraColeccionable) art);
			System.out.println("[DEBUG] FiguraColeccionableDTO: " + dto + " con id: " + dto.getId());
			new FiguraColeccionableService().delete(dto);
		} else if (art instanceof JuegoDeMesa) {
			System.out.println("[DEBUG] Eliminando JuegoDeMesa: " + art + " con id: " + art.getId());
			JuegoDeMesaDTO dto = DataMapper.juegoDeMesaToJuegoDeMesaDTO((JuegoDeMesa) art);
			System.out.println("[DEBUG] JuegoDeMesaDTO: " + dto + " con id: " + dto.getId());
			new JuegoDeMesaService().delete(dto);
		} else if (art instanceof MaquillajeCapilar) {
			System.out.println("[DEBUG] Eliminando MaquillajeCapilar: " + art + " con id: " + art.getId());
			MaquillajeCapilarDTO dto = DataMapper.maquillajeCapilarToMaquillajeCapilarDTO((MaquillajeCapilar) art);
			System.out.println("[DEBUG] MaquillajeCapilarDTO: " + dto + " con id: " + dto.getId());
			new MaquillajeCapilarService().delete(dto);
		} else if (art instanceof MaquillajeDePiel) {
			System.out.println("[DEBUG] Eliminando MaquillajeDePiel: " + art + " con id: " + art.getId());
			MaquillajeDePielDTO dto = DataMapper.maquillajeDePielToMaquillajeDePielDTO((MaquillajeDePiel) art);
			System.out.println("[DEBUG] MaquillajeDePielDTO: " + dto + " con id: " + dto.getId());
			new MaquillajeDePielService().delete(dto);
		} else if (art instanceof PelucheAnimal) {
			System.out.println("[DEBUG] Eliminando PelucheAnimal: " + art + " con id: " + art.getId());
			PelucheAnimalDTO dto = DataMapper.pelucheAnimalToPelucheAnimalDTO((PelucheAnimal) art);
			System.out.println("[DEBUG] PelucheAnimalDTO: " + dto + " con id: " + dto.getId());
			new PelucheAnimalService().delete(dto);
		} else if (art instanceof PeluchePersonaje) {
			System.out.println("[DEBUG] Eliminando PeluchePersonaje: " + art + " con id: " + art.getId());
			PeluchePersonajeDTO dto = DataMapper.peluchePersonajeToPeluchePersonajeDTO((PeluchePersonaje) art);
			System.out.println("[DEBUG] PeluchePersonajeDTO: " + dto + " con id: " + dto.getId());
			new PeluchePersonajeService().delete(dto);
		} else if (art instanceof RopaHombre) {
			System.out.println("[DEBUG] Eliminando RopaHombre: " + art + " con id: " + art.getId());
			RopaHombreDTO dto = DataMapper.ropaHombreToRopaHombreDTO((RopaHombre) art);
			System.out.println("[DEBUG] RopaHombreDTO: " + dto + " con id: " + dto.getId());
			new RopaHombreService().delete(dto);
		} else if (art instanceof RopaMujer) {
			System.out.println("[DEBUG] Eliminando RopaMujer: " + art + " con id: " + art.getId());
			RopaMujerDTO dto = DataMapper.ropaMujerToRopaMujerDTO((RopaMujer) art);
			System.out.println("[DEBUG] RopaMujerDTO: " + dto + " con id: " + dto.getId());
			new RopaMujerService().delete(dto);
		} else if (art instanceof UtilElectronico) {
			System.out.println("[DEBUG] Eliminando UtilElectronico: " + art + " con id: " + art.getId());
			UtilElectronicoDTO dto = DataMapper.utilElectronicoToUtilElectronicoDTO((UtilElectronico) art);
			System.out.println("[DEBUG] UtilElectronicoDTO: " + dto + " con id: " + dto.getId());
			new UtilElectronicoService().delete(dto);
		} else if (art instanceof UtilEscolar) {
			System.out.println("[DEBUG] Eliminando UtilEscolar: " + art + " con id: " + art.getId());
			UtilEscolarDTO dto = DataMapper.utilEscolarToUtilEscolarDTO((UtilEscolar) art);
			System.out.println("[DEBUG] UtilEscolarDTO: " + dto + " con id: " + dto.getId());
			new UtilEscolarService().delete(dto);
		} else {
			System.out.println("[DEBUG] Tipo de artículo no soportado: " + art);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Tipo de artículo no soportado", null));
			return;
		}
		System.out.println("[DEBUG] Recargando lista de artículos");
		cargarArticulos();
		System.out.println("[DEBUG] Artículo eliminado correctamente");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Artículo eliminado correctamente"));
	}

//	public Object getArticuloNuevo() {
//		return articuloNuevo;
//	}
//
//	public void setArticuloNuevo(Object articuloNuevo) {
//		this.articuloNuevo = articuloNuevo;
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getResolucionCamra() {
		return resolucionCamra;
	}

	public void setResolucionCamra(int resolucionCamra) {
		this.resolucionCamra = resolucionCamra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getTieneTargetaGrafica() {
		return tieneTargetaGrafica;
	}

	public void setTieneTargetaGrafica(Boolean tieneTargetaGrafica) {
		this.tieneTargetaGrafica = tieneTargetaGrafica;
	}

	public String getTipoDeFigura() {
		return tipoDeFigura;
	}

	public void setTipoDeFigura(String tipoDeFigura) {
		this.tipoDeFigura = tipoDeFigura;
	}

	public Float getValorEnMercado() {
		return valorEnMercado;
	}

	public void setValorEnMercado(Float valorEnMercado) {
		this.valorEnMercado = valorEnMercado;
	}

	public int getNumeroJugadore() {
		return numeroJugadore;
	}

	public void setNumeroJugadore(int numeroJugadore) {
		this.numeroJugadore = numeroJugadore;
	}

	public String getTipoDeJuego() {
		return tipoDeJuego;
	}

	public void setTipoDeJuego(String tipoDeJuego) {
		this.tipoDeJuego = tipoDeJuego;
	}

	public Boolean getResistenciaAgua() {
		return resistenciaAgua;
	}

	public void setResistenciaAgua(Boolean resistenciaAgua) {
		this.resistenciaAgua = resistenciaAgua;
	}

	public int getDuracionHora() {
		return duracionHora;
	}

	public void setDuracionHora(int duracionHora) {
		this.duracionHora = duracionHora;
	}

	public int getTipoMaquillaje() {
		return tipoMaquillaje;
	}

	public void setTipoMaquillaje(int tipoMaquillaje) {
		this.tipoMaquillaje = tipoMaquillaje;
	}

	public Boolean getEsEcoamigable() {
		return esEcoamigable;
	}

	public void setEsEcoamigable(Boolean esEcoamigable) {
		this.esEcoamigable = esEcoamigable;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Boolean getSonidoIncluido() {
		return sonidoIncluido;
	}

	public void setSonidoIncluido(Boolean sonidoIncluido) {
		this.sonidoIncluido = sonidoIncluido;
	}

	public String getColorPelucheAnimal() {
		return colorPelucheAnimal;
	}

	public void setColorPelucheAnimal(String colorPelucheAnimal) {
		this.colorPelucheAnimal = colorPelucheAnimal;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}

	public String getColorPeluchePersonaje() {
		return colorPeluchePersonaje;
	}

	public void setColorPeluchePersonaje(String colorPeluchePersonaje) {
		this.colorPeluchePersonaje = colorPeluchePersonaje;
	}

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}

	public String getLargoPrenda() {
		return largoPrenda;
	}

	public void setLargoPrenda(String largoPrenda) {
		this.largoPrenda = largoPrenda;
	}

	public String getTipoDispositivo() {
		return tipoDispositivo;
	}

	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}

	public Boolean getBateriaIncluida() {
		return bateriaIncluida;
	}

	public void setBateriaIncluida(Boolean bateriaIncluida) {
		this.bateriaIncluida = bateriaIncluida;
	}

	public String getColorUtilEscolar() {
		return colorUtilEscolar;
	}

	public void setColorUtilEscolar(String colorUtilEscolar) {
		this.colorUtilEscolar = colorUtilEscolar;
	}

	public int getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	public void setTodosArticulos(List<Articulo> todosArticulos) {
		this.todosArticulos = todosArticulos;
	}

}

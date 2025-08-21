package co.edu.unbosque.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Articulo;
import co.edu.unbosque.model.Celular;
import co.edu.unbosque.model.CelularDTO;
import co.edu.unbosque.model.Computador;
import co.edu.unbosque.model.ComputadorDTO;
import co.edu.unbosque.model.DispositivosElectronico;
import co.edu.unbosque.model.FiguraColeccionable;
import co.edu.unbosque.model.FiguraColeccionableDTO;
import co.edu.unbosque.model.JuegoDeMesa;
import co.edu.unbosque.model.JuegoDeMesaDTO;
import co.edu.unbosque.model.MaquillajeCapilar;
import co.edu.unbosque.model.MaquillajeCapilarDTO;
import co.edu.unbosque.model.MaquillajeDePiel;
import co.edu.unbosque.model.MaquillajeDePielDTO;
import co.edu.unbosque.model.ModelFacade;
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
    private Object articuloNuevo; // Será del tipo DTO correspondiente
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

    // JuegoDeMesa
    private int numeroJugadore;
    private String tipoDeJuego;

    // MaquillajeCapilar
    private Boolean resistenciaAgua;
    private int duracionHora;

    // MaquillajeDePiel
    private int tipoMaquillaje;
    private Boolean esEcoamigable;

    // PelucheAnimal
    private String especie;
    private Boolean sonidoIncluido;
    private String colorPelucheAnimal;

    // PeluchePersonaje
    private String personaje;
    private String colorPeluchePersonaje;

    // RopaHombre
    private String corte;

    // RopaMujer
    private String largoPrenda;

    // UtilElectronico
    private String tipoDispositivo;
    private Boolean bateriaIncluida;

    // UtilEscolar
    private String colorUtilEscolar;
    private int edadRecomendada;


    public GestionBean() {
        articuloNuevo = null;
        cargarArticulos();

    }

    public void setArticuloNuevo(Articulo articuloNuevo) {
        this.articuloNuevo = articuloNuevo;
    }

    public String getTipoArticuloNuevo() {
        return tipoArticuloNuevo;
    }

    public void setTipoArticuloNuevo(String tipoArticuloNuevo) {
        this.tipoArticuloNuevo = tipoArticuloNuevo;
        switch (tipoArticuloNuevo) {
            case "Celular":
                articuloNuevo = new CelularDTO();
                break;
            case "Computador":
                articuloNuevo = new ComputadorDTO();
                break;
            case "FiguraColeccionable":
                articuloNuevo = new FiguraColeccionableDTO();
                break;
            case "JuegoDeMesa":
                articuloNuevo = new JuegoDeMesaDTO();
                break;
            case "MaquillajeCapilar":
                articuloNuevo = new MaquillajeCapilarDTO();
                break;
            case "MaquillajeDePiel":
                articuloNuevo = new MaquillajeDePielDTO();
                break;
            case "PelucheAnimal":
                articuloNuevo = new PelucheAnimalDTO();
                break;
            case "PeluchePersonaje":
                articuloNuevo = new PeluchePersonajeDTO();
                break;
            case "RopaHombre":
                articuloNuevo = new RopaHombreDTO();
                break;
            case "RopaMujer":
                articuloNuevo = new RopaMujerDTO();
                break;
            case "UtilElectronico":
                articuloNuevo = new UtilElectronicoDTO();
                break;
            case "UtilEscolar":
                articuloNuevo = new UtilEscolarDTO();
                break;
            default:
                articuloNuevo = null;
        }
    }

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

    public List<Articulo> getTodosArticulos() {
        return todosArticulos;
    }

    public void aniadirObjeto() {
        if (articuloNuevo == null || tipoArticuloNuevo == null || tipoArticuloNuevo.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Seleccione un tipo de artículo y complete los campos", null));
            return;
        }
        try {
            switch (tipoArticuloNuevo) {
                case "Celular": {
                    CelularDTO dto = new CelularDTO(nombre, 0, descripcion, precio, imagen, marca, ram, almacenamiento, procesador, resolucionCamra);
                    new CelularService().add(dto);
                    break;
                }
                case "Computador": {
                    ComputadorDTO dto = new ComputadorDTO(nombre, 0, descripcion, precio, imagen, marca, ram, almacenamiento, procesador, tipo, tieneTargetaGrafica != null ? tieneTargetaGrafica : false);
                    new ComputadorService().add(dto);
                    break;
                }
                case "FiguraColeccionable": {
                    FiguraColeccionableDTO dto = new FiguraColeccionableDTO(nombre, 0, descripcion, precio, imagen, "tamano", "material", tipoDeFigura, valorEnMercado);
                    new FiguraColeccionableService().add(dto);
                    break;
                }
                case "JuegoDeMesa": {
                    JuegoDeMesaDTO dto = new JuegoDeMesaDTO(nombre, 0, descripcion, precio, imagen, "tamano", "material", numeroJugadore, tipoDeJuego);
                    new JuegoDeMesaService().add(dto);
                    break;
                }
                case "MaquillajeCapilar": {
                    MaquillajeCapilarDTO dto = new MaquillajeCapilarDTO(nombre, 0, descripcion, precio, imagen, "color", 0.0f, resistenciaAgua != null ? resistenciaAgua : false, duracionHora);
                    new MaquillajeCapilarService().add(dto);
                    break;
                }
                case "MaquillajeDePiel": {
                    MaquillajeDePielDTO dto = new MaquillajeDePielDTO(nombre, 0, descripcion, precio, imagen, "color", 0.0f, tipoMaquillaje, esEcoamigable != null ? esEcoamigable : false);
                    new MaquillajeDePielService().add(dto);
                    break;
                }
                case "PelucheAnimal": {
                    PelucheAnimalDTO dto = new PelucheAnimalDTO(nombre, 0, descripcion, precio, imagen, "tamano", colorPelucheAnimal, "material", especie, sonidoIncluido != null ? sonidoIncluido : false);
                    new PelucheAnimalService().add(dto);
                    break;
                }
                case "PeluchePersonaje": {
                    PeluchePersonajeDTO dto = new PeluchePersonajeDTO(nombre, 0, descripcion, precio, imagen, "tamano", "color", "material", personaje);
                    new PeluchePersonajeService().add(dto);
                    break;
                }
                case "RopaHombre": {
                    RopaHombreDTO dto = new RopaHombreDTO(nombre, 0, descripcion, precio, imagen, "tipoPrenda", "talla", "material", corte);
                    new RopaHombreService().add(dto);
                    break;
                }
                case "RopaMujer": {
                    RopaMujerDTO dto = new RopaMujerDTO(nombre, 0, descripcion, precio, imagen, "tipoPrenda", "talla", "material", largoPrenda);
                    new RopaMujerService().add(dto);
                    break;
                }
                case "UtilElectronico": {
                    UtilElectronicoDTO dto = new UtilElectronicoDTO(nombre, 0, descripcion, precio, imagen, "tipo", "tamano", "forma", tipoDispositivo, bateriaIncluida != null ? bateriaIncluida : false);
                    new UtilElectronicoService().add(dto);
                    break;
                }
                case "UtilEscolar": {
                    UtilEscolarDTO dto = new UtilEscolarDTO(nombre, 0, descripcion, precio, imagen, "tipo", "tamano", "forma", colorUtilEscolar, edadRecomendada);
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
            articuloNuevo = null;
            tipoArticuloNuevo = null;
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al añadir el artículo: " + e.getMessage(), null));
        }
    }

    public void eliminarObjeto(Object art) {
        if (art instanceof Celular) {
            CelularDTO dto = DataMapper.celularToCelularDTO((Celular) art);
            new CelularService().delete(dto);
        } else if (art instanceof Computador) {
            ComputadorDTO dto = DataMapper.computadorToComputadorDTO((Computador) art);
            new ComputadorService().delete(dto);
        } else if (art instanceof FiguraColeccionable) {
            FiguraColeccionableDTO dto = DataMapper.figuraColeccionableToFiguraColeccionableDTO((FiguraColeccionable) art);
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
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Artículo eliminado correctamente"));
    }

	public Object getArticuloNuevo() {
		return articuloNuevo;
	}

	public void setArticuloNuevo(Object articuloNuevo) {
		this.articuloNuevo = articuloNuevo;
	}

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

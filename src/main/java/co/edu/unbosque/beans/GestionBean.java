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
                    CelularDTO dto = new CelularDTO();
                    dto.setMarca(marca);
                    dto.setRam(ram);
                    dto.setAlmacenamiento(almacenamiento);
                    dto.setProcesador(procesador);
                    dto.setResolucionCamra(resolucionCamra);
                    new CelularService().add(dto);
                    break;
                }
                case "Computador": {
                    ComputadorDTO dto = new ComputadorDTO();
                    dto.setMarca(marca);
                    dto.setRam(ram);
                    dto.setAlmacenamiento(almacenamiento);
                    dto.setProcesador(procesador);
                    dto.setTipo(tipo);
                    dto.setTieneTargetaGrafica(tieneTargetaGrafica != null ? tieneTargetaGrafica : false);
                    new ComputadorService().add(dto);
                    break;
                }
                case "FiguraColeccionable": {
                    FiguraColeccionableDTO dto = new FiguraColeccionableDTO();
                    dto.setTipoDeFigura(tipoDeFigura);
                    dto.setValorEnMercado(valorEnMercado);
                    new FiguraColeccionableService().add(dto);
                    break;
                }
                case "JuegoDeMesa": {
                    JuegoDeMesaDTO dto = new JuegoDeMesaDTO();
                    dto.setNumeroJugadore(numeroJugadore);
                    dto.setTipoDeJuego(tipoDeJuego);
                    new JuegoDeMesaService().add(dto);
                    break;
                }
                case "MaquillajeCapilar": {
                    MaquillajeCapilarDTO dto = new MaquillajeCapilarDTO();
                    dto.setResistenciaAgua(resistenciaAgua != null ? resistenciaAgua : false);
                    dto.setDuracionHora(duracionHora);
                    new MaquillajeCapilarService().add(dto);
                    break;
                }
                case "MaquillajeDePiel": {
                    MaquillajeDePielDTO dto = new MaquillajeDePielDTO();
                    dto.setTipo(tipoMaquillaje);
                    dto.setEsEcoamigable(esEcoamigable != null ? esEcoamigable : false);
                    new MaquillajeDePielService().add(dto);
                    break;
                }
                case "PelucheAnimal": {
                    PelucheAnimalDTO dto = new PelucheAnimalDTO();
                    dto.setEspecie(especie);
                    dto.setSonidoIncluido(sonidoIncluido != null ? sonidoIncluido : false);
                    dto.setColor(colorPelucheAnimal);
                    new PelucheAnimalService().add(dto);
                    break;
                }
                case "PeluchePersonaje": {
                    PeluchePersonajeDTO dto = new PeluchePersonajeDTO();
                    dto.setPersonaje(personaje);
                    dto.setColor(colorPeluchePersonaje);
                    new PeluchePersonajeService().add(dto);
                    break;
                }
                case "RopaHombre": {
                    RopaHombreDTO dto = new RopaHombreDTO();
                    dto.setCorte(corte);
                    new RopaHombreService().add(dto);
                    break;
                }
                case "RopaMujer": {
                    RopaMujerDTO dto = new RopaMujerDTO();
                    dto.setLargoPrenda(largoPrenda);
                    new RopaMujerService().add(dto);
                    break;
                }
                case "UtilElectronico": {
                    UtilElectronicoDTO dto = new UtilElectronicoDTO();
                    dto.setTipoDispositivo(tipoDispositivo);
                    dto.setBateriaIncluida(bateriaIncluida != null ? bateriaIncluida : false);
                    new UtilElectronicoService().add(dto);
                    break;
                }
                case "UtilEscolar": {
                    UtilEscolarDTO dto = new UtilEscolarDTO();
                    dto.setColor(colorUtilEscolar);
                    dto.setEdadRecomendada(edadRecomendada);
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

    // Celular y Computador
    public String getMarca() {
        if (articuloNuevo instanceof DispositivosElectronico) {
            return ((DispositivosElectronico) articuloNuevo).getMarca();
        }
        return null;
    }
    public void setMarca(String marca) {
        if (articuloNuevo instanceof DispositivosElectronico) {
            ((DispositivosElectronico) articuloNuevo).setMarca(marca);
        }
    }
    public Integer getRam() {
        if (articuloNuevo instanceof DispositivosElectronico) {
            return ((DispositivosElectronico) articuloNuevo).getRam();
        }
        return null;
    }
    public void setRam(Integer ram) {
        if (articuloNuevo instanceof DispositivosElectronico) {
            ((DispositivosElectronico) articuloNuevo).setRam(ram);
        }
    }
    public Integer getAlmacenamiento() {
        if (articuloNuevo instanceof DispositivosElectronico) {
            return ((DispositivosElectronico) articuloNuevo).getAlmacenamiento();
        }
        return null;
    }
    public void setAlmacenamiento(Integer almacenamiento) {
        if (articuloNuevo instanceof DispositivosElectronico) {
            ((DispositivosElectronico) articuloNuevo).setAlmacenamiento(almacenamiento);
        }
    }
    public String getProcesador() {
        if (articuloNuevo instanceof Celular) {
            return ((Celular) articuloNuevo).getProcesador();
        }
        if (articuloNuevo instanceof Computador) {
            return ((Computador) articuloNuevo).getProcesador();
        }
        return null;
    }
    public void setProcesador(String procesador) {
        if (articuloNuevo instanceof Celular) {
            ((Celular) articuloNuevo).setProcesador(procesador);
        }
        if (articuloNuevo instanceof Computador) {
            ((Computador) articuloNuevo).setProcesador(procesador);
        }
    }
    public Integer getResolucionCamra() {
        if (articuloNuevo instanceof Celular) {
            return ((Celular) articuloNuevo).getResolucionCamra();
        }
        return null;
    }
    public void setResolucionCamra(Integer resolucionCamra) {
        if (articuloNuevo instanceof Celular) {
            ((Celular) articuloNuevo).setResolucionCamra(resolucionCamra);
        }
    }
    public String getTipo() {
        if (articuloNuevo instanceof Computador) {
            return ((Computador) articuloNuevo).getTipo();
        }
        if (articuloNuevo instanceof UtilElectronico) {
            return ((UtilElectronico) articuloNuevo).getTipo();
        }
        if (articuloNuevo instanceof UtilEscolar) {
            return ((UtilEscolar) articuloNuevo).getTipo();
        }
        return null;
    }
    public void setTipo(String tipo) {
        if (articuloNuevo instanceof Computador) {
            ((Computador) articuloNuevo).setTipo(tipo);
        }
        if (articuloNuevo instanceof UtilElectronico) {
            ((UtilElectronico) articuloNuevo).setTipo(tipo);
        }
        if (articuloNuevo instanceof UtilEscolar) {
            ((UtilEscolar) articuloNuevo).setTipo(tipo);
        }
    }
    public Boolean getTieneTargetaGrafica() {
        if (articuloNuevo instanceof Computador) {
            return ((Computador) articuloNuevo).isTieneTargetaGrafica();
        }
        return null;
    }
    public void setTieneTargetaGrafica(Boolean tieneTargetaGrafica) {
        if (articuloNuevo instanceof Computador) {
            ((Computador) articuloNuevo).setTieneTargetaGrafica(tieneTargetaGrafica);
        }
    }

    // FiguraColeccionable
    public String getTipoDeFigura() {
        if (articuloNuevo instanceof FiguraColeccionable) {
            return ((FiguraColeccionable) articuloNuevo).getTipoDeFigura();
        }
        return null;
    }
    public void setTipoDeFigura(String tipoDeFigura) {
        if (articuloNuevo instanceof FiguraColeccionable) {
            ((FiguraColeccionable) articuloNuevo).setTipoDeFigura(tipoDeFigura);
        }
    }
    public Float getValorEnMercado() {
        if (articuloNuevo instanceof FiguraColeccionable) {
            return ((FiguraColeccionable) articuloNuevo).getValorEnMercado();
        }
        return null;
    }
    public void setValorEnMercado(Float valorEnMercado) {
        if (articuloNuevo instanceof FiguraColeccionable) {
            ((FiguraColeccionable) articuloNuevo).setValorEnMercado(valorEnMercado);
        }
    }

    // JuegoDeMesa
    public Integer getNumeroJugadore() {
        if (articuloNuevo instanceof JuegoDeMesa) {
            return ((JuegoDeMesa) articuloNuevo).getNumeroJugadore();
        }
        return null;
    }
    public void setNumeroJugadore(Integer numeroJugadore) {
        if (articuloNuevo instanceof JuegoDeMesa) {
            ((JuegoDeMesa) articuloNuevo).setNumeroJugadore(numeroJugadore);
        }
    }
    public String getTipoDeJuego() {
        if (articuloNuevo instanceof JuegoDeMesa) {
            return ((JuegoDeMesa) articuloNuevo).getTipoDeJuego();
        }
        return null;
    }
    public void setTipoDeJuego(String tipoDeJuego) {
        if (articuloNuevo instanceof JuegoDeMesa) {
            ((JuegoDeMesa) articuloNuevo).setTipoDeJuego(tipoDeJuego);
        }
    }

    // MaquillajeCapilar
    public Boolean getResistenciaAgua() {
        if (articuloNuevo instanceof MaquillajeCapilar) {
            return ((MaquillajeCapilar) articuloNuevo).isResistenciaAgua();
        }
        return null;
    }
    public void setResistenciaAgua(Boolean resistenciaAgua) {
        if (articuloNuevo instanceof MaquillajeCapilar) {
            ((MaquillajeCapilar) articuloNuevo).setResistenciaAgua(resistenciaAgua);
        }
    }
    public Integer getDuracionHora() {
        if (articuloNuevo instanceof MaquillajeCapilar) {
            return ((MaquillajeCapilar) articuloNuevo).getDuracionHora();
        }
        return null;
    }
    public void setDuracionHora(Integer duracionHora) {
        if (articuloNuevo instanceof MaquillajeCapilar) {
            ((MaquillajeCapilar) articuloNuevo).setDuracionHora(duracionHora);
        }
    }

    // MaquillajeDePiel
    public Integer getTipoMaquillaje() {
        if (articuloNuevo instanceof MaquillajeDePiel) {
            return ((MaquillajeDePiel) articuloNuevo).getTipo();
        }
        return null;
    }
    public void setTipoMaquillaje(Integer tipo) {
        if (articuloNuevo instanceof MaquillajeDePiel) {
            ((MaquillajeDePiel) articuloNuevo).setTipo(tipo);
        }
    }
    public Boolean getEsEcoamigable() {
        if (articuloNuevo instanceof MaquillajeDePiel) {
            return ((MaquillajeDePiel) articuloNuevo).isEsEcoamigable();
        }
        return null;
    }
    public void setEsEcoamigable(Boolean esEcoamigable) {
        if (articuloNuevo instanceof MaquillajeDePiel) {
            ((MaquillajeDePiel) articuloNuevo).setEsEcoamigable(esEcoamigable);
        }
    }

    // PelucheAnimal
    public String getEspecie() {
        if (articuloNuevo instanceof PelucheAnimal) {
            return ((PelucheAnimal) articuloNuevo).getEspecie();
        }
        return null;
    }
    public void setEspecie(String especie) {
        if (articuloNuevo instanceof PelucheAnimal) {
            ((PelucheAnimal) articuloNuevo).setEspecie(especie);
        }
    }
    public Boolean getSonidoIncluido() {
        if (articuloNuevo instanceof PelucheAnimal) {
            return ((PelucheAnimal) articuloNuevo).isSonidoIncluido();
        }
        return null;
    }
    public void setSonidoIncluido(Boolean sonidoIncluido) {
        if (articuloNuevo instanceof PelucheAnimal) {
            ((PelucheAnimal) articuloNuevo).setSonidoIncluido(sonidoIncluido);
        }
    }

    // PeluchePersonaje
    public String getPersonaje() {
        if (articuloNuevo instanceof PeluchePersonaje) {
            return ((PeluchePersonaje) articuloNuevo).getPersonaje();
        }
        return null;
    }
    public void setPersonaje(String personaje) {
        if (articuloNuevo instanceof PeluchePersonaje) {
            ((PeluchePersonaje) articuloNuevo).setPersonaje(personaje);
        }
    }

    // RopaHombre
    public String getCorte() {
        if (articuloNuevo instanceof RopaHombre) {
            return ((RopaHombre) articuloNuevo).getCorte();
        }
        return null;
    }
    public void setCorte(String corte) {
        if (articuloNuevo instanceof RopaHombre) {
            ((RopaHombre) articuloNuevo).setCorte(corte);
        }
    }

    // RopaMujer
    public String getLargoPrenda() {
        if (articuloNuevo instanceof RopaMujer) {
            return ((RopaMujer) articuloNuevo).getLargoPrenda();
        }
        return null;
    }
    public void setLargoPrenda(String largoPrenda) {
        if (articuloNuevo instanceof RopaMujer) {
            ((RopaMujer) articuloNuevo).setLargoPrenda(largoPrenda);
        }
    }

    // UtilElectronico
    public String getTipoDispositivo() {
        if (articuloNuevo instanceof UtilElectronico) {
            return ((UtilElectronico) articuloNuevo).getTipoDispositivo();
        }
        return null;
    }
    public void setTipoDispositivo(String tipoDispositivo) {
        if (articuloNuevo instanceof UtilElectronico) {
            ((UtilElectronico) articuloNuevo).setTipoDispositivo(tipoDispositivo);
        }
    }
    public Boolean getBateriaIncluida() {
        if (articuloNuevo instanceof UtilElectronico) {
            return ((UtilElectronico) articuloNuevo).isBateriaIncluida();
        }
        return null;
    }
    public void setBateriaIncluida(Boolean bateriaIncluida) {
        if (articuloNuevo instanceof UtilElectronico) {
            ((UtilElectronico) articuloNuevo).setBateriaIncluida(bateriaIncluida);
        }
    }

    // UtilEscolar
    public String getColor() {
        if (articuloNuevo instanceof UtilEscolar) {
            return ((UtilEscolar) articuloNuevo).getColor();
        }
        if (articuloNuevo instanceof PelucheAnimal) {
            return ((PelucheAnimal) articuloNuevo).getColor();
        }
        if (articuloNuevo instanceof PeluchePersonaje) {
            return ((PeluchePersonaje) articuloNuevo).getColor();
        }
        return null;
    }
    public void setColor(String color) {
        if (articuloNuevo instanceof UtilEscolar) {
            ((UtilEscolar) articuloNuevo).setColor(color);
        }
        if (articuloNuevo instanceof PelucheAnimal) {
            ((PelucheAnimal) articuloNuevo).setColor(color);
        }
        if (articuloNuevo instanceof PeluchePersonaje) {
            ((PeluchePersonaje) articuloNuevo).setColor(color);
        }
    }
    public Integer getEdadRecomendada() {
        if (articuloNuevo instanceof UtilEscolar) {
            return ((UtilEscolar) articuloNuevo).getEdadRecomendada();
        }
        return null;
    }
    public void setEdadRecomendada(Integer edadRecomendada) {
        if (articuloNuevo instanceof UtilEscolar) {
            ((UtilEscolar) articuloNuevo).setEdadRecomendada(edadRecomendada);
        }
    }

    public Object getArticuloNuevo() {
        return articuloNuevo;
    }
}

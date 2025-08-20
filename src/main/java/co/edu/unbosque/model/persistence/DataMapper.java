package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

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
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.model.UtilElectronico;
import co.edu.unbosque.model.UtilElectronicoDTO;
import co.edu.unbosque.model.UtilEscolar;
import co.edu.unbosque.model.UtilEscolarDTO;

public class DataMapper {

	public static Celular celularDTOToCelular(CelularDTO dto) {
	Celular entity = new Celular(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(), dto.getImagen(),
		dto.getMarca(), dto.getRam(), dto.getAlmacenamiento(), dto.getProcesador(), dto.getResolucionCamra());
	entity.setId(dto.getId());
	return entity;
	}

	public static CelularDTO celularToCelularDTO(Celular entity) {
	CelularDTO dto = new CelularDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getMarca(), entity.getRam(), entity.getAlmacenamiento(),
		entity.getProcesador(), entity.getResolucionCamra());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<CelularDTO> listaCelularToListaCelularDTO(ArrayList<Celular> entityList) {
		ArrayList<CelularDTO> dtoList = new ArrayList<>();
		for (Celular m : entityList) {
			dtoList.add(new CelularDTO(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(), m.getImagen(),
					m.getMarca(), m.getRam(), m.getAlmacenamiento(), m.getProcesador(), m.getResolucionCamra()));
		}
		return dtoList;
	}

	public static ArrayList<Celular> listaCelularDTOToListaCelular(ArrayList<CelularDTO> dtoList) {
		ArrayList<Celular> entityList = new ArrayList<>();
		for (CelularDTO m : dtoList) {
			entityList.add(new Celular(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(), m.getImagen(),
					m.getMarca(), m.getRam(), m.getAlmacenamiento(), m.getProcesador(), m.getResolucionCamra()));
		}
		return entityList;
	}

	public static Computador computadorDTOToComputador(ComputadorDTO dto) {
	Computador entity = new Computador(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(), dto.getImagen(),
		dto.getMarca(), dto.getRam(), dto.getAlmacenamiento(), dto.getProcesador(), dto.getTipo(),
		dto.isTieneTargetaGrafica());
	entity.setId(dto.getId());
	return entity;
	}

	public static ComputadorDTO computadorToComputadorDTO(Computador entity) {
	ComputadorDTO dto = new ComputadorDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getMarca(), entity.getRam(), entity.getAlmacenamiento(),
		entity.getProcesador(), entity.getTipo(), entity.isTieneTargetaGrafica());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<ComputadorDTO> listaComputadorToListaComputadorDTO(ArrayList<Computador> entityList) {
		ArrayList<ComputadorDTO> dtoList = new ArrayList<>();
		for (Computador m : entityList) {
			dtoList.add(new ComputadorDTO(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(), m.getImagen(),
					m.getMarca(), m.getRam(), m.getAlmacenamiento(), m.getProcesador(), m.getTipo(),
					m.isTieneTargetaGrafica()));
		}
		return dtoList;
	}

	public static ArrayList<Computador> listaComputadorDTOToListaComputador(ArrayList<ComputadorDTO> dtoList) {
		ArrayList<Computador> entityList = new ArrayList<>();
		for (ComputadorDTO m : dtoList) {
			entityList.add(new Computador(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(), m.getImagen(),
					m.getMarca(), m.getRam(), m.getAlmacenamiento(), m.getProcesador(), m.getTipo(),
					m.isTieneTargetaGrafica()));
		}
		return entityList;
	}

	public static FiguraColeccionable figuraColeccionableDTOToFiguraColeccionable(FiguraColeccionableDTO dto) {
	FiguraColeccionable entity = new FiguraColeccionable(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(),
		dto.getImagen(), dto.getTamano(), dto.getMaterial(), dto.getTipoDeFigura(), dto.getValorEnMercado());
	entity.setId(dto.getId());
	return entity;
	}

	public static FiguraColeccionableDTO figuraColeccionableToFiguraColeccionableDTO(FiguraColeccionable entity) {
	FiguraColeccionableDTO dto = new FiguraColeccionableDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(),
		entity.getPrecio(), entity.getImagen(), entity.getTamano(), entity.getMaterial(),
		entity.getTipoDeFigura(), entity.getValorEnMercado());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<FiguraColeccionableDTO> listaFiguraColeccionableToListaFiguraColeccionableDTO(
			ArrayList<FiguraColeccionable> entityList) {
		ArrayList<FiguraColeccionableDTO> dtoList = new ArrayList<>();
		for (FiguraColeccionable m : entityList) {
			dtoList.add(new FiguraColeccionableDTO(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(),
					m.getImagen(), m.getTamano(), m.getMaterial(), m.getTipoDeFigura(), m.getValorEnMercado()));
		}
		return dtoList;
	}

	public static ArrayList<FiguraColeccionable> listaFiguraColeccionableDTOToListaFiguraColeccionable(
			ArrayList<FiguraColeccionableDTO> dtoList) {
		ArrayList<FiguraColeccionable> entityList = new ArrayList<>();
		for (FiguraColeccionableDTO m : dtoList) {
			entityList.add(new FiguraColeccionable(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(),
					m.getImagen(), m.getTamano(), m.getMaterial(), m.getTipoDeFigura(), m.getValorEnMercado()));
		}
		return entityList;
	}

	public static JuegoDeMesa juegoDeMesaDTOToJuegoDeMesa(JuegoDeMesaDTO dto) {
	JuegoDeMesa entity = new JuegoDeMesa(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(), dto.getImagen(),
		dto.getTamano(), dto.getMaterial(), dto.getNumeroJugadore(), dto.getTipoDeJuego());
	entity.setId(dto.getId());
	return entity;
	}

	public static JuegoDeMesaDTO juegoDeMesaToJuegoDeMesaDTO(JuegoDeMesa entity) {
	JuegoDeMesaDTO dto = new JuegoDeMesaDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getTamano(), entity.getMaterial(), entity.getNumeroJugadore(),
		entity.getTipoDeJuego());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<JuegoDeMesaDTO> listaJuegoDeMesaToListaJuegoDeMesaDTO(ArrayList<JuegoDeMesa> entityList) {
		ArrayList<JuegoDeMesaDTO> dtoList = new ArrayList<>();
		for (JuegoDeMesa m : entityList) {
			dtoList.add(new JuegoDeMesaDTO(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(), m.getImagen(),
					m.getTamano(), m.getMaterial(), m.getNumeroJugadore(), m.getTipoDeJuego()));
		}
		return dtoList;
	}

	public static ArrayList<JuegoDeMesa> listaJuegoDeMesaDTOToListaJuegoDeMesa(ArrayList<JuegoDeMesaDTO> dtoList) {
		ArrayList<JuegoDeMesa> entityList = new ArrayList<>();
		for (JuegoDeMesaDTO m : dtoList) {
			entityList.add(new JuegoDeMesa(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(), m.getImagen(),
					m.getTamano(), m.getMaterial(), m.getNumeroJugadore(), m.getTipoDeJuego()));
		}
		return entityList;
	}

	public static MaquillajeCapilar maquillajeCapilarDTOToMaquillajeCapilar(MaquillajeCapilarDTO dto) {
	MaquillajeCapilar entity = new MaquillajeCapilar(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(),
		dto.getImagen(), dto.getColor(), dto.getContenidoEnGramo(), dto.isResistenciaAgua(),
		dto.getDuracionHora());
	entity.setId(dto.getId());
	return entity;
	}

	public static MaquillajeCapilarDTO maquillajeCapilarToMaquillajeCapilarDTO(MaquillajeCapilar entity) {
	MaquillajeCapilarDTO dto = new MaquillajeCapilarDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getColor(), entity.getContenidoEnGramo(), entity.isResistenciaAgua(),
		entity.getDuracionHora());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<MaquillajeCapilarDTO> listaMaquillajeCapilarToListaMaquillajeCapilarDTO(
			ArrayList<MaquillajeCapilar> entityList) {
		ArrayList<MaquillajeCapilarDTO> dtoList = new ArrayList<>();
		for (MaquillajeCapilar m : entityList) {
			dtoList.add(new MaquillajeCapilarDTO(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(),
					m.getImagen(), m.getColor(), m.getContenidoEnGramo(), m.isResistenciaAgua(), m.getDuracionHora()));
		}
		return dtoList;
	}

	public static ArrayList<MaquillajeCapilar> listaMaquillajeCapilarDTOToListaMaquillajeCapilar(
			ArrayList<MaquillajeCapilarDTO> dtoList) {
		ArrayList<MaquillajeCapilar> entityList = new ArrayList<>();
		for (MaquillajeCapilarDTO m : dtoList) {
			entityList.add(new MaquillajeCapilar(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(),
					m.getImagen(), m.getColor(), m.getContenidoEnGramo(), m.isResistenciaAgua(), m.getDuracionHora()));
		}
		return entityList;
	}

	public static MaquillajeDePiel maquillajeDePielDTOToMaquillajeDePiel(MaquillajeDePielDTO dto) {
	MaquillajeDePiel entity = new MaquillajeDePiel(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(),
		dto.getImagen(), dto.getColor(), dto.getContenidoEnGramo(), dto.getTipo(), dto.isEsEcoamigable());
	entity.setId(dto.getId());
	return entity;
	}

	public static MaquillajeDePielDTO maquillajeDePielToMaquillajeDePielDTO(MaquillajeDePiel entity) {
	MaquillajeDePielDTO dto = new MaquillajeDePielDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getColor(), entity.getContenidoEnGramo(), entity.getTipo(),
		entity.isEsEcoamigable());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<MaquillajeDePielDTO> listaMaquillajeDePielToListaMaquillajeDePielDTO(
			ArrayList<MaquillajeDePiel> entityList) {
		ArrayList<MaquillajeDePielDTO> dtoList = new ArrayList<>();
		for (MaquillajeDePiel m : entityList) {
			dtoList.add(new MaquillajeDePielDTO(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(),
					m.getImagen(), m.getColor(), m.getContenidoEnGramo(), m.getTipo(), m.isEsEcoamigable()));
		}
		return dtoList;
	}

	public static ArrayList<MaquillajeDePiel> listaMaquillajeDePielDTOToListaMaquillajeDePiel(
			ArrayList<MaquillajeDePielDTO> dtoList) {
		ArrayList<MaquillajeDePiel> entityList = new ArrayList<>();
		for (MaquillajeDePielDTO m : dtoList) {
			entityList.add(new MaquillajeDePiel(m.getNombre(), m.getId(), m.getDescripcion(), m.getPrecio(),
					m.getImagen(), m.getColor(), m.getContenidoEnGramo(), m.getTipo(), m.isEsEcoamigable()));
		}
		return entityList;
	}

	public static PelucheAnimal pelucheAnimalDTOToPelucheAnimal(PelucheAnimalDTO dto) {
	PelucheAnimal entity = new PelucheAnimal(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(), dto.getImagen(),
		dto.getTamano(), dto.getColor(), dto.getMaterial(), dto.getEspecie(), dto.isSonidoIncluido());
	entity.setId(dto.getId());
	return entity;
	}

	public static PelucheAnimalDTO pelucheAnimalToPelucheAnimalDTO(PelucheAnimal entity) {
	PelucheAnimalDTO dto = new PelucheAnimalDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getTamano(), entity.getColor(), entity.getMaterial(), entity.getEspecie(),
		entity.isSonidoIncluido());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<PelucheAnimalDTO> listaPelucheAnimalToListaPelucheAnimalDTO(
			ArrayList<PelucheAnimal> entityList) {
		ArrayList<PelucheAnimalDTO> dtoList = new ArrayList<>();
		for (PelucheAnimal p : entityList) {
			dtoList.add(new PelucheAnimalDTO(p.getNombre(), p.getId(), p.getDescripcion(), p.getPrecio(), p.getImagen(),
					p.getTamano(), p.getColor(), p.getMaterial(), p.getEspecie(), p.isSonidoIncluido()));
		}
		return dtoList;
	}

	public static ArrayList<PelucheAnimal> listaPelucheAnimalDTOToListaPelucheAnimal(
			ArrayList<PelucheAnimalDTO> dtoList) {
		ArrayList<PelucheAnimal> entityList = new ArrayList<>();
		for (PelucheAnimalDTO p : dtoList) {
			entityList.add(new PelucheAnimal(p.getNombre(), p.getId(), p.getDescripcion(), p.getPrecio(), p.getImagen(),
					p.getTamano(), p.getColor(), p.getMaterial(), p.getEspecie(), p.isSonidoIncluido()));
		}
		return entityList;
	}

	public static PeluchePersonaje peluchePersonajeDTOToPeluchePersonaje(PeluchePersonajeDTO dto) {
	PeluchePersonaje entity = new PeluchePersonaje(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(),
		dto.getImagen(), dto.getTamano(), dto.getColor(), dto.getMaterial(), dto.getPersonaje());
	entity.setId(dto.getId());
	return entity;
	}

	public static PeluchePersonajeDTO peluchePersonajeToPeluchePersonajeDTO(PeluchePersonaje entity) {
	PeluchePersonajeDTO dto = new PeluchePersonajeDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getTamano(), entity.getColor(), entity.getMaterial(), entity.getPersonaje());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<PeluchePersonajeDTO> listaPeluchePersonajeToListaPeluchePersonajeDTO(
			ArrayList<PeluchePersonaje> entityList) {
		ArrayList<PeluchePersonajeDTO> dtoList = new ArrayList<>();
		for (PeluchePersonaje p : entityList) {
			dtoList.add(new PeluchePersonajeDTO(p.getNombre(), p.getId(), p.getDescripcion(), p.getPrecio(),
					p.getImagen(), p.getTamano(), p.getColor(), p.getMaterial(), p.getPersonaje()));
		}
		return dtoList;
	}

	public static ArrayList<PeluchePersonaje> listaPeluchePersonajeDTOToListaPeluchePersonaje(
			ArrayList<PeluchePersonajeDTO> dtoList) {
		ArrayList<PeluchePersonaje> entityList = new ArrayList<>();
		for (PeluchePersonajeDTO p : dtoList) {
			entityList.add(new PeluchePersonaje(p.getNombre(), p.getId(), p.getDescripcion(), p.getPrecio(),
					p.getImagen(), p.getTamano(), p.getColor(), p.getMaterial(), p.getPersonaje()));
		}
		return entityList;
	}

	public static RopaHombre ropaHombreDTOToRopaHombre(RopaHombreDTO dto) {
	RopaHombre entity = new RopaHombre(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(), dto.getImagen(),
		dto.getTipoPrenda(), dto.getTalla(), dto.getMaterial(), dto.getCorte());
	entity.setId(dto.getId());
	return entity;
	}

	public static RopaHombreDTO ropaHombreToRopaHombreDTO(RopaHombre entity) {
	RopaHombreDTO dto = new RopaHombreDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getTipoPrenda(), entity.getTalla(), entity.getMaterial(), entity.getCorte());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<RopaHombreDTO> listaRopaHombreToListaRopaHombreDTO(ArrayList<RopaHombre> entityList) {
		ArrayList<RopaHombreDTO> dtoList = new ArrayList<>();
		for (RopaHombre r : entityList) {
			dtoList.add(new RopaHombreDTO(r.getNombre(), r.getId(), r.getDescripcion(), r.getPrecio(), r.getImagen(),
					r.getTipoPrenda(), r.getTalla(), r.getMaterial(), r.getCorte()));
		}
		return dtoList;
	}

	public static ArrayList<RopaHombre> listaRopaHombreDTOToListaRopaHombre(ArrayList<RopaHombreDTO> dtoList) {
		ArrayList<RopaHombre> entityList = new ArrayList<>();
		for (RopaHombreDTO r : dtoList) {
			entityList.add(new RopaHombre(r.getNombre(), r.getId(), r.getDescripcion(), r.getPrecio(), r.getImagen(),
					r.getTipoPrenda(), r.getTalla(), r.getMaterial(), r.getCorte()));
		}
		return entityList;
	}

	public static RopaMujer ropaMujerDTOToRopaMujer(RopaMujerDTO dto) {
	RopaMujer entity = new RopaMujer(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(), dto.getImagen(),
		dto.getTipoPrenda(), dto.getTalla(), dto.getMaterial(), dto.getLargoPrenda());
	entity.setId(dto.getId());
	return entity;
	}

	public static RopaMujerDTO ropaMujerToRopaMujerDTO(RopaMujer entity) {
	RopaMujerDTO dto = new RopaMujerDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getTipoPrenda(), entity.getTalla(), entity.getMaterial(),
		entity.getLargoPrenda());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<RopaMujerDTO> listaRopaMujerToListaRopaMujerDTO(ArrayList<RopaMujer> entityList) {
		ArrayList<RopaMujerDTO> dtoList = new ArrayList<>();
		for (RopaMujer r : entityList) {
			dtoList.add(new RopaMujerDTO(r.getNombre(), r.getId(), r.getDescripcion(), r.getPrecio(), r.getImagen(),
					r.getTipoPrenda(), r.getTalla(), r.getMaterial(), r.getLargoPrenda()));
		}
		return dtoList;
	}

	public static ArrayList<RopaMujer> listaRopaMujerDTOToListaRopaMujer(ArrayList<RopaMujerDTO> dtoList) {
		ArrayList<RopaMujer> entityList = new ArrayList<>();
		for (RopaMujerDTO r : dtoList) {
			entityList.add(new RopaMujer(r.getNombre(), r.getId(), r.getDescripcion(), r.getPrecio(), r.getImagen(),
					r.getTipoPrenda(), r.getTalla(), r.getMaterial(), r.getLargoPrenda()));
		}
		return entityList;
	}

	public static Usuario usuarioDTOToUsuario(UsuarioDTO dto) {
		Usuario entity;
		entity = new Usuario(dto.getNombre(), dto.getApellido(), dto.getFechaDeNacimiento(), dto.getNombreUsuario(),
				dto.getCorreo(), dto.getContrasena(), dto.getDireccion());
		return entity;
	}

	public static UsuarioDTO usuarioToUsuarioDTO(Usuario entity) {
		UsuarioDTO dto;
		dto = new UsuarioDTO(entity.getNombre(), entity.getApellido(), entity.getFechaDeNacimiento(),
				entity.getNombreUsuario(), entity.getCorreo(), entity.getContrasena(), entity.getDireccion());
		return dto;
	}

	public static ArrayList<UsuarioDTO> listaUsuarioToListaUsuarioDTO(ArrayList<Usuario> entityList) {
		ArrayList<UsuarioDTO> dtoList = new ArrayList<>();
		for (Usuario u : entityList) {
			dtoList.add(new UsuarioDTO(u.getNombre(), u.getApellido(), u.getFechaDeNacimiento(), u.getNombreUsuario(),
					u.getCorreo(), u.getContrasena(), u.getDireccion()));
		}
		return dtoList;
	}

	public static ArrayList<Usuario> listaUsuarioDTOToListaUsuario(ArrayList<UsuarioDTO> dtoList) {
		ArrayList<Usuario> entityList = new ArrayList<>();
		for (UsuarioDTO u : dtoList) {
			entityList.add(new Usuario(u.getNombre(), u.getApellido(), u.getFechaDeNacimiento(), u.getNombreUsuario(),
					u.getCorreo(), u.getContrasena(), u.getDireccion()));
		}
		return entityList;
	}

	public static UtilElectronico utilElectronicoDTOToUtilElectronico(UtilElectronicoDTO dto) {
	UtilElectronico entity = new UtilElectronico(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(),
		dto.getImagen(), dto.getTipo(), dto.getTamano(), dto.getForma(), dto.getTipoDispositivo(),
		dto.isBateriaIncluida());
	entity.setId(dto.getId());
	return entity;
	}

	public static UtilElectronicoDTO utilElectronicoToUtilElectronicoDTO(UtilElectronico entity) {
	UtilElectronicoDTO dto = new UtilElectronicoDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getTipo(), entity.getTamano(), entity.getForma(),
		entity.getTipoDispositivo(), entity.isBateriaIncluida());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<UtilElectronicoDTO> listaUtilElectronicoToListaUtilElectronicoDTO(
			ArrayList<UtilElectronico> entityList) {
		ArrayList<UtilElectronicoDTO> dtoList = new ArrayList<>();
		for (UtilElectronico u : entityList) {
			dtoList.add(
					new UtilElectronicoDTO(u.getNombre(), u.getId(), u.getDescripcion(), u.getPrecio(), u.getImagen(),
							u.getTipo(), u.getTamano(), u.getForma(), u.getTipoDispositivo(), u.isBateriaIncluida()));
		}
		return dtoList;
	}

	public static ArrayList<UtilElectronico> listaUtilElectronicoDTOToListaUtilElectronico(
			ArrayList<UtilElectronicoDTO> dtoList) {
		ArrayList<UtilElectronico> entityList = new ArrayList<>();
		for (UtilElectronicoDTO u : dtoList) {
			entityList
					.add(new UtilElectronico(u.getNombre(), u.getId(), u.getDescripcion(), u.getPrecio(), u.getImagen(),
							u.getTipo(), u.getTamano(), u.getForma(), u.getTipoDispositivo(), u.isBateriaIncluida()));
		}
		return entityList;
	}

	public static UtilEscolar utilEscolarDTOToUtilEscolar(UtilEscolarDTO dto) {
	UtilEscolar entity = new UtilEscolar(dto.getNombre(), dto.getId(), dto.getDescripcion(), dto.getPrecio(), dto.getImagen(),
		dto.getTipo(), dto.getTamano(), dto.getForma(), dto.getColor(), dto.getEdadRecomendada());
	entity.setId(dto.getId());
	return entity;
	}

	public static UtilEscolarDTO utilEscolarToUtilEscolarDTO(UtilEscolar entity) {
	UtilEscolarDTO dto = new UtilEscolarDTO(entity.getNombre(), entity.getId(), entity.getDescripcion(), entity.getPrecio(),
		entity.getImagen(), entity.getTipo(), entity.getTamano(), entity.getForma(), entity.getColor(),
		entity.getEdadRecomendada());
	dto.setId(entity.getId());
	return dto;
	}

	public static ArrayList<UtilEscolarDTO> listaUtilEscolarToListaUtilEscolarDTO(ArrayList<UtilEscolar> entityList) {
		ArrayList<UtilEscolarDTO> dtoList = new ArrayList<>();
		for (UtilEscolar u : entityList) {
			dtoList.add(new UtilEscolarDTO(u.getNombre(), u.getId(), u.getDescripcion(), u.getPrecio(), u.getImagen(),
					u.getTipo(), u.getTamano(), u.getForma(), u.getColor(), u.getEdadRecomendada()));
		}
		return dtoList;
	}

	public static ArrayList<UtilEscolar> listaUtilEscolarDTOToListaUtilEscolar(ArrayList<UtilEscolarDTO> dtoList) {
		ArrayList<UtilEscolar> entityList = new ArrayList<>();
		for (UtilEscolarDTO u : dtoList) {
			entityList.add(new UtilEscolar(u.getNombre(), u.getId(), u.getDescripcion(), u.getPrecio(), u.getImagen(),
					u.getTipo(), u.getTamano(), u.getForma(), u.getColor(), u.getEdadRecomendada()));
		}
		return entityList;
	}

}

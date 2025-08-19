package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;

import co.edu.unbosque.model.persistence.CelularDAO;
import co.edu.unbosque.model.persistence.ComputadorDAO;
import co.edu.unbosque.model.persistence.DataMapper;
import co.edu.unbosque.model.persistence.FiguraColeccionableDAO;
import co.edu.unbosque.model.persistence.JuegoDeMesaDAO;
import co.edu.unbosque.model.persistence.MaquillajeCapilarDAO;
import co.edu.unbosque.model.persistence.MaquillajeDePielDAO;
import co.edu.unbosque.model.persistence.PelucheAnimalDAO;
import co.edu.unbosque.model.persistence.PeluchePersonajeDAO;
import co.edu.unbosque.model.persistence.RopaHombreDAO;
import co.edu.unbosque.model.persistence.RopaMujerDAO;
import co.edu.unbosque.model.persistence.UsuarioDAO;
import co.edu.unbosque.model.persistence.UtilElectronicoDAO;
import co.edu.unbosque.model.persistence.UtilEscolarDAO;

public class ModelFacade {

	public static CelularDAO celucoDAO = new CelularDAO();
	public static ComputadorDAO compuDAO = new ComputadorDAO();
	public static FiguraColeccionableDAO figuraColeccionableDAO = new FiguraColeccionableDAO();
	public static JuegoDeMesaDAO juegoMesaDAO = new JuegoDeMesaDAO();
	public static MaquillajeCapilarDAO maquillajeCapilarDAO = new MaquillajeCapilarDAO();
	public static MaquillajeDePielDAO maquillajeDePielDAO = new MaquillajeDePielDAO();
	public static PelucheAnimalDAO pelucheAnimalDAO = new PelucheAnimalDAO();
	public static PeluchePersonajeDAO peluchePersonajeDAO = new PeluchePersonajeDAO();
	public static RopaHombreDAO ropaHombre = new RopaHombreDAO();
	public static RopaMujerDAO ropaMujer = new RopaMujerDAO();
	public static UtilElectronicoDAO utilElectronicoDAO = new UtilElectronicoDAO();
	public static UtilEscolarDAO utilEscolarDAO = new UtilEscolarDAO();
	public static UsuarioDAO usuarioDAO = new UsuarioDAO();

	public static Usuario usuarioActual = null;

	public ModelFacade() {
	}

	public static ArrayList<Articulo> obtenerArticulos() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		articulos.addAll(celucoDAO.getListaCelular());
		articulos.addAll(compuDAO.getListaComputador());
		articulos.addAll(figuraColeccionableDAO.getListaFiguraCol());
		articulos.addAll(juegoMesaDAO.getListaJuegoMesa());
		articulos.addAll(maquillajeCapilarDAO.getListaMaquillajeC());
		articulos.addAll(maquillajeDePielDAO.getListaMaquillajeP());
		articulos.addAll(pelucheAnimalDAO.getListaPelucheAnimal());
		articulos.addAll(peluchePersonajeDAO.getListaPeluchePersonaje());
		articulos.addAll(ropaHombre.getListaRopaHombre());
		articulos.addAll(ropaMujer.getListaRopaMujer());
		articulos.addAll(utilElectronicoDAO.getListaUtilElectronico());
		articulos.addAll(utilEscolarDAO.getListaUtilesEscolares());
		return articulos;
	}
	public static ArrayList<Articulo> obtenerArticulosAleatorios() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		articulos.addAll(celucoDAO.getListaCelular());
		articulos.addAll(compuDAO.getListaComputador());
		articulos.addAll(figuraColeccionableDAO.getListaFiguraCol());
		articulos.addAll(juegoMesaDAO.getListaJuegoMesa());
		articulos.addAll(maquillajeCapilarDAO.getListaMaquillajeC());
		articulos.addAll(maquillajeDePielDAO.getListaMaquillajeP());
		articulos.addAll(pelucheAnimalDAO.getListaPelucheAnimal());
		articulos.addAll(peluchePersonajeDAO.getListaPeluchePersonaje());
		articulos.addAll(ropaHombre.getListaRopaHombre());
		articulos.addAll(ropaMujer.getListaRopaMujer());
		articulos.addAll(utilElectronicoDAO.getListaUtilElectronico());
		articulos.addAll(utilEscolarDAO.getListaUtilesEscolares());
		Collections.shuffle(articulos);
		return articulos;
	}

	public static ArrayList<Articulo> obtenerArticulosRopa() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		articulos.addAll(ropaHombre.getListaRopaHombre());
		articulos.addAll(ropaMujer.getListaRopaMujer());
		return articulos;
	}
	public static ArrayList<Articulo> obtenerArticulosElectronica() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		articulos.addAll(celucoDAO.getListaCelular());
		articulos.addAll(compuDAO.getListaComputador());
		return articulos;
	}
	public static ArrayList<Articulo> obtenerArticulosJuguetes() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		articulos.addAll(figuraColeccionableDAO.getListaFiguraCol());
		articulos.addAll(juegoMesaDAO.getListaJuegoMesa());
		return articulos;
	}
	public static ArrayList<Articulo> obtenerArticulosMaquillaje() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		articulos.addAll(maquillajeCapilarDAO.getListaMaquillajeC());
		articulos.addAll(maquillajeDePielDAO.getListaMaquillajeP());
		return articulos;
	}
	public static ArrayList<Articulo> obtenerArticulosPeluches() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		articulos.addAll(pelucheAnimalDAO.getListaPelucheAnimal());
		articulos.addAll(peluchePersonajeDAO.getListaPeluchePersonaje());
		return articulos;
	}
	public static ArrayList<Articulo> obtenerArticulosPapeleria() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		articulos.addAll(utilElectronicoDAO.getListaUtilElectronico());
		articulos.addAll(utilEscolarDAO.getListaUtilesEscolares());
		return articulos;
	}

	public static void crearArticulosDeCadaClase() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Creando");
			// Celular
			Celular cel = new Celular("Celular" + i, i, "Desc Celular" + i, i * 1000,
					"https://images.unsplash.com/photo-1511707171634-5f897ff02aa9?auto=format&fit=crop&w=400&q=80",
					"Marca" + i, 4, 64, "Proc" + i, 12);
			celucoDAO.add(DataMapper.celularToCelularDTO(cel));

			// Computador
			Computador comp = new Computador("Computador" + i, i, "Desc Comp" + i, i * 2000,
					"https://images.unsplash.com/photo-1517336714731-489689fd1ca8?auto=format&fit=crop&w=400&q=80",
					"Marca" + i, 8, 256, "Proc" + i, "Tipo" + i, true);
			compuDAO.add(DataMapper.computadorToComputadorDTO(comp));

			// FiguraColeccionable
			FiguraColeccionable fig = new FiguraColeccionable("Figura" + i, i, "Desc Fig" + i, i * 100,
					"https://images.unsplash.com/photo-1464983953574-0892a716854b?auto=format&fit=crop&w=400&q=80",
					"Mediano", "Plastico", "TipoFig" + i, i * 10);
			figuraColeccionableDAO.add(DataMapper.figuraColeccionableToFiguraColeccionableDTO(fig));

			// JuegoDeMesa
			JuegoDeMesa juego = new JuegoDeMesa("Juego" + i, i, "Desc Juego" + i, i * 50,
					"https://images.unsplash.com/photo-1506744038136-46273834b3fb?auto=format&fit=crop&w=400&q=80",
					"Grande", "Carton", i + 2, "Estrategia");
			juegoMesaDAO.add(DataMapper.juegoDeMesaToJuegoDeMesaDTO(juego));

			// MaquillajeCapilar
			MaquillajeCapilar maqC = new MaquillajeCapilar("MaquillajeCapilar" + i, i, "Desc MaqC" + i, i * 25,
					"https://images.unsplash.com/photo-1517841905240-472988babdf9?auto=format&fit=crop&w=400&q=80",
					"Rojo", 10.5f, true, 8);
			maquillajeCapilarDAO.add(DataMapper.maquillajeCapilarToMaquillajeCapilarDTO(maqC));

			// MaquillajeDePiel
			MaquillajeDePiel maqP = new MaquillajeDePiel("MaquillajePiel" + i, i, "Desc MaqP" + i, i * 22,
					"https://images.unsplash.com/photo-1515378791036-0648a3ef77b2?auto=format&fit=crop&w=400&q=80",
					"Beige", 8.5f, 1, true);
			maquillajeDePielDAO.add(DataMapper.maquillajeDePielToMaquillajeDePielDTO(maqP));

			// PelucheAnimal
			PelucheAnimal pelA = new PelucheAnimal("PelucheAnimal" + i, i, "Desc PelA" + i, i * 45,
					"https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?auto=format&fit=crop&w=400&q=80",
					"Grande", "Marron", "Algodon", "Perro", true);
			pelucheAnimalDAO.add(DataMapper.pelucheAnimalToPelucheAnimalDTO(pelA));

			// PeluchePersonaje
			PeluchePersonaje pelP = new PeluchePersonaje("PeluchePersonaje" + i, i, "Desc PelP" + i, i * 50,
					"https://images.unsplash.com/photo-1519125323398-675f0ddb6308?auto=format&fit=crop&w=400&q=80",
					"Mediano", "Azul", "Algodon", "Batman");
			peluchePersonajeDAO.add(DataMapper.peluchePersonajeToPeluchePersonajeDTO(pelP));

			// RopaHombre
			RopaHombre rh = new RopaHombre("RopaHombre" + i, i, "Desc RH" + i, i * 65,
					"https://images.unsplash.com/photo-1465101046530-73398c7f28ca?auto=format&fit=crop&w=400&q=80",
					"Camisa", "L", "Algodon", "Slim");
			ropaHombre.add(DataMapper.ropaHombreToRopaHombreDTO(rh));

			// RopaMujer
			RopaMujer rm = new RopaMujer("RopaMujer" + i, i, "Desc RM" + i, i * 70,
					"https://images.unsplash.com/photo-1512436991641-6745cdb1723f?auto=format&fit=crop&w=400&q=80",
					"Vestido", "M", "Seda", "Largo");
			ropaMujer.add(DataMapper.ropaMujerToRopaMujerDTO(rm));

			// UtilElectronico
			UtilElectronico ue = new UtilElectronico("UtilElectronico" + i, i, "Desc UE" + i, i * 80,
					"https://images.unsplash.com/photo-1519389950473-47ba0277781c?auto=format&fit=crop&w=400&q=80",
					"Tablet", "Grande", "Rectangular", "Tablet", true);
			utilElectronicoDAO.add(DataMapper.utilElectronicoToUtilElectronicoDTO(ue));

			// UtilEscolar
			UtilEscolar us = new UtilEscolar("UtilEscolar" + i, i, "Desc US" + i, i * 15,
					"https://lingokids.com/wp-content/uploads/2020/11/20192F032F122F132F242F432F17ed6fa8-4cc3-4f5d-9af6-3d83dc3a4c542FPencilCase.png",
					"Lapiz", "Pequeño", "Cilindrico", "Amarillo", 7);
			utilEscolarDAO.add(DataMapper.utilEscolarToUtilEscolarDTO(us));
		}
	}

	public static void imprimirTodo() {
		for (Articulo arts : obtenerArticulos()) {
			System.out.println(arts.toString());
		}
	}

	public static Articulo obtenerArticulo(int id) {
		for (Articulo a : ModelFacade.obtenerArticulos()) {
			if (a.getId() == id) {
				return a;
			}
		}
		return null;
	}

}

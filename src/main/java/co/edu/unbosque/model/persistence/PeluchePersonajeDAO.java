package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.PeluchePersonaje;
import co.edu.unbosque.model.PeluchePersonajeDTO;

public class PeluchePersonajeDAO implements OperacionDAO<PeluchePersonajeDTO, PeluchePersonaje> {
	private ArrayList<PeluchePersonaje> listaPeluchePersonaje;

	// lOKA Juan diego
	public PeluchePersonajeDAO() {
		listaPeluchePersonaje = new ArrayList<>();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (listaPeluchePersonaje.isEmpty()) {
			return "No hay pelcuhes de personajes aun  ";
		} else {

			for (PeluchePersonaje peluchePersonaje : listaPeluchePersonaje) {
				rta += peluchePersonaje.toString();
			}

		}
		return rta;
	}

	@Override
	public boolean add(PeluchePersonajeDTO newData) {
		if (find(DataMapper.peluchePersonajeDTOToPeluchePersonaje(newData)) == null) {
			listaPeluchePersonaje.add(DataMapper.peluchePersonajeDTOToPeluchePersonaje(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(PeluchePersonajeDTO toDelete) {
		PeluchePersonaje found = find(DataMapper.peluchePersonajeDTOToPeluchePersonaje(toDelete));
		if (found != null) {
			return listaPeluchePersonaje.remove(found);

		} else {
			return false;
		}
	}

	@Override
	public PeluchePersonaje find(PeluchePersonaje toFind) {
		PeluchePersonaje found = null;
		if (!listaPeluchePersonaje.isEmpty()) {
			for (PeluchePersonaje p : listaPeluchePersonaje) {
				if (p.getId() == toFind.getId()) {
					found = p;
					return found;
				} else {
					continue; // las sig lineas desps de continue no se ejecutan, saltan a la sig iteracion
				}
			}
		} else {
			return null;
		}
		return null;
	}

	@Override
	public boolean update(PeluchePersonajeDTO previous, PeluchePersonajeDTO newData) {
		PeluchePersonaje found = find(DataMapper.peluchePersonajeDTOToPeluchePersonaje(previous));
		if (found != null) {
			listaPeluchePersonaje.remove(found);
			listaPeluchePersonaje.add(DataMapper.peluchePersonajeDTOToPeluchePersonaje(newData));
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<PeluchePersonajeDTO> getAll() {

		return DataMapper.listaPeluchePersonajeToListaPeluchePersonajeDTO(listaPeluchePersonaje);
	}

	public ArrayList<PeluchePersonaje> getListaPeluchePersonaje() {
		return listaPeluchePersonaje;
	}

	public void setListaPeluchePersonaje(ArrayList<PeluchePersonaje> listaPeluchePersonaje) {
		this.listaPeluchePersonaje = listaPeluchePersonaje;
	}

}

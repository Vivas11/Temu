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
		// Buscar el objeto en la lista antes de eliminar
		System.out.println("[DEBUG][DAO] Buscando PeluchePersonaje para eliminar: " + toDelete);
		PeluchePersonaje found = find(DataMapper.peluchePersonajeDTOToPeluchePersonaje(toDelete));
		if (found != null) {
			System.out.println("[DEBUG][DAO] Encontrado, procediendo a eliminar: " + found);
			boolean result = listaPeluchePersonaje.remove(found);
			System.out.println("[DEBUG][DAO] Eliminación exitosa: " + result);
			return result;
		} else {
			System.out.println("[DEBUG][DAO] No se encontró el objeto para eliminar");
			return false;
		}
	}

	@Override
	public PeluchePersonaje find(PeluchePersonaje toFind) {
		PeluchePersonaje found = null;
		if (!listaPeluchePersonaje.isEmpty()) {
			for (PeluchePersonaje c : listaPeluchePersonaje) {
				System.out.println("[DEBUG] Comparando PeluchePersonaje: listaId=" + c.getId() + " vs buscarId=" + toFind.getId());
				if (c.getId() == toFind.getId()) {
					System.out.println("[DEBUG] Coincidencia encontrada: id=" + c.getId());
					found = c;
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

/**
 * Paquete que contiene las clases de persistencia (DAO) del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PeluchePersonaje;
import co.edu.unbosque.model.PeluchePersonajeDTO;

/**
 * DAO para la entidad PeluchePersonaje. Gestiona operaciones CRUD en memoria
 * y realiza el mapeo entre {@link PeluchePersonajeDTO} y {@link PeluchePersonaje} usando {@link DataMapper}.
 */
public class PeluchePersonajeDAO implements OperacionDAO<PeluchePersonajeDTO, PeluchePersonaje> {
	/** Lista interna de peluches de personajes. */
	private ArrayList<PeluchePersonaje> listaPeluchePersonaje;

	/** Constructor por defecto. Inicializa la lista interna. */
	public PeluchePersonajeDAO() {
		listaPeluchePersonaje = new ArrayList<>();
	}

	/**
	 * Muestra en una cadena todos los peluches de personajes registrados.
	 * @return Cadena con la representación de los objetos almacenados o un mensaje si no hay registros
	 */
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

	/**
	 * Agrega un nuevo peluche de personaje si no existe otro con el mismo id.
	 * @param newData DTO con la información a agregar
	 * @return true si se agregó, false en caso contrario
	 */
	@Override
	public boolean add(PeluchePersonajeDTO newData) {
		if (find(DataMapper.peluchePersonajeDTOToPeluchePersonaje(newData)) == null) {
			listaPeluchePersonaje.add(DataMapper.peluchePersonajeDTOToPeluchePersonaje(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Elimina un peluche de personaje coincidente con el DTO proporcionado.
	 * @param toDelete DTO del peluche a eliminar
	 * @return true si se eliminó, false en caso contrario
	 */
	@Override
	public boolean delete(PeluchePersonajeDTO toDelete) {
		PeluchePersonaje found = find(DataMapper.peluchePersonajeDTOToPeluchePersonaje(toDelete));
		if (found != null) {
			return listaPeluchePersonaje.remove(found);
		} else {
			return false;
		}
	}

	/**
	 * Busca un peluche de personaje por su identificador.
	 * @param toFind Entidad con el id a buscar
	 * @return La entidad encontrada o null si no existe
	 */
	@Override
	public PeluchePersonaje find(PeluchePersonaje toFind) {
		PeluchePersonaje found = null;
		if (!listaPeluchePersonaje.isEmpty()) {
			for (PeluchePersonaje c : listaPeluchePersonaje) {
				if (c.getId() == toFind.getId()) {
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

	/**
	 * Actualiza los datos de un peluche de personaje, reemplazando el existente por uno nuevo.
	 * @param previous DTO anterior (para localizar el registro)
	 * @param newData DTO con los nuevos datos
	 * @return true si se actualizó, false en caso contrario
	 */
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

	/**
	 * Obtiene todos los peluches de personajes como DTO.
	 * @return Lista de {@link PeluchePersonajeDTO}
	 */
	public ArrayList<PeluchePersonajeDTO> getAll() {
		return DataMapper.listaPeluchePersonajeToListaPeluchePersonajeDTO(listaPeluchePersonaje);
	}

	/**
	 * Obtiene la lista interna de entidades PeluchePersonaje.
	 * @return lista de entidades
	 */
	public ArrayList<PeluchePersonaje> getListaPeluchePersonaje() {
		return listaPeluchePersonaje;
	}

	/**
	 * Establece la lista interna de entidades PeluchePersonaje.
	 * @param listaPeluchePersonaje lista a establecer
	 */
	public void setListaPeluchePersonaje(ArrayList<PeluchePersonaje> listaPeluchePersonaje) {
		this.listaPeluchePersonaje = listaPeluchePersonaje;
	}

}

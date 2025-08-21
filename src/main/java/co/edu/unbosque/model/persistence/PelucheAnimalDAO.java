/**
 * Paquete que contiene las clases de persistencia (DAO) del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PelucheAnimal;
import co.edu.unbosque.model.PelucheAnimalDTO;

/**
 * DAO para la entidad PelucheAnimal. Gestiona operaciones CRUD en memoria
 * y realiza el mapeo entre {@link PelucheAnimalDTO} y {@link PelucheAnimal} usando {@link DataMapper}.
 */
public class PelucheAnimalDAO implements OperacionDAO<PelucheAnimalDTO, PelucheAnimal>{
 
 	/** Lista interna de peluches de animales. */
 	private ArrayList<PelucheAnimal> listaPelucheAnimal;

 	/** Constructor por defecto. Inicializa la lista interna. */
 	public PelucheAnimalDAO() {
 		listaPelucheAnimal = new ArrayList<>();
 	}

 	/**
 	 * Obtiene la lista interna de entidades PelucheAnimal.
 	 * @return lista de entidades
 	 */
 	public ArrayList<PelucheAnimal> getListaPelucheAnimal() {
 		return listaPelucheAnimal;
 	}

 	/**
 	 * Establece la lista interna de entidades PelucheAnimal.
 	 * @param listaPelucheAnimal lista a establecer
 	 */
 	public void setListaPelucheAnimal(ArrayList<PelucheAnimal> listaPelucheAnimal) {
 		this.listaPelucheAnimal = listaPelucheAnimal;
 	}

 	/**
 	 * Muestra en una cadena todos los peluches de animales registrados.
 	 * @return Cadena con la representación de los objetos almacenados o un mensaje si no hay registros
 	 */
 	@Override
 	public String showAll() {
 		String rta = "";
 		if (listaPelucheAnimal.isEmpty()) {
 			return "No hay peluche de animales aun";

 		} else {
 			for (PelucheAnimal p : listaPelucheAnimal) {
 				rta += p.toString();
 			}
 		}
 		return rta;
 	}

 	/**
 	 * Agrega un nuevo peluche de animal si no existe otro con el mismo id.
 	 * @param newData DTO con la información a agregar
 	 * @return true si se agregó, false en caso contrario
 	 */
 	@Override
 	public boolean add(PelucheAnimalDTO newData) {
 		if (find(DataMapper.pelucheAnimalDTOToPelucheAnimal(newData)) == null) {
 			listaPelucheAnimal.add(DataMapper.pelucheAnimalDTOToPelucheAnimal(newData));
 			return true;
 		} else {
 			return false;
 		}

 	}

 	/**
 	 * Elimina un peluche de animal coincidente con el DTO proporcionado.
 	 * @param toDelete DTO del peluche a eliminar
 	 * @return true si se eliminó, false en caso contrario
 	 */
 	@Override
 	public boolean delete(PelucheAnimalDTO toDelete) {
 		PelucheAnimal found = find(DataMapper.pelucheAnimalDTOToPelucheAnimal(toDelete));
 		if (found != null) {
 			return listaPelucheAnimal.remove(found);
 		} else {
 			return false;
 		}
 	}

 	/**
 	 * Busca un peluche de animal por su identificador.
 	 * @param toFind Entidad con el id a buscar
 	 * @return La entidad encontrada o null si no existe
 	 */
 	@Override
 	public PelucheAnimal find(PelucheAnimal toFind) {
 		PelucheAnimal found = null;
 		if (!listaPelucheAnimal.isEmpty()) {
 			for (PelucheAnimal c : listaPelucheAnimal) {
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
 	 * Actualiza los datos de un peluche de animal, reemplazando el existente por uno nuevo.
 	 * @param previous DTO anterior (para localizar el registro)
 	 * @param newData DTO con los nuevos datos
 	 * @return true si se actualizó, false en caso contrario
 	 */
 	@Override
 	public boolean update(PelucheAnimalDTO previous, PelucheAnimalDTO newData) {
 		PelucheAnimal found = find(DataMapper.pelucheAnimalDTOToPelucheAnimal(previous));
 		if (found != null) {
 			listaPelucheAnimal.remove(found);
 			listaPelucheAnimal.add(DataMapper.pelucheAnimalDTOToPelucheAnimal(newData));
 			return true;
 		} else {
 			return false;
 		}
 	}

 	/**
 	 * Obtiene todos los peluches de animales como DTO.
 	 * @return Lista de {@link PelucheAnimalDTO}
 	 */
 	@Override
 	public ArrayList<PelucheAnimalDTO> getAll() {
 		return DataMapper.listaPelucheAnimalToListaPelucheAnimalDTO(listaPelucheAnimal);
 	}

}

/**
 * Paquete que contiene las clases de persistencia (DAO) del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.RopaHombre;
import co.edu.unbosque.model.RopaHombreDTO;

/**
 * DAO para la entidad RopaHombre. Gestiona operaciones CRUD en memoria
 * y realiza el mapeo entre {@link RopaHombreDTO} y {@link RopaHombre} usando {@link DataMapper}.
 */
public class RopaHombreDAO implements OperacionDAO<RopaHombreDTO, RopaHombre> {
	/** Lista interna de prendas para hombre. */
	private ArrayList<RopaHombre> listaRopaHombre;
    
	/** Constructor por defecto. Inicializa la lista interna. */
	public RopaHombreDAO() {
		listaRopaHombre = new ArrayList<>();
	}

	/**
	 * Muestra en una cadena todas las prendas para hombre registradas.
	 * @return Cadena con la representación de los objetos almacenados o un mensaje si no hay registros
	 */
	@Override
	public String showAll() {
		String rta = "";
		if (listaRopaHombre.isEmpty()) {
			return "No hay ropa para hombre aun";

		} else {
			for (RopaHombre ropaHombre : listaRopaHombre) {
				rta += ropaHombre.toString();
			}
		}
		return rta;
	}

	/**
	 * Obtiene todas las prendas para hombre como DTO.
	 * @return Lista de {@link RopaHombreDTO}
	 */
	@Override
	public ArrayList<RopaHombreDTO> getAll() {
		return DataMapper.listaRopaHombreToListaRopaHombreDTO(listaRopaHombre);
	}

	/**
	 * Agrega una nueva prenda para hombre si no existe otra con el mismo id.
	 * @param newData DTO con la información a agregar
	 * @return true si se agregó, false en caso contrario
	 */
	@Override
	public boolean add(RopaHombreDTO newData) {
		if (find(DataMapper.ropaHombreDTOToRopaHombre(newData)) == null) {
			listaRopaHombre.add(DataMapper.ropaHombreDTOToRopaHombre(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Elimina una prenda para hombre coincidente con el DTO proporcionado.
	 * @param toDelete DTO de la prenda a eliminar
	 * @return true si se eliminó, false en caso contrario
	 */
	@Override
	public boolean delete(RopaHombreDTO toDelete) {
		RopaHombre found = find(DataMapper.ropaHombreDTOToRopaHombre(toDelete));
		if (found != null) {
			return listaRopaHombre.remove(found);
		} else {
			return false;
		}
	}

	/**
	 * Busca una prenda para hombre por su identificador.
	 * @param toFind Entidad con el id a buscar
	 * @return La entidad encontrada o null si no existe
	 */
	@Override
	public RopaHombre find(RopaHombre toFind) {
		RopaHombre found = null;
		if (!listaRopaHombre.isEmpty()) {
			for (RopaHombre c : listaRopaHombre) {
				if (c.getId() == toFind.getId()) {
					found = c;
					return found;
				} else {
					continue;
				}
			}
		} else {
			return null;
		}
		return null;
	}

	/**
	 * Actualiza los datos de una prenda para hombre, reemplazando la existente por una nueva.
	 * @param previous DTO anterior (para localizar el registro)
	 * @param newData DTO con los nuevos datos
	 * @return true si se actualizó, false en caso contrario
	 */
	@Override
	public boolean update(RopaHombreDTO previous, RopaHombreDTO newData) {
		RopaHombre found = find(DataMapper.ropaHombreDTOToRopaHombre(previous));
		if (found != null) {
			listaRopaHombre.remove(found);
			listaRopaHombre.add(DataMapper.ropaHombreDTOToRopaHombre(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Obtiene la lista interna de entidades RopaHombre.
	 * @return lista de entidades
	 */
	public ArrayList<RopaHombre> getListaRopaHombre() {
		return listaRopaHombre;
	}

	/**
	 * Establece la lista interna de entidades RopaHombre.
	 * @param listaRopaHombre lista a establecer
	 */
	public void setListaRopaHombre(ArrayList<RopaHombre> listaRopaHombre) {
		this.listaRopaHombre = listaRopaHombre;
	}
	       
	       

}

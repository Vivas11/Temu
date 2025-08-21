/**
 * Paquete que contiene las clases de persistencia (DAO) del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.RopaMujer;
import co.edu.unbosque.model.RopaMujerDTO;

/**
 * DAO para la entidad RopaMujer. Gestiona operaciones CRUD en memoria
 * y realiza el mapeo entre {@link RopaMujerDTO} y {@link RopaMujer} usando {@link DataMapper}.
 */
public class RopaMujerDAO implements OperacionDAO<RopaMujerDTO, RopaMujer>{
	/** Lista interna de prendas para mujer. */
	private ArrayList<RopaMujer> listaRopaMujer;
	/** Constructor por defecto. Inicializa la lista interna. */
	public RopaMujerDAO() {
		listaRopaMujer = new ArrayList<>();
	}

	/**
	 * Muestra en una cadena todas las prendas para mujer registradas.
	 * @return Cadena con la representación de los objetos almacenados o un mensaje si no hay registros
	 */
	@Override
	public String showAll() {
		String rta = "";
		if (listaRopaMujer.isEmpty()) {
			return "No hay ropa para mujer aun";

		} else {
			for (RopaMujer ropaMujer : listaRopaMujer) {
				rta += ropaMujer.toString();
			}
		}
		return rta;
	}

	/**
	 * Obtiene todas las prendas para mujer como DTO.
	 * @return Lista de {@link RopaMujerDTO}
	 */
	@Override
	public ArrayList<RopaMujerDTO> getAll() {
		return DataMapper.listaRopaMujerToListaRopaMujerDTO(listaRopaMujer);
	}

	/**
	 * Agrega una nueva prenda para mujer si no existe otra con el mismo id.
	 * @param newData DTO con la información a agregar
	 * @return true si se agregó, false en caso contrario
	 */
	@Override
	public boolean add(RopaMujerDTO newData) {
		if (find(DataMapper.ropaMujerDTOToRopaMujer(newData)) == null) {
			listaRopaMujer.add(DataMapper.ropaMujerDTOToRopaMujer(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Elimina una prenda para mujer coincidente con el DTO proporcionado.
	 * @param toDelete DTO de la prenda a eliminar
	 * @return true si se eliminó, false en caso contrario
	 */
	@Override
	public boolean delete(RopaMujerDTO toDelete) {
		RopaMujer found = find(DataMapper.ropaMujerDTOToRopaMujer(toDelete));
		if (found != null) {
			return listaRopaMujer.remove(found);
		} else {
			return false;
		}
	}

	/**
	 * Busca una prenda para mujer por su identificador.
	 * @param toFind Entidad con el id a buscar
	 * @return La entidad encontrada o null si no existe
	 */
	@Override
	public RopaMujer find(RopaMujer toFind) {
		RopaMujer found = null;
		if (!listaRopaMujer.isEmpty()) {
			for (RopaMujer c : listaRopaMujer) {
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
	 * Actualiza los datos de una prenda para mujer, reemplazando la existente por una nueva.
	 * @param previous DTO anterior (para localizar el registro)
	 * @param newData DTO con los nuevos datos
	 * @return true si se actualizó, false en caso contrario
	 */
	@Override
	public boolean update(RopaMujerDTO previous, RopaMujerDTO newData) {
		RopaMujer found = find(DataMapper.ropaMujerDTOToRopaMujer(previous));
		if (found != null) {
			listaRopaMujer.remove(found);
			listaRopaMujer.add(DataMapper.ropaMujerDTOToRopaMujer(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Obtiene la lista interna de entidades RopaMujer.
	 * @return lista de entidades
	 */
	public ArrayList<RopaMujer> getListaRopaMujer() {
		return listaRopaMujer;
	}

	/**
	 * Establece la lista interna de entidades RopaMujer.
	 * @param listaRopaMujer lista a establecer
	 */
	public void setListaRopaMujer(ArrayList<RopaMujer> listaRopaMujer) {
		this.listaRopaMujer = listaRopaMujer;
	}
	
	

}

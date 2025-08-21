/**
 * Paquete que contiene las clases de persistencia (DAO) del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.UtilEscolar;
import co.edu.unbosque.model.UtilEscolarDTO;

/**
 * DAO para la entidad UtilEscolar. Gestiona operaciones CRUD en memoria
 * y realiza el mapeo entre {@link UtilEscolarDTO} y {@link UtilEscolar} usando {@link DataMapper}.
 */
public class UtilEscolarDAO implements OperacionDAO<UtilEscolarDTO, UtilEscolar>{
	
	/**
	 * Lista interna de útiles escolares persistidos en memoria.
	 */
	private ArrayList<UtilEscolar> listaUtilesEscolares;
	
	/**
	 * Constructor por defecto. Inicializa la lista interna.
	 */
	public UtilEscolarDAO() {
		listaUtilesEscolares = new ArrayList<>();
	}

	/**
	 * Muestra en una cadena todos los útiles escolares registrados.
	 * @return Cadena con la representación de los objetos almacenados o un mensaje si no hay registros
	 */
	@Override
	public String showAll() {
		String rta = "";
		if (listaUtilesEscolares.isEmpty()) {
			return "No hay utiles escolares aun";

		} else {
			for (UtilEscolar utilEscolar : listaUtilesEscolares) {
				rta += utilEscolar.toString();
			}
		}
		return rta;
	}

	/**
	 * Obtiene todos los útiles escolares como DTO.
	 * @return Lista de {@link UtilEscolarDTO}
	 */
	@Override
	public ArrayList<UtilEscolarDTO> getAll() {
		return DataMapper.listaUtilEscolarToListaUtilEscolarDTO(listaUtilesEscolares);
	}

	/**
	 * Agrega un nuevo útil escolar si no existe otro con el mismo id.
	 * @param newData DTO con la información a agregar
	 * @return true si se agregó, false en caso contrario
	 */
	@Override
	public boolean add(UtilEscolarDTO newData) {
		if (find(DataMapper.utilEscolarDTOToUtilEscolar(newData)) == null) {
			listaUtilesEscolares.add(DataMapper.utilEscolarDTOToUtilEscolar(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Elimina un útil escolar coincidente con el DTO proporcionado.
	 * @param toDelete DTO del útil a eliminar
	 * @return true si se eliminó, false en caso contrario
	 */
	@Override
	public boolean delete(UtilEscolarDTO toDelete) {
		UtilEscolar found = find(DataMapper.utilEscolarDTOToUtilEscolar(toDelete));
		if (found != null) {
			return listaUtilesEscolares.remove(found);
			
		} else {
			return false;
		}
	}

	/**
	 * Busca un útil escolar por su identificador.
	 * @param toFind Entidad con el id a buscar
	 * @return La entidad encontrada o null si no existe
	 */
	@Override
	public UtilEscolar find(UtilEscolar toFind) {
		UtilEscolar found = null;
		if (!listaUtilesEscolares.isEmpty()) {
			for (UtilEscolar e : listaUtilesEscolares) {
				if (e.getId() == toFind.getId()) {
					found = e;
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
	 * Actualiza los datos de un útil escolar, reemplazando el existente por uno nuevo.
	 * @param previous DTO anterior (para localizar el registro)
	 * @param newData DTO con los nuevos datos
	 * @return true si se actualizó, false en caso contrario
	 */
	@Override
	public boolean update(UtilEscolarDTO previous, UtilEscolarDTO newData) {
		UtilEscolar found = find(DataMapper.utilEscolarDTOToUtilEscolar(previous));
		if (found != null) {
			listaUtilesEscolares.remove(found);
			listaUtilesEscolares.add(DataMapper.utilEscolarDTOToUtilEscolar(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Obtiene la lista interna de entidades UtilEscolar.
	 * @return Lista de entidades
	 */
	public ArrayList<UtilEscolar> getListaUtilesEscolares() {
		return listaUtilesEscolares;
	}

	/**
	 * Establece la lista interna de entidades UtilEscolar.
	 * @param listaUtilesEscolares Lista de entidades a establecer
	 */
	public void setListaUtilesEscolares(ArrayList<UtilEscolar> listaUtilesEscolares) {
		this.listaUtilesEscolares = listaUtilesEscolares;
	}
	

}

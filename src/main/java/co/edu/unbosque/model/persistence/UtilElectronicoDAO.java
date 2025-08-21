/**
 * Paquete que contiene las clases de persistencia (DAO) del modelo de la aplicación Temu.
 */
package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.UtilElectronico;
import co.edu.unbosque.model.UtilElectronicoDTO;

/**
 * DAO para la entidad UtilElectronico. Gestiona operaciones CRUD en memoria y
 * realiza el mapeo entre {@link UtilElectronicoDTO} y {@link UtilElectronico}
 * usando {@link DataMapper}.
 */
public class UtilElectronicoDAO implements OperacionDAO<UtilElectronicoDTO, UtilElectronico> {

	/** Lista interna de útiles electrónicos. */
	private ArrayList<UtilElectronico> listaUtilElectronico;

	/** Constructor por defecto. Inicializa la lista interna. */
	public UtilElectronicoDAO() {
		listaUtilElectronico = new ArrayList<>();
	}

	/**
	 * Muestra en una cadena todos los útiles electrónicos registrados.
	 *
	 * @return Cadena con la representación de los objetos almacenados o un mensaje si
	 *         no hay registros
	 */
	@Override
	public String showAll() {
		String rta = "";
		if (listaUtilElectronico.isEmpty()) {
			return "No hay utiles electronicos aun";
		} else {
			for (UtilElectronico e : listaUtilElectronico) {
				rta += e.toString();
			}
		}
		return rta;
	}

	/**
	 * Obtiene todos los útiles electrónicos como DTO.
	 *
	 * @return Lista de {@link UtilElectronicoDTO}
	 */
	@Override
	public ArrayList<UtilElectronicoDTO> getAll() {
		return DataMapper.listaUtilElectronicoToListaUtilElectronicoDTO(listaUtilElectronico);
	}

	/**
	 * Agrega un nuevo útil electrónico si no existe otro con el mismo id.
	 *
	 * @param newData DTO con la información a agregar
	 * @return true si se agregó, false en caso contrario
	 */
	@Override
	public boolean add(UtilElectronicoDTO newData) {
		if (find(DataMapper.utilElectronicoDTOToUtilElectronico(newData)) == null) {
			listaUtilElectronico.add(DataMapper.utilElectronicoDTOToUtilElectronico(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Elimina un útil electrónico coincidente con el DTO proporcionado.
	 *
	 * @param toDelete DTO del útil a eliminar
	 * @return true si se eliminó, false en caso contrario
	 */
	@Override
	public boolean delete(UtilElectronicoDTO toDelete) {
		UtilElectronico found = find(DataMapper.utilElectronicoDTOToUtilElectronico(toDelete));
		if (found != null) {
			return listaUtilElectronico.remove(found);
		} else {
			return false;
		}
	}

	/**
	 * Busca un útil electrónico por su identificador.
	 *
	 * @param toFind Entidad con el id a buscar
	 * @return La entidad encontrada o null si no existe
	 */
	@Override
	public UtilElectronico find(UtilElectronico toFind) {
		if (!listaUtilElectronico.isEmpty()) {
			for (UtilElectronico c : listaUtilElectronico) {
				if (c.getId() == toFind.getId()) {
					return c;
				}
			}
		}
		return null;
	}

	/**
	 * Actualiza los datos de un útil electrónico, reemplazando el existente por uno
	 * nuevo.
	 *
	 * @param previous DTO anterior (para localizar el registro)
	 * @param newData  DTO con los nuevos datos
	 * @return true si se actualizó, false en caso contrario
	 */
	@Override
	public boolean update(UtilElectronicoDTO previous, UtilElectronicoDTO newData) {
		UtilElectronico found = find(DataMapper.utilElectronicoDTOToUtilElectronico(previous));
		if (found != null) {
			listaUtilElectronico.remove(found);
			listaUtilElectronico.add(DataMapper.utilElectronicoDTOToUtilElectronico(newData));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Obtiene la lista interna de útiles electrónicos.
	 *
	 * @return lista de entidades UtilElectronico
	 */
	public ArrayList<UtilElectronico> getListaUtilElectronico() {
		return listaUtilElectronico;
	}

	/**
	 * Establece la lista interna de útiles electrónicos.
	 *
	 * @param listaUtilElectronico nueva lista a establecer
	 */
	public void setListaUtilElectronico(ArrayList<UtilElectronico> listaUtilElectronico) {
		this.listaUtilElectronico = listaUtilElectronico;
	}
}

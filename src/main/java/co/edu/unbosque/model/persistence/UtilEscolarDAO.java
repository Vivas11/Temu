package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.UtilEscolar;
import co.edu.unbosque.model.UtilEscolarDTO;

public class UtilEscolarDAO implements OperacionDAO<UtilEscolarDTO, UtilEscolar>{
	
	private ArrayList<UtilEscolar> listaUtilesEscolares;
	
	public UtilEscolarDAO() {
		listaUtilesEscolares = new ArrayList<>();
	}

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

	@Override
	public ArrayList<UtilEscolarDTO> getAll() {
		// TODO Auto-generated method stub
		return DataMapper.listaUtilEscolarToListaUtilEscolarDTO(listaUtilesEscolares);
	}

	@Override
	public boolean add(UtilEscolarDTO newData) {
		if (find(DataMapper.utilEscolarDTOToUtilEscolar(newData)) == null) {
			listaUtilesEscolares.add(DataMapper.utilEscolarDTOToUtilEscolar(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(UtilEscolarDTO toDelete) {
		UtilEscolar found = find(DataMapper.utilEscolarDTOToUtilEscolar(toDelete));
		if (found != null) {
			return listaUtilesEscolares.remove(found);
			
		} else {
			return false;
		}
	}

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

	public ArrayList<UtilEscolar> getListaUtilesEscolares() {
		return listaUtilesEscolares;
	}

	public void setListaUtilesEscolares(ArrayList<UtilEscolar> listaUtilesEscolares) {
		this.listaUtilesEscolares = listaUtilesEscolares;
	}
	

}

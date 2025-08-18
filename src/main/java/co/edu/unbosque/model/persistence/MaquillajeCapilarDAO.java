package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.MaquillajeCapilar;
import co.edu.unbosque.model.MaquillajeCapilarDTO;

public class MaquillajeCapilarDAO implements OperacionDAO<MaquillajeCapilarDTO, MaquillajeCapilar> {

	private ArrayList<MaquillajeCapilar> listaMaquillajeC;

	public MaquillajeCapilarDAO() {
		listaMaquillajeC = new ArrayList<>();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (listaMaquillajeC.isEmpty()) {
			return "No hay celulares aun";

		} else {
			for (MaquillajeCapilar m : listaMaquillajeC) {
				rta += m.toString();
			}
		}
		return rta;
	}

	@Override
	public boolean add(MaquillajeCapilarDTO newData) {
		if (find(DataMapper.maquillajeCapilarDTOToMaquillajeCapilar(newData)) == null) {
			listaMaquillajeC.add(DataMapper.maquillajeCapilarDTOToMaquillajeCapilar(newData));
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(MaquillajeCapilarDTO toDelete) {
		MaquillajeCapilar found = find(DataMapper.maquillajeCapilarDTOToMaquillajeCapilar(toDelete));
		if (found != null) {
			return listaMaquillajeC.remove(found);

		} else {
			return false;
		}
	}

	@Override
	public MaquillajeCapilar find(MaquillajeCapilar toFind) {
		MaquillajeCapilar found = null;
		if (!listaMaquillajeC.isEmpty()) {
			for (MaquillajeCapilar m : listaMaquillajeC) {
				if (m.getId() == toFind.getId()) {
					found = m;
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
	public boolean update(MaquillajeCapilarDTO previous, MaquillajeCapilarDTO newData) {
		MaquillajeCapilar found = find(DataMapper.maquillajeCapilarDTOToMaquillajeCapilar(previous));
		if (found != null) {
			listaMaquillajeC.remove(found);
			listaMaquillajeC.add(DataMapper.maquillajeCapilarDTOToMaquillajeCapilar(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<MaquillajeCapilarDTO> getAll() {
		return DataMapper.listaMaquillajeCapilarToListaMaquillajeCapilarDTO(listaMaquillajeC);
	}

	public ArrayList<MaquillajeCapilar> getListaMaquillajeC() {
		return listaMaquillajeC;
	}

	public void setListaMaquillajeC(ArrayList<MaquillajeCapilar> listaMaquillajeC) {
		this.listaMaquillajeC = listaMaquillajeC;
	}
}

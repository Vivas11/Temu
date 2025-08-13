package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.MaquillajeDePiel;
import co.edu.unbosque.model.MaquillajeDePielDTO;

public class MaquillajeDePielDAO implements OperacionDAO<MaquillajeDePielDTO, MaquillajeDePiel>{
	private ArrayList<MaquillajeDePiel> listaMaquillajeP;

	public MaquillajeDePielDAO() {
		listaMaquillajeP = new ArrayList<>();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (listaMaquillajeP.isEmpty()) {
			return "No hay celulares aun";

		} else {
			for (MaquillajeDePiel m : listaMaquillajeP) {
				rta += m.toString();
			}
		}
		return rta;
	}

	@Override
	public boolean add(MaquillajeDePielDTO newData) {
		if (find(DataMapper.maquillajeDePielDTOToMaquillajeDePiel(newData)) == null) {
			listaMaquillajeP.add(DataMapper.maquillajeDePielDTOToMaquillajeDePiel(newData));
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(MaquillajeDePielDTO toDelete) {
		MaquillajeDePiel found = find(DataMapper.maquillajeDePielDTOToMaquillajeDePiel(toDelete));
		if (found != null) {
			return listaMaquillajeP.remove(found);

		} else {
			return false;
		}
	}

	@Override
	public MaquillajeDePiel find(MaquillajeDePiel toFind) {
		MaquillajeDePiel found = null;
		if (!listaMaquillajeP.isEmpty()) {
			for (MaquillajeDePiel m : listaMaquillajeP) {
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
	public boolean update(MaquillajeDePielDTO previous, MaquillajeDePielDTO newData) {
		MaquillajeDePiel found = find(DataMapper.maquillajeDePielDTOToMaquillajeDePiel(previous));
		if (found != null) {
			listaMaquillajeP.remove(found);
			listaMaquillajeP.add(DataMapper.maquillajeDePielDTOToMaquillajeDePiel(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<MaquillajeDePielDTO> getAll() {
		return DataMapper.listaMaquillajeDePielToListaMaquillajeDePielDTO(listaMaquillajeP);
	}
}

package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.RopaMujer;
import co.edu.unbosque.model.RopaMujerDTO;

public class RopaMujerDAO implements OperacionDAO<RopaMujerDTO, RopaMujer>{
	private ArrayList<RopaMujer> listaRopaMujer;
	public RopaMujerDAO() {
		listaRopaMujer = new ArrayList<>();
		
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public ArrayList<RopaMujerDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(RopaMujerDTO newData) {
		if (find(DataMapper.ropaMujerDTOToRopaMujer(newData)) == null) {
			listaRopaMujer.add(DataMapper.ropaMujerDTOToRopaMujer(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(RopaMujerDTO toDelete) {
		RopaMujer found = find(DataMapper.ropaMujerDTOToRopaMujer(toDelete));
		if (found != null) {
			return listaRopaMujer.remove(found);
			
		} else {
			return false;
		}
	}

	@Override
	public RopaMujer find(RopaMujer toFind) {
		RopaMujer found = null;
		if (!listaRopaMujer.isEmpty()) {
			for (RopaMujer m : listaRopaMujer) {
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
	public boolean update(RopaMujerDTO previous, RopaMujerDTO newData) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

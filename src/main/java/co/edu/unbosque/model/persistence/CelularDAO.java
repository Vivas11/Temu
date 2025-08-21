package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Celular;
import co.edu.unbosque.model.CelularDTO;

public class CelularDAO implements OperacionDAO<CelularDTO, Celular> {

	private ArrayList<Celular> listaCelular;
	public CelularDAO() {
		listaCelular = new ArrayList<>();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (listaCelular.isEmpty()) {
			return "No hay celulares aun";

		} else {
			for (Celular celular : listaCelular) {
				rta += celular.toString();
			}
		}
		return rta;
	} 

	@Override
	public boolean add(CelularDTO newData) {
		if (find(DataMapper.celularDTOToCelular(newData)) == null) {
			listaCelular.add(DataMapper.celularDTOToCelular(newData));
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(CelularDTO toDelete) {
		Celular found = find(DataMapper.celularDTOToCelular(toDelete));
		if (found != null) {
			return listaCelular.remove(found);
			
		} else {
			return false;
		}
	}

	@Override
	public Celular find(Celular toFind) {
		Celular found = null;
		if (!listaCelular.isEmpty()) {
			for (Celular c : listaCelular) {
				System.out.println("[DEBUG] Comparando Celular: listaId=" + c.getId() + " vs buscarId=" + toFind.getId());
				if (c.getId() == toFind.getId()) {
					System.out.println("[DEBUG] Coincidencia encontrada: id=" + c.getId());
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

	@Override
	public boolean update(CelularDTO previous, CelularDTO newData) {
		Celular found = find(DataMapper.celularDTOToCelular(previous));
		if (found != null) {
			listaCelular.remove(found);
			listaCelular.add(DataMapper.celularDTOToCelular(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<CelularDTO> getAll() {
		return DataMapper.listaCelularToListaCelularDTO(listaCelular);
	}

	public ArrayList<Celular> getListaCelular() {
		return listaCelular;
	}

	public void setListaCelular(ArrayList<Celular> listaCelular) {
		this.listaCelular = listaCelular;
	}
	
}

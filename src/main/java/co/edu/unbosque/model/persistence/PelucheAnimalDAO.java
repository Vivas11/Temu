package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PelucheAnimal;
import co.edu.unbosque.model.PelucheAnimalDTO;

public class PelucheAnimalDAO implements OperacionDAO<PelucheAnimalDTO, PelucheAnimal>{
	 
		private ArrayList<PelucheAnimal> listaPelucheAnimal;

		public PelucheAnimalDAO() {
			listaPelucheAnimal = new ArrayList<>();
		}

		@Override
		public String showAll() {
			String rta = "";
			if (listaPelucheAnimal.isEmpty()) {
				return "No hay celulares aun";

			} else {
				for (PelucheAnimal p : listaPelucheAnimal) {
					rta += p.toString();
				}
			}
			return rta;
		}

		@Override
		public boolean add(PelucheAnimalDTO newData) {
			if (find(DataMapper.pelucheAnimalDTOToPelucheAnimal(newData)) == null) {
				listaPelucheAnimal.add(DataMapper.pelucheAnimalDTOToPelucheAnimal(newData));
				return true;
			} else {
				return false;
			}

		}

		@Override
		public boolean delete(PelucheAnimalDTO toDelete) {
			PelucheAnimal found = find(DataMapper.pelucheAnimalDTOToPelucheAnimal(toDelete));
			if (found != null) {
				return listaPelucheAnimal.remove(found);

			} else {
				return false;
			}
		}

		@Override
		public PelucheAnimal find(PelucheAnimal toFind) {
			PelucheAnimal found = null;
			if (!listaPelucheAnimal.isEmpty()) {
				for (PelucheAnimal j : listaPelucheAnimal) {
					if (j.getId() == toFind.getId()) {
						found = j;
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

		@Override
		public ArrayList<PelucheAnimalDTO> getAll() {
			return DataMapper.listaPelucheAnimalToListaPelucheAnimalDTO(listaPelucheAnimal);
		}

}

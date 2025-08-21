package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PelucheAnimal;
import co.edu.unbosque.model.PelucheAnimalDTO;

public class PelucheAnimalDAO implements OperacionDAO<PelucheAnimalDTO, PelucheAnimal>{
	 
		public ArrayList<PelucheAnimal> getListaPelucheAnimal() {
		return listaPelucheAnimal;
	}

	public void setListaPelucheAnimal(ArrayList<PelucheAnimal> listaPelucheAnimal) {
		this.listaPelucheAnimal = listaPelucheAnimal;
	}

		private ArrayList<PelucheAnimal> listaPelucheAnimal;

		public PelucheAnimalDAO() {
			listaPelucheAnimal = new ArrayList<>();
		}

		@Override
		public String showAll() {
			String rta = "";
			if (listaPelucheAnimal.isEmpty()) {
				return "No hay peluche de animales aun";

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
			// Buscar el objeto en la lista antes de eliminar
			System.out.println("[DEBUG][DAO] Buscando PelucheAnimal para eliminar: " + toDelete);
			PelucheAnimal found = find(DataMapper.pelucheAnimalDTOToPelucheAnimal(toDelete));
			if (found != null) {
				System.out.println("[DEBUG][DAO] Encontrado, procediendo a eliminar: " + found);
				boolean result = listaPelucheAnimal.remove(found);
				System.out.println("[DEBUG][DAO] Eliminación exitosa: " + result);
				return result;
			} else {
				System.out.println("[DEBUG][DAO] No se encontró el objeto para eliminar");
				return false;
			}
		}

		@Override
		public PelucheAnimal find(PelucheAnimal toFind) {
			PelucheAnimal found = null;
			if (!listaPelucheAnimal.isEmpty()) {
				for (PelucheAnimal c : listaPelucheAnimal) {
					System.out.println("[DEBUG] Comparando PelucheAnimal: listaId=" + c.getId() + " vs buscarId=" + toFind.getId());
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

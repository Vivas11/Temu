package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.RopaHombre;
import co.edu.unbosque.model.RopaHombreDTO;

public class RopaHombreDAO implements OperacionDAO<RopaHombreDTO, RopaHombre> {
	//lOKA Juan
	private ArrayList<RopaHombre> listaRopaHombre;
	
	       public RopaHombreDAO() {
			listaRopaHombre = new ArrayList<>();
		}

		   @Override
		   public String showAll() {
			   String rta = "";
				if (listaRopaHombre.isEmpty()) {
					return "No hay ropa para hombre aun";

				} else {
					for (RopaHombre ropaHombre : listaRopaHombre) {
						rta += ropaHombre.toString();
					}
				}
				return rta;
		   }

		   @Override
		   public ArrayList<RopaHombreDTO> getAll() {
			// TODO Auto-generated method stub
			return DataMapper.listaRopaHombreToListaRopaHombreDTO(listaRopaHombre);
		   }

		   @Override
		   public boolean add(RopaHombreDTO newData) {
			   if (find(DataMapper.ropaHombreDTOToRopaHombre(newData)) == null) {
					listaRopaHombre.add(DataMapper.ropaHombreDTOToRopaHombre(newData));
					return true;
				} else {
					return false;
				}
		   }

		   @Override
		   public boolean delete(RopaHombreDTO toDelete) {
			// Buscar el objeto en la lista antes de eliminar
			System.out.println("[DEBUG][DAO] Buscando RopaHombre para eliminar: " + toDelete);
			RopaHombre found = find(DataMapper.ropaHombreDTOToRopaHombre(toDelete));
			if (found != null) {
				System.out.println("[DEBUG][DAO] Encontrado, procediendo a eliminar: " + found);
				boolean result = listaRopaHombre.remove(found);
				System.out.println("[DEBUG][DAO] Eliminación exitosa: " + result);
				return result;
			} else {
				System.out.println("[DEBUG][DAO] No se encontró el objeto para eliminar");
				return false;
			}
		   }

		   @Override
		   public RopaHombre find(RopaHombre toFind) {
			   RopaHombre found = null;
				if (!listaRopaHombre.isEmpty()) {
					for (RopaHombre c : listaRopaHombre) {
						System.out.println("[DEBUG] Comparando RopaHombre: listaId=" + c.getId() + " vs buscarId=" + toFind.getId());
						if (c.getId() == toFind.getId()) {
							System.out.println("[DEBUG] Coincidencia encontrada: id=" + c.getId());
							found = c;
							return found;
						} else {
							continue;
						}
					}
				} else {
					return null;
				}
				return null;
		   }

		   @Override
		   public boolean update(RopaHombreDTO previous, RopaHombreDTO newData) {
				RopaHombre found = find(DataMapper.ropaHombreDTOToRopaHombre(previous));
				if (found != null) {
					listaRopaHombre.remove(found);
					listaRopaHombre.add(DataMapper.ropaHombreDTOToRopaHombre(newData));
					return true;
				} else {
					return false;
				}
		   }

		   public ArrayList<RopaHombre> getListaRopaHombre() {
			   return listaRopaHombre;
		   }

		   public void setListaRopaHombre(ArrayList<RopaHombre> listaRopaHombre) {
			   this.listaRopaHombre = listaRopaHombre;
		   }
	       
	       

}

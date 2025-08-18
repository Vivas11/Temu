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
			RopaHombre found = find(DataMapper.ropaHombreDTOToRopaHombre(toDelete));
				if (found != null) {
					return listaRopaHombre.remove(found);
					
				} else {
					return false;
				}
		   }

		   @Override
		   public RopaHombre find(RopaHombre toFind) {
			   RopaHombre found = null;
				if (!listaRopaHombre.isEmpty()) {
					for (RopaHombre r : listaRopaHombre) {
						if (r.getId() == toFind.getId()) {
							found = r;
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

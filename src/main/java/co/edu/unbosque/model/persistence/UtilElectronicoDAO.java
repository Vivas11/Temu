package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.UtilElectronico;
import co.edu.unbosque.model.UtilElectronicoDTO;

public class UtilElectronicoDAO implements OperacionDAO<UtilElectronicoDTO, UtilElectronico> {
	   private ArrayList<UtilElectronico> listaUtilElectronico;
      public UtilElectronicoDAO() {
		listaUtilElectronico = new ArrayList<>();
	}

	  @Override
	  public String showAll() {
		  String rta = "";
			if (listaUtilElectronico.isEmpty()) {
				return "No hay Utiles electronicos aun";

			} else {
				for (UtilElectronico utilElectronico : listaUtilElectronico) {
					rta += utilElectronico.toString();
				}
			}
			return rta;
	  }

	  @Override
	  public ArrayList<UtilElectronicoDTO> getAll() {
		// TODO Auto-generated method stub
		return  DataMapper.listaUtilElectronicoToListaUtilElectronicoDTO(listaUtilElectronico);
	  }

	  @Override
	  public boolean add(UtilElectronicoDTO newData) {
		  if (find(DataMapper.utilElectronicoDTOToUtilElectronico(newData)) == null) {
				listaUtilElectronico.add(DataMapper.utilElectronicoDTOToUtilElectronico(newData));
				return true;
			} else {
				return false;
			}
	  }

	  @Override
	  public boolean delete(UtilElectronicoDTO toDelete) {
		// Buscar el objeto en la lista antes de eliminar
		System.out.println("[DEBUG][DAO] Buscando UtilElectronico para eliminar: " + toDelete);
		UtilElectronico found = find(DataMapper.utilElectronicoDTOToUtilElectronico(toDelete));
		if (found != null) {
			System.out.println("[DEBUG][DAO] Encontrado, procediendo a eliminar: " + found);
			boolean result = listaUtilElectronico.remove(found);
			System.out.println("[DEBUG][DAO] Eliminación exitosa: " + result);
			return result;
		} else {
			System.out.println("[DEBUG][DAO] No se encontró el objeto para eliminar");
			return false;
		}
	  }

	  @Override
	  public UtilElectronico find(UtilElectronico toFind) {
		  UtilElectronico found = null;
			if (!listaUtilElectronico.isEmpty()) {
				for (UtilElectronico c : listaUtilElectronico) {
					System.out.println("[DEBUG] Comparando UtilElectronico: listaId=" + c.getId() + " vs buscarId=" + toFind.getId());
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

	  public ArrayList<UtilElectronico> getListaUtilElectronico() {
		  return listaUtilElectronico;
	  }

	  public void setListaUtilElectronico(ArrayList<UtilElectronico> listaUtilElectronico) {
		  this.listaUtilElectronico = listaUtilElectronico;
	  }
      
      
      
}

package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Celular;
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
		  UtilElectronico found = find(DataMapper.utilElectronicoDTOToUtilElectronico(toDelete));
			if (found != null) {
				return listaUtilElectronico.remove(found);
				
			} else {
				return false;
			}
	  }

	  @Override
	  public UtilElectronico find(UtilElectronico toFind) {
		  UtilElectronico found = null;
			if (!listaUtilElectronico.isEmpty()) {
				for (UtilElectronico e : listaUtilElectronico) {
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
      
      
      
}

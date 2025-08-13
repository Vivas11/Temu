package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDeMesa;
import co.edu.unbosque.model.JuegoDeMesaDTO;

public class JuegoDeMesaDAO implements OperacionDAO<JuegoDeMesaDTO, JuegoDeMesa> {
 
	private ArrayList<JuegoDeMesa> listaJuegoMesa;

	public JuegoDeMesaDAO() {
		listaJuegoMesa = new ArrayList<>();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (listaJuegoMesa.isEmpty()) {
			return "No hay celulares aun";

		} else {
			for (JuegoDeMesa j : listaJuegoMesa) {
				rta += j.toString();
			}
		}
		return rta;
	}

	@Override
	public boolean add(JuegoDeMesaDTO newData) {
		if (find(DataMapper.juegoDeMesaDTOToJuegoDeMesa(newData)) == null) {
			listaJuegoMesa.add(DataMapper.juegoDeMesaDTOToJuegoDeMesa(newData));
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(JuegoDeMesaDTO toDelete) {
		JuegoDeMesa found = find(DataMapper.juegoDeMesaDTOToJuegoDeMesa(toDelete));
		if (found != null) {
			return listaJuegoMesa.remove(found);

		} else {
			return false;
		}
	}

	@Override
	public JuegoDeMesa find(JuegoDeMesa toFind) {
		JuegoDeMesa found = null;
		if (!listaJuegoMesa.isEmpty()) {
			for (JuegoDeMesa j : listaJuegoMesa) {
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
	public boolean update(JuegoDeMesaDTO previous, JuegoDeMesaDTO newData) {
		JuegoDeMesa found = find(DataMapper.juegoDeMesaDTOToJuegoDeMesa(previous));
		if (found != null) {
			listaJuegoMesa.remove(found);
			listaJuegoMesa.add(DataMapper.juegoDeMesaDTOToJuegoDeMesa(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<JuegoDeMesaDTO> getAll() {
		return DataMapper.listaJuegoDeMesaToListaJuegoDeMesaDTO(listaJuegoMesa);
	}

}

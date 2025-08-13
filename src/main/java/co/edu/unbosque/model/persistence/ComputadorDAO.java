package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Computador;
import co.edu.unbosque.model.ComputadorDTO;

public class ComputadorDAO implements OperacionDAO<ComputadorDTO, Computador>{
	private ArrayList<Computador> listaComputador;
	public ComputadorDAO() {
		listaComputador = new ArrayList<>();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (listaComputador.isEmpty()) {
			return "No hay celulares aun";

		} else {
			for (Computador celular : listaComputador) {
				rta += celular.toString();
			}
		}
		return rta;
	}

	@Override
	public boolean add(ComputadorDTO newData) {
		if (find(DataMapper.computadorDTOToComputador(newData)) == null) {
			listaComputador.add(DataMapper.computadorDTOToComputador(newData));
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(ComputadorDTO toDelete) {
		Computador found = find(DataMapper.computadorDTOToComputador(toDelete));
		if (found != null) {
			return listaComputador.remove(found);
			
		} else {
			return false;
		}
	}

	@Override
	public Computador find(Computador toFind) {
		Computador found = null;
		if (!listaComputador.isEmpty()) {
			for (Computador c : listaComputador) {
				if (c.getId() == toFind.getId()) {
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
	public boolean update(ComputadorDTO previous, ComputadorDTO newData) {
		Computador found = find(DataMapper.computadorDTOToComputador(previous));
		if (found != null) {
			listaComputador.remove(found);
			listaComputador.add(DataMapper.computadorDTOToComputador(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<ComputadorDTO> getAll() {
		return DataMapper.listaComputadorToListaComputadorDTO(listaComputador);
	}
}

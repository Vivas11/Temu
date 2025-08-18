package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.FiguraColeccionable;
import co.edu.unbosque.model.FiguraColeccionableDTO;

public class FiguraColeccionableDAO implements OperacionDAO<FiguraColeccionableDTO, FiguraColeccionable>{
	
	private ArrayList<FiguraColeccionable> listaFiguraCol;
	public FiguraColeccionableDAO() {
		listaFiguraCol = new ArrayList<>();
	}

	@Override
	public String showAll() {
		String rta = "";
		if (listaFiguraCol.isEmpty()) {
			return "No hay celulares aun";

		} else {
			for (FiguraColeccionable celular : listaFiguraCol) {
				rta += celular.toString();
			}
		}
		return rta;
	}

	@Override
	public boolean add(FiguraColeccionableDTO newData) {
		if (find(DataMapper.figuraColeccionableDTOToFiguraColeccionable(newData)) == null) {
			listaFiguraCol.add(DataMapper.figuraColeccionableDTOToFiguraColeccionable(newData));
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(FiguraColeccionableDTO toDelete) {
		FiguraColeccionable found = find(DataMapper.figuraColeccionableDTOToFiguraColeccionable(toDelete));
		if (found != null) {
			return listaFiguraCol.remove(found);
			
		} else {
			return false;
		}
	}

	@Override
	public FiguraColeccionable find(FiguraColeccionable toFind) {
		FiguraColeccionable found = null;
		if (!listaFiguraCol.isEmpty()) {
			for (FiguraColeccionable f : listaFiguraCol) {
				if (f.getId() == toFind.getId()) {
					found = f;
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
	public boolean update(FiguraColeccionableDTO previous, FiguraColeccionableDTO newData) {
		FiguraColeccionable found = find(DataMapper.figuraColeccionableDTOToFiguraColeccionable(previous));
		if (found != null) {
			listaFiguraCol.remove(found);
			listaFiguraCol.add(DataMapper.figuraColeccionableDTOToFiguraColeccionable(newData));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<FiguraColeccionableDTO> getAll() {
		return DataMapper.listaFiguraColeccionableToListaFiguraColeccionableDTO(listaFiguraCol);
	}

	public ArrayList<FiguraColeccionable> getListaFiguraCol() {
		return listaFiguraCol;
	}

	public void setListaFiguraCol(ArrayList<FiguraColeccionable> listaFiguraCol) {
		this.listaFiguraCol = listaFiguraCol;
	}
	
}

package co.edu.unbosque.service;

import co.edu.unbosque.model.FiguraColeccionable;
import co.edu.unbosque.model.FiguraColeccionableDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class FiguraColeccionableService {
    public List<FiguraColeccionable> getAll() {
        return ModelFacade.figuraColeccionableDAO.getListaFiguraCol();
    }
    public void add(FiguraColeccionableDTO figura) {
        ModelFacade.figuraColeccionableDAO.add(figura);
    }
    public void delete(FiguraColeccionableDTO figura) {
    // Llamada al DAO para eliminar el objeto FiguraColeccionable
    System.out.println("[DEBUG][Service] Llamando a DAO para eliminar FiguraColeccionableDTO: " + figura);
    ModelFacade.figuraColeccionableDAO.delete(figura);
    }
}

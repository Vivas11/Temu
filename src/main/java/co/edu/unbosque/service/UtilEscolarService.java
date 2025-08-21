package co.edu.unbosque.service;

import co.edu.unbosque.model.UtilEscolar;
import co.edu.unbosque.model.UtilEscolarDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class UtilEscolarService {
    public List<UtilEscolar> getAll() {
        return ModelFacade.utilEscolarDAO.getListaUtilesEscolares();
    }
    public void add(UtilEscolarDTO util) {
        ModelFacade.utilEscolarDAO.add(util);
    }
    public void delete(UtilEscolarDTO util) {
    // Llamada al DAO para eliminar el objeto UtilEscolar
    System.out.println("[DEBUG][Service] Llamando a DAO para eliminar UtilEscolarDTO: " + util);
    ModelFacade.utilEscolarDAO.delete(util);
    }
}

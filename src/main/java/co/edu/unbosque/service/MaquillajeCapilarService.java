package co.edu.unbosque.service;

import co.edu.unbosque.model.MaquillajeCapilar;
import co.edu.unbosque.model.MaquillajeCapilarDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class MaquillajeCapilarService {
    public List<MaquillajeCapilar> getAll() {
        return ModelFacade.maquillajeCapilarDAO.getListaMaquillajeC();
    }
    public void add(MaquillajeCapilarDTO maq) {
        ModelFacade.maquillajeCapilarDAO.add(maq);
    }
    public void delete(MaquillajeCapilarDTO maq) {
    // Llamada al DAO para eliminar el objeto MaquillajeCapilar
    System.out.println("[DEBUG][Service] Llamando a DAO para eliminar MaquillajeCapilarDTO: " + maq);
    ModelFacade.maquillajeCapilarDAO.delete(maq);
    }
}

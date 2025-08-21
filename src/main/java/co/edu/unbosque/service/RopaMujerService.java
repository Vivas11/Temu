package co.edu.unbosque.service;

import co.edu.unbosque.model.RopaMujer;
import co.edu.unbosque.model.RopaMujerDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class RopaMujerService {
    public List<RopaMujer> getAll() {
        return ModelFacade.ropaMujer.getListaRopaMujer();
    }
    public void add(RopaMujerDTO ropa) {
        ModelFacade.ropaMujer.add(ropa);
    }
    public void delete(RopaMujerDTO ropa) {
    // Llamada al DAO para eliminar el objeto RopaMujer
    System.out.println("[DEBUG][Service] Llamando a DAO para eliminar RopaMujerDTO: " + ropa);
    ModelFacade.ropaMujer.delete(ropa);
    }
}

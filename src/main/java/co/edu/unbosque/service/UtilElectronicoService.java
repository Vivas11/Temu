package co.edu.unbosque.service;

import co.edu.unbosque.model.UtilElectronico;
import co.edu.unbosque.model.UtilElectronicoDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class UtilElectronicoService {
    public List<UtilElectronico> getAll() {
        return ModelFacade.utilElectronicoDAO.getListaUtilElectronico();
    }
    public void add(UtilElectronicoDTO util) {
        ModelFacade.utilElectronicoDAO.add(util);
    }
    public void delete(UtilElectronicoDTO util) {
    // Llamada al DAO para eliminar el objeto UtilElectronico
    System.out.println("[DEBUG][Service] Llamando a DAO para eliminar UtilElectronicoDTO: " + util);
    ModelFacade.utilElectronicoDAO.delete(util);
    }
}

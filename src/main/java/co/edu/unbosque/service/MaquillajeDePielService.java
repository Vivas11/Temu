package co.edu.unbosque.service;

import co.edu.unbosque.model.MaquillajeDePiel;
import co.edu.unbosque.model.MaquillajeDePielDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class MaquillajeDePielService {
    public List<MaquillajeDePiel> getAll() {
        return ModelFacade.maquillajeDePielDAO.getListaMaquillajeP();
    }
    public void add(MaquillajeDePielDTO maq) {
        ModelFacade.maquillajeDePielDAO.add(maq);
    }
    public void delete(MaquillajeDePielDTO maq) {
        ModelFacade.maquillajeDePielDAO.delete(maq);
    }
}

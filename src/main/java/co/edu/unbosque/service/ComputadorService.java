package co.edu.unbosque.service;

import co.edu.unbosque.model.Computador;
import co.edu.unbosque.model.ComputadorDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class ComputadorService {
    public List<Computador> getAll() {
        return ModelFacade.compuDAO.getListaComputador();
    }
    public void add(ComputadorDTO computador) {
        ModelFacade.compuDAO.add(computador);
    }
    public void delete(ComputadorDTO computador) {
    // Llamada al DAO para eliminar el objeto Computador
    System.out.println("[DEBUG][Service] Llamando a DAO para eliminar ComputadorDTO: " + computador);
    ModelFacade.compuDAO.delete(computador);
    }
}

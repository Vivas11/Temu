package co.edu.unbosque.service;

import co.edu.unbosque.model.RopaHombre;
import co.edu.unbosque.model.RopaHombreDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class RopaHombreService {
    public List<RopaHombre> getAll() {
        return ModelFacade.ropaHombre.getListaRopaHombre();
    }
    public void add(RopaHombreDTO ropa) {
        ModelFacade.ropaHombre.add(ropa);
    }
    public void delete(RopaHombreDTO ropa) {
    // Llamada al DAO para eliminar el objeto RopaHombre
    System.out.println("[DEBUG][Service] Llamando a DAO para eliminar RopaHombreDTO: " + ropa);
    ModelFacade.ropaHombre.delete(ropa);
    }
}

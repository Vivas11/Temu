package co.edu.unbosque.service;

import co.edu.unbosque.model.PelucheAnimal;
import co.edu.unbosque.model.PelucheAnimalDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class PelucheAnimalService {
    public List<PelucheAnimal> getAll() {
        return ModelFacade.pelucheAnimalDAO.getListaPelucheAnimal();
    }
    public void add(PelucheAnimalDTO peluche) {
        ModelFacade.pelucheAnimalDAO.add(peluche);
    }
    public void delete(PelucheAnimalDTO peluche) {
    // Llamada al DAO para eliminar el objeto PelucheAnimal
    System.out.println("[DEBUG][Service] Llamando a DAO para eliminar PelucheAnimalDTO: " + peluche);
    ModelFacade.pelucheAnimalDAO.delete(peluche);
    }
}

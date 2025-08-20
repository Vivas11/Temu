package co.edu.unbosque.service;

import co.edu.unbosque.model.PeluchePersonaje;
import co.edu.unbosque.model.PeluchePersonajeDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class PeluchePersonajeService {
    public List<PeluchePersonaje> getAll() {
        return ModelFacade.peluchePersonajeDAO.getListaPeluchePersonaje();
    }
    public void add(PeluchePersonajeDTO peluche) {
        ModelFacade.peluchePersonajeDAO.add(peluche);
    }
    public void delete(PeluchePersonajeDTO peluche) {
        ModelFacade.peluchePersonajeDAO.delete(peluche);
    }
}

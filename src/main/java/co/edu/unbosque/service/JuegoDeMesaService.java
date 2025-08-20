package co.edu.unbosque.service;

import co.edu.unbosque.model.JuegoDeMesa;
import co.edu.unbosque.model.JuegoDeMesaDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class JuegoDeMesaService {
    public List<JuegoDeMesa> getAll() {
        return ModelFacade.juegoMesaDAO.getListaJuegoMesa();
    }
    public void add(JuegoDeMesaDTO juego) {
        ModelFacade.juegoMesaDAO.add(juego);
    }
    public void delete(JuegoDeMesaDTO juego) {
        ModelFacade.juegoMesaDAO.delete(juego);
    }
}

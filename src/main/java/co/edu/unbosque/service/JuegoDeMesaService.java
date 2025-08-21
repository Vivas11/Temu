/**
 * Paquete que contiene los servicios para la gestión de juegos de mesa.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.JuegoDeMesa;
import co.edu.unbosque.model.JuegoDeMesaDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre juegos de mesa: obtener, agregar y eliminar.
 */
public class JuegoDeMesaService {
    /**
     * Obtiene la lista de todos los juegos de mesa.
     * @return lista de juegos de mesa
     */
    public List<JuegoDeMesa> getAll() {
        return ModelFacade.juegoMesaDAO.getListaJuegoMesa();
    }
    /**
     * Agrega un juego de mesa a la base de datos.
     * @param juego JuegoDeMesaDTO a agregar
     */
    public void add(JuegoDeMesaDTO juego) {
        ModelFacade.juegoMesaDAO.add(juego);
    }
    /**
     * Elimina un juego de mesa de la base de datos.
     * @param juego JuegoDeMesaDTO a eliminar
     */
    public void delete(JuegoDeMesaDTO juego) {
        // Llamada al DAO para eliminar el objeto JuegoDeMesa
        ModelFacade.juegoMesaDAO.delete(juego);
    }
}

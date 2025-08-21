/**
 * Paquete que contiene los servicios para la gestión de computadores.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.Computador;
import co.edu.unbosque.model.ComputadorDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre computadores: obtener, agregar y eliminar.
 */
public class ComputadorService {
    /**
     * Obtiene la lista de todos los computadores.
     * @return lista de computadores
     */
    public List<Computador> getAll() {
        return ModelFacade.compuDAO.getListaComputador();
    }
    /**
     * Agrega un computador a la base de datos.
     * @param computador ComputadorDTO a agregar
     */
    public void add(ComputadorDTO computador) {
        ModelFacade.compuDAO.add(computador);
    }
    /**
     * Elimina un computador de la base de datos.
     * @param computador ComputadorDTO a eliminar
     */
    public void delete(ComputadorDTO computador) {
        // Llamada al DAO para eliminar el objeto Computador
        ModelFacade.compuDAO.delete(computador);
    }
}

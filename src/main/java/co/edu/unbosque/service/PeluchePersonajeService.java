/**
 * Paquete que contiene los servicios para la gestión de peluches personaje.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.PeluchePersonaje;
import co.edu.unbosque.model.PeluchePersonajeDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre peluches personaje: obtener, agregar y eliminar.
 */
public class PeluchePersonajeService {
    /**
     * Obtiene la lista de todos los peluches personaje.
     * @return lista de peluches personaje
     */
    public List<PeluchePersonaje> getAll() {
        return ModelFacade.peluchePersonajeDAO.getListaPeluchePersonaje();
    }
    /**
     * Agrega un peluche personaje a la base de datos.
     * @param peluche PeluchePersonajeDTO a agregar
     */
    public void add(PeluchePersonajeDTO peluche) {
        ModelFacade.peluchePersonajeDAO.add(peluche);
    }
    /**
     * Elimina un peluche personaje de la base de datos.
     * @param peluche PeluchePersonajeDTO a eliminar
     */
    public void delete(PeluchePersonajeDTO peluche) {
        // Llamada al DAO para eliminar el objeto PeluchePersonaje
        ModelFacade.peluchePersonajeDAO.delete(peluche);
    }
}

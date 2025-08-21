/**
 * Paquete que contiene los servicios para la gestión de peluches animales.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.PelucheAnimal;
import co.edu.unbosque.model.PelucheAnimalDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre peluches animales: obtener, agregar y eliminar.
 */
public class PelucheAnimalService {
    /**
     * Obtiene la lista de todos los peluches animales.
     * @return lista de peluches animales
     */
    public List<PelucheAnimal> getAll() {
        return ModelFacade.pelucheAnimalDAO.getListaPelucheAnimal();
    }
    /**
     * Agrega un peluche animal a la base de datos.
     * @param peluche PelucheAnimalDTO a agregar
     */
    public void add(PelucheAnimalDTO peluche) {
        ModelFacade.pelucheAnimalDAO.add(peluche);
    }
    /**
     * Elimina un peluche animal de la base de datos.
     * @param peluche PelucheAnimalDTO a eliminar
     */
    public void delete(PelucheAnimalDTO peluche) {
        // Llamada al DAO para eliminar el objeto PelucheAnimal
        ModelFacade.pelucheAnimalDAO.delete(peluche);
    }
}

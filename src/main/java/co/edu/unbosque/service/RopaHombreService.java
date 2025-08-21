/**
 * Paquete que contiene los servicios para la gestión de ropa de hombre.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.RopaHombre;
import co.edu.unbosque.model.RopaHombreDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre ropa de hombre: obtener, agregar y eliminar.
 */
public class RopaHombreService {
    /**
     * Obtiene la lista de toda la ropa de hombre.
     * @return lista de ropa de hombre
     */
    public List<RopaHombre> getAll() {
        return ModelFacade.ropaHombre.getListaRopaHombre();
    }
    /**
     * Agrega una prenda de ropa de hombre a la base de datos.
     * @param ropa RopaHombreDTO a agregar
     */
    public void add(RopaHombreDTO ropa) {
        ModelFacade.ropaHombre.add(ropa);
    }
    /**
     * Elimina una prenda de ropa de hombre de la base de datos.
     * @param ropa RopaHombreDTO a eliminar
     */
    public void delete(RopaHombreDTO ropa) {
        // Llamada al DAO para eliminar el objeto RopaHombre
        ModelFacade.ropaHombre.delete(ropa);
    }
}

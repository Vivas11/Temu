/**
 * Paquete que contiene los servicios para la gestión de ropa de mujer.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.RopaMujer;
import co.edu.unbosque.model.RopaMujerDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre ropa de mujer: obtener, agregar y eliminar.
 */
public class RopaMujerService {
    /**
     * Obtiene la lista de toda la ropa de mujer.
     * @return lista de ropa de mujer
     */
    public List<RopaMujer> getAll() {
        return ModelFacade.ropaMujer.getListaRopaMujer();
    }
    /**
     * Agrega una prenda de ropa de mujer a la base de datos.
     * @param ropa RopaMujerDTO a agregar
     */
    public void add(RopaMujerDTO ropa) {
        ModelFacade.ropaMujer.add(ropa);
    }
    /**
     * Elimina una prenda de ropa de mujer de la base de datos.
     * @param ropa RopaMujerDTO a eliminar
     */
    public void delete(RopaMujerDTO ropa) {
        // Llamada al DAO para eliminar el objeto RopaMujer
        ModelFacade.ropaMujer.delete(ropa);
    }
}

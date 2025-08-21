/**
 * Paquete que contiene los servicios para la gestión de maquillaje capilar.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.MaquillajeCapilar;
import co.edu.unbosque.model.MaquillajeCapilarDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre maquillaje capilar: obtener, agregar y eliminar.
 */
public class MaquillajeCapilarService {
    /**
     * Obtiene la lista de todos los maquillajes capilares.
     * @return lista de maquillajes capilares
     */
    public List<MaquillajeCapilar> getAll() {
        return ModelFacade.maquillajeCapilarDAO.getListaMaquillajeC();
    }
    /**
     * Agrega un maquillaje capilar a la base de datos.
     * @param maq MaquillajeCapilarDTO a agregar
     */
    public void add(MaquillajeCapilarDTO maq) {
        ModelFacade.maquillajeCapilarDAO.add(maq);
    }
    /**
     * Elimina un maquillaje capilar de la base de datos.
     * @param maq MaquillajeCapilarDTO a eliminar
     */
    public void delete(MaquillajeCapilarDTO maq) {
        // Llamada al DAO para eliminar el objeto MaquillajeCapilar
        ModelFacade.maquillajeCapilarDAO.delete(maq);
    }
}

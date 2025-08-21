/**
 * Paquete que contiene los servicios para la gestión de maquillaje de piel.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.MaquillajeDePiel;
import co.edu.unbosque.model.MaquillajeDePielDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre maquillaje de piel: obtener, agregar y eliminar.
 */
public class MaquillajeDePielService {
    /**
     * Obtiene la lista de todos los maquillajes de piel.
     * @return lista de maquillajes de piel
     */
    public List<MaquillajeDePiel> getAll() {
        return ModelFacade.maquillajeDePielDAO.getListaMaquillajeP();
    }
    /**
     * Agrega un maquillaje de piel a la base de datos.
     * @param maq MaquillajeDePielDTO a agregar
     */
    public void add(MaquillajeDePielDTO maq) {
        ModelFacade.maquillajeDePielDAO.add(maq);
    }
    /**
     * Elimina un maquillaje de piel de la base de datos.
     * @param maq MaquillajeDePielDTO a eliminar
     */
    public void delete(MaquillajeDePielDTO maq) {
        // Llamada al DAO para eliminar el objeto MaquillajeDePiel
        ModelFacade.maquillajeDePielDAO.delete(maq);
    }
}

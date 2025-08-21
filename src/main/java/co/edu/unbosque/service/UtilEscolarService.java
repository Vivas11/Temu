/**
 * Paquete que contiene los servicios para la gestión de utilitarios escolares.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.UtilEscolar;
import co.edu.unbosque.model.UtilEscolarDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre utilitarios escolares: obtener, agregar y eliminar.
 */
public class UtilEscolarService {
    /**
     * Obtiene la lista de todos los utilitarios escolares.
     * @return lista de utilitarios escolares
     */
    public List<UtilEscolar> getAll() {
        return ModelFacade.utilEscolarDAO.getListaUtilesEscolares();
    }
    /**
     * Agrega un utilitario escolar a la base de datos.
     * @param util UtilEscolarDTO a agregar
     */
    public void add(UtilEscolarDTO util) {
        ModelFacade.utilEscolarDAO.add(util);
    }
    /**
     * Elimina un utilitario escolar de la base de datos.
     * @param util UtilEscolarDTO a eliminar
     */
    public void delete(UtilEscolarDTO util) {
        // Llamada al DAO para eliminar el objeto UtilEscolar
        ModelFacade.utilEscolarDAO.delete(util);
    }
}

/**
 * Paquete que contiene los servicios para la gestión de figuras coleccionables.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.FiguraColeccionable;
import co.edu.unbosque.model.FiguraColeccionableDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre figuras coleccionables: obtener, agregar y eliminar.
 */
public class FiguraColeccionableService {
    /**
     * Obtiene la lista de todas las figuras coleccionables.
     * @return lista de figuras coleccionables
     */
    public List<FiguraColeccionable> getAll() {
        return ModelFacade.figuraColeccionableDAO.getListaFiguraCol();
    }
    /**
     * Agrega una figura coleccionable a la base de datos.
     * @param figura FiguraColeccionableDTO a agregar
     */
    public void add(FiguraColeccionableDTO figura) {
        ModelFacade.figuraColeccionableDAO.add(figura);
    }
    /**
     * Elimina una figura coleccionable de la base de datos.
     * @param figura FiguraColeccionableDTO a eliminar
     */
    public void delete(FiguraColeccionableDTO figura) {
        // Llamada al DAO para eliminar el objeto FiguraColeccionable
        ModelFacade.figuraColeccionableDAO.delete(figura);
    }
}

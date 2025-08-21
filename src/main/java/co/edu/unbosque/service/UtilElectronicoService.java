/**
 * Paquete que contiene los servicios para la gestión de utilitarios electrónicos.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.UtilElectronico;
import co.edu.unbosque.model.UtilElectronicoDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre utilitarios electrónicos: obtener, agregar y eliminar.
 */
public class UtilElectronicoService {
    /**
     * Obtiene la lista de todos los utilitarios electrónicos.
     * @return lista de utilitarios electrónicos
     */
    public List<UtilElectronico> getAll() {
        return ModelFacade.utilElectronicoDAO.getListaUtilElectronico();
    }
    /**
     * Agrega un utilitario electrónico a la base de datos.
     * @param util UtilElectronicoDTO a agregar
     */
    public void add(UtilElectronicoDTO util) {
        ModelFacade.utilElectronicoDAO.add(util);
    }
    /**
     * Elimina un utilitario electrónico de la base de datos.
     * @param util UtilElectronicoDTO a eliminar
     */
    public void delete(UtilElectronicoDTO util) {
        // Llamada al DAO para eliminar el objeto UtilElectronico
        ModelFacade.utilElectronicoDAO.delete(util);
    }
}

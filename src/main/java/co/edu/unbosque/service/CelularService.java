/**
 * Paquete que contiene los servicios para la gestión de celulares.
 */
package co.edu.unbosque.service;

import co.edu.unbosque.model.Celular;
import co.edu.unbosque.model.CelularDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

/**
 * Servicio para operaciones sobre celulares: obtener, agregar y eliminar.
 */
public class CelularService {
    /**
     * Obtiene la lista de todos los celulares.
     * @return lista de celulares
     */
    public List<Celular> getAll() {
        return ModelFacade.celucoDAO.getListaCelular();
    }
    /**
     * Agrega un celular a la base de datos.
     * @param celular CelularDTO a agregar
     */
    public void add(CelularDTO celular) {
        ModelFacade.celucoDAO.add(celular);
    }
    /**
     * Elimina un celular de la base de datos.
     * @param celular CelularDTO a eliminar
     */
    public void delete(CelularDTO celular) {
        ModelFacade.celucoDAO.delete(celular);
    }
}

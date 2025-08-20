package co.edu.unbosque.service;

import co.edu.unbosque.model.Celular;
import co.edu.unbosque.model.CelularDTO;
import co.edu.unbosque.model.ModelFacade;
import java.util.List;

public class CelularService {
    public List<Celular> getAll() {
        return ModelFacade.celucoDAO.getListaCelular();
    }
    public void add(CelularDTO celular) {
        ModelFacade.celucoDAO.add(celular);
    }
    public void delete(CelularDTO celular) {
        ModelFacade.celucoDAO.delete(celular);
    }
}

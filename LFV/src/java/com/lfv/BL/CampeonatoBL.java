
package com.lfv.BL;

import com.google.inject.Inject;
import com.lfv.DAO.CampeonatoDAO;
import com.lfv.entitys.Campeonato;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class CampeonatoBL  implements  CampeonatoManager{

    @Inject
    private CampeonatoDAO campeonatoDAO;
    EntityManagerFactory em = Persistence.createEntityManagerFactory("LFVPU");
    @Override
    public Campeonato getCampeonatoById(int idCampeonato) {
        return campeonatoDAO.getCampeonatoById(idCampeonato, em);
    }

    @Override
    public List<Campeonato> getAllCampeonato() {
        return campeonatoDAO.getAllCampeonato(em);
    }

    @Override
    public boolean IsExistCampeonatoAperturado() {
        return campeonatoDAO.IsExistCampeonatoAperturado(em);
    }

    @Override
    public void GuardarCampeonato(Campeonato campeonato) {
        campeonatoDAO.create(campeonato, em);
    }

    @Override
    public void ActualizarCampeonato(Campeonato campeonato) {
        campeonatoDAO.update(campeonato, em);
    }

    @Override
    public void EliminarCampeonato(Campeonato campeonato) {
        campeonatoDAO.delete(campeonato, em);
    }
    
}

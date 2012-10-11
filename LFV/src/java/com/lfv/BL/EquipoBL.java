/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;

import com.google.inject.Inject;
import com.lfv.DAO.CategoriaDAO;
import com.lfv.DAO.EquipoDAO;
import com.lfv.entitys.Categoria;
import com.lfv.entitys.Equipo;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EquipoBL implements EquipoManager{
    @Inject
    private EquipoDAO equipoDAO;
    @Inject
    private CategoriaDAO categoriaDAO;
    EntityManagerFactory em = Persistence.createEntityManagerFactory("LFVPU");
    
    public List<Categoria> getAllCategoryList() {
        return categoriaDAO.getAllCategoryList(em);
    }

    public Equipo getEquipoById(int idEquipo) {
        return equipoDAO.getEquipoByID(idEquipo, em);
    }

    public void guardarEquipo(Equipo equipo) {
        equipoDAO.create(equipo, em);
    }
    
    public void actualizarEquipo(Equipo equipo) {
        equipoDAO.update(equipo, em);
    }

    public Categoria getCategoriaById(int idCategoria) {
        return categoriaDAO.getCategoriaByID(idCategoria, em);
    }

    public List<Equipo> getEquipoList(int idCategoria) {
        return equipoDAO.getEquipoList(idCategoria, em);
    }
    
}

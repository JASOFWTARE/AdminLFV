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
public class CategoriaBL implements CategoriaManager{

    @Inject
    private CategoriaDAO categoriaDAO;
    EntityManagerFactory em = Persistence.createEntityManagerFactory("LFVPU");
    @Override
    public List<Categoria> getAllCategoryList() {
        return categoriaDAO.getAllCategoryList(em);
    }

    @Override
    public Categoria getCategoriaById(int idCategoria) {
        return categoriaDAO.getCategoriaByID(idCategoria, em);
    }

    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaDAO.create(categoria, em);
    }

    @Override
    public void actualizarCategor(Categoria categoria) {
        categoriaDAO.update(categoria, em);
    }

}

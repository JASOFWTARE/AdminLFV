/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;

import com.lfv.DAO.CategoriaDAO;
import com.lfv.entitys.Categoria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JONATHAN
 */
public class EquipoBL implements EquipoManager{
    EntityManagerFactory em = Persistence.createEntityManagerFactory("LFVPU");
    
    public List<Categoria> getAllCategoryList() {
        return CategoriaDAO.getAllCategoryList(em);
    }
    
}

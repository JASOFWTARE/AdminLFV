/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.DAO;

import com.lfv.entitys.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class CategoriaDAO {
    public static List<Categoria> getAllCategoryList(EntityManagerFactory  emf){
        List<Categoria> categoriaList = new ArrayList<Categoria>();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "SELECT c FROM Categoria c";
            Query query = em.createQuery(jpql);
            categoriaList = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categoriaList;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.DAO;

import com.lfv.entitys.Equipo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class EquipoDAO extends GenericDAO<Equipo> {

    public EquipoDAO() {
        super(Equipo.class);
    }

    public Equipo getEquipoByID(int idEquipo, EntityManagerFactory emf) {
        Equipo equipo = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "SELECT e FROM Equipo e where e.idEquipo = :idEquipo";
            Query query = em.createQuery(jpql);
            query.setParameter("idEquipo", idEquipo);
            equipo = (Equipo) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return equipo;
    }

    public List<Equipo> getEquipoList(int idCategoria, EntityManagerFactory emf) {
        List<Equipo> equipoList = new ArrayList<Equipo>();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "SELECT e FROM Equipo e";
            if (idCategoria > 0) {
                jpql += " where e.idCategoria.idCategoria = :idCategoria";
            }
            Query query = em.createQuery(jpql);
            if (idCategoria > 0) {
                query.setParameter("idCategoria", idCategoria);
            }
            equipoList = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return equipoList;
    }
}

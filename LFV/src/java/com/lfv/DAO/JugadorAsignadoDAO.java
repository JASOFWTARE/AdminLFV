/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import com.lfv.entitys.JugadorAsignado;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

public class JugadorAsignadoDAO  extends  GenericDAO<JugadorAsignado> {
    
    public JugadorAsignadoDAO(){
        super(JugadorAsignado.class); }
    
    public List<JugadorAsignado> getByEquipoId(int idEquipo, EntityManagerFactory emf)
    {
        List<JugadorAsignado> asignados = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "SELECT ja FROM JugadorAsignado ja where ja.idEquipo.idEquipo = :idEquipo";
            Query query = em.createQuery(jpql);
            query.setParameter("idEquipo", idEquipo);
            asignados = (List<JugadorAsignado>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return asignados;
    }
}

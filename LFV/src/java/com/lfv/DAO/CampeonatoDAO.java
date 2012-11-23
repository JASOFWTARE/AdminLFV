
package com.lfv.DAO;

import com.lfv.constants.Constantes;
import com.lfv.entitys.Campeonato;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class CampeonatoDAO extends GenericDAO<Campeonato> {
    public CampeonatoDAO()
    {
        super(Campeonato.class);
    }
    
    public Campeonato getCampeonatoById(int idCampeonato, EntityManagerFactory emf)
    {
        Campeonato campeonato = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "SELECT c FROM Campeonato c where c.idCampeonato= :idCampeonato";
            Query query = em.createQuery(jpql);
            query.setParameter("idCampeonato", idCampeonato);
            campeonato = (Campeonato) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return campeonato;
    }
    
    public List<Campeonato> getAllCampeonato(EntityManagerFactory emf)
    {
        List<Campeonato> campeonatoList = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "SELECT c FROM Campeonato c Order By c.idCampeonato Desc";
            Query query = em.createQuery(jpql);
            campeonatoList = (List<Campeonato>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return campeonatoList;
    }
    
    public boolean IsExistCampeonatoAperturado(EntityManagerFactory emf)
    {
        boolean result = false;
        List<Campeonato> campeonatoList = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "select c from Campeonato c Where c.estadoCampeonato=true";
            Query query = em.createQuery(jpql);
            campeonatoList = (List<Campeonato>) query.getResultList();
            if (campeonatoList.size()!=0) 
                result = true;
            else
                result = false;
                
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return result;
    }
}

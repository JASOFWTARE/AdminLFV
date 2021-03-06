package com.lfv.DAO;

import com.lfv.constants.Constantes;
import com.lfv.entitys.Equipo;
import com.lfv.entitys.Jugador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class JugadorDAO extends GenericDAO<Jugador> {

    public JugadorDAO() {
        super(Jugador.class);
    }

    public Jugador getJugadorByID(int idJugador, EntityManagerFactory emf) {
        Jugador jugador = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "SELECT j FROM Jugador j where j.idJugador = :idJugador";
            Query query = em.createQuery(jpql);
            query.setParameter("idJugador", idJugador);
            jugador = (Jugador) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return jugador;
    }

    public List<Jugador> getJugadorByFilter(String filter, EntityManagerFactory emf) {
        //Busqueda mayuculas minusculas Fixeado 
        List<Jugador> jugadorList = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            String jpql = "SELECT j FROM Jugador j where (upper(j.nombreJugador) like :filter or upper(j.aPaternoJugador) like :filter)";
            Query query = em.createQuery(jpql);
            query.setParameter("filter", filter.toUpperCase() + Constantes.LIKE);
            jugadorList = (List<Jugador>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return jugadorList;
    }
}

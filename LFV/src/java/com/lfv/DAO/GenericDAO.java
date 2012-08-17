
package com.lfv.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class GenericDAO<E> {
    
//    EntityManagerFactory  emf = Persistence.createEntityManagerFactory("StrutsDemo2PU");
    
    protected Class<E> entityClass;

    public GenericDAO(Class<E> entityClass) {
        this.entityClass = entityClass;
    }
    
    public boolean create(E entity, EntityManagerFactory  emf) {
        boolean response = true;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            response = false;
        } finally {
            em.flush();
            em.close();
        }
        return response;
    }
    
    public boolean update(E entity, EntityManagerFactory  emf) {
        boolean response = true;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            response = false;
        } finally {
            em.flush();
            em.close();
        }
        return response;
    }
    
    public boolean delete(E entity, EntityManagerFactory  emf) {
        boolean response = true;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            response = false;
        } finally {
            em.flush();
            em.close();
        }
        return response;
    }
    
    public Object getEntityById(EntityManagerFactory  emf, int id) {
        Object entity = null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            entity = em.find(entityClass, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.flush();
            em.close();
        }
        return entity;
    }
}

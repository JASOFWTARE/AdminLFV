/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;

import com.google.inject.Inject;
import com.lfv.DAO.JugadorAsignadoDAO;
import com.lfv.entitys.JugadorAsignado;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class JugadorAsignadoBL implements  JugadorAsignadoManager{

    @Inject
    private JugadorAsignadoDAO asignadoDAO;
    EntityManagerFactory em = Persistence.createEntityManagerFactory("LFVPU");
    @Override
    public JugadorAsignado getJugadorAsignadoById(int idjugador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void guardarJugadorAsignado(JugadorAsignado jugadorAsignado) {
        asignadoDAO.create(jugadorAsignado, em);
    }

    @Override
    public void actualizarJugadorAsignado(JugadorAsignado jugadorAsignado) {
        asignadoDAO.update(jugadorAsignado, em);
    }

    @Override
    public void eliminarJugadorAsignado(JugadorAsignado jugadorAsignado) {
        asignadoDAO.delete(jugadorAsignado, em);
    }

    @Override
    public List<JugadorAsignado> getByEquipoId(int idEquipo) {
        return asignadoDAO.getByEquipoId(idEquipo, em);
    }
    
}

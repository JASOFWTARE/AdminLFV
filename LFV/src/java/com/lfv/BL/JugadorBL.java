/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;
import com.google.inject.Inject;
import com.lfv.DAO.JugadorDAO;
import com.lfv.entitys.Jugador;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class JugadorBL implements JugadorManager{

    @Inject
    private JugadorDAO jugadorDAO;
    EntityManagerFactory em = Persistence.createEntityManagerFactory("LFVPU");

    public Jugador getJugadorById(int idjugador) {
        return jugadorDAO.getJugadorByID(idjugador, em);
    }

    public void guardarJugador(Jugador jugador) {
        jugadorDAO.create(jugador, em);
    }

    public void actualizarJugador(Jugador jugador) {
        jugadorDAO.update(jugador, em);
    }
    
}

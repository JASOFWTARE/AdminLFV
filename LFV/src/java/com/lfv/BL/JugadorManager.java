/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;

import com.lfv.entitys.Jugador;
import java.util.List;

public interface JugadorManager {
    public Jugador getJugadorById(int idjugador);
    public void guardarJugador(Jugador jugador);
    public void actualizarJugador(Jugador jugador);
    public List<Jugador>  getJugadorListByFilter(String filter);
}

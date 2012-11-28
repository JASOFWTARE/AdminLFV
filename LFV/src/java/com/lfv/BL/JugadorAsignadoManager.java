/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;

import com.lfv.entitys.JugadorAsignado;
import java.util.List;

public interface JugadorAsignadoManager {
    public JugadorAsignado getJugadorAsignadoById(int idjugador);
    public void guardarJugadorAsignado(JugadorAsignado jugadorAsignado);
    public void actualizarJugadorAsignado(JugadorAsignado jugadorAsignado);
    public void eliminarJugadorAsignado(JugadorAsignado jugadorAsignado);
    public List<JugadorAsignado> getByEquipoId(int idEquipo);
    public boolean  guardartMultiJugadorAsignado(List<JugadorAsignado> asignados);
}

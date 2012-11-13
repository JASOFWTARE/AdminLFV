/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.controller;

import com.lfv.constants.Constantes;
import com.lfv.entitys.Jugador;
import com.lfv.util.ManagedUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JONATHAN
 */
public class JugadorAction extends ManagedUtil {

    private int idJugador;
    private Jugador jugador;
    private List<Jugador> jugadorList = new ArrayList<Jugador>();
    private String accion;
    private String date;
    private String filter;

    public String execute() {
        accion = Constantes.GUARDAR;
        if (idJugador > 0) {
            accion = Constantes.ACTUALIZAR;
            jugador = jugadorManager.getJugadorById(idJugador);
        }
        return SUCCESS;
    }

    public String actualizarJugador() {
        if (accion.equals(Constantes.ACTUALIZAR)) {
            Jugador jugadorAnt = jugadorManager.getJugadorById(idJugador);
            jugadorAnt.setNombreJugador(jugador.getNombreJugador());
            jugadorAnt.setAPaternoJugador(jugador.getAPaternoJugador());
            jugadorAnt.setAMaternoJugador(jugador.getAMaternoJugador());
            jugadorAnt.setCiJugador(jugador.getCiJugador());
            jugadorAnt.setMatriculaJugador(jugador.getMatriculaJugador());
            jugadorAnt.setFechaNacimientoJugador(new Date(date));
            jugadorManager.actualizarJugador(jugadorAnt);
        } else {
            jugador.setFechaNacimientoJugador(new Date(date));
            jugador.setEstadoJugador(Constantes.TRUE);
            jugadorManager.guardarJugador(jugador);
        }
        return "actualizado";
    }

    public String listaJugadores() {
        jugadorList = jugadorManager.getJugadorList();
        return "lista";
    }

    public String eliminarJugador() {
        jugador = jugadorManager.getJugadorById(idJugador);
        if (jugador.getEstadoJugador().equals(Constantes.TRUE)) 
            jugador.setEstadoJugador(Constantes.FALSE);
        else
            jugador.setEstadoJugador(Constantes.TRUE);
        jugadorManager.actualizarJugador(jugador);
        return "eliminado";
    }

    public String refreshJugador() {
        jugadorList = jugadorManager.getJugadorListByFilter(filter);
        return "refresh";
    }

    /**
     * @return the idJugador
     */
    public int getIdJugador() {
        return idJugador;
    }

    /**
     * @param idJugador the idJugador to set
     */
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    /**
     * @return the jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the jugadorList
     */
    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    /**
     * @param jugadorList the jugadorList to set
     */
    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    /**
     * @return the accion
     */
    public String getAccion() {
        return accion;
    }

    /**
     * @param accion the accion to set
     */
    public void setAccion(String accion) {
        this.accion = accion;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * @param filter the filter to set
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }
}

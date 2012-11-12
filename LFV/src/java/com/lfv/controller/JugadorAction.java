/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.controller;

import com.lfv.constants.Constantes;
import com.lfv.entitys.Jugador;
import com.lfv.util.ManagedUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JONATHAN
 */
public class JugadorAction extends ManagedUtil{
    private int idJugador;
    private Jugador jugador;
    private List<Jugador> jugadorList = new ArrayList<Jugador>();
    private String accion;
    private String date;

    public String execute(){
        accion = Constantes.GUARDAR;
        return SUCCESS;
    }
    
    public String actualizarJugador(){
        return "actualizado";
    }
    
    public String listaJugadores(){
        return "lista";
    }
    
    public String eliminarJugador(){
        return "eliminado";
    }
    
    public String refreshJugador(){
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
}

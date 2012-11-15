/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.controller;

import com.lfv.constants.Constantes;
import com.lfv.entitys.Campeonato;
import com.lfv.util.ManagedUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iventiva12
 */
public class CampeonatoAction extends ManagedUtil{
    private int idCampeonato;
    private Campeonato campeonato;
    private List<Campeonato> campeonatoList = new ArrayList<Campeonato>();
    private String accion;
    private String inicioCampeonato;
    private String finCampeonato;
    private String limiteHabilitacion;
    private boolean campeonatoAbierto;
    
    public String execute(){
        setAccion(Constantes.GUARDAR);
        if (getIdCampeonato() > 0) {
            setAccion(Constantes.ACTUALIZAR);
        }
        return SUCCESS;
    }
    
    public String actualizarCampeonato() {
        return "actualizado";
    }
    
    public String listaCampeonatos() {
        campeonatoAbierto = false;
        return "lista";
    }
    
    public String cerrarCampeonato() {
        return "cerrado";
    }

    /**
     * @return the idCampeonato
     */
    public int getIdCampeonato() {
        return idCampeonato;
    }

    /**
     * @param idCampeonato the idCampeonato to set
     */
    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    /**
     * @return the campeonato
     */
    public Campeonato getCampeonato() {
        return campeonato;
    }

    /**
     * @param campeonato the campeonato to set
     */
    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    /**
     * @return the campeonatoList
     */
    public List<Campeonato> getCampeonatoList() {
        return campeonatoList;
    }

    /**
     * @param campeonatoList the campeonatoList to set
     */
    public void setCampeonatoList(List<Campeonato> campeonatoList) {
        this.campeonatoList = campeonatoList;
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
     * @return the inicioCampeonato
     */
    public String getInicioCampeonato() {
        return inicioCampeonato;
    }

    /**
     * @param inicioCampeonato the inicioCampeonato to set
     */
    public void setInicioCampeonato(String inicioCampeonato) {
        this.inicioCampeonato = inicioCampeonato;
    }

    /**
     * @return the finCampeonato
     */
    public String getFinCampeonato() {
        return finCampeonato;
    }

    /**
     * @param finCampeonato the finCampeonato to set
     */
    public void setFinCampeonato(String finCampeonato) {
        this.finCampeonato = finCampeonato;
    }

    /**
     * @return the limiteHabilitacion
     */
    public String getLimiteHabilitacion() {
        return limiteHabilitacion;
    }

    /**
     * @param limiteHabilitacion the limiteHabilitacion to set
     */
    public void setLimiteHabilitacion(String limiteHabilitacion) {
        this.limiteHabilitacion = limiteHabilitacion;
    }

    /**
     * @return the campeonatoAbierto
     */
    public boolean isCampeonatoAbierto() {
        return campeonatoAbierto;
    }

    /**
     * @param campeonatoAbierto the campeonatoAbierto to set
     */
    public void setCampeonatoAbierto(boolean campeonatoAbierto) {
        this.campeonatoAbierto = campeonatoAbierto;
    }
}

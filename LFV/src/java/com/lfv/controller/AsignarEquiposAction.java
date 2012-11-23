/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.controller;

import com.lfv.entitys.Campeonato;
import com.lfv.entitys.Equipo;
import com.lfv.entitys.Inscritos;
import com.lfv.util.ManagedUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JONATHAN
 */
public class AsignarEquiposAction extends ManagedUtil{
    private List<Equipo> equipoList = new ArrayList<Equipo>();
    private String fechaInscripcion;
    private int idCampeonato;
    private Campeonato campeonato;
    private List<Inscritos> inscritosList = new ArrayList<Inscritos>();
    private String inscritosIds;
    public String execute(){
        equipoList = equipoManager.getEquipoList(0);
        return SUCCESS;
    }
    
    public String actualizarEquipos(){
        campeonato = campeonatoManager.getCampeonatoById(idCampeonato);
        //borrando todos los equipos con el idCampeonato
        String[] inscritos = inscritosIds.split(",");
        for(String idEquipo: inscritos){
            Inscritos ins = new Inscritos();
            ins.setFechaInscripcion(new Date(fechaInscripcion));
            ins.setIdCampeonato(campeonato);
            ins.setIdEquipo(equipoManager.getEquipoById(Integer.parseInt(idEquipo)));
            inscritosList.add(ins);
        }
        //enviando la lista de inscritos
        return "actualizado";
    }

    /**
     * @return the equipoList
     */
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    /**
     * @param equipoList the equipoList to set
     */
    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    /**
     * @return the fechaInscripcion
     */
    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * @param fechaInscripcion the fechaInscripcion to set
     */
    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
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
     * @return the inscritosList
     */
    public List<Inscritos> getInscritosList() {
        return inscritosList;
    }

    /**
     * @param inscritosList the inscritosList to set
     */
    public void setInscritosList(List<Inscritos> inscritosList) {
        this.inscritosList = inscritosList;
    }

    /**
     * @return the inscritosIds
     */
    public String getInscritosIds() {
        return inscritosIds;
    }

    /**
     * @param inscritosIds the inscritosIds to set
     */
    public void setInscritosIds(String inscritosIds) {
        this.inscritosIds = inscritosIds;
    }
            
}

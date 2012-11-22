/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.controller;

import com.lfv.entitys.Equipo;
import com.lfv.util.ManagedUtil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JONATHAN
 */
public class AsignarEquiposAction extends ManagedUtil{
    private List<Equipo> equipoList = new ArrayList<Equipo>();
    public String execute(){
        System.out.println("ejecutando");
        equipoList = equipoManager.getEquipoList(0);
        return SUCCESS;
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
            
}

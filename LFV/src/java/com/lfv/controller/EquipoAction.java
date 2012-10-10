/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.controller;

import com.lfv.entitys.Categoria;
import com.lfv.entitys.Equipo;
import com.lfv.util.ManagedUtil;
import java.util.ArrayList;
import java.util.List;


public class EquipoAction extends ManagedUtil{
    private int idEquipo;
    private Equipo equipo;
    private List<Categoria> categoriaList = new ArrayList<Categoria>();
    private int idCategoria;
    public String execute(){
        if(getIdEquipo() > 0){
            System.out.println("obteniendo equipo");
        }
        categoriaList = equipoManager.getAllCategoryList();
        return SUCCESS;
    }
    
    public String actualizarGuardarEquipo(){
        System.out.println(">>>>>>>>>>: " + idCategoria);
        return SUCCESS;
    }

    /**
     * @return the equipo
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the idEquipo
     */
    public int getIdEquipo() {
        return idEquipo;
    }

    /**
     * @param idEquipo the idEquipo to set
     */
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    /**
     * @return the categoriaList
     */
    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    /**
     * @param categoriaList the categoriaList to set
     */
    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}

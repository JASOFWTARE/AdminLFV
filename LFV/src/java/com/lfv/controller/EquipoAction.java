/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.controller;

import com.lfv.constants.Constantes;
import com.lfv.entitys.Categoria;
import com.lfv.entitys.Equipo;
import com.lfv.util.ManagedUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipoAction extends ManagedUtil {

    private int idEquipo;
    private Equipo equipo;
    private List<Categoria> categoriaList = new ArrayList<Categoria>();
    private List<Equipo> equipoList = new ArrayList<Equipo>();
    private int idCategoria;
    private String accion;
    private String date;

    public String execute() {
        accion = Constantes.GUARDAR_EQUIPO;
        if (idEquipo > 0) {
            accion = Constantes.ACTUALIZAR_EQUIPO;
            equipo = equipoManager.getEquipoById(idEquipo);
            idCategoria = Integer.parseInt(equipo.getIdCategoria().getIdCategoria().toString());
        }
        categoriaList = categoriaManager.getAllCategoryList();
        return SUCCESS;
    }

    public String actualizarGuardarEquipo() {
        equipo.setFundacionEquipo(new Date(date));
        Categoria categoria = categoriaManager.getCategoriaById(idCategoria);
        equipo.setIdCategoria(categoria);
        if (accion.equals(Constantes.ACTUALIZAR_EQUIPO)) {
            Equipo equipoAnt = equipoManager.getEquipoById(idEquipo);
            equipoAnt.setNombreEquipo(equipo.getNombreEquipo());
            equipoAnt.setFundacionEquipo(new Date(date));
            equipoAnt.setIdCategoria(equipo.getIdCategoria());
            equipoAnt.setPresidenteEquipo(equipo.getPresidenteEquipo());
            equipoManager.actualizarEquipo(equipoAnt);
        } else {
            equipoManager.guardarEquipo(equipo);
        }
        return SUCCESS;
    }

    public String listarEquipos() {
        equipoList = equipoManager.getEquipoList(0);
        categoriaList = categoriaManager.getAllCategoryList();
        return SUCCESS;
    }
    
    public String refreshEquipos(){
        equipoList = equipoManager.getEquipoList(idCategoria);
        return "categorias";
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

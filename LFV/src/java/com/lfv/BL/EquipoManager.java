/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;

import com.lfv.entitys.Categoria;
import com.lfv.entitys.Equipo;
import java.util.List;

public interface EquipoManager {
    public Equipo getEquipoById(int idEquipo);
    public void guardarEquipo(Equipo equipo);
    public void actualizarEquipo(Equipo equipo);
    public List<Equipo> getEquipoList(int idCategoria);
}

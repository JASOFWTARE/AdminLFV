/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;

import com.lfv.entitys.Campeonato;
import java.util.List;
public interface CampeonatoManager {
    public Campeonato getCampeonatoById(int idCampeonato);
    public List<Campeonato> getAllCampeonato();
    public boolean IsExistCampeonatoAperturado();
    public void GuardarCampeonato(Campeonato campeonato);
    public void ActualizarCampeonato(Campeonato campeonato);
    public void EliminarCampeonato(Campeonato campeonato);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.util;

import com.google.inject.AbstractModule;
import com.lfv.BL.CampeonatoBL;
import com.lfv.BL.CampeonatoManager;
import com.lfv.BL.CategoriaBL;
import com.lfv.BL.CategoriaManager;
import com.lfv.BL.EquipoBL;
import com.lfv.BL.EquipoManager;
import com.lfv.BL.JugadorAsignadoBL;
import com.lfv.BL.JugadorAsignadoManager;
import com.lfv.BL.JugadorBL;
import com.lfv.BL.JugadorManager;

public class GuiceMainModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EquipoManager.class).to(EquipoBL.class);
        bind(CategoriaManager.class).to(CategoriaBL.class);
        bind(JugadorManager.class).to(JugadorBL.class);
        bind(CampeonatoManager.class).to(CampeonatoBL.class);
        bind(JugadorAsignadoManager.class).to(JugadorAsignadoBL.class);
    }
}

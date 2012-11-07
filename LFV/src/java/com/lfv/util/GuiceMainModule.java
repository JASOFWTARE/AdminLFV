/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.util;

import com.google.inject.AbstractModule;
import com.lfv.BL.EquipoBL;
import com.lfv.BL.CategoriaBL;
import com.lfv.BL.CategoriaManager;
import com.lfv.BL.EquipoManager;


public class GuiceMainModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EquipoManager.class).to(EquipoBL.class);
        bind(CategoriaManager.class).to(CategoriaBL.class);
    }
}

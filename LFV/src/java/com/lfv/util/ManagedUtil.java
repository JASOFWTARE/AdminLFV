/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.util;

import com.lfv.BL.CategoriaManager;
import com.lfv.BL.EquipoManager;
import com.lfv.BL.JugadorManager;
import com.opensymphony.xwork2.ActionSupport;

public class ManagedUtil extends ActionSupport{
    protected EquipoManager equipoManager = GuiceInjectorSingleton.getInstance(EquipoManager.class);
    protected CategoriaManager categoriaManager = GuiceInjectorSingleton.getInstance(CategoriaManager.class);
    protected JugadorManager jugadorManager = GuiceInjectorSingleton.getInstance(JugadorManager.class);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.util;

import com.lfv.BL.EquipoManager;
import com.opensymphony.xwork2.ActionSupport;

public class ManagedUtil extends ActionSupport{
    protected EquipoManager equipoManager = GuiceInjectorSingleton.getInstance(EquipoManager.class);
}
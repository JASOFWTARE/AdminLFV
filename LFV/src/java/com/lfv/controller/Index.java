/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.controller;

import com.lfv.util.ManagedUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author iventiva12
 */
public class Index extends ManagedUtil{
    private String message;
    
    @Override
    public String execute(){
        message = "Pagina en Construccion 'Liga de Futbol Vinto'";
        return SUCCESS;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}

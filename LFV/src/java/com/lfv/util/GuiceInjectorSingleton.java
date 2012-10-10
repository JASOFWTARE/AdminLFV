/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.util;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceInjectorSingleton {
    private static Injector injector;

    private GuiceInjectorSingleton() {
    }

    public static Injector getInjector() {
        if (injector == null) {
            injector = Guice.createInjector(new GuiceMainModule());
        }
        return injector;
    }

    public static <T> T getInstance(Class t) {
        return (T) getInjector().getInstance(t);
    }
}

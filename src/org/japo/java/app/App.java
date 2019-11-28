/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesPrimitivos;
/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class App {

    public static final String MSG_USR = "Introducir número ....: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta ";
    public static final String INTRO ="INTRODUCCIÓN ENTERO";
    public static final String LINEAS ="===================";
    public static final String INTRODUCCION ="Numero introducido ...: ";

    public final void launchApp() {
        System.out.println(INTRO);
        System.out.println(LINEAS);
        System.out.println(INTRODUCCION+UtilesPrimitivos.obtener(MSG_USR, MSG_ERR));
    }
}

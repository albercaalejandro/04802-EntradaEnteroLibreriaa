/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class UtilesPrimitivos {

    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static final double obtener(String msgUsr, String msgErr) {
        double numero = 0;
        boolean semaforo = true;

        do {
            System.out.print(msgUsr);
            try {
                numero = SCN.nextDouble();
                semaforo = false;
            } catch (Exception e) {
                System.out.println("---");
                System.out.println(msgErr);

            } finally {
                SCN.nextLine();
                System.out.println("---");
            }
        } while (semaforo);
        return numero;
    }

}

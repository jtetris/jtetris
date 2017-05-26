/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jota;

import java.util.*;
import java.lang.*;

/**
 *
 * @author Administrador
 */
class Jota {

    public static void main(String args[]) {
        System.out.println("Hello, World!");
        Jota re = new Jota();
        Girar re1 = new Girar();
        Izquierda re2 = new Izquierda();
        Derecha re3 = new Derecha();
        Bajar re4 = new Bajar();
        //Variable bajar debe ser traida desde un objeto del tablero que calcula que tanto puede caer la ficha
        int bajar = 20;
        String entrada;
        //variable solicitud debe ser traida desde un objeto del tablero que indique la accion que desea q se tome en la ficha
        String solicitud = "girar";//esta es la entrada, descomentaree cualquiera de las 4 para q vea lo q hace
        //String solicitud = "bajar";
        //String solicitud = "izquierda";        
        //String solicitud = "derecha";
        entrada = solicitud;
        //se inicializa la ficha en la posicion por defecto antes de realizarle algun movimiento
        String[][] Jota = re.ini();
        //dependiendo de la accion que solicite el table se escoge el metodo a aplicar a la ficha
        if (entrada.equals("girar")) {
            Jota = re1.girar(Jota);
            System.out.println("  ");
            for (int x = 0; x < Jota.length; x++) {
                System.out.println("");
                for (int y = 0; y < Jota[x].length; y++) {

                    System.out.print(Jota[x][y] + "  ");
                }
            }
            System.out.println("");
        } else if (entrada.equals("bajar")) {
            Jota = re4.bajar(Jota, bajar);
            System.out.println("  ");
            for (int x = 0; x < Jota.length; x++) {
                System.out.println("");
                for (int y = 0; y < Jota[x].length; y++) {

                    System.out.print(Jota[x][y] + "  ");
                }
            }
            System.out.println("");
        } else if (entrada.equals("izquierda")) {
            Jota = re2.izquierda(Jota);
            System.out.println("  ");
            for (int x = 0; x < Jota.length; x++) {
                System.out.println("");
                for (int y = 0; y < Jota[x].length; y++) {

                    System.out.print(Jota[x][y] + "  ");
                }
            }
            System.out.println("");
        } else if (entrada.equals("derecha")) {
            Jota = re3.derecha(Jota);       
            System.out.println("  ");
            for (int x = 0; x < Jota.length; x++) {
                System.out.println("");
                for (int y = 0; y < Jota[x].length; y++) {

                    System.out.print(Jota[x][y] + "  ");
                }
            }
            System.out.println("");
        }
    }

    public String[][] ini() {
        String posicion1 = "0,5";
        String posicion2 = "1,5";
        String posicion3 = "2,5";
        String posicion4 = "2,4";
        String[][] ficha = {
            {null, posicion1, null},
            {null, posicion2, null},
            {posicion4, posicion3, null}
        };
        return ficha;
    }
}

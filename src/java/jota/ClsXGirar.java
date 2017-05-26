/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jota;

import java.util.*;

/**
 *
 * @author Administrador
 */
public class ClsXGirar {

    public String[][] girar(String[][] Jota) {
        //los null de la ficha de cabeza
        if (Jota[0][0] == null && Jota[0][2] == null && Jota[1][0] == null && Jota[1][2] == null && Jota[2][2] == null) {//posicion inicial _|
            //Posicion que llega en jota de cabeza
            String posicion1 = Jota[0][1];
            String posicion2 = Jota[1][1];
            String posicion3 = Jota[2][1];
            String posicion4 = Jota[2][0];

            String[] strposicion1 = posicion1.split(",");
            int[] intposicion1 = new int[strposicion1.length];
            for (int i = 0; i < strposicion1.length; i++) {
                intposicion1[i] = Integer.parseInt(strposicion1[i]);
            }
            intposicion1[0] = intposicion1[0] + 1;
            intposicion1[1] = intposicion1[1] - 1;
            String xposicion1 = Arrays.toString(intposicion1);
            posicion1 = xposicion1.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion2 = posicion2.split(",");
            int[] intposicion2 = new int[strposicion2.length];
            for (int i = 0; i < strposicion2.length; i++) {
                intposicion2[i] = Integer.parseInt(strposicion2[i]);
            }
            intposicion2[0] = intposicion2[0] + 1;
            intposicion2[1] = intposicion2[1] - 1;
            String xposicion2 = Arrays.toString(intposicion2);
            posicion2 = xposicion2.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion3 = posicion3.split(",");
            int[] intposicion3 = new int[strposicion3.length];
            for (int i = 0; i < strposicion3.length; i++) {
                intposicion3[i] = Integer.parseInt(strposicion3[i]);
            }
            intposicion3[0] = intposicion3[0] + 0;
            intposicion3[1] = intposicion3[1] + 0;
            String xposicion3 = Arrays.toString(intposicion3);
            posicion3 = xposicion3.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion4 = posicion4.split(",");
            int[] intposicion4 = new int[strposicion4.length];
            for (int i = 0; i < strposicion4.length; i++) {
                intposicion4[i] = Integer.parseInt(strposicion4[i]);
            }
            intposicion4[0] = intposicion4[0] + 0;
            intposicion4[1] = intposicion4[1] + 2;
            String xposicion4 = Arrays.toString(intposicion4);
            posicion4 = xposicion4.replaceAll("\\[|\\]|\\s", "");
            //posicion resultante en jota acostada a la izquieda
            String[][] ficha = {
                {null, null, null},
                {posicion1, null, null},
                {posicion2, posicion3, posicion4}
            };
            Jota = ficha;

        } //los null de la ficha acostada a la izquieda
        else if (Jota[0][0] == null && Jota[0][1] == null && Jota[0][2] == null && Jota[1][1] == null && Jota[1][2] == null) {//posicion acostada izq |__
            //Posicion que llega en jota acostada a la ezqueirda
            String posicion1 = Jota[1][0];
            String posicion2 = Jota[2][0];
            String posicion3 = Jota[2][1];
            String posicion4 = Jota[2][2];

            String[] strposicion1 = posicion1.split(",");
            int[] intposicion1 = new int[strposicion1.length];
            for (int i = 0; i < strposicion1.length; i++) {
                intposicion1[i] = Integer.parseInt(strposicion1[i]);
            }
            intposicion1[0] = intposicion1[0] - 1;
            intposicion1[1] = intposicion1[1] + 2;
            String xposicion1 = Arrays.toString(intposicion1);
            posicion1 = xposicion1.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion2 = posicion2.split(",");
            int[] intposicion2 = new int[strposicion2.length];
            for (int i = 0; i < strposicion2.length; i++) {
                intposicion2[i] = Integer.parseInt(strposicion2[i]);
            }
            intposicion2[0] = intposicion2[0] - 2;
            intposicion2[1] = intposicion2[1] + 1;
            String xposicion2 = Arrays.toString(intposicion2);
            posicion2 = xposicion2.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion3 = posicion3.split(",");
            int[] intposicion3 = new int[strposicion3.length];
            for (int i = 0; i < strposicion3.length; i++) {
                intposicion3[i] = Integer.parseInt(strposicion3[i]);
            }
            intposicion3[0] = intposicion3[0] - 1;
            intposicion3[1] = intposicion3[1] + 0;
            String xposicion3 = Arrays.toString(intposicion3);
            posicion3 = xposicion3.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion4 = posicion4.split(",");
            int[] intposicion4 = new int[strposicion4.length];
            for (int i = 0; i < strposicion4.length; i++) {
                intposicion4[i] = Integer.parseInt(strposicion4[i]);
            }
            intposicion4[0] = intposicion4[0] + 0;
            intposicion4[1] = intposicion4[1] - 1;
            String xposicion4 = Arrays.toString(intposicion4);
            posicion4 = xposicion4.replaceAll("\\[|\\]|\\s", "");

            //posicion resultante en jota depie
            String[][] ficha = {
                {null, posicion2, posicion1},
                {null, posicion3, null},
                {null, posicion4, null}
            };
            Jota = ficha;

        } //los null de la ficha depie
        else if (Jota[0][0] == null && Jota[1][0] == null && Jota[2][0] == null && Jota[1][2] == null && Jota[2][2] == null) {//posicion depie |-
            //Posicion que llega en jota de pie
            String posicion1 = Jota[0][2];
            String posicion2 = Jota[0][1];
            String posicion3 = Jota[1][1];
            String posicion4 = Jota[2][1];

            String[] strposicion1 = posicion1.split(",");
            int[] intposicion1 = new int[strposicion1.length];
            for (int i = 0; i < strposicion1.length; i++) {
                intposicion1[i] = Integer.parseInt(strposicion1[i]);
            }
            intposicion1[0] = intposicion1[0] + 1;
            intposicion1[1] = intposicion1[1] + 0;
            String xposicion1 = Arrays.toString(intposicion1);
            posicion1 = xposicion1.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion2 = posicion2.split(",");
            int[] intposicion2 = new int[strposicion2.length];
            for (int i = 0; i < strposicion2.length; i++) {
                intposicion2[i] = Integer.parseInt(strposicion2[i]);
            }
            intposicion2[0] = intposicion2[0] + 0;
            intposicion2[1] = intposicion2[1] + 1;
            String xposicion2 = Arrays.toString(intposicion2);
            posicion2 = xposicion2.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion3 = posicion3.split(",");
            int[] intposicion3 = new int[strposicion3.length];
            for (int i = 0; i < strposicion3.length; i++) {
                intposicion3[i] = Integer.parseInt(strposicion3[i]);
            }
            intposicion3[0] = intposicion3[0] - 1;
            intposicion3[1] = intposicion3[1] + 0;
            String xposicion3 = Arrays.toString(intposicion3);
            posicion3 = xposicion3.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion4 = posicion4.split(",");
            int[] intposicion4 = new int[strposicion4.length];
            for (int i = 0; i < strposicion4.length; i++) {
                intposicion4[i] = Integer.parseInt(strposicion4[i]);
            }
            intposicion4[0] = intposicion4[0] - 2;
            intposicion4[1] = intposicion4[1] - 1;
            String xposicion4 = Arrays.toString(intposicion4);
            posicion4 = xposicion4.replaceAll("\\[|\\]|\\s", "");

            //posicion resultante en jota acostada a la derecha
            String[][] ficha = {
                {posicion4, posicion3, posicion2},
                {null, null, posicion1},
                {null, null, null}
            };
            Jota = ficha;

        } //los null de la ficha acostada a la derecha
        else if (Jota[1][0] == null && Jota[1][1] == null && Jota[2][0] == null && Jota[2][1] == null && Jota[2][2] == null) {//posicion acostada dere __|
            //Posicion que llega en jota acostada a la derecha
            String posicion1 = Jota[1][2];
            String posicion2 = Jota[0][2];
            String posicion3 = Jota[0][1];
            String posicion4 = Jota[0][0];

            String[] strposicion1 = posicion1.split(",");
            int[] intposicion1 = new int[strposicion1.length];
            for (int i = 0; i < strposicion1.length; i++) {
                intposicion1[i] = Integer.parseInt(strposicion1[i]);
            }
            intposicion1[0] = intposicion1[0] - 1;
            intposicion1[1] = intposicion1[1] - 1;
            String xposicion1 = Arrays.toString(intposicion1);
            posicion1 = xposicion1.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion2 = posicion2.split(",");
            int[] intposicion2 = new int[strposicion2.length];
            for (int i = 0; i < strposicion2.length; i++) {
                intposicion2[i] = Integer.parseInt(strposicion2[i]);
            }
            intposicion2[0] = intposicion2[0] + 1;
            intposicion2[1] = intposicion2[1] - 1;
            String xposicion2 = Arrays.toString(intposicion2);
            posicion2 = xposicion2.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion3 = posicion3.split(",");
            int[] intposicion3 = new int[strposicion3.length];
            for (int i = 0; i < strposicion3.length; i++) {
                intposicion3[i] = Integer.parseInt(strposicion3[i]);
            }
            intposicion3[0] = intposicion3[0] + 2;
            intposicion3[1] = intposicion3[1] + 0;
            String xposicion3 = Arrays.toString(intposicion3);
            posicion3 = xposicion3.replaceAll("\\[|\\]|\\s", "");

            String[] strposicion4 = posicion4.split(",");
            int[] intposicion4 = new int[strposicion4.length];
            for (int i = 0; i < strposicion4.length; i++) {
                intposicion4[i] = Integer.parseInt(strposicion4[i]);
            }
            intposicion4[0] = intposicion4[0] + 2;
            intposicion4[1] = intposicion4[1] + 0;
            String xposicion4 = Arrays.toString(intposicion4);
            posicion4 = xposicion4.replaceAll("\\[|\\]|\\s", "");

            //posicion resultante en jota de cabeza
            String[][] ficha = {
                {null, posicion1, null},
                {null, posicion2, null},
                {posicion4, posicion3, null}
            };
            Jota = ficha;
        }
        return Jota;
    }

}

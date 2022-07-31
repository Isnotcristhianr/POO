/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Numeros {

    private int num = 0, cant = 0, cont = 0, contasc, contdesc;
    private String frase, msgrepe = "", asc="", desc="";
    private String[] split, guardar;
    private int[] serie={};

    ArrayList<String> array = new ArrayList<>();

    public Numeros(String txt) {
        this.frase = txt;
        this.split = frase.split(", ");
        //this.serie= Integer.parseInt(frase.split(", ").toString());
    }

    public int Cantidad() {

        cant = split.length;

        return cant;
    }

    public String Repetido() {

        for (int i = 0; i < split.length; i++) {
            cont = 1;
            for (int j = i + 1; j < split.length; j++) {
                if (split[i] == split[j] && split[i] != "0") {
                    split[j] = "0";
                    cont++;
                }
            }
            if (cant != 1) {
                msgrepe += "" + cont + " -> " + " (" + split[i] + ") ";
            }
        }

//            char character = split[i].charAt(i);
//
//            if (esEquals(character)) {
//                msgrepe = "" + num;
//            }
//
//            num++;
//            if (split[i].equals(character)) {
//                msgrepe = "" + num;
//            }
//            num++;
//            guardar = frase.split(", ");
//            for (int j = 0; j < guardar.length; j++) {
//                if (guardar[j].equals(split[i])) {
//                    msgrepe = "" + num++;
//                }
//            }
        return msgrepe;
    }

    public String Repetido2() {

        for (int i = 0; i < split.length; i++) {
            cont = 1;
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].equals(split[j]) && !split[j].equals("0")) {
                    split[j] = "0";
                    cont++;
                }
            }
            if (cont != 1) {
                msgrepe += "" + split[i] + " = " + " [  " + cont + " ], ";
            }
        }

        return msgrepe;
    }

    public String ascendente() {

        serie = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            serie[i] = Integer.parseInt(String.valueOf(split[i]));
        }

        Arrays.sort(serie);

        for (int i = 0; i < serie.length; i++) {
            asc += "" + serie[i] + ", ";
        }

        return asc;

//        for (int i = 0; i < split.length; i++) {
//            for (int j = 0; j < split.length; j++) {
//                int val1 = split[i].charAt(i);
//                int val2 = split[j].charAt(j);
//
//                if (val1 > val2) {
//                    asc = "" + val1;
//                }
//
//            }
//        }
    }

    public String descendente() {

//        serie = new int[split.length];
//        for (int i = 0; i < split.length; i++) {
//            serie[i] = Integer.parseInt(String.valueOf(split[i]));
//        }
//
//        Arrays.sort(serie);

        for (int i = serie.length-1; i>=0; i--) {
            desc += "" + serie[i] + ", ";
        }

        return desc;

    }
}

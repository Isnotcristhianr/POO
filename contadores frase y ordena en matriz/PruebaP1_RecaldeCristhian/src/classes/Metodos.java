/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Metodos {

    private String[] vocales = {"a", "e", "i", "o", "u"}, voc, letr;
    //private String[] abecedario = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
    private String frase, msgv = "", msgc = "", msgp = "";
    private int contv = 0, contc = 0, contp = 0;

    public Metodos(String frase) {
        this.frase = frase;
    }

    public Metodos() {
    }

    public String Vocales() {

        voc = frase.split("");

        for (int i = 0; i < vocales.length; i++) {
            for (int j = 0; j < frase.length(); j++) {
                if (vocales[i].equalsIgnoreCase(voc[j])) {
                    contv++;
                }
            }
        }

        msgv = " " + contv;
        return msgv;
    }

    public String Consonantes() {

        return msgc;
    }

    public String Palabras() {

        String[] pal = frase.split(" ");

        contp = pal.length;

        msgp = " " + contp;
        return msgp;
    }

    public String contConsonantes() {
        letr = frase.split("");
        for (int i = 0; i < letr.length; i++) {
            char letras = frase.charAt(i);
            if (esConsonante(letras)) {
                contp++;
            }
        }

        msgc = "" + contp;
        return msgc;
    }

    private boolean esConsonante(char letras) {
        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letras));
    }

//    public String Conso() {
//
//        letr = frase.split("");
//
//        for (int i = 0; i < abecedario.length; i++) {
//            for (int j = 0; j < letr.length; j++) {
//                if (vocales[i].equalsIgnoreCase(letr[j])) {
//                    contv++;
//                }
//            }
//        }
//
//        msgc = "" + contp;
//        return msgc;
//    }
    //matriz
    private String[][] ma;
    private String tmp="";
    private int valor, mul, cont = 0, estado = 1;

    public String[][] matriz() {

        String[] texto = frase.split(" "), fraseTmp;

        //separar sin espacios
        for (int i = 0; i < texto.length; i++) {
            tmp += texto[i];
        }
        fraseTmp = tmp.split("");

        //tam matriz
        do {
            valor++;
            mul = valor * valor;
        } while (mul < fraseTmp.length);

        ma = new String[valor][valor];

        //llenar matriz
        if (estado == 1) {
            for (int c = 0; c < valor; c++) {
                for (int f = valor - 1; f >= 0; f--) {
                    if (cont < fraseTmp.length) {
                        ma[f][c] = fraseTmp[cont];
                        cont++;
                    }
                }
            }
            estado = 0;
        } else {
            for (int c = 0; c < valor; c++) {
                for (int f = 0; f < valor; f++) {
                    if (cont < fraseTmp.length) {
                        ma[f][c] = fraseTmp[cont];
                        cont++;
                    }
                }
            }
            estado = 1;
        }
        
        
        

        return ma;
    }
     public void imprimirM(String[][] matriz, JTable nombre) {
        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();
        modelo.setColumnCount(valor);
        modelo.setRowCount(valor);

        for (int fil = 0; fil < valor; fil++) {
            for (int j = 0; j < valor; j++) {
                nombre.setValueAt(matriz[fil][j], fil, j);
            }
        }
    }
}

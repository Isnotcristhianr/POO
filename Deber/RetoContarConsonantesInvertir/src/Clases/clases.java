/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class clases {

    private String frase, resp, tmp;
    private int cont, contLetras, aux;
    private String[] palabras;
    private String[] letras, espacios;
    private String[] vocales = {"a", "e", "i", "o", "u"};
    private String[] abecedario = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

    //constructor
    public clases(String frase) {
        //var clase = var atributo
        this.frase = frase;
    }

    public int contador() {

        palabras = frase.split(" ");
        cont = palabras.length;

        return cont;
    }

    private int contVocales() {
        cont = 0;
        letras = frase.split("");

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (letras[i].equalsIgnoreCase(vocales[j])) {
                    cont++;
                }
            }
        }
        return cont;
    }

    private int contLetras() {

        cont = 0;

        letras = frase.split("");
        espacios = frase.split(" ");
        cont = letras.length;
        aux = espacios.length - 1;
        contLetras = cont - aux;

        return contLetras;
    }

//    private int contConso() {
//        cont = 0;
//        letras = frase.split("");
//
//        for (int l = 0; l < letras.length; l++) {
//            for (int c = 0; c < vocales.length; c++) {
//                if (letras[l].equals(abecedario[c])) {
//                    cont++;
//                }
//            }
//        }
//        return cont;
//    }

    public int contConsonantes() {
        cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letras = frase.charAt(i);
            if (esConsonante(letras)) {
                cont++;
            }
        }
        return cont;
    }

    private boolean esConsonante(char letras) {
        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letras));
    }

    private String invertir() {
        
        tmp="";
        for (int i = frase.length()-1; i>=0; i--) {
            tmp += frase.charAt(i);
        }

        return tmp;
    }

    public String imprimirLetras() {

        resp = "<html>";

        resp += "Frase: " + frase + "<br>";
        resp += "Vocales: " + contVocales() + "<br>";
        resp += "Letras: " + contLetras() + "<br>";
        resp += "Consonantes: " + contConsonantes() + "<br>";
        resp += "Invertir: " + invertir() + "<br>";
        resp += "</html>";

        return resp;
    }

}

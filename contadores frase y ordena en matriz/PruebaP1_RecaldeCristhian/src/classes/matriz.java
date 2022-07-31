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
public class matriz {

    private String frase;
    private String[][] palabras;
    private String[] caracteres;
    private int v = 0, m, cont = 0, aux = 0, tam = 0, tmp = 0;

//    public texto(String frase) {
//        this.frase = frase;
//    }
    public int tam() {

        caracteres = frase.split("");

        do {
            v++;
            m = v * v;

        } while (m < caracteres.length);

        tam = m;
        return tam;
    }

    public String[][] mtrix() {

        caracteres = frase.split("");

        do {
            v++;
            m = v * v;

        } while (m < caracteres.length);

        if (caracteres.equals(" ")) {
            //espacio no hace nada
        } else {
            palabras = new String[tam][tam];

            if (aux == 0) {
                for (int f = 0; f < v - 1; f++) {
                    if (cont < caracteres.length) {
                        palabras[f][tmp] = caracteres[cont];
                        cont++;
                        aux = 1;
                    }
                }
            } else if (aux == 1) {
                for (int f = 0; f < v - 1; f++) {
                    if (cont < caracteres.length) {
                        palabras[f][tmp] = caracteres[cont];
                        cont++;
                        aux = 1;
                    }
                }

            }

        }

        return palabras;
    }

    public String[][] llenado() {
        caracteres = frase.split("");

        do {
            v++;
            m = v * v;

        } while (m < caracteres.length);

        if (caracteres.equals(" ")) {

        } else {
            palabras = new String[v][v];

            if (aux == 0) {
                for (int c = 0; c < v - 1; c++) {
                    for (int f = v - 1; f > 0; f--) {
                        if (cont < caracteres.length) {
                            palabras[f][c] = caracteres[cont];
                            cont++;
                            aux = 1;
                        }
                    }
                }
            } else {
                for (int c = 0; c < v - 1; c++) {
                    for (int f = 0; f > v - 1; f--) {
                        if (cont < caracteres.length) {
                            palabras[f][c] = caracteres[cont];
                            cont++;
                            aux = 0;
                        }
                    }
                }
            }
        }
        return palabras;
    }

    public int calcular_tam_matriz() {
        for (int i = 0; i < 1000000; i++) {
            if ((i * i) >= frase.length()) {
                tam = i;
                break;
            }
        }
        return tam;
    }

    public void imprimirM(int[][] matriz, JTable nombre) {
        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();
        modelo.setColumnCount(this.caracteres.length);
        modelo.setRowCount(this.m);

        for (int fil = 0; fil < this.caracteres.length; fil++) {
            for (int j = 0; j < this.caracteres.length; j++) {
                nombre.setValueAt(matriz[fil][j], fil, j);
            }
        }
    }
}

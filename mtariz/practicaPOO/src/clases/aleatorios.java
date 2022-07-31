/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jibarra
 */
public class aleatorios {

    private int[] num;
    private int[][] mat;
    private int f, c, tam = 0, aleatorio, j = 0, cont = 0;

    public aleatorios(int f, int c) {
        this.f = f;
        this.c = c;
        tam = this.f * this.c;
    }

    private void aleatorio() {
        num = new int[tam];
        for (int i = 0; i < tam; i++) {
            aleatorio = (int) (Math.random() * tam + 1);
            if (i == 0) {
                num[i] = aleatorio;
            } else {
                j = 0;
                while (j < i) {
                    if (aleatorio != num[j]) {
                        j++;
                    } else {
                        aleatorio = (int) (Math.random() * tam + 1);
                        j = 0;
                    }
                }
                num[i] = aleatorio;
            }
        }
    }

    public int[][] matriz() {

        mat = new int[f][c];
        aleatorio();

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = num[cont];
                cont++;
            }
        }

        return mat;
    }

    public void imprimirMatriz(int[][] matriz, int f, int c, JTable nombre) {
        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();
        modelo.setColumnCount(c);
        modelo.setRowCount(f);

        for (int fil = 0; fil < f; fil++) {
            for (int co = 0; co < c; co++) {
                nombre.setValueAt(matriz[fil][co], fil, co);

            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lenovo
 */
public class naipes {

    private int principal[][] = new int[10][4];
    private String cartas[] = new String[40];

    private int f, cont, fil, col;
    private String cs = "", cr = "", ce = "";

    //constructor
    public naipes() {
        llenar();
        barajar();
    }

    //llenar matriz
    private void llenar() {
        for (int c = 0; c < 4; c++) {
            f = 0;
            cont = 1;
            while (f < 10) {
                if (cont != 8 && cont != 9) {
                    principal[f][c] = cont;
                    cont++;
                    f++;
                } else {
                    cont++;
                }
            }
        }
    }

    private void barajar() {

        for (int i = 0; i < 40; i++) {

            do {
                fil = (int) (Math.random() * 10);
                col = (int) (Math.random() * 3);

            } while (principal[fil][col] == 0);

            if (col == 0) {
                cartas[i] = principal[fil][col] + " rojas";
            }
            if (col == 1) {
                cartas[i] = principal[fil][col] + " trebol";
            }
            if (col == 2) {
                cartas[i] = principal[fil][col] + " picas";
            }
            if (col == 3) {
                cartas[i] = principal[fil][col] + " diamante";
            }

        }
    }

    private void cartaSiguiente() {

        f = 0;
        while (f < cartas.length) {
            if (cartas[f].equals("")) {
                f++;
            } else {
                cs = cartas[f];
                ce += " " + cs;
                cartas[f] = "";
                break;
            }
        }

    }

    public String getCS() {
        cartaSiguiente();
        return cs;
    }

    private void cartasRestantes() {

        for (int i = 0; i < cartas.length; i++) {
            if (!cartas[i].equals("")) {
                cr += cartas[i] + " ";
            }
        }

    }

    public String getCE() {
        return ce;
    }

    public String getCR() {
        cartasRestantes();
        return cr;
    }
}

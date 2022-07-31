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
 * @author Lenovo
 */
public class letras {

    //atributos
    private String letra;
    private String[][] mat;
    private int f, c;

    //constructor
    public letras(String letra) {
        this.letra = letra;
    }

    //metodos
    public String[][] num1() {

        mat = new String[5][4];

        mat[0][0] = "";
        mat[0][1] = "";
        mat[0][2] = "";
        mat[0][3] = "*";
        mat[1][0] = "";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "*";
        mat[2][0] = "";
        mat[2][1] = "";
        mat[2][2] = "";
        mat[2][3] = "*";
        mat[3][0] = "";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "*";
        mat[4][0] = "";
        mat[4][1] = "";
        mat[4][2] = "";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num2() {

        mat = new String[5][4];

        mat[0][0] = "*";
        mat[0][1] = "*";
        mat[0][2] = "*";
        mat[0][3] = "*";
        mat[1][0] = "";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "*";
        mat[2][0] = "*";
        mat[2][1] = "*";
        mat[2][2] = "*";
        mat[2][3] = "*";
        mat[3][0] = "*";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "";
        mat[4][0] = "*";
        mat[4][1] = "*";
        mat[4][2] = "*";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num3() {

        mat = new String[5][4];

        mat[0][0] = "*";
        mat[0][1] = "*";
        mat[0][2] = "*";
        mat[0][3] = "*";
        mat[1][0] = "";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "*";
        mat[2][0] = "*";
        mat[2][1] = "*";
        mat[2][2] = "*";
        mat[2][3] = "*";
        mat[3][0] = "";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "*";
        mat[4][0] = "*";
        mat[4][1] = "*";
        mat[4][2] = "*";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num4() {

        mat = new String[5][4];

        mat[0][0] = "*";
        mat[0][1] = "";
        mat[0][2] = "";
        mat[0][3] = "*";
        mat[1][0] = "*";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "*";
        mat[2][0] = "*";
        mat[2][1] = "*";
        mat[2][2] = "*";
        mat[2][3] = "*";
        mat[3][0] = "";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "*";
        mat[4][0] = "";
        mat[4][1] = "";
        mat[4][2] = "";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num5() {

        mat = new String[5][4];

        mat[0][0] = "*";
        mat[0][1] = "*";
        mat[0][2] = "*";
        mat[0][3] = "*";
        mat[1][0] = "*";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "";
        mat[2][0] = "*";
        mat[2][1] = "*";
        mat[2][2] = "*";
        mat[2][3] = "*";
        mat[3][0] = "";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "*";
        mat[4][0] = "*";
        mat[4][1] = "*";
        mat[4][2] = "*";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num6() {

        mat = new String[5][4];

        mat[0][0] = "*";
        mat[0][1] = "*";
        mat[0][2] = "*";
        mat[0][3] = "*";
        mat[1][0] = "*";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "";
        mat[2][0] = "*";
        mat[2][1] = "*";
        mat[2][2] = "*";
        mat[2][3] = "*";
        mat[3][0] = "*";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "*";
        mat[4][0] = "*";
        mat[4][1] = "*";
        mat[4][2] = "*";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num7() {

        mat = new String[5][4];

        mat[0][0] = "*";
        mat[0][1] = "*";
        mat[0][2] = "*";
        mat[0][3] = "*";
        mat[1][0] = "";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "*";
        mat[2][0] = "";
        mat[2][1] = "";
        mat[2][2] = "";
        mat[2][3] = "*";
        mat[3][0] = "";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "*";
        mat[4][0] = "";
        mat[4][1] = "";
        mat[4][2] = "";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num8() {

        mat = new String[5][4];

        mat[0][0] = "*";
        mat[0][1] = "*";
        mat[0][2] = "*";
        mat[0][3] = "*";
        mat[1][0] = "*";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "*";
        mat[2][0] = "*";
        mat[2][1] = "*";
        mat[2][2] = "*";
        mat[2][3] = "*";
        mat[3][0] = "*";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "*";
        mat[4][0] = "*";
        mat[4][1] = "*";
        mat[4][2] = "*";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num9() {

        mat = new String[5][4];

        mat[0][0] = "*";
        mat[0][1] = "*";
        mat[0][2] = "*";
        mat[0][3] = "*";
        mat[1][0] = "*";
        mat[1][1] = "";
        mat[1][2] = "";
        mat[1][3] = "*";
        mat[2][0] = "*";
        mat[2][1] = "*";
        mat[2][2] = "*";
        mat[2][3] = "*";
        mat[3][0] = "";
        mat[3][1] = "";
        mat[3][2] = "";
        mat[3][3] = "*";
        mat[4][0] = "*";
        mat[4][1] = "*";
        mat[4][2] = "*";
        mat[4][3] = "*";

        return mat;
    }

    public String[][] num() {

        mat = new String[5][4];

        //0
        if (letra.equals("0")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (f == 0 || f == 4) {
                        mat[f][c] = letra;
                    } else if (c == 0 || c == 3) {
                        mat[f][c] = letra;
                    }
                }
            }
            //1
        } else if (letra.equals("1")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (c == 3) {
                        mat[f][c] = letra;
                    } else {
                        mat[f][c] = "";
                    }
                }
            }
            //2
        } else if (letra.equals("2")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (f % 2 == 0) {
                        mat[f][c] = letra;
                    } else if (f == 1) {
                        mat[f][3] = letra;
                    } else if (f == 3) {
                        mat[f][0] = letra;

                    }
                }
            }
            //3
        } else if (letra.equals("3")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (f % 2 == 0) {
                        mat[f][c] = letra;
                    } else {
                        mat[f][3] = letra;
                    }
                }
            }
            //4
        } else if (letra.equals("4")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (f == 0 || f == 1) {
                        if (c == 0 || c == 3) {
                            mat[f][c] = letra;
                        }
                    } else if (f == 2) {
                        mat[f][c] = letra;
                    } else if (f == 3 || f == 4) {
                        if (c == 3) {
                            mat[f][c] = letra;
                        }
                    }
                }
            }
            //5
        } else if (letra.equals("5")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (f % 2 == 0) {
                        mat[f][c] = letra;
                    } else if (f == 1) {
                        mat[f][0] = letra;
                    } else if (f == 3) {
                        mat[f][3] = letra;

                    }
                }
            }
            //6
        } else if (letra.equals("6")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (f % 2 == 0) {
                        mat[f][c] = letra;
                    } else if (f == 1) {
                        mat[f][0] = letra;
                    } else if (f == 3) {
                        mat[f][0] = letra;
                        mat[f][3] = letra;
                    }
                }
            }
            //7
        } else if (letra.equals("7")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (c == 3) {
                        mat[f][c] = letra;
                    } else if (f == 0) {
                        for (int i = 0; i < 3; i++) {
                            mat[f][i] = letra;

                        }
                    }
                }
            }
            //8
        } else if (letra.equals("8")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (f % 2 == 0) {
                        mat[f][c] = letra;
                    } else {
                        mat[f][0] = letra;
                        mat[f][3] = letra;
                    }
                }
            }
            //9
        } else if (letra.equals("9")) {
            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 4; c++) {
                    if (f % 2 == 0) {
                        mat[f][c] = letra;
                    } else if (f == 1 && c == 0) {
                        mat[f][c] = letra;
                    } else {
                        mat[f][3] = letra;
                    }
                }
            }
        }

        return mat;
    }

    public void imprimirMatriz(String[][] matriz, int f, int c, JTable nombre) {
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

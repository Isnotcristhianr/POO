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
public class animal {

    private int edad, humano;

    public animal(int edad) {
        this.edad = edad;
    }

    //metodo hijo
    public String comer() {
        return "Pasto";
    }

    //get y set
    public int getEdad() {
        return edad;
    }

    public int getHumano() {
        return humano;
    }

    public void setHumano(int humano) {
        this.humano = humano;
    }

    //calcular edad del animal
    public void edad() {
        if (edad <= 1) {
            humano = 15;
        } else if (edad >= 1 && edad < 3) {
            humano = 24;
        } else {
            humano = 24;
            for (int i = 2; i < edad; i++) {
                humano += 4;
            }

        }
    }

}

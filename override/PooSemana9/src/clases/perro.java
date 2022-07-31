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
public class perro extends animal {

    String raza;
    int resp;

    //constructor padre 
    public perro(int edad, String raza) {
        super(edad);
        this.raza = raza;
    }

    //sobreescribir y hereda del padre caracteristicas, se modifica usando override caracteristica
    //padre manda pasto, hijo sobreescribe por croquetas
    @Override
    public void edad() {
        if (raza.equals("pequeña")) {
            super.edad();
        } else {
            setHumano(120);
        }

    }

    public String getResp() {

        edad();
        resp = getHumano();
        return "Edad Humana es: " + resp;
    }

}

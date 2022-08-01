/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprestamos;

/**
 *
 * @author Lenovo
 */
public class Prestamo {

    //variables
    private String name;
    private double sueldo, porcentaje = 0.45, prestamo;

    //constructor
    public Prestamo() {
    }

    //get y set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    //metodos
    public double prestmax(double sueldo) {

        prestamo = sueldo * porcentaje;

        return prestamo;
    }

}

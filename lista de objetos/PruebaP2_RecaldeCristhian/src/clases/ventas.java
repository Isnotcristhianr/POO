/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class ventas {

    //atributos
    private int tamAlmacen;
    private String nombre;
    private int stock;
    private double precio;

    //array objetos
    private productos listaproductos[];

    //constructor
    public ventas(int tamAlmacen) {
        this.tamAlmacen = tamAlmacen;
        listaproductos = new productos[tamAlmacen];
    }

    //metodos   
    //registar
    public void registroEst() {
        for (int i = 0; i < tamAlmacen; i++) {
            nombre = (JOptionPane.showInputDialog("Nombre del producto: " + (i + 1)));
            stock = Integer.parseInt(JOptionPane.showInputDialog("Stock: " + (i + 1)));
            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio: " + (i + 1)));

            listaproductos[i] = new productos(nombre, stock, precio);

        }
    }

    //visualizar
    public String visualizar() {
        String msg = "<html>";

        for (int i = 0; i < tamAlmacen; i++) {
            if (listaproductos[i] == null) {
                msg += "<p>" + " No se han agregado productos aun" + "</p>";
            } else {
                msg += "<p>" + "Nombre: " + listaproductos[i].getNombre() + " Stock: " + listaproductos[i].getStock() + " Precio: " + listaproductos[i].getPrecio() + "</p>";
            }
        }

        msg += "</html>";

        return msg;
    }

    //vender producto, n cantidad y disminuir stock
    public String vender(String nombre, int cantidad) {
        String msg = "<html>";
        int nuevoStock;

        for (int i = 0; i < tamAlmacen; i++) {
            if (listaproductos[i] == null) {
                msg += "<p>" + " No se han agregado productos aun, no se puede vender" + "</p>";
            } else {
                if (listaproductos[i].getNombre().equals(nombre)) {

                    nuevoStock = listaproductos[i].getStock() - cantidad;
                    listaproductos[i].setStock(nuevoStock);

                    msg += "El producto se vendio" + "</p>";
                    msg += "Inventario actual: " + listaproductos[i].getNombre() + " Cantidad: " + listaproductos[i].getStock() + "</p>";

                }
            }
        }

        msg += "</html>";

        return msg;
    }

    //Método para mostrar productos agotados.
    public String agotados() {
        String msg = "<html>";

        for (int i = 0; i < tamAlmacen; i++) {
            if (listaproductos[i].getStock() == 0) {

                msg += listaproductos[i].getNombre() + " Stock: " + listaproductos[i].getStock() + " Precio: " + listaproductos[i].getPrecio() + "<p>";

            }
        }

        msg += "</html>";

        return msg;

    }

    //actualizar precio del producto
    public String actualizarPrecio(String nombre, double precio) {

        String msg = "<html>";

        for (int i = 0; i < tamAlmacen; i++) {
            if (listaproductos[i] == null) {
                msg += "<p>" + " No se han agregado productos aun, no se puede vender" + "</p>";
            } else {
                if (listaproductos[i].getNombre().equals(nombre)) {

                    listaproductos[i].setPrecio(precio);

                    msg += "El producto se actualizo" + "</p>";
                    msg += "Inventario actual: " + listaproductos[i].getNombre() + " Precio: " + listaproductos[i].getPrecio() + "</p>";

                }
            }
        }

        msg += "</html>";

        return msg;

    }

    //aumentar stock
    public String aumentarStock(String nombre, int cantidad) {

        String msg = "<html>";

        for (int i = 0; i < tamAlmacen; i++) {
            if (listaproductos[i] == null) {
                msg += "<p>" + " No se han agregado productos aun, no se puede vender" + "</p>";
            } else {
                if (listaproductos[i].getNombre().equals(nombre)) {

                    listaproductos[i].setStock(cantidad);

                    msg += "El producto se actualizo" + "</p>";
                    msg += "Inventario actual: " + listaproductos[i].getNombre() + " Stock: " + listaproductos[i].getStock() + "</p>";

                }
            }
        }

        msg += "</html>";

        return msg;

    }
}

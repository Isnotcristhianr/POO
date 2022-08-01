/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Arrays;

/**
 *
 * @author odmon
 */
public class Numeros {

    private int cant = 0, cont, tmp1, tmp2;
    private String frase, msgrepe = "", asc ="", desc="";
    private String[] split, guardar;
    private int[] serie;
     

    public Numeros(String txt) {
        this.frase = txt;
        this.split = frase.split(",");
    }

    public int Cantidad() {

        cant = split.length;

        return cant;
    }

    public String Repetido() {

        for (int i = 0; i < split.length; i++) {
            cont = 1;
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].equals(split[j]) && !split[j].equals("0")) {
                    split[j] = "0";
                    cont++;
                }
            }
            if (cont != 1) {
                msgrepe += "" + split[i] + " = " + " [  " + cont + " ], ";
            }
        }


        return msgrepe;
    }

    public String ascendente() {


      serie = new int[split.length];

        for(int i = 0; i < split.length; i++){
            serie[i] = Integer.parseInt(String.valueOf(split[i]));
           
            
        }
        
        Arrays.sort(serie);
        
        for(int i = 0; i<serie.length;i++){
            
            asc += ""+ serie[i] +", ";
            
        }
        

        return asc;
    }
    public String descendente() {
    
        for(int i = serie.length-1; i>=0;i--){
            
            desc += ""+ serie[i] +", ";
            
        }
        

        return desc;
    }

}

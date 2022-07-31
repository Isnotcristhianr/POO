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
public class PerroGrande extends animal{
    
    private String resp;
    
    public PerroGrande(int edad) {
        super(edad);
    }

    @Override
    public void edad() {
        super.edad(); //To change body of generated methods, choose Tools | Templates.
        //calculo y reemplazo
        setHumano(getHumano()+5);
    }
    
    public String getResp(){
    
        resp="La edad raza grander es:0"+getHumano();
        
        return resp;
    }
    
    
    
}

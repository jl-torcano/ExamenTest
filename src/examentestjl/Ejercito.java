/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentestjl;



/**
 *
 * @author julut
 */
public class Ejercito {

    public Ejercito() {
    }
    
    public boolean verificar(int edad){
     
        if(edad<0){
            
            throw new ArithmeticException("La edad no puede ser NEGATIVA");
        }else if(edad>0&&edad<18){
            
            return false;
        }else  if(edad>40){
            
            return false;
        }
            return true;
    }
    
    public int nivelAcceso(boolean ap1, boolean ap2, boolean ap3){
        if(ap1==true&&ap2==true){
            return 1;
        } else if (ap3==true){
            return 2;
        }
        return 3;
    }
    
}

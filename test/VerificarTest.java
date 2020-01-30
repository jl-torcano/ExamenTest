/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import examentestjl.Ejercito;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author julut
 */
@RunWith(value=Parameterized.class)
public class VerificarTest {
    
    private Ejercito e;
    
    private int edad;
    private boolean esperado;
    
    @Before
    public void before(){
    e=new Ejercito();
    }
    
    public VerificarTest(int edad, boolean esperado) {
        this.edad=edad;
        this.esperado=esperado;
    }
    
    @Parameterized.Parameters//Aquí creamos un Array con los valores que van a ser los parametros a probar y el resultado esperado
    public static ArrayList<Object[]> getDatos(){
        ArrayList<Object[]> d = new ArrayList<>();
        d.add(new Object[]{-5, false});
        d.add(new Object[]{5, false});
        d.add(new Object[]{19, true});
        d.add(new Object[]{48, false});
        
        return d;
    }
    
    @Test
    public void testEdad(){
        assertEquals(esperado, e.verificar(edad));        
    }
    
}


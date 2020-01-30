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
public class NivelAcceso {
    
    private Ejercito e;
    private boolean ap1, ap2, ap3;
    private int esperado;
    
    @Before
    public void before(){
    e=new Ejercito();
    }
    
    public NivelAcceso(boolean ap1, boolean ap2, boolean ap3, int esperado) {
        this.ap1=ap1;
        this.ap2=ap2;
        this.ap3=ap3;
        this.esperado=esperado;
    }
    
        @Parameterized.Parameters
    public static ArrayList<Object[]> getDatos(){
        ArrayList<Object[]> d = new ArrayList<>();
        d.add(new Object[]{true, false, false, 3});
        d.add(new Object[]{false, true, false, 3});
        d.add(new Object[]{false, false, false, 3});
        d.add(new Object[]{false, false, true, 2});
        d.add(new Object[]{true, false, true, 2});
        d.add(new Object[]{false, true, true, 2});
        d.add(new Object[]{true, true, true, 1});
        d.add(new Object[]{true, true, false, 1});
        
        return d;
    }
    
    @Test
    public void testPermiso(){
        assertEquals(esperado, e.nivelAcceso(ap1, ap2, ap3));        
    }
    
}

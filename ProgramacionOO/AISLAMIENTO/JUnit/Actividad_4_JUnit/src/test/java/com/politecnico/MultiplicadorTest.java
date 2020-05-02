package com.politecnico;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicadorTest {

    private Multiplicador multp;
    
    @Before
    public void setUp() throws Exception {
        multp = new Multiplicador();
    }

    @Test (expected = IllegalArgumentException.class)
    public void exceptionTestParaProbarQueEfectivamenteItWorks() {
        multp.multiplicar(1500,5);
    }

    @Test
    public void pruebaDelMetodoDeLaMultiplicacion(){
        assertEquals(20,multp.multiplicar(4,5));
        assertEquals(0,multp.multiplicar(0,5));
        assertEquals(27,multp.multiplicar(3,9));
        assertEquals(120,multp.multiplicar(15,8));
    }
}
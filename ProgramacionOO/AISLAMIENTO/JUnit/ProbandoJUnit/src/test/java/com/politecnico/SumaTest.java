package com.politecnico;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumaTest {

    @Test
    public void sumar(){
        int valorEsperado = 10;

        Suma suma = new Suma();
        int valorObtenido = suma.sumar(5,5);

        assertEquals(valorEsperado,valorObtenido);
    }


}
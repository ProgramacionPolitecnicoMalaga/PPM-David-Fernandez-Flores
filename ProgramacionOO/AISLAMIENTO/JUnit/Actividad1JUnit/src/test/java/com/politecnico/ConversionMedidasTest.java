package com.politecnico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConversionMedidasTest {

    private ConversionMedidas conversor;
    private double valorEsperado;
    private double valorObtenido;

    @Before
    public void setUp() throws Exception {
        conversor = new ConversionMedidas();
    }

    @Test
    public void inchToCm() {
        //---- 1 inch = 2,54 cm ----\\
        valorEsperado = 2.54;
        valorObtenido = conversor.inchACm(1);
        assertEquals((long)valorEsperado,(long)valorObtenido);

        //---- 12 inch = 30,48 cm ----\\
        valorEsperado = 30.48;
        valorObtenido = conversor.inchACm(12);
        assertEquals((long)valorEsperado,(long)valorObtenido);


    }

    @Test
    public void cmToInches(){
        //---- 12 cm = 4,72441 inch ----\\
        valorEsperado = 4.72441;
        valorObtenido = conversor.cmAInches(12);
        assertEquals((long)valorEsperado,(long)valorObtenido);

        //---- 0 cm = 0 inch ----\\
        valorEsperado = 0;
        valorObtenido = conversor.cmAInches(0);
        assertEquals((long)valorEsperado,(long)valorObtenido);

        //---- 0,5 cm = 0,1968 inch ----\\
        valorEsperado = 0.1968;
        valorObtenido = conversor.cmAInches(0.5);
        assertEquals((long)valorEsperado,(long)valorObtenido);
    }


}
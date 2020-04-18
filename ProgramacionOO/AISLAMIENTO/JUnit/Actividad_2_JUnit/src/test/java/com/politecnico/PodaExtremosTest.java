package com.politecnico;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;



import java.util.ArrayList;

import static org.junit.Assert.*;

public class PodaExtremosTest {
    private ArrayList<Integer> listaNum;
    private PodaExtremos poda;
    private int valorEsperado;
    private int valorObtenido;

    @Before
    public void setUp() throws Exception {
        poda = new PodaExtremos();
        listaNum = new ArrayList<Integer>();
        //Dada la lista {1,21,55,1,5,8,13,3,2,34}
        listaNum.add(1);
        listaNum.add(21);
        listaNum.add(55);
        listaNum.add(1);
        listaNum.add(5);
        listaNum.add(8);
        listaNum.add(13);
        listaNum.add(3);
        listaNum.add(2);
        listaNum.add(34);
    }

    @Test
    public void podarProximoValor8() {
        valorEsperado = 8;
        valorObtenido = poda.podarMasProximo(9,listaNum);
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void podarProximoValor49() {
        valorEsperado = 55;
        valorObtenido = poda.podarMasProximo(49,listaNum);
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void podarLejanosValor10() {
        valorEsperado = 55;
        valorObtenido = poda.podarMasLejano(10,listaNum);
        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void podarLejanosValor30() {
        valorEsperado = 1;
        valorObtenido = poda.podarMasLejano(30,listaNum);
        assertEquals(valorEsperado,valorObtenido);
    }

    @After
    public void tearDown() throws Exception {
        listaNum.clear();
    }


}
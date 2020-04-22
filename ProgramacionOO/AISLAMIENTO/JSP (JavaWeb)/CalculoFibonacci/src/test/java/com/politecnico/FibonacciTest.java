package com.politecnico;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci fibonacci;
    private ArrayList<Integer> serie = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci(serie);
    }

    @Test
    public void GetPosicion() {
        int posicion = 11;
        int valorEsperado = 55;
        fibonacci.calculoFibonacci(posicion,serie);
        int valorObtenido = fibonacci.getPosicionDeFibonacci(posicion,serie);
        assertEquals(valorEsperado,valorObtenido);
    }

    @After
    public void tearDown() throws Exception {
        serie.clear();
    }
}
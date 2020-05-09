package com.politecnico.calificaciones;

import com.politecnico.excepcion.NotaException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalificacionesTest {

    private Calificaciones c;

    @Before
    public void setUp() throws Exception {
        c = new Calificaciones();
    }

    @Test
    public void Entre0y500LaNotaEsInsuficiente() throws NotaException {

        for (int i=0; i<500; i++){
            assertEquals("INSUFICIENTE",c.getCalificacion(i));
        }
    }
    @Test
    public void Entre500y600LaNotaEsSuficiente() throws NotaException {

        for (int i=500; i<600; i++){
            assertEquals("SUFICIENTE",c.getCalificacion(i));
        }
    }
    @Test
    public void Entre600y700LaNotaEsBien() throws NotaException {

        for (int i=600; i<700; i++){
            assertEquals("BIEN",c.getCalificacion(i));
        }
    }
    @Test
    public void Entre700y850LaNotaEsNotable() throws NotaException {

        for (int i=700; i<850; i++){
            assertEquals("NOTABLE",c.getCalificacion(i));
        }
    }
    @Test
    public void Entre850y1000LaNotaEsSobresaliente() throws NotaException {

        for (int i=850; i<1000; i++){
            assertEquals("SOBRESALIENTE",c.getCalificacion(i));
        }
    }
    @Test (expected = NotaException.class)
    public void ValorDistintoDaExcepcion() throws NotaException {
        assertEquals("SUFICIENTE",c.getCalificacion(-8));
    }
}
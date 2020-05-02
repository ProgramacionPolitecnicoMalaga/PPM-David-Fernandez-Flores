package com.politecnico;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CarreraTest {

    private int valorEsperado;
    private int valorObtenido;
    private ArrayList<String> lista;
    private Carrera carrera;

    @Before
    public void setUp() throws Exception {
        lista = new ArrayList<String>();
        carrera = new Carrera();
    }
    @Test
    public void listaVacia() {
        assertNull(carrera.getListadoParticipantes(lista));
    }
    @Test
    public void listaNoVaciaTrasInsercion() {
        boolean insert = carrera.addParticipante("Jeff Lebowsky",lista);
        assertNotNull(carrera.getListadoParticipantes(lista));
    }
    @Test
    public void insertarCuatroParticipantes(){
        assertTrue(carrera.addParticipante("John Wick",lista));
        assertTrue(carrera.addParticipante("Travis Bickle",lista));
        assertTrue(carrera.addParticipante("Jack Torrance",lista));
        assertTrue(carrera.addParticipante("Joh McClane",lista));
    }
    @Test
    public void insertarRepetido(){
        // Given
        carrera.addParticipante("John Wick",lista);
        carrera.addParticipante("Ellen Ripley",lista);
        carrera.addParticipante("Sarah Connor",lista);
        carrera.addParticipante("Jules Winnfield",lista);

        // When
        boolean isInsertado = carrera.addParticipante("John Wick",lista);

        // Then
        assertFalse(isInsertado);
        assertEquals(4,carrera.getTotalParticipantes(lista));
    }
    @Test
    public void cambioDePosicion(){
        // Given
        String wick = "John Wick";
        carrera.addParticipante("James Bond",lista);
        carrera.addParticipante(wick,lista);

        // When
        carrera.setPosicion(wick,1,lista);

        // Then
        assertEquals(wick,carrera.getParticipantePorPosicion(1,lista));
    }
    @Test
    public void ComparacionListaClonDeLista(){
        // Given
        ArrayList<String> newlist = carrera.getListadoParticipantes(lista);
        ArrayList<String> clonedList = carrera.cloneCarrera(lista);

        // Then
        assertNotEquals(clonedList,newlist);
    }
    @Test
    public void ComparacionDeArraysConCambioDePosicion(){
        // Given
        carrera.addParticipante("Thomas Shelby",lista);
        carrera.addParticipante("Sheldon Cooper",lista);
        carrera.addParticipante("Vito Corleone",lista);
        carrera.addParticipante("Barney Stinson",lista);
        ArrayList<String> initialList = carrera.getListadoParticipantes(lista);

        // When
        carrera.setPosicion("Barney Stinson",1,lista);
        carrera.setPosicion("Sheldon Cooper",3,lista);
        carrera.setPosicion("Thomas Shelby",2,lista);
        ArrayList<String> finalList = carrera.getListadoParticipantes(lista);

        // Then
        assertArrayEquals(initialList.toArray(),finalList.toArray());
    }
    @After
    public void tearDown() throws Exception {
        lista.clear();
    }


}
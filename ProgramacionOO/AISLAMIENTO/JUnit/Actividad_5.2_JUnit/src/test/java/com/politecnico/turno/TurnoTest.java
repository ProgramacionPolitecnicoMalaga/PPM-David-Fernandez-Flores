package com.politecnico.turno;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TurnoTest {

    private Turno mockedTurno;

    @Test
    public void TestSobreElMetodoSiguienteDeTurno() {
        // Given
        mockedTurno = spy(Turno.class);
        int[] turnos = {1,5,2,8,4};
        mockedTurno.add(turnos);
        /* when(mockedTurno.siguiente()).thenReturn(1); */

        // Then
        int siguiente;
        siguiente = mockedTurno.siguiente();
        assertEquals(1, siguiente);
        siguiente = mockedTurno.siguiente();
        assertEquals(5, siguiente);
        siguiente = mockedTurno.siguiente();
        assertEquals(2, siguiente);
    }


}
package com.politecnico.calificaciones;

import com.politecnico.excepcion.NotaException;
import com.politecnico.notas.Notas;

public class Calificaciones {

    public String getCalificacion(int numCalif) throws NotaException {
        if ((numCalif >= 0) && (numCalif <= 499)){
            return String.valueOf(Notas.INSUFICIENTE);
        }
        else if ((numCalif >= 500) && (numCalif <= 599)){
            return String.valueOf(Notas.SUFICIENTE);
        }
        else if ((numCalif >= 600) && (numCalif <= 699)){
            return String.valueOf(Notas.BIEN);
        }
        else if ((numCalif >= 700) && (numCalif <= 849)){
            return String.valueOf(Notas.NOTABLE);
        }
        else if ((numCalif >= 850) && (numCalif <= 1000)){
            return String.valueOf(Notas.SOBRESALIENTE);
        }
        else {
            throw new NotaException();
        }
    }
}

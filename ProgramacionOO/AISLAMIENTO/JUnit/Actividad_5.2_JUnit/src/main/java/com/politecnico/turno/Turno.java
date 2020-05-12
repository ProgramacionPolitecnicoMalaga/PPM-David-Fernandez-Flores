package com.politecnico.turno;

import java.util.ArrayList;
import java.util.List;

public class Turno {

    private List<Integer> turnos;

    private int numInicio = -1;

    public Turno(){
        turnos = new ArrayList<Integer>();
    }

    public int getNumeroInicio(){
        return this.numInicio;
    }

    public void setNumeroInicio(int numero){
        this.numInicio = numero;
    }

    public int siguiente(){
        setNumeroInicio(getNumeroInicio() + 1);
        return turnos.get(getNumeroInicio());
    }

    public int siguiente(int numeroDeReferencia){
        return turnos.get(numeroDeReferencia++);
    }

    public void add(int a){
        turnos.add(a);
    }

    public void add(int[] array){
        for(int i=0; i<array.length; i++){
            turnos.add(array[i]);
        }
    }

    public void deleteThis(int a){
        turnos.remove(a);
    }
}

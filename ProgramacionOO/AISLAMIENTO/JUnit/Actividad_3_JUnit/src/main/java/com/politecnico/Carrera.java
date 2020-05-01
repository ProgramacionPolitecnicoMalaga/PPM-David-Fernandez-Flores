package com.politecnico;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    //private ArrayList<String> listaCarrera;

    public Carrera(){
        //listaCarrera = new ArrayList<String>();
    }


    public boolean addParticipante(String nombreParticipante,ArrayList<String> listaCarrera){
        boolean introducir = false;
        if (listaCarrera.isEmpty()){
            listaCarrera.add(nombreParticipante);
            introducir = true;
        }
        else {
            if (!listaCarrera.contains(nombreParticipante)) {
                return listaCarrera.add(nombreParticipante);
            }
            else{
                introducir = false;
            }
        }
        return introducir;
    }

    public ArrayList<String> getListadoParticipantes(ArrayList<String> listaCarrera){
        if (listaCarrera.isEmpty()){
            listaCarrera = null;
        }
        return listaCarrera;
    }

    public int getTotalParticipantes(ArrayList<String> listaCarrera){
        return listaCarrera.size();
    }

    public ArrayList<String> cloneCarrera(ArrayList<String> listaCarrera){
        return (ArrayList<String>) listaCarrera.clone();
    }

    public boolean setPosicion(String nombreParticipante, int posicionDestino, ArrayList<String> listaCarrera){
        boolean cambio = false;
        if (listaCarrera.contains(nombreParticipante)) {
            listaCarrera.remove(nombreParticipante);
            listaCarrera.add(posicionDestino-1,nombreParticipante);
            cambio = true;
        }
        else{
            cambio = false;
        }
        return cambio;
    }
    public String getParticipantePorPosicion(int posicion, ArrayList<String> listaCarrera){
        return listaCarrera.get(posicion-1);
    }
}

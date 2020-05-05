package com.politecnico.modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {

    private static ListaPersonas instance = new ListaPersonas();
    private List<Persona> list;

    public ListaPersonas(){
        list = new ArrayList<>();
    }

    public static ListaPersonas getInstance(){
        return instance;
    }

    public void añadirPersona(Persona p){
        list.add(p);
    }

    public int getSizeLista(){
        return list.size();
    }

    public Persona getPersonaAt(int i){
        return list.get(i);
    }

    public void deleteThis(int i){
        list.remove(i);
    }

    @Override
    public String toString() {
        return "List: " + list;
    }
}

package com.politecnico.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingleTarea {

    private static SingleTarea instance = new SingleTarea();
    private List<String> tareas;
    private int ultimaRealizada;

    public SingleTarea(){
        tareas = new ArrayList<String>();
        ultimaRealizada = -1;
    }

    public static SingleTarea getInstance(){
        return instance;
    }

    public void addTarea(String tarea){
        tareas.add(tarea);
    }

    public String getUltimaRealizada(){
        return tareas.get(ultimaRealizada);
    }

    public void cambiarUltimaTareaRealizada(int numeroDeTareas){
        ultimaRealizada += numeroDeTareas;
    }



}

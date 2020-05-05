package com.politecnico.operacionesTareas;

import com.politecnico.singleton.SingleTarea;

public class RetrocesoDeTarea {

    SingleTarea tareas = SingleTarea.getInstance();

    public void retroceder(int numeroDePosiciones){
        tareas.cambiarUltimaTareaRealizada(-numeroDePosiciones);
    }

    public String mostrarUltimaRealizada(){
        return tareas.getUltimaRealizada();
    }
}

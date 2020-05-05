package com.politecnico.operacionesTareas;

import com.politecnico.singleton.SingleTarea;

public class AvanceDeTarea {

    SingleTarea tareas = SingleTarea.getInstance();

    public void avanzar(int numeroDePosiciones){
        tareas.cambiarUltimaTareaRealizada(numeroDePosiciones);
    }

    public String mostrarÚltimaTareaRealizada(){
        return tareas.getUltimaRealizada();
    }


}

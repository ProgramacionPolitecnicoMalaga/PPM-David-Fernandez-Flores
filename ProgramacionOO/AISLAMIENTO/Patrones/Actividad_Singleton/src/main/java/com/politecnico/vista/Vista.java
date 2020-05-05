package com.politecnico.vista;

import com.politecnico.operacionesTareas.AvanceDeTarea;
import com.politecnico.operacionesTareas.RetrocesoDeTarea;
import com.politecnico.singleton.SingleTarea;

public class Vista {

    SingleTarea tareas = SingleTarea.getInstance();
    AvanceDeTarea avance = new AvanceDeTarea();
    RetrocesoDeTarea retroceso = new RetrocesoDeTarea();

    public void inicializacion(){
        tareas.addTarea("Primera tarea");
        tareas.addTarea("Segunda tarea");
        tareas.addTarea("Tercera tarea");
        tareas.addTarea("Cuarta tarea");
    }

    public String primerCambio() throws IndexOutOfBoundsException {
        avance.avanzar(3);
        return avance.mostrarÚltimaTareaRealizada();
    }
    public String segundoCambio() throws IndexOutOfBoundsException {
        avance.avanzar(1);
        return avance.mostrarÚltimaTareaRealizada();
    }
    public String tercerCambio() throws IndexOutOfBoundsException {
        retroceso.retroceder(3);
        return retroceso.mostrarUltimaRealizada();
    }
    public String cuartoCambio() throws IndexOutOfBoundsException {
        avance.avanzar(1);
        return avance.mostrarÚltimaTareaRealizada();
    }
}

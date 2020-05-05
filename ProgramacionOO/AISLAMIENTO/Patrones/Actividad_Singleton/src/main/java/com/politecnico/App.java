package com.politecnico;

import com.politecnico.vista.Vista;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Vista vista = new Vista();
        vista.inicializacion();
        try{
        System.out.println(vista.primerCambio());
        System.out.println(vista.segundoCambio());
        System.out.println(vista.tercerCambio());
        System.out.println(vista.cuartoCambio());
    } catch (IndexOutOfBoundsException e){
            System.out.println("\n");
            logger.log(Level.SEVERE,"\n    IndexOutOfBoundsException: Este movimiento no es posible");
        }
    }
}

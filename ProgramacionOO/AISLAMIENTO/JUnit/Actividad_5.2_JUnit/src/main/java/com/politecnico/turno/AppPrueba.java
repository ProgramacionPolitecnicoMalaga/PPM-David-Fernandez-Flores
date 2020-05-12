package com.politecnico.turno;

public class AppPrueba {
    public static void main(String[] args) {
        Turno turno = new Turno();
        int[] array = {1,5,2,6,0,9};
        turno.add(array);
        System.out.println(turno.siguiente()); //  1
        System.out.println(turno.siguiente()); //  5
        System.out.println(turno.siguiente()); //  2
        System.out.println(turno.siguiente()); //  6
        System.out.println(turno.siguiente()); //  0
        System.out.println(turno.siguiente()); //  9
    }
}

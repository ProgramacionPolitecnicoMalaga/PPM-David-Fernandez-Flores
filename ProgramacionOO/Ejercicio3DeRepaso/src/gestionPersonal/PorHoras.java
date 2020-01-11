package gestionPersonal;

import java.util.Scanner;

public class PorHoras extends Trabajadores{
    private int horasTrabajadas;
    private double salarioPorHoras;
    private double salarioFinal;

    public PorHoras(String nombre,String apellidos, int horasTrabajadas, double salarioPorHoras){
        super(nombre,apellidos);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHoras = salarioPorHoras;
    }
    public void getSalarioPorHoras(){
        salarioFinal = salarios.PorHoras(horasTrabajadas,salarioPorHoras);
    }

    @Override
    public String toString() {
        return " Por Horas {" + "\n" +
                "  Nombre =  " + getNombre() + "\n" +
                "  Apellido =  " + getApellidos() + "\n" +
                "  Horas trabajadas =  " + horasTrabajadas + "\n" +
                "  Sueldo Por Horas =  " + salarioPorHoras + "\n" +
                "  Salario =  " + salarioFinal + "\n" +
                '}' + "\n\n";
    }
}

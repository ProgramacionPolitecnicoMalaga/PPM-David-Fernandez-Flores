package gestionPersonal;

public class Salarios {

    public double Comisionados(int ventasRealizadas, double salarioBase){
        double bonificacionSalarial = ventasRealizadas * 50;
        double resultado = salarioBase + bonificacionSalarial;
        return resultado;
    }


    public double PorHoras(int horas,double salarioPorHoras){
        double resultado = salarioPorHoras * horas;
        return resultado;
    }


    public double Asalariados(double salarioBase){
        return salarioBase;
    }
}

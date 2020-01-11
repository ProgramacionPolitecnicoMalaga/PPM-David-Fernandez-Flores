package CalculadoraJava;

public class Operaciones {

    private double resultado;
    public String prueba;

    public double OperacionSuma(double numerocalculo1, double numerocalculo2){
        resultado = numerocalculo1+numerocalculo2;
        return resultado;
    }
    public double OperacionResta(double numerocalculo1, double numerocalculo2){
        resultado = numerocalculo1 - numerocalculo2;
        return resultado;
    }
    public double OperacionMultiplicacion(double numerocalculo1,double numerocalculo2){
        resultado = numerocalculo1 * numerocalculo2;
        return resultado;
    }
    public double OperacionDivision(double numerocalculo1,double numerocalculo2){
        resultado = numerocalculo1 / numerocalculo2;
        return resultado;
    }
    public double OperacionPotencia(double numerocalculo1, double numerocalculo2){
        resultado = Math.pow(numerocalculo1,numerocalculo2);
        return resultado;
    }
}

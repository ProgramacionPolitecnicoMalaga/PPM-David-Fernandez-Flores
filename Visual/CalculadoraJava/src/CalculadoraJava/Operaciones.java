package CalculadoraJava;

public class Operaciones {

    private double resultado;
    public String prueba;

    public void OperacionSuma(double numerocalculo1, double numerocalculo2){
        resultado = numerocalculo1+numerocalculo2;
    }
    public void OperacionResta(double numerocalculo1, double numerocalculo2){
        resultado = numerocalculo1 - numerocalculo2;
    }
    public void OperacionMultiplicacion(double numerocalculo1,double numerocalculo2){
        resultado = numerocalculo1 * numerocalculo2;
    }
    public void OperacionDivision(double numerocalculo1,double numerocalculo2){
        resultado = numerocalculo1 / numerocalculo2;
    }
    public void OperacionRaizCuadrada(double numerocalculo1){
        resultado = Math.sqrt(numerocalculo1);
    }
    public void OperacionPotencia(double numerocalculo1, double numerocalculo2){
        resultado = Math.pow(numerocalculo1,numerocalculo2);
    }
}

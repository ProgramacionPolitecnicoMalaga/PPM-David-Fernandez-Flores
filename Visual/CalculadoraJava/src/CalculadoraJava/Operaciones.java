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
    public double OperacionNeperiano(double numerocalculo2){
        resultado = Math.log(numerocalculo2);
        return resultado;
    }
    public double OperacionLogaritmo(double numerocalculo2) {
        resultado = Math.log10(numerocalculo2);
        return resultado;
    }
    public double OperacionRaiz(double numerocalculo2){
        resultado = Math.sqrt(numerocalculo2);
        return resultado;
    }
    public double OperacionSeno(double numerocalculo2){
        resultado = Math.sin(numerocalculo2);
        return resultado;
    }
    public double OperacionCoseno(double numerocalculo2){
        resultado = Math.cos(numerocalculo2);
        return resultado;
    }
    public double OperacionTangente(double numerocalculo2){
        resultado = Math.tan(numerocalculo2);
        return resultado;
    }
}

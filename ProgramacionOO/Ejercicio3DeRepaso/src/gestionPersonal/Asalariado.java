package gestionPersonal;

public class Asalariado extends Trabajadores{
    private double salarioBase;
    private double salarioFinal;

    public Asalariado(String nombre, String apellidos, double salarioBase){
        super(nombre,apellidos);
        this.salarioBase = salarioBase;
    }

    public void getSalarioAsalariado(){
        salarioFinal = salarios.Asalariados(salarioBase);
    }

    @Override
    public String toString() {
        return  " Asalariado {" + "\n" +
                "  Nombre =  " + getNombre() + "\n" +
                "  Apellido =  " + getApellidos() + "\n" +
                "  Salario =  " + salarioFinal + "\n" +
                '}';
    }

}

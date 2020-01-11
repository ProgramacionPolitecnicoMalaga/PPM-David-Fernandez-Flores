package gestionPersonal;

public class Comisionado extends Trabajadores{

    private double salarioBase;
    private double salarioFinal = 0;

    private int ventasRealizadas = 0;


    public Comisionado(String nombre,String apellidos,int ventasRealizadas,double salarioBase){
        super(nombre, apellidos);
        this.ventasRealizadas = ventasRealizadas;
        this.salarioBase = salarioBase;
    }
    public void getSalarioComisionado(){
        salarioFinal = salarios.Comisionados(ventasRealizadas,salarioBase);
    }

    @Override
    public String toString() {
        return " Comisionado {" + "\n" +
                "  Nombre =  " + getNombre() + "\n" +
                "  Apellido =  " + getApellidos() + "\n" +
                "  Numero de ventas =  " + ventasRealizadas + "\n" +
                "  Sueldo Base =  " + salarioBase + "\n" +
                "  Salario =  " + salarioFinal + "\n" +
                '}' + "\n\n";
    }
}

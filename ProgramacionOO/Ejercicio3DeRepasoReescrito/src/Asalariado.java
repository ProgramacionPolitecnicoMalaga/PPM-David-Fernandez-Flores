public class Asalariado extends Empleados {

    private double salarioFinal;

    public Asalariado(String nombre,String apellido,String DNI){
        super(nombre, apellido, DNI);
    }
    public double getSalario(){
        return SALARIO_BASE;
    }
    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    @Override
    public void calcularSalarioAsalariado(Asalariado a) {
        op.salarioAsalariado(a);
    }

    @Override
    public String toString() {
        return "\n Comisionados { \n" +
                "   Nombre: "+getNombre()+" "+getApellido()+"\n"+
                "   DNI: "+getDNI()+"\n"+
                "   Salario: "+salarioFinal+"  }\n";
    }
}

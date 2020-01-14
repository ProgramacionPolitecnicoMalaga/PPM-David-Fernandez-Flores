public class PorHoras extends Empleados {

    private int horasTrabajadas;
    private double salarioFinal;

    public PorHoras(String nombre,String apellido,String DNI){
        super(nombre, apellido, DNI);
    }
    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public void setSalarioFinal(double salarioFinal){
        this.salarioFinal = salarioFinal;
    }
    @Override
    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public void calcularSalarioPorHoras(PorHoras ph) {
        op.salarioPorHoras(ph);
    }

    @Override
    public String toString() {
        return "\n PorHoras { \n" +
                "   Nombre: "+getNombre()+" "+getApellido()+"\n"+
                "   DNI: "+getDNI()+"\n"+
                "   HorasTrabajadas: " + horasTrabajadas + "\n"+
                "   Salario: "+salarioFinal+"  }\n";
    }
}

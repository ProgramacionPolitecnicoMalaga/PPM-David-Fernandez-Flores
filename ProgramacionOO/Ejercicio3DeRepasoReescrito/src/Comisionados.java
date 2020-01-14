public class Comisionados extends Empleados{

    private int ventas;
    private double salarioFinal;

    public Comisionados(String nombre,String apellido,String DNI){
        super(nombre, apellido, DNI);
    }
    public int getVentas(){
        return ventas;
    }

    public void setSalarioFinal(double salarioFinal){
        this.salarioFinal = salarioFinal;
    }
    @Override
    public void calcularSalarioComisionados(Comisionados c) {
        op.salarioComisionados(c);
    }
    @Override
    public void setVentasComisionados(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "\n Comisionados { \n" +
                "   Nombre: "+getNombre()+" "+getApellido()+"\n"+
                "   DNI: "+getDNI()+"\n"+
                "   Ventas: " + ventas + "\n" +
                "   Salario: "+ salarioFinal + "  }\n";
    }
}

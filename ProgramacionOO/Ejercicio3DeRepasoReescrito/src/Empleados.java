public class Empleados {

    protected String nombre;
    protected String apellido;
    protected String DNI;
    protected static final double SALARIO_BASE = 950;
    protected static final double SUELDO_POR_HORA = 45;
    protected SalarioCalculator op = new SalarioCalculator();

    public Empleados(String nombre, String apellido, String DNI){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void calcularSalarioComisionados(Comisionados c){}
    public void calcularSalarioPorHoras(PorHoras ph){}
    public void calcularSalarioAsalariado(Asalariado ph){}
    public void setVentasComisionados(int ventas){}
    public void setHorasTrabajadas(int horasTrabajadas){}
}

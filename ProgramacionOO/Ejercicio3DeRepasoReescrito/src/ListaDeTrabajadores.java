import java.util.ArrayList;

public class ListaDeTrabajadores {

    private ArrayList<Empleados> listaDeEmpleados;

    public ListaDeTrabajadores(){
        listaDeEmpleados = new ArrayList<>();
    }
    public void añadirEmpleado(Empleados empleado){
        listaDeEmpleados.add(empleado);
    }

    @Override
    public String toString() {
        return " ListaDeTrabajadores { " + listaDeEmpleados + "  }\n";
    }
}

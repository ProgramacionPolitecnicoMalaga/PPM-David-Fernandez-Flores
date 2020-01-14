import java.util.Scanner;

public class InterfazUsuario {

    private int ventasRealizadas;
    private int horasTrabajadas;
    private Scanner lectorPantalla = new Scanner(System.in).useDelimiter("\n");

    public void pedirDatos(){
        System.out.println("  Ventas realizadas:   ");
        ventasRealizadas = lectorPantalla.nextInt();
        System.out.println("  Horas Trabajadas:   ");
        horasTrabajadas = lectorPantalla.nextInt();
    }
    public void valoresInicialesVentasHoras(Empleados comisionado, Empleados porHoras){
        pedirDatos();
        comisionado.setVentasComisionados(ventasRealizadas);
        porHoras.setHorasTrabajadas(horasTrabajadas);
    }
    public void conseguirAreaDeLasFiguras(Comisionados comisionados, PorHoras porHoras, Asalariado asalariado) {
        comisionados.calcularSalarioComisionados(comisionados);
        porHoras.calcularSalarioPorHoras(porHoras);
        asalariado.calcularSalarioAsalariado(asalariado);
    }

    public void adicionEnListaDeLasFigurasConSusAreas(ListaDeTrabajadores lista, Empleados comisionado, Empleados porHoras, Empleados asalariados) {
        lista.añadirEmpleado(comisionado);
        lista.añadirEmpleado(porHoras);
        lista.añadirEmpleado(asalariados);
    }
    public void mostrarLista(ListaDeTrabajadores listaDeTrabajadores){
        System.out.println(listaDeTrabajadores);
    }
}


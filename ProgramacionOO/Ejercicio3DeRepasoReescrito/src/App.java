public class App {
    public static void main(String[] args) {
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        ListaDeTrabajadores listaDeTrabajadores = new ListaDeTrabajadores();
        Empleados emp1 = new Comisionados("Aitor","Tilla","445887J");
        Empleados emp2 = new PorHoras("Encarna","Vales","223698O");
        Empleados emp3 = new Asalariado("Albeto","Mate","2154POO");

        interfazUsuario.valoresInicialesVentasHoras(emp1,emp2);
        interfazUsuario.conseguirSalarios((Comisionados)emp1,(PorHoras)emp2,(Asalariado)emp3);
        interfazUsuario.adicionEnListaDeEmpleados(listaDeTrabajadores,emp1,emp2,emp3);
        interfazUsuario.mostrarLista(listaDeTrabajadores);
    }
}

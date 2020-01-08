import java.util.Scanner;

/*Hacerlo con las clases INTERFAZ, COMERCIAL + VENTAS, Y EL MAIN.
 * con las operaciones hechas en el main pero tambien pueden hacerse en un OPERADOR.*/

public class App {
    public static void main(String[] args) {
        InterfazMenu menuPrincipalPrograma = new InterfazMenu();
        ComercialVentas comercial = new ComercialVentas();
        menuPrincipalPrograma.mostrarInterfazMenu();
        //System.out.println(comercial.getIsabel()[2]);

    }
}


package aplicacionVehiculosRequisados;

import java.util.Scanner;

public class Interfaz {

    Coches coche1 = new Coches(4,"1/2/97", "11989","78K",
            "Toyota","Yaris");
    Barcos barco1 = new Barcos(6,"4/8/02","2000","Plumbus");
    Camiones camion1 = new Camiones(9,"7/8/10","2001","P67K","Opel");
    Scanner lector = new Scanner(System.in).useDelimiter("\n");
    private int opcion;


   /* public void MenuEleccionOpcion(){
        System.out.println( "  1. Introducir un nuevo vehiculo en el depósito.\n" +
                            "  2. Poner vehiculo en subasta.\n" +
                            "  3. Registrar compradores autorizados.\n" +
                            "  4. Vender vehiculo subastado a un comprador autorizado por un precio y en una fecha.\n" +
                            "  5. Registrar un vehiculo como vendido.\n" +
                            "  6. Mostrar una lista de los vehiculos en el depósit.\no" +
                            "  7. Mostrar una lista de los vehiculos en espera de subasta.\n" +
                            "  8. Mostrar una lista de los vehiculos vendidos con el comprador, precio y fecha.");
        opcion = lector.nextInt();
    }
    public void EvaluacionDeLaOpcion(){
        switch (opcion){
            case 1: nuevoVehiculoEnDeposito(); break;
            case 2: vehiculoASubasta(); break;
            case 3: registrarCompradores(); break;
            case 4: venderVehiculoComprador(); break;
            case 5: registrarVehiculoComoVendido(); break;
            case 6: listaVehiculosDeposito(); break;
            case 7: listaVehiculosEnSubasta(); break;
            case 8: listaVehiculosVendidosCompradorVenta(); break;
            default: NotSuppotedAction();
        }
    }
    public void nuevoVehiculoEnDeposito(Coches coche1){
        listaVehiculosDeposito.añadirVehiculo(coche1);
    }
    public void NotSuppotedAction(){
        System.exit(1);
    }*/
    public void SetValoresInicialesDeLosVehiculos(){
        coche1.setLongitud(6); coche1.setAncho(4); coche1.setAltura(3.5);
        camion1.setLongitud(10); camion1.setAncho(5); camion1.setAltura(7.2);
        barco1.setManga(5); barco1.setCalado(8); barco1.setEslora(4);
    }
}
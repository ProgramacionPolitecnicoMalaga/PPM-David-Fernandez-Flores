import java.util.Scanner;

public class InterfazUsuario {
    ListaVehiculos listaVehiculos = new ListaVehiculos();
    ListaClientes listaClientes = new ListaClientes();
    OperacionCompraVenta operaciones = new OperacionCompraVenta();
    Cliente cliente1;
    Vehiculo vehiculo1;
    
    public void menu(int opcion, Scanner lectorOp){
        System.out.println(" 1. Insertar un vehiculo.\n" +
                " 2. Insertar un cliente.\n" +
                " 3. Realizar compra de un cliente.\n" +
                " 4. Realizar venta de un cliente.\n" +
                " 5. Ver saldo total de un cliente en el concesionario.\n"+
                " 6. Salir.");
        opcion = lectorOp.nextInt();
        evaluadorDeOpciones(opcion);
    }
    public void evaluadorDeOpciones(int opcion){
        switch (opcion){
            case 1: insertarVehiculo();
                break;
            case 2: insertarCliente();
                break;
            case 3: compraCliente();
                break;
            case 4: ventaCliente();
                break;
            case 5: saldoDeCliente();
                break;
            case 6: System.exit(1);
                break;
            default:
                break;
        }
    }

    private void saldoDeCliente() {
        double saldo;
        saldo = operaciones.getPrecioCompra() - operaciones.getPrecioVenta();
        System.out.println(" El saldo del cliente "+ cliente1 +"\n es de :   "+saldo+" \n\n\n");
    }

    private void ventaCliente() {
        operaciones.ventaDeVehiculo(cliente1, vehiculo1);
    }

    private void compraCliente() {
        operaciones.compraDeVehiculo(cliente1, vehiculo1);
    }

    private Cliente insertarCliente() {
        cliente1 = new Cliente("Francisco","Jones","777890G","221545483215");
        listaClientes.addCliente(cliente1);
        System.out.println(" Se ha agregado el siguiente cliente: \n"+ cliente1);
        return cliente1;
    }

    private Vehiculo insertarVehiculo() {
        vehiculo1 = new Vehiculo("Yaris","Toyota","rojo","01/02/03","Gasolina");
        listaVehiculos.addVehiculo(vehiculo1);
        System.out.println(" Se ha agregado el siguiente vehiculo: \n"+ vehiculo1);
        return vehiculo1;
    }
}

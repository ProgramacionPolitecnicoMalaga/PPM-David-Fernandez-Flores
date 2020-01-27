package aplicacionVehiculosRequisados;

public class App {
    public static void main(String[] args) {

        Interfaz interfaz = new Interfaz();
        ListaVehiculos listaVehiculosDeposito = new ListaVehiculos();
        ListaEnSubasta listaVehiculosEnSubasta = new ListaEnSubasta();
        ListaVehiculosVendidos listaVehiculosVendidos = new ListaVehiculosVendidos();
        Venta ventaCoche = new Venta(60.000,"7/8/2019");
        Venta ventaCamion = new Venta(100.000,"7/8/2019");
        Venta ventaBarco = new Venta(350.000,"7/8/2019");

        //SET DE LAS CARACTERISTICAS DE LOS VEHICULOS.
        interfaz.SetValoresInicialesDeLosVehiculos();

        //  1. INTRODUCIR NUEVOS VEHICULOS EN DEPOSITO.
        listaVehiculosDeposito.añadirVehiculo(interfaz.coche1);
        listaVehiculosDeposito.añadirVehiculo(interfaz.camion1);
        listaVehiculosDeposito.añadirVehiculo(interfaz.barco1);

        // 2. PONER VEHICULO EN SUBASTA.
        listaVehiculosEnSubasta.añadirVehiculoASubasta(interfaz.coche1);
        listaVehiculosEnSubasta.añadirVehiculoASubasta(interfaz.camion1);

        // 3. REGISTRAR COMPRADORES AUTORIZADOS.
        CompradorFisico comprador1 = new CompradorFisico("Aitor","Tilla","Fernandez","87920145J","C/ Piruleta");
        CompradorJuridico comprador2 = new CompradorJuridico("Encarna","Vales","Gomez","456978Q","EncaVehiculos");

        // 4. VENDER VEHICULO SUBASTADO A UN COMPRADOR POR UN PRECIO Y EN UNA FECHA.
        comprador1.compraVehiculo(interfaz.coche1);
        comprador2.compraVehiculo(interfaz.barco1);

        // 5. REGISTRAR VEHICULOS COMO VENDIDOS.
        listaVehiculosVendidos.añadirVehiculoVendido(interfaz.coche1);
        listaVehiculosVendidos.añadirVehiculoVendido(interfaz.barco1);

        // 6. LISTA DE COCHES EN DEPOSITO.
        System.out.println(listaVehiculosDeposito);

        // 7. LISTA DE COCHES EN ESPERA DE SUBASTA.
        System.out.println(listaVehiculosEnSubasta);

        // 8. LISTA DE VEHICULOS VENDIDOS Y A QUIEN CON PRECIO Y FECHA.
        System.out.println(listaVehiculosVendidos);
        //falta el precio y fecha
    }
}

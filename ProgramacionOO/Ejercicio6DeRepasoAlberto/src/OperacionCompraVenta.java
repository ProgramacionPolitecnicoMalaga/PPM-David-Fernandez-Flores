import java.util.Scanner;

public class OperacionCompraVenta {
    private double precio;
    private double precioVenta;
    private double precioCompra;
    private Scanner lector = new Scanner(System.in).useDelimiter("\n");

    public Compra compraDeVehiculo(Cliente cliente, Vehiculo vehiculo){
        precioCompra = preguntarPrecio();
        vehiculo.setPrecio(precioCompra);
        System.out.println(" El vehiculo "+vehiculo+" \nserá comprado del cliente "+cliente+" \n");
        Compra compra = new Compra(vehiculo, cliente);
        return compra;
    }

    public Venta ventaDeVehiculo(Cliente cliente, Vehiculo vehiculo){
        precioVenta = preguntarPrecio();
        vehiculo.setPrecio(precioVenta);
        System.out.println(" El vehiculo "+vehiculo+" \nserá vendido al cliente "+cliente+" \n");
        Venta venta = new Venta(vehiculo,cliente);
        return venta;
    }

    public double preguntarPrecio(){
        System.out.println(" ¿Por qué precio se ha comprado/vendido? \n");
        precio = lector.nextDouble();
        return precio;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
}

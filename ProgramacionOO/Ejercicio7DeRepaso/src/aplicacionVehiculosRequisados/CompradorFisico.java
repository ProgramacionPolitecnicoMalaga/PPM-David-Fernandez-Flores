package aplicacionVehiculosRequisados;

public class CompradorFisico extends Comprador{

    private String DNI;
    private String direccion;

    public CompradorFisico(String nombre, String apellido1, String apellido2, String DNI, String direccion){
        super(nombre,apellido1,apellido2);
        this.DNI = DNI;
        this.direccion = direccion;
    }
}

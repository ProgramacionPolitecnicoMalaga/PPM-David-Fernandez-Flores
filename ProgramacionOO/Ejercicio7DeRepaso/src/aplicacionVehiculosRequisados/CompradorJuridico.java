package aplicacionVehiculosRequisados;

public class CompradorJuridico extends Comprador{

    private String CIF;
    private String razonSocial;

    public CompradorJuridico(String nombre, String apellido1, String apellido2, String CIF, String razonSocial){
        super(nombre,apellido1,apellido2);
        this.CIF = CIF;
        this.razonSocial = razonSocial;
    }
}

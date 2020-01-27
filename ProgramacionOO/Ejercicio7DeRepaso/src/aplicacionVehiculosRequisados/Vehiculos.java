package aplicacionVehiculosRequisados;

public class Vehiculos {


    protected static final int VENDIDO = 0;
    protected static final int NO_VENDIDO = 1;

    protected int vendido;
    protected String respuestaVenta;
    private int numeroBastidor;
    private String fechaDeEntrada;
    private String fechaDeFabricacion;

    public int getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(int numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    public String getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setFechaDeEntrada(String fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public String getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(String fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }
    public void EvaluacionDeVenta(){
        switch (vendido){
            case VENDIDO: respuestaVenta = "VENDIDO"; break;
            case NO_VENDIDO: respuestaVenta = "NO HA SIDO VENDIDO"; break;
        }
    }
    public Vehiculos(int numeroBastidor, String fechaDeEntrada, String fechaDeFabricacion){
        this.numeroBastidor = numeroBastidor;
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeFabricacion = fechaDeFabricacion;
    }
}

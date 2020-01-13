package aplicacionVehiculosRequisados;

public class Barcos extends Vehiculos {

    private String nombre;
    private double eslora;
    private double calado;
    private double manga;

    public void setVendido(int vendido) {
        this.vendido = vendido;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setCalado(double calado) {
        this.calado = calado;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }

    public Barcos(int numeroBastidor, String fechaDeEntrada, String fechaDeFabricacion, String nombre){
        super(numeroBastidor,fechaDeEntrada,fechaDeFabricacion);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nBarcos{" + "\n" +
                " numBastidor: " + getNumeroBastidor() + "\n" +
                " fechaEntrada: " + getFechaDeEntrada() + "\n" +
                " fechaFabricacion: " + getFechaDeFabricacion() + "\n" +
                " nombre: " + nombre + "\n" +
                " eslora: " + eslora + "\n" +
                " calado: " + calado + "\n" +
                " manga: " + manga + "\n" +
                " ¿ha sido vendido? => " + respuestaVenta + " }\n";
    }
}

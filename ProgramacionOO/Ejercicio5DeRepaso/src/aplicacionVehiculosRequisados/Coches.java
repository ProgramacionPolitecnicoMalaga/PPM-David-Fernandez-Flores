package aplicacionVehiculosRequisados;

public class Coches extends Vehiculos {

    private String matricula;
    private String marca;
    private String modelo;
    private double ancho;
    private double altura;
    private double longitud;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public void setVendido(int vendido){
        this.vendido = vendido;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Coches(int numeroBastidor,String fechaDeEntrada,String fechaDeFabricacion,String matricula,String marca,String modelo) {
        super(numeroBastidor, fechaDeEntrada, fechaDeFabricacion);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nCoches{" + "\n" +
                " numBastidor: " + getNumeroBastidor() + "\n" +
                " fechaEntrada: " + getFechaDeEntrada() + "\n" +
                " fechaFabricacion: " + getFechaDeFabricacion() + "\n" +
                " matricula: " + matricula + "\n" +
                " marca: " + marca + "\n" +
                " modelo: " + modelo + "\n" +
                " ancho: " + ancho + "\n" +
                " altura: " + altura + "\n" +
                " longitud: " + longitud + "\n" +
                " ¿ha sido vendido? => " + respuestaVenta + " }\n";
    }
}
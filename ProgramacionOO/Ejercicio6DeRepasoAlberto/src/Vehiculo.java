import java.text.SimpleDateFormat;

public class Vehiculo {
    private String modelo;
    private String marca;
    private String color;
    private String fechaFabricacion;
    private String combustion;
    private String estado;
    private double precio;

    public Vehiculo(String modelo,String marca,String color,String fechaFabricacion,String combustion,String estado){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.fechaFabricacion = fechaFabricacion;
        this.combustion = combustion;
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getCombustion() {
        return combustion;
    }

    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " \nVehiculo {\n" +
                "  modelo: " + modelo + "\n" +
                "  marca: " + marca + "\n" +
                "  color: " + color + "\n" +
                "  fechaFabricacion: " + fechaFabricacion + "\n" +
                "  combustion: " + combustion + "\n" +
                "  estado: " + estado + "\n" +
                "  precio: " + precio + "\n" +
                '}';
    }
}

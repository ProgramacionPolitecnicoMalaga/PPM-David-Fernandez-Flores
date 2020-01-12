package figurasgeometricas;

public class Cuadrado extends Figuras{

    private String color;
    private double lado;
    Area areaCuadrado;

    public Cuadrado(String nombre,String color){
        super(nombre);
        this.color = color;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setAreaCuadrado(Area areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Cuadrado { " + "\n" +
                "Color: " + color + "\n" +
                "Lado: " + lado + "\n"
                + areaCuadrado +
                '}';
    }
}

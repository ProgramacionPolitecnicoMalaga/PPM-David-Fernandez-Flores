package figurasgeometricas;

public class Circulo extends Figuras{

    private String color;
    private double radio;
    Area areaCirculo;

    public Circulo(String nombre,String color){
        super(nombre);
        this.color = color;
    }

    public void setAreaCirculo(Area areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo { " + "\n" +
                "Color='" + color + "\n"
                + "Radio: " + radio + "\n"
                + areaCirculo +
                '}';
    }
}

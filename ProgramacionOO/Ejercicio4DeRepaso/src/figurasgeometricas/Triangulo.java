package figurasgeometricas;

public class Triangulo extends Figuras{

    private String color;
    private double base;
    private double altura;
    Area areaTriangulo;

    public Triangulo(String nombre, String color){
        super(nombre);
        this.color = color;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public void setAreaTriangulo(Area areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    @Override
    public String toString() {
        return "Triangulo { " + "\n" +
                "Color: " + color +"\n"
                +"Base: " + base + "\n"
                +"Altura: " + altura + "\n"
                + areaTriangulo + " } \n";
    }
}

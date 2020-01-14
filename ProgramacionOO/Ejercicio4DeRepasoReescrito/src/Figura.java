public class Figura {

    private String nombre;
    private String color;
    protected CalculoDeArea op = new CalculoDeArea();

    public Figura(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }
    public void getAreaCirculo(Circulo c){}
    public void getAreaCuadrado(Cuadrado c){}
    public void getAreaTriangulo(Triangulo t){}
    public void setBase(double base){}
    public  void setLado(double lado){}
    public  void setAltura(double altura){}
    public  void setRadio(double radio){}
}

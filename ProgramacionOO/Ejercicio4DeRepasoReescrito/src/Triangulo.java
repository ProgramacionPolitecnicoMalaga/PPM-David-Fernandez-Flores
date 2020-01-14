public class Triangulo extends Figura {

    private double base;
    private double altura;
    private Area area;

    public Triangulo(String nombre, String color){
        super(nombre, color);
    }
    @Override
    public void getAreaTriangulo(Triangulo t) {
        op.areaTriangulo(t);
    }
    @Override
    public void setBase(double base){
        this.base = base;
    }
    @Override
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setArea(Area area){
        this.area = area;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    @Override
    public String toString() {
        return "\n Triangulo {\n" +
                "  base: "+base+"\n"+
                "  altura: "+altura+"\n"+
                "  area: "+area+"  }\n";
    }
}

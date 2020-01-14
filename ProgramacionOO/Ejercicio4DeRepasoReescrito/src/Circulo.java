public class Circulo extends Figura{

    private double radio;
    private Area area;

    public Circulo(String nombre, String color){
        super(nombre,color);
    }
    @Override
    public void getAreaCirculo(Circulo c) {
        op.areaCirculo(c);
    }
    @Override
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }

    @Override
    public String toString() {
        return "\n Circulo {\n" +
                "  radio: "+radio+"\n"+
                "  area: "+area+"  }\n";
    }

    public void setArea(Area area){
        this.area = area;
    }
}

public class Cuadrado extends Figura {

    private double lado;
    private Area areaCuad;

    public Cuadrado(String nombre, String color){
        super(nombre, color);
    }
    @Override
    public void getAreaCuadrado(Cuadrado c) {
        op.areaCuadrado(c);
    }
    @Override
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    public void setArea(Area area){
        this.areaCuad = area;
    }

    @Override
    public String toString() {
        return "\n Cuadrado {\n" +
                "  lado: "+lado+"\n"+
                "  areaCuad: "+areaCuad+"  }\n";
    }
}

public class CalculoDeArea {

    public CalculoDeArea(){}

    public Cuadrado areaCuadrado(Cuadrado cuadrado){
        double resultado = Math.pow(cuadrado.getLado(),2);
        Area areaCuadrado = new Area(resultado);
        cuadrado.setArea(areaCuadrado);
        return cuadrado;
    }
    public Triangulo areaTriangulo(Triangulo triangulo){
        double resultado = (triangulo.getBase()*triangulo.getAltura())/2;
        Area areaTriangulo = new Area(resultado);
        triangulo.setArea(areaTriangulo);
        return triangulo;
    }
    public Circulo areaCirculo(Circulo circulo){
        double resultado = (Math.PI * Math.pow(circulo.getRadio(),2));
        Area areaCirculo = new Area(resultado);
        circulo.setArea(areaCirculo);
        return circulo;
    }
}

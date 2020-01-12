package figurasgeometricas;

import java.text.DecimalFormat;

public class AreaGenerator {

    public AreaGenerator(){}

    public Triangulo calculoAreaTriagulo(Triangulo triangulo){
        double resultado = (triangulo.getBase()*triangulo.getAltura()) / 2;
        Area areaTriangulo = new Area(resultado);
        triangulo.setAreaTriangulo(areaTriangulo);
        return triangulo;
    }
    public Cuadrado calculoAreaCuadrado(Cuadrado cuadrado){
        double resultado = Math.pow(cuadrado.getLado(),2);
        Area areaCuadrado = new Area(resultado);
        cuadrado.setAreaCuadrado(areaCuadrado);
        return cuadrado;
    }
    public Circulo calcularAreaCirculo(Circulo circulo){
        double resultado = Math.PI * (Math.pow(circulo.getRadio(),2));
        Area areaCirculo = new Area(resultado);
        circulo.setAreaCirculo(areaCirculo);
        return circulo;
    }
}

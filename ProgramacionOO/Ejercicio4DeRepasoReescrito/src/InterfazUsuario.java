import java.util.Scanner;

public class InterfazUsuario {

    private double base;
    private double altura;
    private double radio;
    private double lado;
    private Scanner lectorPantalla = new Scanner(System.in).useDelimiter("\n");

    public void preguntarDatos() {
        System.out.println("  Base del triangulo: ");
        base = lectorPantalla.nextDouble();
        System.out.println("  Altura del triangulo: ");
        altura = lectorPantalla.nextDouble();
        System.out.println("  Lado del cuadrado: ");
        lado = lectorPantalla.nextDouble();
        System.out.println("  Radio del circulo");
        radio = lectorPantalla.nextDouble();
    }

    public void valoresInicialesFiguras(Figura cuadrado, Figura circulo, Figura triangulo) {
        preguntarDatos();
        circulo.setRadio(radio);
        cuadrado.setLado(lado);
        triangulo.setBase(base);
        triangulo.setAltura(altura);
    }

    public void conseguirAreaDeLasFiguras(Cuadrado cuadrado, Circulo circulo, Triangulo triangulo) {
        cuadrado.getAreaCuadrado(cuadrado);
        circulo.getAreaCirculo(circulo);
        triangulo.getAreaTriangulo(triangulo);
    }

    public void adicionEnListaDeLasFigurasConSusAreas(ListaDeFiguras listaDeFigurasIniciales, Figura cuadrado, Figura circulo, Figura triangulo) {
        listaDeFigurasIniciales.añadirFigura(cuadrado);
        listaDeFigurasIniciales.añadirFigura(circulo);
        listaDeFigurasIniciales.añadirFigura(triangulo);
    }
    public void mostrarLista(ListaDeFiguras listaDeFigurasIniciales){
        System.out.println(listaDeFigurasIniciales);
    }
}

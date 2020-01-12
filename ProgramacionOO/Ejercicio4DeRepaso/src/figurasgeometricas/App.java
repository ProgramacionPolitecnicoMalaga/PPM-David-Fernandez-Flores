package figurasgeometricas;

public class App {
    public static void main(String[] args) {
        //INICIALIZACION DE CLASES
        Cuadrado fig0 = new Cuadrado("Cuadrado01","Rojo");
        Triangulo fig1 = new Triangulo("Triangulo01","Azul");
        Circulo fig2 = new Circulo("Circulo01","Verde");
        ListaFiguras ListaFigurasGeometricas = new ListaFiguras();
        AreaGenerator areaGenerator = new AreaGenerator();

        //INDICAR LOS LADOS Y BASES PARA EL CALCULO DE AREAS
        fig0.setLado(4);
        fig1.setBase(6);
        fig1.setAltura(3);
        fig2.setRadio(5);

        //CALCULAR AREAS
        areaGenerator.calculoAreaCuadrado(fig0);
        areaGenerator.calculoAreaTriagulo(fig1);
        areaGenerator.calcularAreaCirculo(fig2);

        //INTRODUCCION DE LAS FIGURAS EN EL ARRAYLIST
        ListaFigurasGeometricas.addFigura(fig0);
        ListaFigurasGeometricas.addFigura(fig1);
        ListaFigurasGeometricas.addFigura(fig2);

        //IMPRIMIR EN PANTALLA EL CONTENIDO DE LA LISTA
        System.out.println(ListaFigurasGeometricas);
    }
}

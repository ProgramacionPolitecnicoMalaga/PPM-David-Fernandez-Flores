public class App {

    public static void main(String[] args) {
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        ListaDeFiguras listaDeFigurasIniciales = new ListaDeFiguras();
        Figura circulo = new Circulo("Circulo01","Gris");
        Figura cuadrado = new Cuadrado("Cuadrado01","Amarillo");
        Figura triangulo = new Triangulo("Triangulo01","Azul");

        interfazUsuario.valoresInicialesFiguras(cuadrado,circulo,triangulo);
        interfazUsuario.conseguirAreaDeLasFiguras((Cuadrado) cuadrado, (Circulo) circulo, (Triangulo) triangulo);
        interfazUsuario.adicionEnListaDeLasFigurasConSusAreas(listaDeFigurasIniciales,cuadrado,circulo,triangulo);
        interfazUsuario.mostrarLista(listaDeFigurasIniciales);
    }
}

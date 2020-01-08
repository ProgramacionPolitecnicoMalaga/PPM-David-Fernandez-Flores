import java.text.DecimalFormat;
import java.util.Scanner;

public class InterfazMenu {

    private static final int MILIMETROS=1;
    private static final int CENTIMETROS=2;
    private static final int METROS=3;
    private static final int CAT_CAT=1;
    private static final int CAT_HIP=2;
    private static final int AR_CAT_HIP=3;
    private static final int AR_CAT_CAT=4;

    private Scanner lectorTeclado = new Scanner(System.in);
    private int opcion1, opcion2;
    private String unidadMedida;
    private double catetoPrimero, catetoSegundo;
    private double hipotenusa;
    private double area;
    private double resultado;
    private GestorDeOperaciones operaciones = new GestorDeOperaciones();
    private DecimalFormat formateador = new DecimalFormat("###.##");

    public void mostrarMenuUnidades(){
        System.out.println("  Indique la unidad de medida a ser utilizada:");
        System.out.println( "   1. mm.");
        System.out.println( "   2. cm.");
        System.out.println( "   3. m.");
        System.out.println( " Introduzca una opcion:");
        opcion1 = lectorTeclado.nextInt();
        eleccionUnidad();
        mostrarMenuOpciones();
    }
    private void mostrarMenuOpciones() {
        System.out.println("  ¿Qué operación desea realizar?");
        System.out.println("    1. Calcular la hipotenusa de un triángulo a partir de sus catetos.");
        System.out.println("    2. Calcular un cateto de un triángulo a partir de el otro cateto y la hipotenusa.");
        System.out.println("    3. Calcular el área de un triángulo a partir un cateto y la hipotenusa");
        System.out.println("    4. Calcular el área de un triángulo a partir de dos catetos.");
        System.out.println("  Introduzca su opcion.");
        opcion2 = lectorTeclado.nextInt();
        eleccionDeOperacion();
    }
    private void eleccionDeOperacion() {
        switch (opcion2){
            case CAT_CAT: Operacion1(); break;
            case CAT_HIP: Operacion2(); break;
            case AR_CAT_HIP: Operacion3(); break;
            case AR_CAT_CAT: Operacion4(); break;
            default: NotSupportedOption();
        }
    }
    private void NotSupportedOption() {
        System.out.println("No es posible realizar esta opcion, por favor reescriba una opcion valida a continuacion:");
        opcion2 = lectorTeclado.nextInt();
        eleccionDeOperacion();
    }

    public void eleccionUnidad(){
        switch (opcion1){
            case MILIMETROS: unidadMedida="mm"; break;
            case CENTIMETROS: unidadMedida="cm"; break;
            case METROS: unidadMedida="m"; break;
            default: NotSupportedAction();
        }
    }
    private void NotSupportedAction() {
        System.out.println(" Esa opción no es válida y por tanto se usarán unidades (u)");
        unidadMedida = "unidades";
    }
    public void pedirCatetoPrimero(){
        System.out.println("  Introduzca el valor del Cateto:  ");
        catetoPrimero = lectorTeclado.nextDouble();
    }
    public void pedirCatetoSegundo(){
        System.out.println("  Introduzca el valor del Cateto:  ");
        catetoSegundo = lectorTeclado.nextDouble();
    }
    public void pedirHipotenusa(){
        System.out.println("  Introduzca el valor de la hipotenusa: ");
        hipotenusa = lectorTeclado.nextDouble();
    }
    public void Operacion1(){
        pedirCatetoPrimero();
        pedirCatetoSegundo();
        hipotenusa = operaciones.OperacionHipotenusaAPartirDeDosCatetos(catetoPrimero,catetoSegundo);
        resultado = hipotenusa;
        mostrarResultados();
    }
    public void Operacion2(){
        pedirCatetoPrimero();
        pedirHipotenusa();
        catetoSegundo = operaciones.OperacionCatetoAPartirDeHipotenusaYCateto(catetoPrimero, hipotenusa);
        resultado = catetoSegundo;
        mostrarResultados();
    }
    public void Operacion3(){
        pedirCatetoPrimero();
        pedirHipotenusa();
        area = operaciones.AreaAPartirDeCatetoEHipotenusa(catetoPrimero,hipotenusa,area);
        resultado = area;
        mostrarResultados();
    }
    public void Operacion4(){
        pedirCatetoPrimero();
        pedirCatetoSegundo();
        area = operaciones.AreaAPartirDeDosCatetos(catetoPrimero,catetoSegundo);
        resultado = area;
        mostrarResultados();
    }
    private void mostrarResultados() {
        System.out.println("  El resultado es :  "+formateador.format(resultado)+" "+unidadMedida);
    }
}

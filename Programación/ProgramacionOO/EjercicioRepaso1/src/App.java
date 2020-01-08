import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int opcion1 = 0, opcion2 = 0;
        double hipotenusa, catetoPrimero, catetoSegundo, area;
        Scanner lectorTeclado = new Scanner(System.in);
        String unidadMedida = "";
        DecimalFormat formateador = new DecimalFormat("###.##");

        System.out.println("  Indique la unidad de medida a ser utilizada:");
        System.out.println( "   1. mm.");
        System.out.println( "   2. cm.");
        System.out.println( "   3. m.");
        System.out.println( " Introduzca una opcion:");

        opcion1 = lectorTeclado.nextInt();

        if (opcion1 == 1){
            unidadMedida = "mm";
        }
        if (opcion1 == 2){
            unidadMedida = "cm";
        }
        if (opcion1 == 3){
            unidadMedida = "m";
        }
        else{
            System.out.println("  El valor introducido no es válido");
        }

        System.out.println("  ¿Qué operación desea realizar?");
        System.out.println("    1. Calcular la hipotenusa de un triángulo a partir de sus catetos.");
        System.out.println("    2. Calcular un cateto de un triángulo a partir de el otro cateto y la hipotenusa.");
        System.out.println("    3. Calcular el área de un triángulo a partir un cateto y la hipotenusa");
        System.out.println("    4. Calcular el área de un triángulo a partir de dos catetos.");
        System.out.println("  Introduzca su opcion.");

        opcion2 = lectorTeclado.nextInt();

        if (opcion2 == 1){
            System.out.println(" Cateto primero :  ");
            catetoPrimero = lectorTeclado.nextDouble();
            System.out.println(" Cateto segundo :  ");
            catetoSegundo = lectorTeclado.nextDouble();

            double temp = (Math.pow(catetoPrimero,2) + Math.pow(catetoSegundo,2));
            hipotenusa = Math.sqrt(temp);

            System.out.println("  Hipotenusa :  "+formateador.format(hipotenusa)+" "+unidadMedida);
        }
        if (opcion2 == 2){
            System.out.println(" Cateto primero :  ");
            catetoPrimero = lectorTeclado.nextDouble();
            System.out.println(" Hipotenusa :  ");
            hipotenusa = lectorTeclado.nextDouble();

            double temp = (Math.pow(hipotenusa,2) - Math.pow(catetoPrimero,2));
            catetoSegundo = Math.sqrt(temp);

            System.out.println("  Cateto restante :  "+formateador.format(catetoSegundo)+" "+unidadMedida);
        }
        if (opcion2 == 3){
            System.out.println(" Cateto primero :  ");
            catetoPrimero = lectorTeclado.nextDouble();
            System.out.println(" Hipotenusa :  ");
            hipotenusa = lectorTeclado.nextDouble();

            double temp = (Math.pow(hipotenusa,2) - Math.pow(catetoPrimero,2));
            catetoSegundo = Math.sqrt(temp);
            area = (catetoPrimero*catetoSegundo)/2;

            System.out.println("  El área del triangulo es de :  "+formateador.format(area)+" "+unidadMedida);
        }
        if (opcion2 == 4){
            System.out.println(" Cateto primero :  ");
            catetoPrimero = lectorTeclado.nextDouble();
            System.out.println(" Cateto segundo :  ");
            catetoSegundo = lectorTeclado.nextDouble();

            area = (catetoPrimero*catetoSegundo)/2;

            System.out.println("  El area del triangulo será :  "+formateador.format(area)+" "+unidadMedida);
        }
    }
}

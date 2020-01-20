import java.util.Scanner;

public class MenuIdioma {

    public static String pedirIdioma(){
        Scanner lector = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  Introduzca el idioma que desea utilizar (es|en|it|ma|epo)");
        return lector.next();
    }
}

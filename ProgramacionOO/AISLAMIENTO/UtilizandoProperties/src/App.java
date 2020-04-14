import politecnicomalaga.configuracion.GestorProperties;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        GestorProperties gestor = new GestorProperties();
        Scanner lector = new Scanner(System.in);
        System.out.println("Nombre propertie :  ");
        String nombre = lector.nextLine();
        System.out.println("Valor propertie :  ");
        String value = lector.nextLine();
        gestor.setPropertie(nombre,value);
        gestor.guardar();
    }
}

package Vista;

import Factory.DesiertoEnvironment;
import Factory.EspacioEnvironment;
import Factory.GeneradorDeEntorno;
import Factory.SelvaEnvironment;

import java.util.Scanner;

public class SelectorDeJuego {

    private static final int SELVA = 1;
    private static final int DESIERTO = 2;
    private static final int ESPACIO = 3;

    private Scanner lector;

    public SelectorDeJuego(){
        lector = new Scanner(System.in).useDelimiter("\n");
    }

    public int opcionesDisponibles(){
        System.out.println("\n Elija entre los siguentes mapas : \n" +
                "    1). Selva\n" +
                "    2). Desierto\n" +
                "    3). Espacio\n " +
                " Su opción: ");
        return lector.nextInt();
    }

    public GeneradorDeEntorno generarEntorno(){
        GeneradorDeEntorno entorno = null;
        int opcion = opcionesDisponibles();
        switch (opcion){
            case SELVA: entorno = new SelvaEnvironment(); break;
            case DESIERTO: entorno = new DesiertoEnvironment(); break;
            case ESPACIO: entorno = new EspacioEnvironment(); break;
        }
        return entorno;
    }
}

import java.util.Scanner;

public class AppConcesionario {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner lectorOp = new Scanner(System.in).useDelimiter("\n");
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        while(opcion < 6){
            interfazUsuario.menu(opcion,lectorOp);
        }
    }
}

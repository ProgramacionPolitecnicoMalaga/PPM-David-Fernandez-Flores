import com.politecnico.operaciones.Multiplicacion;

public class App {
    public static void main(String[] args) {

        // Instanciacion del otro proyecto
        Multiplicacion mult = new Multiplicacion();
        
        // Tabla del 2
        for (int i=0; i<11; i++){
            System.out.println(mult.multiplicar(i,2));
        }
    }
}

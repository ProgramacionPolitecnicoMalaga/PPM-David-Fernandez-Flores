import java.util.ArrayList;

public class Trabajadores {

    private ArrayList<Trabajador> trabajadores;

    public Trabajadores(){
        trabajadores = new ArrayList<>();
    }

    public void add (Trabajador tr){
        trabajadores.add(tr);
    }

    public void rmv (Trabajador tr){
        trabajadores.remove(tr);
    }

    @Override
    public String toString() {
        return "\n" + trabajadores + "\n";
    }
}

import java.util.ArrayList;

public class ListaVehiculos {

    private ArrayList<Vehiculo> listaVehiculos;

    public ListaVehiculos(){
        listaVehiculos = new ArrayList<Vehiculo>();
    }
    public void addVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }
    public void removeVehiculo(Vehiculo vehiculo){
        listaVehiculos.remove(vehiculo);
    }
}

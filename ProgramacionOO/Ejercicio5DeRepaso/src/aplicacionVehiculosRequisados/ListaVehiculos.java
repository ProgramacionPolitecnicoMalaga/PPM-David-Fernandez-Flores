package aplicacionVehiculosRequisados;

import java.util.ArrayList;

public class ListaVehiculos {

    private ArrayList<Vehiculos> listaVehiculos;

    public ListaVehiculos(){
        listaVehiculos = new ArrayList<>();
    }
    public void añadirVehiculo(Vehiculos vehiculo){
        listaVehiculos.add(vehiculo);
    }
    public void eliminarVehiculo(Vehiculos vehiculo){
        listaVehiculos.remove(vehiculo);
    }

    @Override
    public String toString() {
        return "ListaVehiculos:  \n" + listaVehiculos + '}';
    }
}

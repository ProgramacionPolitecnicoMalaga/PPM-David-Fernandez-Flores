package aplicacionVehiculosRequisados;

import javafx.scene.control.skin.SplitMenuButtonSkin;

import java.util.ArrayList;

public class ListaEnSubasta {

    private ArrayList<Vehiculos> vehiculosEnSubasta;
    ListaVehiculos listaVehiculosDisponibles;

    public ListaEnSubasta(){
        vehiculosEnSubasta = new ArrayList<>();
        listaVehiculosDisponibles = new ListaVehiculos();
    }
    public void añadirVehiculoASubasta(Vehiculos vehiculoActual){
        listaVehiculosDisponibles.eliminarVehiculo(vehiculoActual);
        vehiculosEnSubasta.add(vehiculoActual);
    }
    public void eliminarVehiculoDeSubasta(Vehiculos vehiculoActual){
        vehiculosEnSubasta.remove(vehiculoActual);
    }

    @Override
    public String toString() {
        return "ListaEnSubasta {\n" +  vehiculosEnSubasta + "\n" +
                '}';
    }
}

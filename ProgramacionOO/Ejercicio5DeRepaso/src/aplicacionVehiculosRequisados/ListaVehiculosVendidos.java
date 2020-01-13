package aplicacionVehiculosRequisados;

import java.util.ArrayList;

public class ListaVehiculosVendidos {

    private ArrayList<Vehiculos> listaVehiculosVendidos;
    ListaEnSubasta listaEnSubasta;

    public ListaVehiculosVendidos(){
        listaVehiculosVendidos = new ArrayList<>();
        listaEnSubasta = new ListaEnSubasta();
    }
    public void añadirVehiculoVendido(Vehiculos vehiculoVendido){
        listaEnSubasta.eliminarVehiculoDeSubasta(vehiculoVendido);
        listaVehiculosVendidos.add(vehiculoVendido);
    }

    @Override
    public String toString() {
        return "ListaVehiculosVendidos { \n" + listaVehiculosVendidos + "\n" +
                '}';
    }
}

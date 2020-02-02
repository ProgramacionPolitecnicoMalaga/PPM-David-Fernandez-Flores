import java.util.ArrayList;

public class ListaClientes {

    private ArrayList<Cliente> listaCliente;

    public ListaClientes(){
        listaCliente = new ArrayList<Cliente>();
    }
    public void addCliente(Cliente cliente){
        listaCliente.add(cliente);
    }
    public void removeCliente(Cliente cliente){
        listaCliente.remove(cliente);
    }
}

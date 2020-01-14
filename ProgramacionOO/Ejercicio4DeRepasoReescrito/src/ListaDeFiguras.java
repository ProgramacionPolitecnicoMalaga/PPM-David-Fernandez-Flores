import java.util.ArrayList;

public class ListaDeFiguras {

    private ArrayList<Figura> listaDeFiguras;

    public ListaDeFiguras(){
        listaDeFiguras = new ArrayList<>();
    }
    public void añadirFigura(Figura figura){
        listaDeFiguras.add(figura);
    }

    @Override
    public String toString() {
        return "\n  ListaDeFiguras {\n" +
                    listaDeFiguras +"\n }";
    }
}

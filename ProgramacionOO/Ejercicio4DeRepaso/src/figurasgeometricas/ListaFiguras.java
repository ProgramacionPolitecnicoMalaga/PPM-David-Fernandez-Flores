package figurasgeometricas;

import java.util.ArrayList;

public class ListaFiguras {

    private ArrayList<Figuras> listaFiguras;

    public ListaFiguras(){
        this.listaFiguras = new ArrayList<>();
    }

    public void addFigura(Figuras figuraGeometrica){
        listaFiguras.add(figuraGeometrica);
    }


    @Override
    public String toString() {
        return "ListaFiguras {\n " + listaFiguras + '}';
    }
}

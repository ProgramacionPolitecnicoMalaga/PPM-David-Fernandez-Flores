package Modelo.Villanos;

public class KhanVillain implements Villano{

    public static final String nombreVillano ="Khan";

    @Override
    public String getNombreVillano() {
        return nombreVillano;
    }

    @Override
    public String toString() {
        return nombreVillano;
    }
}

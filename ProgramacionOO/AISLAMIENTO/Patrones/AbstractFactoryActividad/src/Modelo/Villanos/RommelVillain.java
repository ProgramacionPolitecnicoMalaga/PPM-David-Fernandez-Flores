package Modelo.Villanos;

public class RommelVillain implements Villano {

    public static final String nombreVillano = "Rommel";

    @Override
    public String getNombreVillano() {
        return nombreVillano;
    }

    @Override
    public String toString() {
        return nombreVillano;
    }
}

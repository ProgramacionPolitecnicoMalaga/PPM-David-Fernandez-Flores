package Modelo.Villanos;

public class MolaRamVillain implements Villano {

    public static final String nombreVillano = "Mola Ram";

    @Override
    public String getNombreVillano() {
        return nombreVillano;
    }

    @Override
    public String toString() {
        return nombreVillano;
    }
}

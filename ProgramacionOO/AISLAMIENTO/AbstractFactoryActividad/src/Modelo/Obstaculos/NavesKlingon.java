package Modelo.Obstaculos;

public class NavesKlingon implements Obstaculo {

    public static final String nombreObstaculo = "Naves Klingon";

    @Override
    public String getNombreObstaculo() {
        return nombreObstaculo;
    }

    @Override
    public String toString() {
        return nombreObstaculo;
    }
}

package Modelo.Obstaculos;

public class Tanques implements Obstaculo {

    public static final String nombreObstaculo = "Tanques";

    @Override
    public String getNombreObstaculo() {
        return nombreObstaculo;
    }

    @Override
    public String toString() {
        return nombreObstaculo;
    }
}

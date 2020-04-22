package Modelo.Obstaculos;

public class CarceleroTurco implements Obstaculo {

    public static final String nombreObstaculo = "Carcelero Turco";

    @Override
    public String getNombreObstaculo() {
        return "Carcelero Turco";
    }

    @Override
    public String toString() {
        return nombreObstaculo;
    }
}

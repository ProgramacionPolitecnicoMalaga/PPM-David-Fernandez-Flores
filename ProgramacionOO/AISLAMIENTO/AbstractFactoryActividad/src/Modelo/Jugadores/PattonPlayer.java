package Modelo.Jugadores;

public class PattonPlayer implements Jugador {

    public static final String nombreJugador = "Patton";

    @Override
    public String getNombre() {
        return nombreJugador;
    }

    @Override
    public String toString() {
        return nombreJugador;
    }
}

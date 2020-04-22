package Modelo.Jugadores;

public class IndianaPlayer implements Jugador {

    public static final String nombreJugador = "Indiana Jones";

    @Override
    public String getNombre() {
        return nombreJugador;
    }

    @Override
    public String toString() {
        return nombreJugador;
    }
}

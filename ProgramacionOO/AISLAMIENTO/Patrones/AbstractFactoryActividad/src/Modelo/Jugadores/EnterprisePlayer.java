package Modelo.Jugadores;

public class EnterprisePlayer implements Jugador {

    public static final String nombreJugador = "USSEnterprise";

    @Override
    public String getNombre() {
        return nombreJugador;
    }

    @Override
    public String toString() {
        return nombreJugador;
    }
}

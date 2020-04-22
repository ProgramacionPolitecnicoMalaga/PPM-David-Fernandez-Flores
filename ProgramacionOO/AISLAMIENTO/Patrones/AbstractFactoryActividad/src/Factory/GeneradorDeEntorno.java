package Factory;

import Modelo.Jugadores.Jugador;
import Modelo.Obstaculos.Obstaculo;
import Modelo.Villanos.Villano;

public interface GeneradorDeEntorno {
    public Jugador crearJugador();
    public Villano crearVillano();
    public Obstaculo crearObstáculo();
}

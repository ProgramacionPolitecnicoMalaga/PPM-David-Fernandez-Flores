package Factory;

import Modelo.Jugadores.Jugador;
import Modelo.Jugadores.PattonPlayer;
import Modelo.Obstaculos.Obstaculo;
import Modelo.Obstaculos.Tanques;
import Modelo.Villanos.RommelVillain;
import Modelo.Villanos.Villano;

public class DesiertoEnvironment implements GeneradorDeEntorno {
    @Override
    public Jugador crearJugador() {
        return new PattonPlayer();
    }

    @Override
    public Villano crearVillano() {
        return new RommelVillain();
    }

    @Override
    public Obstaculo crearObstáculo() {
        return new Tanques();
    }
}

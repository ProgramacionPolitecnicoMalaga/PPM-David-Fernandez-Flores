package Factory;

import Modelo.Jugadores.IndianaPlayer;
import Modelo.Jugadores.Jugador;
import Modelo.Obstaculos.CarceleroTurco;
import Modelo.Obstaculos.Obstaculo;
import Modelo.Villanos.MolaRamVillain;
import Modelo.Villanos.Villano;

public class SelvaEnvironment implements GeneradorDeEntorno {
    @Override
    public Jugador crearJugador() {
        return new IndianaPlayer();
    }

    @Override
    public Villano crearVillano() {
        return new MolaRamVillain();
    }

    @Override
    public Obstaculo crearObstáculo() {
        return new CarceleroTurco();
    }
}

package Factory;

import Modelo.Jugadores.EnterprisePlayer;
import Modelo.Jugadores.Jugador;
import Modelo.Obstaculos.NavesKlingon;
import Modelo.Obstaculos.Obstaculo;
import Modelo.Villanos.KhanVillain;
import Modelo.Villanos.Villano;

public class EspacioEnvironment implements GeneradorDeEntorno {
    @Override
    public Jugador crearJugador() {
        return new EnterprisePlayer();
    }

    @Override
    public Villano crearVillano() {
        return new KhanVillain();
    }

    @Override
    public Obstaculo crearObstáculo() {
        return new NavesKlingon();
    }
}

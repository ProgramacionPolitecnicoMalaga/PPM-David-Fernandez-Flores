import Factory.GeneradorDeEntorno;
import Modelo.Jugadores.Jugador;
import Modelo.Obstaculos.Obstaculo;
import Modelo.Villanos.Villano;
import Vista.SelectorDeJuego;

public class App {
    public static void main(String[] args) {
        SelectorDeJuego selector = new SelectorDeJuego();
        GeneradorDeEntorno entorno = selector.generarEntorno();
        Jugador jugador = entorno.crearJugador();
        Villano villano = entorno.crearVillano();
        Obstaculo obstaculo = entorno.crearObstáculo();
        System.out.println("Jugador :   "+jugador);
        System.out.println("Villano :   "+villano);
        System.out.println("Obstaculo :   "+obstaculo);
    }
}

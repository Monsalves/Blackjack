package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;
import BlackJack.Carta;
import BlackJack.*;
public class BlackJack {
    private ArrayList<Carta> mazo_blackjack = new ArrayList<Carta>(0);
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();


    public void menu() {
        System.out.println("Bienvenido al mejor juego de BLackJack de toda el área lacustre");
        System.out.println("Somos el juego número uno en diversos países tales como:");
        System.out.println("Birminia,Nepal, Irak y próximamente en Chile!!!");
    }

    public void jugar(String nombre) {
        menu();
        crearMazo();
        crearJugador(nombre);
        crearJugadorBot();
        repartirCartas();
        mostrarJugadores();
        asignarPuntaje();
        verGanador();


    }

    public void crearJugador(String nombre) {
        Jugador jugador = new Jugador(nombre);
        jugadores.add(jugador);
    }

    public void crearJugadorBot() {
        Jugador jugador = new Jugador("botardo");
        jugadores.add(jugador);
    }

    public void crearMazo() {
        Baraja baraja = new Baraja();
        baraja.llenarMazo();
        baraja.mezclarMazo();
        mazo_blackjack = baraja.getMazo();

    }

    public void repartirCartas() {
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).agregarCarta(mazo_blackjack.get(0));
            mazo_blackjack.remove(0);
            jugadores.get(i).agregarCarta(mazo_blackjack.get(0));
            mazo_blackjack.remove(0);
            jugadores.get(i).agregarCarta(mazo_blackjack.get(0));
            mazo_blackjack.remove(0);
        }
    }

    public void mostrarJugadores() {
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println(jugadores.get(i).toString());
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        }
    }

    public void asignarPuntaje() {
        ArrayList puntaje = new ArrayList();
        for (int i = 0; i < jugadores.size(); i++) {
            ArrayList<Carta> cartas = jugadores.get(i).getMano();
            for (int j = 0; j < cartas.size(); j++) {
                puntaje.add(cartas.get(j).getValorJuego());
            }
        }
        int puntaje1 = 0;
        int puntaje2 = 0;

        puntaje1 = (int) puntaje.get(0) + (int) puntaje.get(1) + (int) puntaje.get(2);
        puntaje2 = (int) puntaje.get(3) + (int) puntaje.get(4) + (int) puntaje.get(5);

        jugadores.get(0).setPuntaje(puntaje1);
        jugadores.get(1).setPuntaje(puntaje2);


    }

    public String verGanador() {
        String texto = "";
        int puntajeJugador = jugadores.get(0).getPuntaje();
        int puntajeBot = jugadores.get(1).getPuntaje();
        int puntajeLimite = 21;

        if (puntajeJugador > puntajeLimite) {
            texto = "Lo siento, perdiste todo.\n";
        } else if (puntajeJugador <= puntajeLimite && puntajeBot > puntajeJugador && puntajeBot <= puntajeLimite) {
            texto = "El ganador es " + jugadores.get(1).getNombre() + " (¡Cómo te gana un bot, jaja!)\n";
        } else if (puntajeJugador <= puntajeLimite && puntajeBot < puntajeJugador && puntajeBot <= puntajeLimite) {
            texto = "¡FELICIDADES LOCOOOOOO, SOS MILLONARIO! (Deberías dedicarte a las apuestas en vez de estudiar informática :)\n";
        } else if (puntajeJugador == puntajeBot) {
            texto = "No gana ninguno, gana la casa HAHAHAHHAHAHAHHAHAH\n";
        } else {
            texto = "Gracias por jugar\n";
        }

        texto += "Puntaje " + (jugadores.get(0).getNombre())+":" + puntajeJugador + "\n";
        texto += "Puntaje de Botardo: " + puntajeBot + "\n";

        return texto;
    }
}
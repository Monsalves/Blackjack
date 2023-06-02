import java.util.ArrayList;
import java.util.Scanner;



public class BlackJack {
    private ArrayList<Carta> mazo_blackjack = new ArrayList<>(0);
    private ArrayList<Jugador> jugadores = new ArrayList<>();


    public void menu(){
        System.out.println("Bienvenido al mejor juego de BLackJack de toda el área lacustre");
        System.out.println("Somos el juego número uno en diversos países tales como:");
        System.out.println("Birminia,Nepal, Irak y próximamente en Chile!!!");
    }
    public void jugar(){

        menu();
        crearMazo();
        crearJugador();
        crearJugadorBot();
        repartirCartas();
        mostrarJugadores();
        asignarPuntaje();
        verGanador();

    }

    public void crearJugador(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nomnbre");
        String nombre = teclado.nextLine();
        Jugador jugador = new Jugador(nombre);
        jugadores.add(jugador);
    }
    public void crearJugadorBot(){
        Jugador jugador = new Jugador("botardo");
        jugadores.add(jugador);
    }
    public void crearMazo(){
        Baraja baraja = new Baraja();
        baraja.llenarMazo();
        baraja.mezclarMazo();
        mazo_blackjack = baraja.getMazo();
        System.out.println(mazo_blackjack.size());
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
    public void mostrarJugadores(){
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println(jugadores.get(i).toString());
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        }
    }
    public void asignarPuntaje(){
        ArrayList puntaje = new ArrayList();
        for (int i = 0; i < jugadores.size(); i++) {
           ArrayList<Carta> cartas = jugadores.get(i).getMano();
            for (int j = 0; j < cartas.size(); j++) {
                puntaje.add(cartas.get(j).getValorJuego());
            }
        }
        int puntaje1 = 0;
        int puntaje2 = 0;
        for (int i = 0; i < 3; i++) {
            puntaje1 = (int) puntaje.get(i)+(int) puntaje.get(i);
            puntaje2 = (int) puntaje.get(i + 3)+(int) puntaje.get(i + 3);
        }
        jugadores.get(0).setPuntaje(puntaje1);
        jugadores.get(1).setPuntaje(puntaje2);






    }
    public void verGanador(){
        if (jugadores.get(0).getPuntaje() > 21){
            System.out.println("lo siento wacho, lo perdiste todo");
        }
        else if (jugadores.get(0).getPuntaje() <= 21 && jugadores.get(1).getPuntaje()>jugadores.get(0).getPuntaje() && jugadores.get(1).getPuntaje()<=21) {
            System.out.println("el ganador es " + jugadores.get(1).getNombre()+"(como te gana un bot jaja");
        }
        else if (jugadores.get(0).getPuntaje() <= 21 && jugadores.get(1).getPuntaje()<jugadores.get(0).getPuntaje()) {
            System.out.println("FELICIDADES LOCOOOOOO, SOS MILLONARIO, (deberías dedicarte a las apuestas\n en vez de estudiar informática :)");
        }
        else if (jugadores.get(0).getPuntaje() == jugadores.get(1).getPuntaje()) {
            System.out.println("No gana ninguno, gana la casa HAHAHAHHAHAHAHHAHAH");
        }
    }

}
package BlackJack;

import java.util.ArrayList;
public class Jugador {
    private String nombre;
    private int puntaje = 0;
    ArrayList<Carta> mano = new ArrayList<Carta>();

    //Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
    }



    public void agregarCarta(Carta cartita){
        mano.add(cartita);
    }
    public int getPuntaje(){
        return puntaje;
    }
    public void setPuntaje(int puntaje){
        this.puntaje = puntaje;
    }
    public String getNombre(){return nombre;}
    public ArrayList<Carta> getMano() {
        return mano;
    }
    public String toString() {
        return "Señor " +nombre+" tu mano es \n"+mano.get(0) +"\n" + mano.get(1) +"\n" + mano.get(2);
    }
}


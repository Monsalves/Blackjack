import java.util.ArrayList;


public class Jugador {
    private String nombre;
    private int puntaje = 0;
    ArrayList<Carta> mano = new ArrayList<Carta>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    public String toString() {
        return "Señor " +nombre+" tu mano es \n"+mano.get(0) +"\n" + mano.get(1) +"\n" + mano.get(2);
    }
    public void agregarCarta(Carta cartita){
        mano.add(cartita);
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }
    public void setPuntaje(int puntaje){
        this.puntaje = puntaje;

    }
    public int getPuntaje(){
        return puntaje;
    }
    public String getNombre(){return nombre;}
}


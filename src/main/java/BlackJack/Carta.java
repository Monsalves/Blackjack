package BlackJack;

import Enum.Color;
import Enum.Pinta;
import Enum.Numero;
public class Carta {
    private Pinta pinta;
    private Color color;
    private Numero numero;
    private int valorJuego;

    //Constructor
    public Carta(Pinta pinta, Color color, Numero numero, int valorJuego) {
        this.pinta = pinta;
        this.color = color;
        this.numero = numero;
        this.valorJuego = valorJuego;
    }

    // imprimir una carta
    public String toString() {
        return "Carta [pinta=" + pinta + ", color=" + color + ", numero=" + numero + ", valorJuego=" + valorJuego + "]";
    }

    public int getValorJuego(){
        return valorJuego;
    }
}


import Enum.Color;
import Enum.Numero;
import Enum.Pinta;

import java.util.ArrayList;
import java.util.Collections;
public class Baraja {
    private ArrayList<Carta> mazo = new ArrayList<>();


    public void llenarMazo(){
        llenarPicas();
        llenarCorazones();
        llenarDiamantes();
        llenarTreboles();
    }
    public void mezclarMazo(){
        Collections.shuffle(mazo);
    }
    public void llenarPicas() {
        for (Numero num : Numero.values()) {
            int valorJuego = obtenerValorJuego(num);
            Carta cartita = new Carta(Pinta.PICAS, Color.NEGRO, num, valorJuego);
            mazo.add(cartita);
        }
    }
    public void llenarTreboles() {
        for (Numero num : Numero.values()) {
            int valorJuego = obtenerValorJuego(num);
            Carta cartita = new Carta(Pinta.TRÉBOLES, Color.NEGRO, num,valorJuego);
            mazo.add(cartita);
        }
    }
    public void llenarCorazones() {
        for (Numero num : Numero.values()) {
            int valorJuego = obtenerValorJuego(num);
            Carta cartita = new Carta(Pinta.CORAZONES, Color.ROJO, num, valorJuego);
            mazo.add(cartita);
        }
    }
    public void llenarDiamantes() {
        for (Numero num : Numero.values()) {
            int valorJuego = obtenerValorJuego(num);
            Carta cartita = new Carta(Pinta.DIAMANTES, Color.ROJO, num, valorJuego);
            mazo.add(cartita);
        }
    }
    public int obtenerValorJuego(Numero num){
        int valorJuego =0;
        switch (num) {
            case AS:
                valorJuego = 11;
                break;
            case DOS:
                valorJuego = 2;
                break;
            case TRES:
                valorJuego = 3;
                break;
            case CUATRO:
                valorJuego = 4;
                break;
            case CINCO:
                valorJuego = 5;
                break;
            case SEIS:
                valorJuego = 6;
                break;
            case SIETE:
                valorJuego = 7;
                break;
            case OCHO:
                valorJuego = 8;
                break;
            case NUEVE:
                valorJuego = 9;
                break;
            case DIEZ:
                valorJuego = 10;
                break;
            case JOTA:
                valorJuego = 10;
                break;
            case QUINA:
                valorJuego = 10;
                break;
            case KAISER:
                valorJuego = 10;
                break;
        }
        return valorJuego;


    }
    public ArrayList<Carta> getMazo() {
        return mazo;
    }

}

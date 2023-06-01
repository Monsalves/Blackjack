import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Enum.Color;
import Enum.Pinta;
import Enum.Numero;
public class Baraja {
    private ArrayList<Carta> mazo = new ArrayList<>();


    public void llenarMazo(){
        llenarPicas();
        llenarCorazones();
        llenarDiamantes();
        llenarTreboles();

        System.out.println(mazo.size());
    }
    public void mezclarMazo(){
        Collections.shuffle(mazo);
    }
    public void llenarPicas() {
        for (Numero num : Numero.values()) {
            Carta cartita = new Carta(Pinta.PICAS, Color.NEGRO, num, 1);
            mazo.add(cartita);
        }
    }
    public void llenarTreboles() {
        for (Numero num : Numero.values()) {
            Carta cartita = new Carta(Pinta.TRÉBOLES, Color.NEGRO, num, 1);
            mazo.add(cartita);
        }
    }
    public void llenarCorazones() {
        for (Numero num : Numero.values()) {
            Carta cartita = new Carta(Pinta.CORAZONES, Color.ROJO, num, 1);
            mazo.add(cartita);
        }
    }
    public void llenarDiamantes() {
        for (Numero num : Numero.values()) {
            Carta cartita = new Carta(Pinta.DIAMANTES, Color.ROJO, num, 1);
            mazo.add(cartita);
        }
    }
    public ArrayList<Carta> getMazo() {
        return mazo;
    }

}

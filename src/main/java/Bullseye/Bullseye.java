package Bullseye;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bullseye {
    ArrayList<Caballo> ListaCaballos = new ArrayList<Caballo>();
    ArrayList<Ludopata> Jugadores = new ArrayList<Ludopata>();


    public void CrearCaballos() {
        Random aleatorio = new Random();
        String[] nombres = {"Rayo", "Campione", "TiroAlBlanco", "Spirit", "Pegaso", "Boxer"};
        String[] colores = {"Azul", "Rojo", "Amarillo", "Verde", "Rosa", "Blanco"};

        for (int i = 0; i < nombres.length; i++) {
            int numero = i + 1;
            int tiempo = aleatorio.nextInt(60) + 1;

            Caballo caballo = new Caballo(nombres[i], numero, colores[i], tiempo);
            ListaCaballos.add(caballo);


        }
    }
    public void CrearJugadores(){
        for (int i = 2; i <= 7; i++) {
            String nombre = "Jugador" + i;
            Ludopata jugador = new Ludopata(nombre,50000);
            Jugadores.add(jugador);
        }

    }
    public void AgregarLudopata(Ludopata jugador ){
        Jugadores.add(jugador);

    }
    public void AgregarCaballosJugador(){
        for (int i = 1; i < Jugadores.size(); i++) {
            for (int j = 0; j <ListaCaballos.size() ; j++) {
                Jugadores.get(i).setCaballoApostado(ListaCaballos.get(j));
            }
        }
    }
    public void RealizarApuestaAleatoria(){
        int [] monto = {500, 1000, 5000, 10000, 25000, 50000};
        Random aleatorio = new Random();
        for (int i = 1; i <Jugadores.size() ; i++) {
            Jugadores.get(i).setMontoApostado(monto[aleatorio.nextInt(6)]);
        }



    }
    public void SeleccionarCaballo(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ListaCaballos.size(); i++) {
            System.out.println(ListaCaballos.get(i));
        }

        System.out.println("Elige por cuál caballo apostar (Selecciona el número del caballo):");
        int opcion = sc.nextInt();

        Caballo caballo = ListaCaballos.get(opcion - 1);

        Jugadores.get(0).setCaballoApostado(caballo);

        ListaCaballos.remove(opcion - 1);

        System.out.println("Has realizado tu apuesta por el caballo: " + caballo);
    }
    public void SeleccionarMonto(){
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Jugadores.get(0).setMontoApostado(500);
                Jugadores.get(0).actualizarEfectivo(500);
                break;
            case 2:
                Jugadores.get(0).setMontoApostado(1000);
                Jugadores.get(0).actualizarEfectivo(1000);
                break;
            case 3:
                Jugadores.get(0).setMontoApostado(5000);
                Jugadores.get(0).actualizarEfectivo(5000);
                break;
            case 4:
                Jugadores.get(0).setMontoApostado(10000);
                Jugadores.get(0).actualizarEfectivo(10000);
                break;
            case 5:
                Jugadores.get(0).setMontoApostado(25000);
                Jugadores.get(0).actualizarEfectivo(25000);
                break;
            case 6:
                Jugadores.get(0).setMontoApostado(50000);
                Jugadores.get(0).actualizarEfectivo(50000);
                break;
            default:
                System.out.println(" Como parece que usted no entiende , su monto a apostar será de  $0");

                break;
        }

    }
    public void verGanador(){

    }

}

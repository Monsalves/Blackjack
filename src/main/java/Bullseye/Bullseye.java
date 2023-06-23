package Bullseye;

import BlackJack.Jugador;

import javax.swing.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Bullseye {


    private ArrayList<Caballo> ListaCaballos = new ArrayList<Caballo>();
    private ArrayList<Ludopata> Jugadores = new ArrayList<Ludopata>();


    public ArrayList<Ludopata> getJugadores() {
        return Jugadores;
    }
    public ArrayList<Caballo> getListaCaballos() {
        return ListaCaballos;
    }
    public void CrearJugador(String nombre){
        Ludopata jugador = new Ludopata(nombre,50000);
        Jugadores.add(jugador);

    }
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
        for (int i = 2; i <= 6; i++) {
            String nombre = "Jugador " + i;
            Ludopata jugador = new Ludopata(nombre,50000);
            Jugadores.add(jugador);
        }

    }
    public void AgregarCaballosJugador() {
        System.out.println(ListaCaballos.size());
        int x = 0;
        for (int i = 1; i < Jugadores.size(); i++) {
            Jugadores.get(i).setCaballoApostado(ListaCaballos.get(x));
            x = x +1;
        }
    }
    public void RealizarApuestaAleatoria(){
        int [] monto = {500, 1000, 5000, 10000, 25000, 50000};
        Random aleatorio = new Random();
        for (int i = 1; i <Jugadores.size() ; i++) {
            Jugadores.get(i).setMontoApostado(monto[aleatorio.nextInt(6)]);
        }



    }
    public void SeleccionarCaballo(Caballo caballoSeleccionado){

        for(Caballo caballo : ListaCaballos){
            if (caballo == caballoSeleccionado){
                Jugadores.get(0).setCaballoApostado(caballo);
                ListaCaballos.remove(caballo);
            }
        }
    }
    public void SeleccionarMonto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el monto a apostar");
        System.out.println("1-$500");
        System.out.println("2-$1000");
        System.out.println("3-$5000");
        System.out.println("4-$10000");
        System.out.println("5-$25000");
        System.out.println("6-$50000");
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
    public Ludopata CalcularGanador(){
        ArrayList<Integer> tiempos = new ArrayList<>();
        for(Ludopata jugador : Jugadores){
            tiempos.add(jugador.getCaballoApostado().getTiempo());
        }
        Collections.sort(tiempos);
        for(Ludopata jugador : Jugadores){
            if (jugador.getCaballoApostado().getTiempo() == tiempos.get(5)){
                return jugador;
            }
        }
        return null;

    }
    public void AsignarPremio(Ludopata ganador){
        int montoApostado = ganador.getMontoApostado();
        switch (montoApostado) {
            case 500:
                ganador.recibirPremio(2);
                break;
            case 1000:
                ganador.recibirPremio(3);
                break;
            case 5000:
                ganador.recibirPremio(4);
                break;
            case 10000:
                ganador.recibirPremio(5);
                break;
            case 25000:
                ganador.recibirPremio(7);
                break;
            case 50000:
                ganador.recibirPremio(10);
                break;
            default:
                ganador.recibirPremio(1);
        }


    }
    public void verGanador(Ludopata ganador){
        System.out.println("Enhorabuena al jugador: ");
        System.out.println(ganador.getNombre());
        System.out.println("Su nuevo monto de efectivo es de:");
        System.out.println(ganador.getEfectivo());

    }
    public String verCarrera(){
        String texto = "";
        for(Ludopata jugador : Jugadores){
            texto = jugador.verCaballo() + "\n" + texto;

        }
        return texto;
    }
    public void limpiarJuego(){
        for (int i = 1; i <Jugadores.size(); i++) {
            Jugadores.remove(i);
        }
        Jugadores.get(0).eliminarCaballo();
        ListaCaballos.clear();

    }
    public void Jugar(){

        CrearCaballos();
        CrearJugadores();

        SeleccionarMonto();
        AgregarCaballosJugador();
        RealizarApuestaAleatoria();
        verCarrera();
        AsignarPremio(CalcularGanador());
        verGanador(CalcularGanador());

    }

}

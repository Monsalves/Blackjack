package Bullseye;

import BlackJack.Carta;

import java.util.ArrayList;

public class Ludopata {
    private String nombre;
    private int efectivo;
    private int montoApostado = 0;
    private Caballo caballoApostado;

    public Ludopata(String nombre , int efectivo) {
        this.nombre = nombre;
        this.efectivo = efectivo;

    }
    public int getMontoApostado() {
        return montoApostado;
    }
    public void setMontoApostado(int montoApostado) {
        this.montoApostado = montoApostado;
    }
    public Caballo getCaballoApostado() {
        return caballoApostado;
    }
    public void setCaballoApostado(Caballo caballoApostado) {
        this.caballoApostado = caballoApostado;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEfectivo() {
        return efectivo;
    }
    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }
}








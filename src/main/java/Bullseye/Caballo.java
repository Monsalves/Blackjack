package Bullseye;

public class Caballo {
    String nombre;
    int numero;
    String color;
    int tiempo;

    public Caballo(String nombre , int numero , String color, int tiempo) {
        this.nombre = nombre;
        this.numero = numero;
        this.color = color;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumero() {
        return numero;
    }
    public String getColor(){
        return color;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }


    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "\n"
                +"NUMERO: " + numero + "\n"
                +"COLOR: " + color;
    }
}

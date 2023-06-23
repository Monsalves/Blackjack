package GUIS;

import BlackJack.BlackJack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Blackjack extends JFrame implements ActionListener {
    private JPanel panelTodo;
    private JPanel fondo;
    private JButton botonVolver;
    private JButton botonJugar;
    private String name;
    private JTextPane mostrar;


    public Blackjack(String nombre){
        name = nombre;
        mostrar.setEditable(false);
        mostrar.setVisible(false);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        setContentPane(panelTodo);
        botonJugar.addActionListener(this);
        botonVolver.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonJugar){
            BlackJack juego = new BlackJack();
            juego.crearMazo();
            juego.crearJugador(name);
            juego.crearJugadorBot();
            juego.repartirCartas();
            juego.asignarPuntaje();
            mostrar.setVisible(true);
            mostrar.setText(juego.verGanador());


        }
        if(e.getSource()==botonVolver){
            MenuPrincipal nuevaVentana  = new MenuPrincipal();
            nuevaVentana.setVisible(true);
            dispose();
        }


    }
}

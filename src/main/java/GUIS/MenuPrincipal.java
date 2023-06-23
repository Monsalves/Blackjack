package GUIS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame implements ActionListener {
    private JPanel todoPanel;
    private JPanel fondo;
    private JLabel titulo;
    private JButton juegoCartas;
    private JButton juegoCaballos;
    private JTextField textoNombre;
    private JLabel ingresar;


    public MenuPrincipal(){
        setSize(800, 800);
        setLocationRelativeTo(null);
        setContentPane(todoPanel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        juegoCartas.addActionListener(this);
        juegoCaballos.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == juegoCartas){
            String nombre = textoNombre.getText();
            Blackjack ventanaBlackjack = new Blackjack(nombre);
            ventanaBlackjack.setVisible(true);
            dispose();

            }
        if(e.getSource()==juegoCaballos){
            Bullsai ventanaBullsai = new Bullsai();
            ventanaBullsai.setVisible(true);
            dispose();
        }
        }






}


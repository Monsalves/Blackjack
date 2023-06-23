package GUIS;
import Enum.Monto;
import Bullseye.Bullseye;
import Bullseye.Caballo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bullsai extends JFrame implements ActionListener {
    private JPanel panel1;
    private JPanel fondo;
    private JLabel titulo;
    private JComboBox comboBoxCaballo;
    private JComboBox comboBoxMonto;
    private JButton volver;
    private JButton jugarButton;
    private JTextPane resultado;
    private JLabel caballo;
    private JLabel monto;
    private String name;

    public Bullsai(){
        setSize(800, 800);
        setLocationRelativeTo(null);
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        volver.addActionListener(this);
        jugarButton.addActionListener(this);






    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==volver){
            MenuPrincipal nuevaVentana  = new MenuPrincipal();
            nuevaVentana.setVisible(true);
            dispose();
        }

        if(e.getSource()==jugarButton){
            resultado.setText("");
            Bullseye juego = new Bullseye();
            juego.CrearJugador(name);
            juego.CrearCaballos();
            juego.CrearJugadores();
            juego.SeleccionarCaballo((Caballo)comboBoxCaballo.getSelectedItem());
            juego.AgregarCaballosJugador();
            juego.getJugadores().get(0).setMontoApostado((int)comboBoxMonto.getSelectedItem());
            resultado.setText(juego.verCarrera());
            juego.limpiarJuego();




        }

    }


}

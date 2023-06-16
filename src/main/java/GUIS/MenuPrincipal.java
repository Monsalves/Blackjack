package GUIS;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame implements ActionListener {
    private JLabel TituloMenu;
    private JButton ButtonBlackJack;
    private JPanel panel;

    public MenuPrincipal() {
        pantalla();
    }

    public void pantalla(){
        // Configuramos la ventana
        setTitle("Jueguito");
        setSize(1500, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Creamos el panel
        panel = new JPanel();


        // Creamos los componentes
        TituloMenu = new JLabel("CASINO");
        ButtonBlackJack = new JButton("Jugar Cartitas");


        // Añadimos los componentes al panel
        panel.add(TituloMenu);
        panel.add(ButtonBlackJack);

        // Añadimos el panel a la ventana
        add(panel);

        // Agregamos el ActionListener al botón
        ButtonBlackJack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ButtonBlackJack) {
            System.out.println("HOLA CHAVALES");
        }
    }
}






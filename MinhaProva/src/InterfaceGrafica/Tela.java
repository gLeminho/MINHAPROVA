package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Tela extends JFrame {
    private JPanel panel= new JPanel();
    private JButton jButton = new JButton("Votar");
    private JButton jButton2 = new JButton("Apurar");


    public Tela(){
        this.setTitle("***Eliminção BBB***");
        this.setSize(400,200);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5) {

        });

        panel.add(jButton);
        panel.add(jButton2);
        add(panel);

        setLocationRelativeTo(null);
        this.setVisible(true);

        revalidate();
        repaint();


    }

    public static void main(String[] args){
new Tela();
    }

}

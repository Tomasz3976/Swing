package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 extends JFrame {

    private JPanel panel1;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JButton smallerButton;
    private JButton fatButton;
    private JButton italicsButton;
    private JButton biggerButton;
    private JLabel kolorLabel;
    private JLabel edytorLabel;

    public static void main(String[] args) {
        Zadanie2 zadanie2 = new Zadanie2();
        zadanie2.setVisible(true);
    }

    public Zadanie2() {
        super("Zadanie 2");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = String.valueOf(comboBox1.getSelectedItem());
                switch (color) {
                    case "czerwony" -> textArea1.setForeground(Color.RED);
                    case "czarny" -> textArea1.setForeground(Color.BLACK);
                    case "zielony" -> textArea1.setForeground(Color.GREEN);
                    case "niebieski" -> textArea1.setForeground(Color.BLUE);
                    case "zolty" -> textArea1.setForeground(Color.YELLOW);
                    case "szary" -> textArea1.setForeground(Color.GRAY);
                }
            }
        });
        fatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setFont(new Font("Bold", Font.BOLD, textArea1.getFont().getSize()));
            }
        });
        italicsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setFont(new Font("Italic", Font.ITALIC, textArea1.getFont().getSize()));
            }
        });
        smallerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setFont(new Font("Smaller", textArea1.getFont().getStyle(), textArea1.getFont().getSize() - 1));
            }
        });
        biggerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setFont(new Font("Smaller", textArea1.getFont().getStyle(), textArea1.getFont().getSize() + 1));
            }
        });
    }
}

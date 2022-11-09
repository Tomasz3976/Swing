package Lab2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxExample extends JFrame {
    private JPanel panel1;
    private JTextArea wybierzTextArea;
    private JButton button1;
    private JCheckBox javaCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox cPlusPlusCheckBox;
    private JCheckBox pythonCheckBox;

    private int price;

    public static void main(String[] args) {
        JCheckBoxExample run = new JCheckBoxExample();
        run.setVisible(true);
    }

    public JCheckBoxExample() {
        super("JCheckBoxExample");
        this.setContentPane(panel1); //wyswietlanie na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        javaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                price += 3500;
            }
        });
        cSharpCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                price += 3000;
            }
        });
        cPlusPlusCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                price += 4000;
            }
        });
        pythonCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                price += 5000;
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane optionPane = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Cena wynosi: " + price);
            }
        });
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_form_1 extends JFrame {
    private JPanel Panel1;
    private JButton button1;
    private JButton button2;
    private JButton konwersjaButton;
    private JLabel textFieldA;
    private JButton roznicaButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JCheckBox checkBox1;
    private JTextField textField4;
    private JLabel inputA;
    private JLabel inputB;
    private JLabel DataLabel;
    double liczbaA, liczbaB, wynik;

    public static void main(String[] args) {
        gui_form_1 gui = new gui_form_1();
        gui.setVisible(true);
    }
    //I sposob
    public gui_form_1() {
        super("Moja pierwsza aplikacja");
        this.setContentPane(this.Panel1); //wyswietlanie na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 700);
        konwersjaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.parseDouble(textField1.getText());
                liczbaB = Double.parseDouble(textField2.getText());
                wynik = liczbaA + liczbaB;
                textField3.setText("Suma " + liczbaA + " + " + liczbaB + " = " + wynik);
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczbaA = Double.parseDouble(textField1.getText());
                liczbaB = Double.parseDouble(textField2.getText());
                wynik = liczbaA - liczbaB;
                textField3.setText("Roznica " + liczbaA + " - " + liczbaB + " = " + wynik);
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField4.setText("Checkbox dziala");
            }
        });
        konwersjaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temperatura = Double.parseDouble(textField1.getText());
                textField2.setText(String.valueOf((((temperatura * 9) / 5) + 32)));
            }
        });
    }
}

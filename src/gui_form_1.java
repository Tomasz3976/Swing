import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_form_1 extends JFrame {
    private JPanel Panel1;
    private JButton konwersjaButton;
    private JLabel textFieldA;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        gui_form_1 gui = new gui_form_1();
        gui.setVisible(true);
    }
    //I sposob
    public gui_form_1() {
        super("Moja pierwsza aplikacja");
        this.setContentPane(this.Panel1); //wyswietlanie na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        konwersjaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temperatura = Double.parseDouble(textField1.getText());
                textField2.setText(String.valueOf((((temperatura * 9) / 5) + 32)));
            }
        });
    }
}

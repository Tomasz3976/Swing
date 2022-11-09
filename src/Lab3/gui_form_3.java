package Lab3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui_form_3 extends JFrame {
    private JPanel JPanel1;
    private JButton button2;
    private JComboBox comboBox1;
    private JLabel LabelText;
    private JTable table1;

    public static void main(String[] args) {
        gui_form_3 ob1 = new gui_form_3();
        ob1.setVisible(true);
    }

    public gui_form_3() {
        super("Example");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);

        createComboBox();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Wybrano jezyk: " + comboBox1.getItemAt(comboBox1.getSelectedIndex());
                LabelText.setText(data);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dataSelect = (String) comboBox1.getSelectedItem();
                JOptionPane.showMessageDialog(gui_form_3.this, "Wybrano jezyk: " + dataSelect);
            }
        });
    }

    private void createComboBox() {
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"C++", "C#", "Java", "Python"}));
    }
}

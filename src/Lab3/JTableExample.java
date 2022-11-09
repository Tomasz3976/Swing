package Lab3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableExample extends JFrame {
    private JPanel PanelMain;
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JPanel JPanel3;
    private JPanel JPanel4;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JTable showTable;
    private JButton episodeRatingsButton;
    private JButton IMDBPageButton;

    public static void main(String[] args) {
        JTableExample swingExample = new JTableExample();
        swingExample.setVisible(true);
    }

    public JTableExample() {
        super("App");
        this.setContentPane(this.PanelMain);
        this.setDefaultCloseOperation(JTableExample.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        createTable();
    }

    private void createTable() {
        Object[][] data = {
                {"file 1 ", 2022,8.123, 12341},
                {"file 2 ", 2022,9.123, 12346551},
                {"file 4 ", 2022,8.123, 341}
        };

        showTable.setModel(new DefaultTableModel(
                data, new String[]{"Tytul", "Rok", "Ranking", "Liczba opinii"}
        ));
    }
}

package Lab3;

import javax.swing.*;
import java.awt.event.ComponentAdapter;

public class ItemExample extends JFrame {
    private JPanel mainPanel;
    private JList list1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private final String[] names = {"Jan", "Marian", "Janina", "Ewelina"};
    private final String[] emails = {"jan.kowalski65743@gmail.com", "mariannowak555@hotmail.com",
            "janina333@o2.com", "ewellinaina@o2.com"};
    private final String[] addresses = {"Rzeszow, Rejtana 3A", "Krakow, Wadowicka 56",
            "Poznan, Cicha 24", "Wroclaw, Pocztowa 1"};
    private final String[] datesOfBirth = {"02-04-1994", "05-11-1984", "30-01-1990", "23-02-2001"};
    private final int[] phoneNumbers = {543323256, 968765554, 549032997, 576830012};
    private final int[] ages = {28, 38, 32, 21};


    public static void main(String[] args) {
        ItemExample itemExample = new ItemExample();
        itemExample.setVisible(true);
    }

    public ItemExample() {
        super("New Project");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 450);
    }
}

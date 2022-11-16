package Lab4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame {
    private JPanel panel1;
    private JList list1;
    private JList list2;
    private JButton rightMover;
    private JButton leftAllMover;
    private JButton leftMover;
    private JButton rightAllMover;
    int leftPointer = 0;

    public static void main(String[] args) {
        Zadanie1 zadanie1 = new Zadanie1();
        zadanie1.setVisible(true);
    }

    public Zadanie1() {
        super("Zadanie 1");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        rightMover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (leftPointer < 5) {
                    String element = list1.getModel().getElementAt(leftPointer).toString();
                    leftPointer++;
                }
            }
        });
    }
}

package Lab5.Zadanie1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel aboutPanel;
    private JPanel filePanel;
    private JList toDoList;
    private JList doneList;
    private JList inProgressList;
    private JLabel toDoLabel;
    private JLabel inProgressLabel;
    private JLabel doneLabel;
    private JButton newTaskButton;
    private JButton backButton;
    private JButton closeButton;
    private JTextField aboutTaskField;
    private final String[][] toDoInfo = {
            {"Low", "Jest ich trochę w koszu", },
            {},
            {},
            {},
            {}
    };

    public static void main(String[] args) {
        Zadanie1 zadanie1 = new Zadanie1();
        zadanie1.setVisible(true);
    }

    public Zadanie1() {
        super("Zadanie 1");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        newTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewTaskForm addTaskForm = new addNewTaskForm();

            }
        });
    }
}

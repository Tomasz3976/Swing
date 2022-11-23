package Lab5.Zadanie1;

import javax.swing.*;

public class addNewTaskForm extends JFrame {
    private JPanel panel1;
    private JTextField titleField;
    private JTextField aboutField;
    private JTextField expDateField;
    private JComboBox priorityBox;

    public JTextField getTitleField() {
        return titleField;
    }

    public JTextField getAboutField() {
        return aboutField;
    }

    public JTextField getExpDateField() {
        return expDateField;
    }

    public JComboBox getPriorityBox() {
        return priorityBox;
    }

    public void run() {
        addNewTaskForm addForm = new addNewTaskForm();
        addForm.setVisible(true);
    }

    public addNewTaskForm() {
        this.setContentPane(this.panel1);
        this.setSize(600, 400);
    }
}

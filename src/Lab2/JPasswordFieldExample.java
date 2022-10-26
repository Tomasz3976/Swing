package Lab2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldExample extends JFrame {
    private JTextArea usernameTextArea;
    private JTextField textField1;
    private JTextArea passwordTextArea;
    private JPasswordField passwordField1;
    private JTextArea resultArea1;
    private JPanel Panel;
    private JButton loginButton;

    public static void main(String[] args) {
        JPasswordFieldExample run = new JPasswordFieldExample();
        run.setVisible(true);
    }

    public JPasswordFieldExample() {
        super("JPasswordField");
        this.setContentPane(Panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = passwordField1.getText();
                resultArea1.setText(String.format("Username: %s, Password: %s", username, password));
            }
        });
    }
}

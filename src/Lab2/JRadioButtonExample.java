package Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonExample extends JFrame {
    private JPanel panel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JButton OKButton;
    private JLabel photo;

    private final ImageIcon imageLinux = SetImageSize(new ImageIcon(getClass().getResource("linux.png")));
    private final ImageIcon imageWindows = SetImageSize(new ImageIcon(getClass().getResource("windows.png")));
    private final ImageIcon imageMacintosh = SetImageSize(new ImageIcon(getClass().getResource("macintosh.png")));

    ImageIcon SetImageSize(ImageIcon image) {
        Image img = image.getImage();
        Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        return newImc;
    }

    public static void main(String[] args) {
        JRadioButtonExample run = new JRadioButtonExample();
        run.setVisible(true);
    }

    public JRadioButtonExample() {
        super("JRadioButtonExample");
        this.setContentPane(panel1); //wyswietlanie na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                photo.setIcon(imageLinux);
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                photo.setIcon(imageWindows);
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                photo.setIcon(imageMacintosh);
            }
        });
    }
}

package Lab4;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JTreeExample extends JFrame {
    private JTree tree1;
    private JTextField textKursu;
    private JLabel nameKurs;
    private JTextField textCena;
    private JButton oplacKursButton;
    private JButton wyjscieButton;
    private JLabel listakursowLabel;
    private JPanel glownyPanel;
    private JTabbedPane tabbedPane1;

    public static void main(String[] args) {
        JTreeExample jTree = new JTreeExample();
        jTree.setVisible(true);
    }

    public JTreeExample() {
        super("JTree");
        this.setContentPane(this.glownyPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.createUIComponents(); //wywołanie metody ze zdefiniowanym JTree
        tree1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree1.getSelectionPath().getLastPathComponent();

                textKursu.setText(root.getUserObject().toString());

                String select = root.getUserObject().toString();
                if (select.equals("C++")) textCena.setText("223");
                if (select.equals("C#")) textCena.setText("2323");
                if (select.equals("Java")) textCena.setText("434");
                if (select.equals("Python")) textCena.setText("2424");
                if (select.equals("ASP.NET")) textCena.setText("2423");
                if (select.equals("C")) textCena.setText("35433");
                if (select.equals("Photoshop")) textCena.setText("5242");
                if (select.equals("Corel")) textCena.setText("24423");
                if (select.equals("AutoCad")) textCena.setText("2442");
                if (select.equals("InDesign")) textCena.setText("1213");
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void createUIComponents() {
        //root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy");

        //poziom
        DefaultMutableTreeNode kProg = new DefaultMutableTreeNode("Programowanie");
        DefaultMutableTreeNode P1 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode P2 = new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode P3 = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode P4 = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode P5 = new DefaultMutableTreeNode("ASP.NET");
        DefaultMutableTreeNode P6 = new DefaultMutableTreeNode("C");

        kProg.add(P1);
        kProg.add(P2);
        kProg.add(P3);
        kProg.add(P4);
        kProg.add(P5);
        kProg.add(P6);

        //poziom
        DefaultMutableTreeNode kGrafika = new DefaultMutableTreeNode("Grafika komputerowa");
        DefaultMutableTreeNode G1 = new DefaultMutableTreeNode("Photoshop");
        DefaultMutableTreeNode G2 = new DefaultMutableTreeNode("Corel");
        DefaultMutableTreeNode G3 = new DefaultMutableTreeNode("AutoCad");
        DefaultMutableTreeNode G4 = new DefaultMutableTreeNode("InDesign");

        kGrafika.add(G1);
        kGrafika.add(G2);
        kGrafika.add(G3);
        kGrafika.add(G4);

        //dodanie po root
        root.add(kProg);
        root.add(kGrafika);

        DefaultTreeModel myModel = new DefaultTreeModel(root);

        tree1 = new JTree(myModel);
    }
}

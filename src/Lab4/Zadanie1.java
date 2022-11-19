package Lab4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Zadanie1 extends JFrame {
    private JPanel panel1;
    private JList<String> list1;
    private JList<String> list2;
    private JButton rightMover;
    private JButton leftAllMover;
    private JButton leftMover;
    private JButton rightAllMover;

    public static void main(String[] args) {
        Zadanie1 zadanie1 = new Zadanie1();
        zadanie1.setVisible(true);
    }

    public Zadanie1() {
        super("Zadanie 1");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        List<String> customList1 = new ArrayList<>();
        customList1.add("Mleko");
        customList1.add("Jaja");
        customList1.add("Ser");
        customList1.add("Groch");
        customList1.add("Kasza");
        customList1.add("Kielbasa");
        customList1.add("Pierogi");
        customList1.add("Makaron");
        customList1.add("Bazylia");
        customList1.add("Beza");
        customList1.add("Szynka");
        DefaultListModel<String> customModel1 = new DefaultListModel<>();
        customModel1.addAll(customList1);
        list1.setModel(customModel1);

        rightMover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedValue = list1.getSelectedValue();
                if (selectedValue != null) {
                    DefaultListModel<String> newList2Model = new DefaultListModel<>();
                    ListModel<String> list2Model = list2.getModel();
                    for (int i = 0; i < list2Model.getSize(); i++) {
                        newList2Model.addElement(list2Model.getElementAt(i));
                    }
                    newList2Model.addElement(selectedValue);
                    list2.setModel(newList2Model);
                    DefaultListModel<String> newList1Model = new DefaultListModel<>();
                    ListModel<String> list1Model = list1.getModel();
                    int removeElementIndex = list1.getSelectedIndex();
                    for (int i = 0; i < list1Model.getSize(); i++) {
                        if (i == removeElementIndex) continue;
                        newList1Model.addElement(list1Model.getElementAt(i));
                    }
                    list1.setModel(newList1Model);
                }
            }
        });
        rightAllMover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> newList2Model = new DefaultListModel<>();
                ListModel<String> list2Model = list2.getModel();
                for (int i=0; i<list2Model.getSize(); i++) {
                    newList2Model.addElement(list2Model.getElementAt(i));
                }
                ListModel<String> list1Model = list1.getModel();
                for (int i=0; i<list1Model.getSize(); i++) {
                    newList2Model.addElement(list1Model.getElementAt(i));
                }
                list2.setModel(newList2Model);
                list1.setModel(new DefaultListModel<>());
            }
        });
        leftMover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedValue = list2.getSelectedValue();
                if (selectedValue != null) {
                    DefaultListModel<String> newList1Model = new DefaultListModel<>();
                    ListModel<String> list1Model = list1.getModel();
                    for (int i = 0; i < list1Model.getSize(); i++) {
                        newList1Model.addElement(list1Model.getElementAt(i));
                    }
                    newList1Model.addElement(selectedValue);
                    list1.setModel(newList1Model);
                    DefaultListModel<String> newList2Model = new DefaultListModel<>();
                    ListModel<String> list2Model = list2.getModel();
                    int removeElementIndex = list2.getSelectedIndex();
                    for (int i = 0; i < list2Model.getSize(); i++) {
                        if (i == removeElementIndex) continue;
                        newList2Model.addElement(list2Model.getElementAt(i));
                    }
                    list2.setModel(newList2Model);
                }
            }
        });
        leftAllMover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> newList1Model = new DefaultListModel<>();
                ListModel<String> list1Model = list1.getModel();
                for (int i=0; i<list1Model.getSize(); i++) {
                    newList1Model.addElement(list1Model.getElementAt(i));
                }
                ListModel<String> list2Model = list2.getModel();
                for (int i=0; i<list2Model.getSize(); i++) {
                    newList1Model.addElement(list2Model.getElementAt(i));
                }
                list1.setModel(newList1Model);
                list2.setModel(new DefaultListModel<>());
            }
        });
    }
}

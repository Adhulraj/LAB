///No OUTPUT

// AIM 

// Create an AWT application to add, remove items in a list

// Algorithm
// Step 01 : Start
// Step 02 : Create a class inheriting class JFrame and interface ActionListener
// Step 03 : Initialize the frame
// Step 04 : Create a list module and add elements
// Step 05 : Add buttons to frame and attach action listeners
// Step 06 : Perform the actions: add item, remove item & clears the list using the method actionPerformed() and ActionEvent
// Step 07 : Display the frame
// Step 08 : Stop

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MyList extends JFrame implements ActionListener {
    JList l1;
    JTextField t1;
    JButton b1, b2, b3;

    int ret;
    DefaultListModel listModel;

    MyList() {
        setTitle("Adding or Removing Items from JList");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        listModel.addElement("Ronaldo");
        listModel.addElement("Messi");
        listModel.addElement("Mbappe");
        listModel.addElement("Mbappe");

        // creating list
        l1 = new JList<>(listModel);

        // creating text field
        t1 = new JTextField(10);

        // creating buttons
        b1 = new JButton("ADD");
        b1.addActionListener(this);

        b2 = new JButton("REMOVE");
        b2.addActionListener(this);
        b2.setActionCommand("remove");

        b3 = new JButton("CLEAR ALL");
        b3.addActionListener(this);
        b3.setActionCommand("clear");

        // adding jlist to a scrollpane
        JScrollPane js = new JScrollPane(l1);
        js.setPreferredSize(new Dimension(300, 100));

        add(js);
        add(t1);
        add(b1);
        add(b2);
        add(b3);

        setSize(700, 500);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if ("clear".equals(ae.getActionCommand())) {
            listModel.removeAllElements();
        } else if ("remove".equals(ae.getActionCommand())) {
            ret = l1.getSelectedIndex();
            listModel.remove(ret);
        } else {
            String select = t1.getText();
            Object obj = select;
            listModel.add(0, obj);
        }
    }

    public static void main(String[] args) {
        MyList list = new MyList();
    }
}

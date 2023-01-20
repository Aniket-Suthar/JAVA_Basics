import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class combobox {

    //JComboBox= A GUI component combines a button or editable field and a
    //           drop-down list
    public static void main(String[] args) {
        new fr2();
    }
}

class fr2 extends JFrame implements ActionListener {
    JComboBox cbx;
    JButton b5;

    fr2() {
        //in combobox always pass an array of non-primitive data types for primitives use their wrapper class
        String[] l = {"JAVA", "C++", "PYTHON", "C#", "C"};
        cbx = new JComboBox(l);
        cbx.addActionListener(this);

        //other method
//        cbx.setEditable(true);
//        cbx.addItem("CARBON");
//        cbx.setSelectedIndex(2);
//        cbx.removeItem(0);

        b5 = new JButton("EXIT");
        b5.addActionListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(50));
        this.add(cbx);
        this.add(b5);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cbx) {
            System.out.println("You love " + cbx.getSelectedItem() + " Language..");

        } else if (e.getSource() == b5) {
            this.dispose();
            System.out.println("THANK YOU..");
        }
    }
}
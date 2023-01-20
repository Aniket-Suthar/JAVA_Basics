import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radiobutton {
    //JRadioButton =  One or more radio button in a grouping in which only 1 may be selected
    //                per group

    public static void main(String[] args) {
        new fr1();
    }
}

class fr1 extends JFrame implements ActionListener {
    JRadioButton b, b1, b2, b3, b4;
    JButton b5;

    fr1() {

        b = new JRadioButton("JAVA");
        b1 = new JRadioButton("C++");
        b2 = new JRadioButton("PYTHON");
        b3 = new JRadioButton("C#");
        b4 = new JRadioButton("C");
        b5 = new JButton("EXIT");

        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);


        //to make only one selection at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(b);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(50));
        this.add(b);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            System.out.println("JAVA is Awesome..");
        } else if (e.getSource() == b1) {
            System.out.println("C++ is Awesome..");
        } else if (e.getSource() == b2) {
            System.out.println("PYTHON is Awesome..");
        } else if (e.getSource() == b3) {
            System.out.println("C# is Awesome..");
        } else if (e.getSource() == b4) {
            System.out.println("C is Awesome..");
        } else if (e.getSource() == b5) {
            this.dispose();
            System.out.println("THANK YOU..");
        }
    }
}
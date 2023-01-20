import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
class Myframe extends JFrame {
    JButton b;
    JButton c;
    static JTextField f;

    Myframe()
    {
        c = new JButton("Cancel Button");
        b = new JButton("CLick Button");
        f = new JTextField(25);

        //using Listener to get respond to whenever the buttons are clicked
        MyListener ml = new MyListener();
        b.addActionListener(ml);
        c.addActionListener(ml);

        //setting size of buttons
        c.setSize(500,500);
        b.setSize(500,500);

        //making the button visible on screen
        setVisible(true);

        //ending the program whenever the gui window is being closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(b);
        add(c);

        //changing the layout of "Content Pane" to "FlowLayout"
        //also making the Alignment to center
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
        getContentPane().setLayout(f1);
        Container ct = getContentPane();
        ct.setLayout(f1);
        ct.add(b);
        ct.add(f);
        ct.add(c);
    }
    public static void main(String[] args) {
        Myframe t = new Myframe();
    }
}

//implementation of Listeners using ActionListener Interface
class MyListener implements ActionListener
{
    @Override
    //calling ActionEvent object to perform the particular work whenever the button is being clicked
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand() + " is clicked");

    }
}
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class cardlayout extends JFrame implements ActionListener
{
    CardLayout crd;
    JButton btn1, btn2, btn3,btn4;
    Container cPane;
    cardlayout()
    {

        cPane = getContentPane();
        
        crd = new CardLayout();

        cPane.setLayout(crd);

// creating the buttons  
        btn1 = new JButton("BUTTON 1 ");
        btn2 = new JButton("NEW CARD 1");
        btn3 = new JButton("NEW CARD 2");
        btn4 = new JButton("NEW CARD 3");

// adding listeners to it  
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        cPane.add("a", btn1); // first card is the button btn1
        cPane.add("b", btn2); // first card is the button btn2  
        cPane.add("c", btn3);  // first card is the button btn3  
        cPane.add("d", btn4);

    }
    public void actionPerformed(ActionEvent e)
    {
        crd.next(cPane);
    }
    public static void main(String [] args)
    {
        cardlayout c = new cardlayout();
        c.setSize(300, 300);
        c.setTitle("CARD LAYOUT");
        c.setVisible(true);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}    
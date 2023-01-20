import javax.accessibility.Accessible;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

//Main Frame
class Myframe extends JFrame implements ActionListener {
    JButton button;
    JButton button1;
    JButton button2;
    JLabel label , label1 , label2 , label3,label4;
    JPanel panel1 , panel2;
    Myframe()
    {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setBackground(new Color(255,240,28));
        panel2.setBackground(new Color(255,240,28));

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p5=new JPanel();

        p1.setBackground(new Color(225,52,72));
        p2.setBackground(new Color(103,40,168));
        p3.setBackground(new Color(225,52,72));
        p5.setBackground(Color.BLACK );

        p1.setPreferredSize(new Dimension(70,70));
        p2.setPreferredSize(new Dimension(1000,1000));
        p3.setPreferredSize(new Dimension(70,70));
        p2.setLayout(null);


        this.setTitle(" PUZZLES --- CHALLENGING YOUR BRAINS ");
        this.getContentPane().setBackground(new Color(103,40,168));

        ImageIcon icon = new ImageIcon();
        ImageIcon icon1 = new ImageIcon();
        ImageIcon icon2 = new ImageIcon();

        //creating buttons
        button = new JButton();
        button.setText(" PUZZLE ");
        button.setBounds(175, 50, 200,  100);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setForeground(white);
        button.setBackground(new Color(0,0,0));
        // button.setIconTextGap(30);
        button.setFocusable(false);
        // button.setIcon(icon1);
        button.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));

        button1 = new JButton();
        button1.setText(" VIEW SOLUTION ");
        button1.setBounds(567, 50, 350, 100);
        button1.setFocusable(false);
        // button1.setIcon(icon1);
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setVerticalTextPosition(SwingConstants.BOTTOM);
        // button1.setIconTextGap(30);
        button1.setForeground(white);
        button1.setBackground(GRAY);
        button1.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));

        button2 = new JButton();
        button2.setText(" EXIT PUZZLE ");
        button2.setBounds(1000, 50, 300, 100);
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);
        button2.setForeground(white);
        button2.setBackground(new Color(0,0,0));
        button2.setIconTextGap(30);
        button2.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
        button2.setFocusable(false);

//        button2.setIcon(icon1);
        //when button is clicked the action will be performed but to make action visible
        //we will use "ActionListener


        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        //this ==>  is written bcz this particular class is implementing actionListener
        //displaying a label on button click


        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(385, 30, 900, 800);
        label.setBackground(GREEN);
        label.setVisible(false);

        label1 = new JLabel();
        label1.setIcon(icon1);
        label1.setBounds(385 , 30, 1000, 800);
        label1.setBackground(GREEN);
        label1.setVisible(false);

        label2=new JLabel();
        label2.setVisible(true);
        label2.setText(" THINK  LIKE  A  CODER ");
        label2.setFont(new Font("Lucida Handwriting" ,Font.BOLD , 40) );

        label3=new JLabel();
        label3.setVisible(true);
        label3.setText(" By  Prayag  and  Aniket ");
        label3.setFont(new Font("Lucida Handwriting" ,Font.BOLD , 30) );

        label4=new JLabel();
        label4.setIcon(icon2);
        label4.setBounds(600 , 30, 1000, 750);
        label4.setVisible(false);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        panel1.setPreferredSize(new Dimension(60,60));
        this.add(panel1 , new BorderLayout().WEST);
        panel2.setPreferredSize(new Dimension(60,60));
        this.add(panel2 , new BorderLayout().EAST);

//        this.add(p1,new BorderLayout().SOUTH);
//        this.add(p3,new BorderLayout().NORTH);
        this.setSize(1000, 1000);
        this.add(p1,BorderLayout.NORTH);
        this.add(p3,BorderLayout.SOUTH);

        p1.add(label2);
        p2.add(label);
        p2.add(label1);
        p2.add(label4);
        p3.add(label3);

        p2.add(button);
        p2.add(button1);
        p2.add(button2);

        this.add(p2,BorderLayout.CENTER);
        this.setVisible(true);
    }

    //making button to do certain action when being clicked
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button)
        {
//            int a = (int) (Math.random() * 1000) % 255;
//            int b = (int) (Math.random() * 1000) % 255;
//            int c = (int) (Math.random() * 1000) % 255;
//            button.setBackground(new Color(a, b, c));
            label.setVisible(true);
            label1.setVisible(false);
        }
        else if (e.getSource() == button1)
        {
//            int a = (int) (Math.random() * 1000) % 255;
//            int b = (int) (Math.random() * 1000) % 255;
//            int c = (int) (Math.random() * 1000) % 255;
//            button1.setBackground(new Color(a, b, c));
            label1.setVisible(true);
            label.setVisible(false);
            label4.setVisible(false);
        }
        else if (e.getSource() == button2) {
            label.setVisible(false);
            label1.setVisible(false);
            label4.setVisible(true);
        }
    }
}
class PUZZLE_main
{
    public static void main(String[] args) {
        new Myframe();
}
}
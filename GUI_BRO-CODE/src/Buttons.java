import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

class Buttons {
    //JButton = a button that perform an action when clicked on
    public static void main(String[] args) {
        new Myframe();
    }

}


//Main Frame
class Myframe extends JFrame implements ActionListener {
    JButton button;
    JButton button1;
    JButton button2;
    JLabel label;
    JLabel label1;

    Myframe() {
        ImageIcon icon1 = new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\g.jpg");
        ImageIcon icon = new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\b.jpg");
        //creating buttons
        button = new JButton();
        button.setText("ENTER");
        button.setBounds(10, 50, 250, 120);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setForeground(white);
        button.setBackground(BLACK);
        button.setIconTextGap(30);
        button.setFocusable(false);
        button.setIcon(icon1);
        button.setFont(new Font("Times New Roman", Font.BOLD, 15));

        button1 = new JButton();
        button1.setText("EXIT");
        button1.setBounds(350, 50, 250, 120);
        button1.setFocusable(false);
        button1.setIcon(icon1);
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setVerticalTextPosition(SwingConstants.BOTTOM);
        button1.setIconTextGap(30);
        button1.setForeground(white);
        button1.setBackground(BLACK);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));

        button2 = new JButton();
        button2.setText("EXIT....");
        button2.setBounds(700, 50, 250, 120);
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);
        button2.setForeground(white);
        button2.setBackground(BLACK);
        button2.setIconTextGap(30);
        button2.setFocusable(false);
//        button2.setIcon(icon1);
        //when button is clicked the action will be performed but to make action visible
        //we will use "ActionListener

        //instead of implementing actionListener interface we can use "Lambda Function" for this
        // button1.addActionListener(e -> System.out.println("HELLO,ANIKET SUTHAR"));
        //button.addActionListener(e -> System.out.println("HELLO"));

        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        //this =  is written bcz this particular class is implementing actionListener

        //displaying a label on button click
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(10, 50, 500, 500);
        label.setBackground(new Color(12,24,44));
        label.setVisible(false);

        label1 = new JLabel();
        label1.setIcon(icon1);
        label1.setBounds(50, 200, 500, 500);
        label1.setBackground(GREEN);
        label1.setVisible(false);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(red);
        this.setLayout(null);
        this.setSize(1000, 1000);
        this.setVisible(true);
        this.add(button);
        this.add(button1);
        this.add(button2);
        this.add(label);
        this.add(label1);
    }

    //making button to do certain action when being clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("HELLO");
            int a = (int) (Math.random() * 1000) % 255;
            int b = (int) (Math.random() * 1000) % 255;
            int c = (int) (Math.random() * 1000) % 255;
            button.setBackground(new Color(a, b, c));
            this.getContentPane().setBackground(gray);
            label.setVisible(true);
        } else if (e.getSource() == button1) {
            System.out.println("HI I'm ANIKET");
            int a = (int) (Math.random() * 1000) % 255;
            int b = (int) (Math.random() * 1000) % 255;
            int c = (int) (Math.random() * 1000) % 255;
            button1.setBackground(new Color(a, b, c));
            label1.setVisible(true);
            label.setVisible(false);

        } else if (e.getSource() == button2) {
            label.setVisible(false);
            label1.setVisible(false);

        }
    }
}




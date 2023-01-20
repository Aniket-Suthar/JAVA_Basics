import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import static java.awt.Color.*;

class Panels {
    public static void main(String[] args) {
     //JPanel = a GUI component that function as a container to hold other componebts

        //adding label to a panel
        ImageIcon icon = new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\a.png");
        ImageIcon icon1 =  new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\c.png");
        ImageIcon icon3 = new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\d.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\b.jpg");
        //label for yellow panel
        JLabel label = new JLabel();

        //no need of this if we use setbounds method in panel
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
        label.setText("JAVA GUI");
        label.setForeground(red);
        label.setFont(new Font("Mv Boli",Font.BOLD,20));
        label.setIcon(icon);
        label.setBounds(180,10,250,250);

        //label for green panel
        JLabel label1 = new JLabel();
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setText("GOOGLE");
        label1.setForeground(red);
        label1.setFont(new Font("Mv Boli",Font.BOLD,20));
        label1.setIcon(icon2);

        //label for red panel
        JLabel label2 = new JLabel();
        label2.setVerticalTextPosition(JLabel.BOTTOM);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setIconTextGap(10);
        label2.setText("JAVA");
        label2.setForeground(yellow);
        label2.setFont(new Font("Mv Boli",Font.BOLD,20));
        label2.setIcon(icon1);


        //creating panel
        JPanel redpanel =new JPanel();
        redpanel.setBackground(red);
        redpanel.setBounds(0,0,300,300);
        redpanel.add(label2);
        Border border = BorderFactory.createLineBorder(black,4);
        redpanel.setBorder(border);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(green);
        greenpanel.setBounds(300,0,300,300);
        greenpanel.add(label1);
        Border border1 = BorderFactory.createLineBorder(black,4);
        greenpanel.setBorder(border1);

        JPanel yellowpanel = new JPanel();
        yellowpanel.setBackground(yellow);
        yellowpanel.setBounds(0,300,600,300);
        yellowpanel.add(label);
        Border border2 = BorderFactory.createLineBorder(black,4);
        yellowpanel.setBorder(border2);

        //changing the layout of panel
        yellowpanel.setLayout(null);
        //yellowpanel.setLayout(new BorderLayout());



        JFrame frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setIconImage(icon3.getImage());
        frame2.setSize(750,750);
        frame2.setTitle("JAVA PANELS");
        frame2.setVisible(true);
        frame2.add(redpanel);
        frame2.add(greenpanel);
        frame2.add(yellowpanel);
    }
}

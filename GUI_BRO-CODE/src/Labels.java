import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Labels {
    public static void main(String[] args) throws FontFormatException {
        //Jlabel= a GUI which displays area for string of text,an image or both
        //a label is a JAVA component

        JLabel label = new JLabel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();


        //adding text to label
        label1.setText("WELCOME TO PDEU");
        label2.setText("Name : Aniket suthar");
        label3.setText("RollNo. : 21BCP229");
        label4.setText("Course : CSE");
        label5.setText("Subject : OOPS with JAVA");

        //adding image to label
        ImageIcon image = new ImageIcon("C:\\Users\\anike\\Downloads\\p.jpg");
        label.setIcon(image);

        //setting the position of text and image
        label.setHorizontalTextPosition(JLabel.CENTER); //set text = LEFT ,CENTER,RIGHT
        label.setVerticalTextPosition(JLabel.TOP);//set test TOP,CENTER,BOTTOM

        //changing color of text
        label.setForeground(Color.red);

        //changing font and size
        label1.setFont(new Font("MV Boli",Font.BOLD,20));
        label2.setFont(new Font("MV Boli",Font.BOLD,20));
        label3.setFont(new Font("MV Boli",Font.BOLD,20));
        label4.setFont(new Font("MV Boli",Font.BOLD,20));
        label5.setFont(new Font("MV Boli",Font.BOLD,20));
        label.setFont(new Font("MV Boli",Font.BOLD,20));
        //changing gap between image and text
        label.setIconTextGap(10);

        //changing label background color
        label.setBackground(Color.white);
        label.setOpaque(true);

        //creating border for the image
        Border border = BorderFactory.createLineBorder(Color.YELLOW,4);
        label.setBorder(border);

        //changing alignment of label (image+text)
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        //setting this whole label in a frame
        label.setBounds(200,0,300,300);
        label1.setBounds(200,320,300,20);
        label2.setBounds(200,350,300,20);
        label3.setBounds(200,380,300,20);
        label4.setBounds(200,410,300,20);
        label5.setBounds(200,440,300,20);

        JFrame frame = new JFrame();
        frame.setTitle("STUDENT'S INFORMATION");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.lightGray);
        //adding label in frame
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);



    }
}

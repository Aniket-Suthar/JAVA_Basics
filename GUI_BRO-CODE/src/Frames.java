import javax.swing.*;
import java.awt.*;

class Frames {
    public static void main(String[] args) {

        //Jframe = a GUI window to add components
        JFrame frame = new JFrame();  //creating a frame

        //setting the frame title
        frame.setTitle("My first JAVA frame");

        //setting x and y dimension of frame
        frame.setSize(500,500);

        //making the frame visible
        frame.setVisible(true);

        //closing frame along with the program using close window button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //preventing frame to be resize
        frame.setResizable(false);

        //creating an image icon
        ImageIcon image = new ImageIcon("apj3.jpeg");

        //changing icon of frame
        frame.setIconImage(image.getImage());

        //setting background color
        //frame.getContentPane().setBackground(Color.yellow);

        //setting color manualy
        frame.getContentPane().setBackground(new Color(123,100,22));

    }
}

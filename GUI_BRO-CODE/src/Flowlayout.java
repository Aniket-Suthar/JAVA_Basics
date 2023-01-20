import javax.swing.*;
import java.awt.*;

class Flowlayout {
    //FLowLayout=  places components in a row,sized at their
     //            preferred size.If Horizontal space in the container
     //            is too small, the flowlayout class uses the next available row.
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("FLOW LAYOUT");
        frame.setSize(500,500) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //changing the layout of frame
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        //changing the direction of button's flow default is centre and adding spacing  between buttons

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,100));
        panel.setBackground(Color.gray);
        panel.setLayout(new FlowLayout());

        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));

        JLabel label = new JLabel();
        label.setText("THIS IS A FLOW LAYOUT");
        label.setBounds(200,100,100,30);


        frame.add(panel);
        frame.add(label);
        frame.setVisible(true);


    }

}

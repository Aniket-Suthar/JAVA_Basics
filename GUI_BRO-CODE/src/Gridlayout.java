import javax.swing.*;
import java.awt.*;

class Gridlayout {
    //GridLayout  = places components in a grid cells
    //              each component takes all the available space
    //              within its cell,and each cell is of same size
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //changing the layout of frame
        frame.setLayout(new GridLayout(5, 3, 10, 10));
        JLabel label = new JLabel();
        label.setText("THIS IS A GRID LAYOUT");
        label.setBounds(5000, 0, 500, 30);
        frame.add(label);
        frame.setTitle("Grid Layout");
        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.add(new Button("7"));
        frame.add(new Button("8"));
        frame.add(new Button("enter"));
        frame.pack();
        frame.setVisible(true);


    }
}

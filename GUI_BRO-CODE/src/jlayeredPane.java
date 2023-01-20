import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class jlayeredPane {
    //Jlayered Pane= Swing container that provides a third dimension
     //              for positioning components ex. depth , Z-index

     public static void main(String[] args) {

          Border border = BorderFactory.createLineBorder(Color.black,5);

          JLabel label = new JLabel();
          label.setOpaque(true);
          label.setBackground(Color.orange);
          label.setBorder(border);
          label.setBounds(100,100,200,200);

          JLabel label1 = new JLabel();
          label1.setOpaque(true);
          label1.setBackground(Color.white);
          label1.setBorder(border);
          label1.setBounds(150,150,200,200);

          JLabel label2 = new JLabel();
          label2.setOpaque(true);
          label2.setBackground(Color.green);
          label2 .setBorder(border);
          label2.setBounds(200,200,200,200);


         JFrame frame = new JFrame();

     //creating JLayered pane
     JLayeredPane layeredPane = new JLayeredPane();
     layeredPane.setBounds(0,0,500,500);

//     layeredPane.add(label);
//     layeredPane.add(label1);
//     layeredPane.add(label2);

     //setting up panes according various positions
          layeredPane.add(label,Integer.valueOf(0));
          layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
          layeredPane.add(label2,Integer.valueOf(2));




     //naming of Jlayered pane = Default(base pane)->Palette->M odal->Popup->Drag(outermost pane)

     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(500,500);
     frame.setLayout(null);
     frame.setVisible(true);
     frame.add(layeredPane);


     }
}

import javax.swing.*;
import java.awt.*;

class Borderlayout {
    public static void main(String[] args) {


        //layout manager  = Defines the natural layout for components within a container

        //3 common managers
        //BorderLayout = A BorderLayout places components in five areas
        //NORTH,SOUTH,WEST,EAST,CENTER
        //All extra space is placed in the center area.

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p1.setBackground(Color.lightGray);
        p2.setBackground(Color.green);
        p3.setBackground(Color.red);
        p4.setBackground(Color.blue);
        p5.setBackground(Color.BLACK);

        JLabel label = new JLabel("THIS IS BORDERLAYOUT");
        label.setBounds(20, 20, 60, 50);
        label.setFont(new Font("Mv Boli", Font.BOLD, 30));

        p1.setPreferredSize(new Dimension(100, 100));
        p2.setPreferredSize(new Dimension(100, 100));
        p3.setPreferredSize(new Dimension(100, 100));
        p4.setPreferredSize(new Dimension(100, 100));
        p5.setPreferredSize(new Dimension(100, 100));
        p1.add(label);

        /*    SUB PANEL FOR CENTER LAYOUT */
        p2.setLayout(new BorderLayout(10, 10));

        JPanel pP1 = new JPanel();
        JPanel pP2 = new JPanel();
        JPanel pP3 = new JPanel();
        JPanel pP4 = new JPanel();

        JPanel pP5 = new JPanel();
        pP1.setBackground(Color.red);
        pP2.setBackground(Color.green);
        pP3.setBackground(Color.yellow);
        pP4.setBackground(Color.blue);
        pP5.setBackground(Color.BLACK);

        pP1.setPreferredSize(new Dimension(50, 50));
        pP2.setPreferredSize(new Dimension(50, 50));
        pP3.setPreferredSize(new Dimension(50, 50));
        pP4.setPreferredSize(new Dimension(50, 50));
        pP5.setPreferredSize(new Dimension(50, 50));

        p2.add(pP1, BorderLayout.NORTH);
        p2.add(pP2, BorderLayout.CENTER);
        p2.add(pP3, BorderLayout.SOUTH);
        p2.add(pP4, BorderLayout.EAST);
        p2.add(pP5, BorderLayout.WEST);
        /*  ENDS OF INNER PANEL FOR PANEL5 */

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("BorderLayout");
        //changing frame layout

        //adding margin to each panel in layout
        frame.setLayout(new BorderLayout(10, 10));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.CENTER);
        frame.add(p3, BorderLayout.SOUTH);
        frame.add(p4, BorderLayout.EAST);
        frame.add(p5, BorderLayout.WEST);


    }
}

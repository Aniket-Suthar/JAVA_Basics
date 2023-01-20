import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseMovement {
    public static void main(String[] args) {
        new frame7();
    }
}
class frame7 extends JFrame implements MouseListener {
    ImageIcon i;
    ImageIcon i1;
    ImageIcon i2;
    ImageIcon i3;
    ImageIcon i4;
    JLabel label;
    frame7(){
        i=new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\f.jpg");
        i1=new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\b.jpg");
        i2=new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\c.jpg");
        i3=new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\e.jpg");
        i4=new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\c.png");

        label = new JLabel();
        label.setBounds(200,100,300,300);
        label.setBackground(Color.white);


    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(700,500);
    this.setLayout(null);
    this.setVisible(true);
    this.add(label);
    this.getContentPane().setBackground(Color.gray);
    this.addMouseListener(this);
}

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse button is clicked..");
        label.setIcon(i);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse button is Pressed..");
        label.setIcon(i1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse button is Released..");
        label.setIcon(i2);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse button is Entered..");
        label.setIcon(i3);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse button is Exited..");
        label.setIcon(i4);

    }
}
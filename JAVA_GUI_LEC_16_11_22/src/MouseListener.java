import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

class MouseListener {
}

class myframe extends JFrame implements ActionListener, java.awt.event.MouseListener{
JButton button = new JButton("CLICK HERE");
JButton newButton = new JButton ("OK HERE");


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
        this.setBackground(Color.magenta);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
        this.setBackground(Color.green);
    }

}
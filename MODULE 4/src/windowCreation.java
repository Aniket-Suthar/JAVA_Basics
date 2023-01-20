import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class windowsCreation extends JFrame implements WindowListener {
    windowsCreation() {
        addWindowListener(this);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new windowsCreation(); //creating window
    }

    public void windowActivated(WindowEvent E) {
        System.out.println("Window is now activated");
    }

    public void windowClosed(WindowEvent E) {
        System.out.println("Window is now closed");
    }

    public void windowClosing(WindowEvent E) {
        System.out.println("Window is closing");
        dispose();
    }

    public void windowDeactivated(WindowEvent E) {
        System.out.println("Window is now deactivated");
    }

    public void windowDeiconified(WindowEvent E) {
        System.out.println("Window is deiconified");
    }

    public void windowIconified(WindowEvent E) {
        System.out.println("Window is iconified");
    }

    public void windowOpened(WindowEvent E) {
        System.out.println("Window is now again opened");
    }
}
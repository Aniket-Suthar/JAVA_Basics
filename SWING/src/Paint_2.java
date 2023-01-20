import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class BallDEMO extends JFrame implements Runnable {
    MyPanel p1;
    BallDEMO(){
//                                                JFrame jf = new JFrame();     // extend jframe in public class Balldemo
        p1 = new MyPanel();
//      this.getContentPane().add(new MyPanel());     //either this or the below one can be used to add the panel
        this.setSize(1000 , 1000);
        this.add(p1);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void run() {
        while(true){
            p1.repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        BallDEMO b1 = new BallDEMO();
        Thread t = new Thread(b1);
        t.start();

    }

}


class MyPanel extends JPanel{
    int x = 10;
    int y = 10;
    public void paint(Graphics g){
        x = x+10;
        y = y+10;

        g.fillOval(x  ,y, 100,100);
    }
}
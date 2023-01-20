
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


 class bouncingball {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("MOVING BALL");
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Thread t = new Thread(panel);
        t.start();
    }
}
class MyPanel extends JPanel implements Runnable{
    int x = 0;
    int y = 0;
    boolean axisx = true;
    boolean axisy = true;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(axisx==true && axisy ==true)
            g.setColor(Color.YELLOW);
        else if(axisx==true && axisy ==false)
            g.setColor(Color.GREEN);
        else if(axisx==false && axisy ==true)
            g.setColor(Color.RED);
        else
            g.setColor(Color.black);
        g.fillOval(x, y, 100, 100);

    }

    @Override
    public void run() {
        while(true)
        {   if(axisx == true)
        {
            x = x+20;
            if(x>=(this.getWidth()-100))axisx =false;
        }
        else
        {
            x = x-20;
            if(x<=0)axisx =true;
        }
            if(axisy == true)
            {
                y = y+20;
                if(y>=(this.getHeight()-100)) axisy =false;
            }
            else
            {
                y = y-20;
                if(y<=20) axisy =true;
            }
            try { Thread.sleep(50);}
            catch (InterruptedException ex) {}

            this.repaint();
        }
    }
}
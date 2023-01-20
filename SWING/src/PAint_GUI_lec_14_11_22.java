import javax.swing.*;
import java.awt.*;

class Balldemo extends JFrame implements Runnable{
    Mypanel p1;

    Balldemo() {
        new Mypanel();
        //Creating panel == Canvas
//       Jpanel jp = new Jpanel()   2nd way to create panel

        //setting the size of content pane
        this.setSize(1000,1000);

        //adding Mypanel objet to content pane
        this.add(p1);
        this.setVisible(true);

        //setting the close button of gui window to close the program
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void run(){
        while(true){
            p1.repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Balldemo b =new Balldemo();
        Thread th = new Thread(b);
        th.start();
    }

}

//creating panel = canvas

//Repaint method = clear Canvas(panel) and repaints the object/shape selected
class Mypanel extends JPanel{
    int x=10;
    int y=10;
    public void paint(Graphics g){ //paint method to paint and Graphics "g" is a kind of "pen"
        if(x<=900){
            x = x + 10;
        }
        else {
            x=x-10;
        }

        if(y<=900){
        y+=10;}
        else {
            y-=10;
        }
        g.clearRect(0,0,1000,1000);
        g.fillOval(20, 20, 100, 100);
    }
}
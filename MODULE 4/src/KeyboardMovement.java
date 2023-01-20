import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class frame6 extends JFrame implements KeyListener{
    JLabel label;
    frame6(){
        label = new JLabel();
        label.setBounds(200,150,150,100);
        label.setBackground(Color.gray);
        label.setOpaque(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);
        this.setLayout(null);
        this.add(label);
        this.setVisible(true);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //invoked when a key is typed ,USEs keyCHar,char output
        label.setBackground(Color.yellow);
        label.setText("KEY IS TYPED");
        System.out.println("YOu typed the key: "+e.getKeyChar());
  }


    @Override
    public void keyPressed(KeyEvent e) {
        //Invoked when a physical key is pressed down. USes keyCOde ,int o/p
        System.out.println("you have  PRESSED: "+e.getKeyChar());
        label.setText("KEY IS PRESSED");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //called whenever a button is released
        label.setText("KEY IS RELEASED");
        System.out.println("You have released key char: "+e.getKeyChar());
        label.setBackground(Color.green);
    }
}
class test{
    public static void main(String[] args) {
        new frame6();
    }
}

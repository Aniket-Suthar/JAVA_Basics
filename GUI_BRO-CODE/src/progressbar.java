import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;

class progressbar {
// progress bar = Visual aid to let the user know that an operation is processing
     public static void main(String[] args) throws InterruptedException {
new fr5();
     }
}

class fr5 {
    JFrame frame=new JFrame();
    JProgressBar jpr= new JProgressBar();
    fr5() throws InterruptedException {
        jpr.setValue(0);
        jpr.setBounds(0,0,420,20);
        jpr.setStringPainted(true);
        jpr.setFont(new Font("MV Boli",Font.BOLD,25));
        jpr.setForeground(Color.darkGray);
        jpr.setBackground(Color.BLACK);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(jpr);
        frame.setVisible(true);
        frame.setLayout(null);
        fill();

    }
    public void fill() throws InterruptedException {
        int c=0;
        while(c<=100){
            jpr.setValue(c);
            Thread.sleep(100);
            c+=10;
        }
        jpr.setString("FINISHED...");


    }
}

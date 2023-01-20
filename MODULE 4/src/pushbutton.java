import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class push extends JFrame implements ActionListener {
    JTextField tf;

    push() {
        JFrame f = new JFrame("PUSH BUTTON");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField();
        f.setLayout(null);
        tf.setBounds(50, 50, 250, 30);
        Button b = new Button("CLICK ME");
        b.setBounds(150, 150, 70, 40);
        b.addActionListener(this);

        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("YOU HAVE PRESSED THE BUTTON.");

    }

    public static void main(String[] args) {
        new push();
    }
}



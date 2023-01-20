import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NewWindow {
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel("HELLO IM THE NEW WINDOW");

    NewWindow() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label1);
    }

    public static void main(String[] args) {
        LaunchPage page = new LaunchPage();
    }
}

class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");


    LaunchPage() {
        button.setBounds(130, 200, 200, 30);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //for closing the main window after opening the new window
            //frame.dispose();
            NewWindow window = new NewWindow();
        }

    }
}

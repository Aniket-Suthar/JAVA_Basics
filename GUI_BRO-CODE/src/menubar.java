import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class menubar {
    public static void main(String[] args) {
        new fr6();
    }
}

class fr6 extends JFrame implements ActionListener {
    JMenuItem l;
    JMenuItem l1;
    JMenuItem l2;

    fr6() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        this.setJMenuBar(menuBar);
        JMenu m = new JMenu("FILE");
        JMenu m1 = new JMenu("EDIT");
        JMenu m2 = new JMenu("VIEW");
        JMenu m3 = new JMenu("NAVIGATE");

        l = new JMenuItem("Save");
        l1 = new JMenuItem("Save as");
        l2 = new JMenuItem("Exit");

        m.add(l);
        m.add(l1);
        m.add(l2);

        l.setMnemonic(KeyEvent.VK_S);//s for save
        l1.setMnemonic(KeyEvent.VK_A);//a for save as
        l2.setMnemonic(KeyEvent.VK_E);//e for exit

        m.setMnemonic(KeyEvent.VK_F); //alt+f to file
        m1.setMnemonic(KeyEvent.VK_E);//alt+e to edit
        m2.setMnemonic(KeyEvent.VK_V);//alt+v to exit


        l.addActionListener(this);
        l1.addActionListener(this);
        l2.addActionListener(this);


        menuBar.add(m);
        menuBar.add(m1);
        menuBar.add(m2);
        menuBar.add(m3);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == l) {
            System.out.println("YOUR ITEM IS SAVED");
        } else if (e.getSource() == l1) {
            System.out.println("YOUR ITEM IS SAVED as 'aniket'");
        } else if (e.getSource() == l2) {
            System.out.println("exit...");
            this.dispose();
        }
    }
}
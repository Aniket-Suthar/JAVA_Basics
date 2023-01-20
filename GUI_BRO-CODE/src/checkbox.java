import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class checkbox {

    //JCheckBox= a GUI component that can be selected or deselected


    public static void main(String[] args) {
        new fr();
    }
}

class fr extends JFrame implements ActionListener {
    JCheckBox box;
    JButton button;
    ImageIcon i;
    ImageIcon i1;

    fr() {
        i=new ImageIcon("C:\\Users\\anike\\OneDrive\\Pictures\\r.jpg");
        i1=new ImageIcon("C:\\Users\\anike\\OneDrive\\Pictures\\w.jpg");

        box = new JCheckBox();
        box.setText("ARE you READY?");
        box.setFont(new Font("Times New Roman", Font.BOLD, 15));
        box.setFocusable(false);
        box.setIcon(i1);
        box.setSelectedIcon(i);

        button = new JButton("Exit");
        button.addActionListener(this);


        this.setVisible(true);
        this.setLayout(new FlowLayout(50));
        this.add(box);
        this.add(button);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(box.isSelected());

        }

    }
}


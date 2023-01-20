import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class dialoguebox extends WindowAdapter implements ActionListener {
    Frame frame,frame2;
    Label label1,label2;
    TextField field1;
    Button button1, button2, button3;
    Dialog d1, d2;
    dialoguebox() {
        frame = new Frame(" Dialog Box  ");
        button1 = new Button(" Open ");
        label1 = new Label(" Click below to open the dialog box ");
        frame = new Frame(" New Dialog Box ");
        button2 = new Button(" Open NEw ");
        label2 = new Label(" Click below to open the new dialog box ");
        frame.add(label1);

        frame.add(button1);
        button1.addActionListener(this);
        frame.pack();
        frame.add(label2);
        frame.add(button2);
        button2.addActionListener(this);
        frame.pack();
        frame.setLayout(new FlowLayout());
        frame.setSize(330, 250);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==button1) {
            d1 = new Dialog(frame, " Dialog Box ", true);
            Label label = new Label(" This is the Dialog Box. ", Label.CENTER);
            d1.add(label);
            d1.addWindowListener(this);
            d1.pack();
            d1.setLocationRelativeTo(frame);
            d1.setLocation(new Point(100, 100));
            d1.setSize(400, 200);
            d1.setVisible(true);
            d1.dispose();

        }
        else if (ae.getSource()==button2) {
            d2 = new Dialog(frame, " NEw Dialog BOX ", true);
            Label label2 = new Label(" Welcome to PDEU ..... ", Label.CENTER);
            d2.add(label2);
            d2.addWindowListener(this);
            d2.pack();
            d2.setLocationRelativeTo(frame);
            d2.setLocation(new Point(100, 100));
            d2.setSize(400, 200);
            d2.setVisible(true);


        }
    }

    public static void main(String[] args) {
        new dialoguebox();
    }
}
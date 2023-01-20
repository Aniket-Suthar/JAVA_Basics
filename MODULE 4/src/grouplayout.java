import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 class grouplayout implements ActionListener {
    static JLabel l;
     static JButton button;
    grouplayout() {

        ImageIcon i4=new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\c.png");
        l = new JLabel();
        l.setVisible(false);
        l.setIcon(i4);

        JFrame frame = new JFrame("GROUP LAYOUT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);

        contentPanel.setLayout(groupLayout);

        JLabel clickMe = new JLabel("CLICK ON THIS BUTTON to OPEN IMAGE ");
         button = new JButton("This Button");

        button.addActionListener(this);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(clickMe)
                        .addGap(10, 20, 100)
                        .addComponent(button)
                        .addGap(10, 20, 100)
                        .addComponent(l)
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(clickMe)
                        .addComponent(button)
                        .addComponent(l));
        frame.pack();
        frame.setVisible(true);
    }

     @Override
     public void actionPerformed(ActionEvent e) {
         if(e.getSource()==button){
             l.setVisible(true);
         }
     }

     public static void main(String[] args) {
         new grouplayout();
     }
 }
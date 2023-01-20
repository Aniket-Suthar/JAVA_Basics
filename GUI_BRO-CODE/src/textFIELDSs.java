import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class textFIields {
    //JTextField = a gui component that can be used to add ,set,or gert text
    public static void main(String[] args) {
        myfr frame = new myfr();
    }

}

class myfr extends JFrame implements ActionListener{
    JButton button,button1;
    JTextField textfield;
    myfr(){

        //creating JTextField
        textfield=new JTextField();
//        textfield.setSize(250,40);
        textfield.setPreferredSize(new Dimension(250,40));
        textfield.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        textfield.setForeground(Color.red);
        textfield.setBackground(Color.gray);

        //restricting editing
        //textfield.setEditable(false);


        button=new JButton("Submit");
        button.addActionListener(this);

        button1=new JButton("EXIT");
        button1.addActionListener(this);


        this.setVisible(true);
        this.setLayout(new FlowLayout(40));
        this.setSize(500,500);
//        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(textfield);
        this.add(button);
        this.add(button1);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){

            //getting text in the text field
            System.out.println("HEllO "+textfield.getText());
        } else if (e.getSource()==button1) {
            this.dispose();
            System.out.println("THANK YOU....");

        }
    }
}



import javax.swing.*;
class Simple2 extends JFrame{
    JFrame f;
    Simple2(){

        JButton b=new JButton("click");
        b.setBounds(300,300,200, 200);

        add(b);

        setSize(600,600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Simple2();
    }
}
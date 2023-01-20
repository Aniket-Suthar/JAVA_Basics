import java.awt.*;
import javax.swing.*;

class Boxlayout extends Frame
{
    Button buttons[];

    public Boxlayout()
    {
        JFrame f = new JFrame();
        f.setTitle("BOX LAYOUT");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pnl = new JPanel();
        JLabel label = new JLabel();
        label.setText("THIS IS A BOX LAYOUT");
        label.setBounds(90,10,200,40);
        label.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(label);
        add(pnl);
        buttons = new Button[5];
        GridBagConstraints constrntObj = new GridBagConstraints();

        constrntObj.fill = GridBagConstraints.VERTICAL;
        for (int i = 0; i < 5; i++)
        {
            buttons[i] = new Button ("CLICK ME im BUTTON : " + (i + 1));

            // adding the buttons so that it can be displayed  
            add(buttons[i]);
        }

// the components will be displayed in the form of  line is presented on a page
        setLayout (new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setSize(400, 400);
        setVisible(true);
    }


    public static void main(String argvs[])
    {

        Boxlayout obj = new Boxlayout();
    }
}  
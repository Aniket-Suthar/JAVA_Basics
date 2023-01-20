import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

class sliders {
    // JSlider =GUI component that lets user enter a value
    //          by using an adjustable sliding knob on a track
    public static void main(String[] args) {
        new fr3();
    }
}

class fr3 implements ChangeListener {
JFrame frame;
JPanel panel = new JPanel();
JSlider slider;
JLabel label;

fr3(){

    frame= new JFrame();
    panel = new JPanel();
    label= new JLabel();

    slider= new JSlider(0,100,1);
    slider.setPreferredSize(new Dimension(400,200));
    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(10);

    slider.setPaintTrack(true);
    slider.setPaintLabels(true);
    slider.setMajorTickSpacing(25);
    slider.setFont(new Font("MV Boli",Font.BOLD,10));

    slider.setOrientation(SwingConstants.VERTICAL);
slider.addChangeListener(this);


    panel.add(slider);
    panel.add(label);
    frame.add(panel);
    frame.setSize(420,420);
    frame.setVisible(true);




}
@Override
    public void stateChanged(ChangeEvent e){
    label.setText("Degree Celsius "+slider.getValue());
    }
}
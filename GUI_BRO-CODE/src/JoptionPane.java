import javax.swing.*;

class JoptionPane {
    //JOption Pane= pop up a standard dialog box that prompts users for a
    //              value or informs them of something
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("C:\\Users\\anike\\Downloads\\SOFTWARES\\a.png");

        //creating a dialogbox/JOptionpane
        JOptionPane.showMessageDialog(null,"THIS IS SOME INFO","TITLE",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"IMFORMATION MESSAGE ","TITLE",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"QUESTION MESSAGE","TITLE",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"WARNING MESSAGE","TITLE",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"ERROR MESSAGE","TITLE",JOptionPane.ERROR_MESSAGE);

        //Other Dialog Boxes
        JOptionPane.showConfirmDialog(null,"ARE YOU A CODER?","CONFIRM",JOptionPane.YES_NO_CANCEL_OPTION);

        //input dialog box
        String name= JOptionPane.showInputDialog("ENTER YOUR NAME:");
        System.out.println("Hello "+ name);

        //combined DIalogBox
        String[] responses = {"PRO!", "NOOB!", "BEGINNER!"};
        JOptionPane.showOptionDialog(null, "WHICH TYPE OF CODER ARE YOU ?", "JAVA GUI", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, image, responses, 0);

    }
}

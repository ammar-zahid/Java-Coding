package Codes;
import javax.swing.JOptionPane;

public class DialogBoxInputOutput {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog(null, "Enter your name");
        String age = JOptionPane.showInputDialog(null, "Enter your age");
        String rollno = JOptionPane.showInputDialog(null, "Enter your roll no");

        JOptionPane.showMessageDialog(null, "Your Name is " + name, "DialogBox", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your Age is "+age, "DialogBox", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your Roll no is "+rollno, "DialogBox", JOptionPane.PLAIN_MESSAGE);
    }    
}

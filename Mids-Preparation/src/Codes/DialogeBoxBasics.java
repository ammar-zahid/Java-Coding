package Codes;
import javax.swing.JOptionPane;

public class DialogeBoxBasics {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Enter your Information", "Info Box", JOptionPane.PLAIN_MESSAGE);

        String name = JOptionPane.showInputDialog(null, "What is your name? ");
        String age = JOptionPane.showInputDialog(null, "Enter your age");
        
        System.out.println(name);
        System.out.println(age);


    }
}

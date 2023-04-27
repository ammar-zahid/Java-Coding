// write a program to check whether a number is positive or negative or zero

package Codes;
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Zero");
        }
        else if (n > 0) {
            System.out.println("Positve");
        }
        else {
            System.out.println("Negative");
        }
        sc.close();
    }    
}

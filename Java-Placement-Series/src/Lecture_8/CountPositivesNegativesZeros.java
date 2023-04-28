// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

package Lecture_8;
import java.util.Scanner;

public class CountPositivesNegativesZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, zeros = 0, positives = 0, negatives = 0;
        char choice;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if (num == 0) {
                zeros = zeros + 1;
            }
            else if (num > 0) {
                positives = positives + 1;
            }
            else {
                negatives = negatives + 1;
            }

            System.out.print("Enter y for continue and n for stop: ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Zeros " + zeros);
        System.out.println("Positives "  + positives);
        System.out.println("Negatives " + negatives);
        
        sc.close();
    }    
}

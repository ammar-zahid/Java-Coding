// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

package Lecture_8;
import java.util.Scanner; 

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("Greatest Common Divisor is " + gcd);
        sc.close();
    }    
}

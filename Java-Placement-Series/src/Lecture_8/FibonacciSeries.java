// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)

package Lecture_8;
import java.util.Scanner; 

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of series: ");
        int length = sc.nextInt();

        int a = 0 , b = 1;
        System.out.print(a + " " + b);

        for (int i = 2; i <= length; i++) {
            int c = a + b;
            System.out.print(" " + c);

            a = b;
            b = c;
        }

        sc.close();
    }    
}

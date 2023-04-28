// Write a function to print the sum of all Odd numbers from 1 to n

package Lecture_8;
import java.util.Scanner;

public class OddNumbersSumFunction {
    public static int Sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int answer = Sum(n);

        System.out.println("Sum of odd numbers from 1 to n is : " + answer);
        sc.close();
    }
}

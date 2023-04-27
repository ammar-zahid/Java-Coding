// Write a function to print factorial of a given number 

package Codes;
import java.util.Scanner;

public class FactorialFunction {
    public static int Factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int answer = Factorial(n);

        System.out.println("Factorial of " + n + " is " + answer);
        sc.close();
    }
}

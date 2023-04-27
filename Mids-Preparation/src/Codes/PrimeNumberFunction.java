// Write a function to check whether a number is prime or not 

package Codes;

import java.util.Scanner;

public class PrimeNumberFunction {
    public static void PrimeOrNot(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PrimeOrNot(n);

        sc.close();
    }
}

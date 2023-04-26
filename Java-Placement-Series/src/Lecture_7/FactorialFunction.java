package Lecture_7;

import java.util.*;
public class FactorialFunction {
    public static int Factorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int answer = Factorial(n);

        System.out.println("Factorial of number is " + answer);
        sc.close();
    }
}

// Make a function to check if a number is prime or not
package Lecture_7.HomeWork_Problems;

import java.util.*;
public class Qno_1 {
    public static void PrimeNumber(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        if(count == 2){
        System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PrimeNumber(n);
        sc.close();
    }
}

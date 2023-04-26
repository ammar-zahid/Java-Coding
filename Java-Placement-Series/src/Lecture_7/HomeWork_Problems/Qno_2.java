// Make a function to check if a given number n is even or not.

package Lecture_7.HomeWork_Problems;

import java.util.*;
public class Qno_2 {
    public static void EvenOdd(int n){
        if (n % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        EvenOdd(n);
        sc.close();
    }
}

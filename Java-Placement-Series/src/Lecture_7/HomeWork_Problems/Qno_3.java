// Make a function to print the table of a given number n.
package Lecture_7.HomeWork_Problems;

import java.util.*;
public class Qno_3 {
    public static void Table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Table(n);
        sc.close();
    }
}

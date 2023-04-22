package Lecture_3;

import java.util.*;
public class NumbersComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if (x == y) {
            System.out.println("x == y");
        }
        else if (x > y) {
            System.out.println("x > y");
        }
        else{
            System.out.println("x < y");
        }
        sc.close();
    }
}

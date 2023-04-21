package Lecture_2;

import java.util.*;
public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        int sum = x + y;

        System.out.println(x + " + " + y + " = " + sum);
        sc.close();
    }
}

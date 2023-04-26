package Lecture_7;

import java.util.*;
public class NumbersSumFunction {
    public static int Sum(int x, int y){
        int sum = x + y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        int sum = Sum(x, y);

        System.out.print(x + " + " + y + " = " + sum);
        sc.close();
    }
}

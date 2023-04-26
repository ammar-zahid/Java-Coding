// Write a function which takes in 2 numbers and returns the greater of those two.

package Codes;

import java.util.Scanner;
public class GreaterNumberFunction {
    public static void GreaterNumber(int x, int y){
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (y > x) {
            System.out.print(y + " is greater than " + x);
        } else {
            System.out.println(x + " and " + y + " are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        GreaterNumber(x, y);
        sc.close();
    }
}

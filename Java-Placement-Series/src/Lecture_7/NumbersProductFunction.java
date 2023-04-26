package Lecture_7;

import java.util.*;
public class NumbersProductFunction {
    public static int Product(int x, int y){
        int product = x * y;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        int product = Product(x, y);

        System.out.print(x + " x " + y + " = " + product);
        sc.close();
    }
}

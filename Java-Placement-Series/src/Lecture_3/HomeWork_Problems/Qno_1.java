// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b

package Lecture_3.HomeWork_Problems;

import java.util.*;
public class Qno_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operation \n1. Addition, \n2. Subtraction, \n3. Multiplication, \n4. Division, \n5. Remainder: ");
        int operation = sc.nextInt();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        switch(operation){
            case 1: System.out.println(x + " + " + y + " = " + (x + y));
            break;

            case 2: System.out.println(x + " - " + y + " = " + (x - y));
            break;

            case 3: System.out.println(x + " x " + y + " = " + (x * y));
            break;

            case 4: System.out.println(x + " / " + y + " = " + (x / y));
            break;

            case 5: System.out.println(x + " % " + y + " = " + (x % y));
            break;

            default: System.out.println("Invalid Choice");
        }
        sc.close();
    }
}

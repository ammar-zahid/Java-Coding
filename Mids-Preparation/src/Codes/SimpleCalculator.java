// create a simple calculator 

package Codes;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Choose an operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        }
        else if (op == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        }
        else if (op == '*') {
            System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
        }
        else if (op == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }

        System.out.print("enter y for continue and n for stop");
        choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}

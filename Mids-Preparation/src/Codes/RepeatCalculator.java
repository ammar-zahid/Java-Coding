package Codes;
import java.util.Scanner;

public class RepeatCalculator {
    public static void Calculator(){
        Scanner sc = new Scanner(System.in);
        char repeat;

        do{
        System.out.println("Choose an operation\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division ");
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
            default: System.out.println("Invalid Input");
        }
        System.out.println("Press y for another operation and n for stop (y/n): ");
        repeat = sc.next().charAt(0);
    } while (repeat == 'y' || repeat == 'Y');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator();

        sc.close();
    }
}

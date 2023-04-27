// Write a function to print the multiplication table of a given number using a for loop. And take choice from user if he wants to enter another. (y for yes & n for no)

package Codes;

import java.util.Scanner;

public class TableFunction {

    public static void Table() {
        Scanner sc = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + n * i);
            }

            System.out.print("y for another table and n for no: ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        sc.close();
    }

    public static void main(String[] args) {

        Table();

    }
}

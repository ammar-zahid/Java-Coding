// Two numbers are entered by the user, x and y. Write a function to find the value of one number raised to the power of another i.e. xn.
package Lecture_8;
import java.util.Scanner;

public class PowerFunction {
    public static double Power(int x, int y){
        double power = Math.pow(x, y);
        return power;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        double answer = Power(x, y);

        System.out.println("Answer is " + answer);
        sc.close();
    }
}

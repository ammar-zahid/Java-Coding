// Enter 3 numbers from the user & make a function to print their average.

package Lecture_8;

import java.util.Scanner;
public class AverageFunction {
    public static double Average(int x, int y, int z){
        int avg;
        avg = (x + y + z) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        System.out.print("Enter z: ");
        int z = sc.nextInt();

        double answer = Average(x, y, z);

        System.out.println("Average is " + answer);
        sc.close();
    }
}

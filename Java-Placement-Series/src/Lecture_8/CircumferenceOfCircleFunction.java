// Write a function that takes in the radius as input and returns the circumference of a circle.
package Lecture_8;
import java.util.Scanner;

public class CircumferenceOfCircleFunction {
    public static double Circumference(double radius){
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double answer = Circumference(radius);

        System.out.println("Circumference of circle is " + answer);
        sc.close();
    }
}

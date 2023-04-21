// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

package Lecture_2.HomeWork_Problems;

import java.util.*;
public class Qno_2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter radius of a circle: ");
     double radius = sc.nextDouble();

     final double PI = 3.14;
     double area = PI * radius * radius;

     System.out.println("Area of circle is " + area);
     sc.close();
    }
}

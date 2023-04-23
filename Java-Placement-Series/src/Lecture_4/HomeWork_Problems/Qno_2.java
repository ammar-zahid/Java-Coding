// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)

package Lecture_4.HomeWork_Problems;

import java.util.*;
public class Qno_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        
        do {
            System.out.print("Enter marks : ");
            int marks = sc.nextInt();

            if (marks >= 90) {
                System.out.println("This is Good");
            }
            else if (marks >= 60 && marks < 90) {
                System.out.println("This is also Good");
            }
            else if (marks >= 0 && marks < 60) {
                System.out.println("This is also good\nBecause marks don't matter but our effort does");
            }

            System.out.print("Enter a number (1 to continue, 0 to stop) : ");
            n = sc.nextInt();
            
        } while (n == 1);
        sc.close();
    }
}

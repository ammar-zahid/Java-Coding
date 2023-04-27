// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
package Codes;
import java.util.Scanner;

public class EeligibleForVote {
    public static void Age(int age){
        if (age >= 18) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible for vote");
        }
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Age(age);
        sc.close();
    }
}

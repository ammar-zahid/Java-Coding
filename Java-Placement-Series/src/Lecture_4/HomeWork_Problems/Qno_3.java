// Print if a number is prime or not (Input n from the user). 
package Lecture_4.HomeWork_Problems;

import java.util.*;

public class Qno_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }

        if(count == 2){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
        sc.close();
    }
}

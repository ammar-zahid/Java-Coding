package Lecture_4;

import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of n numbers is " + sum);
        sc.close();
    }
}

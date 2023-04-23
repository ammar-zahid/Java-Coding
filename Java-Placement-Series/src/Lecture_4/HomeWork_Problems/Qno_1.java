// Print all even numbers till n

package Lecture_4.HomeWork_Problems;

import java.util.*;
public class Qno_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

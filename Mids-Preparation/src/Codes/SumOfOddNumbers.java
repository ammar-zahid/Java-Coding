// Write a program to print the sum of all the odd numbers between 1 and 50 using a do-while loop.

package Codes;

public class SumOfOddNumbers {
    public static void main(String[] args) {      

        int i = 1, sum = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
            }
            i++;
        } while (i <= 50);

        System.out.println("Sum of odd numbers from 1 to 50 is " + sum );
    }
}

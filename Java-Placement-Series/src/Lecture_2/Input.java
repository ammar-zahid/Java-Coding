package Lecture_2;

import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println(name);
        sc.close();
    }
}

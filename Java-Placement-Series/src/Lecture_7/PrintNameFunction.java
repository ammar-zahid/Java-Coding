package Lecture_7;

import java.util.*;
public class PrintNameFunction {
    public static void PrintName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        PrintName(name);
        sc.close();
    }
}

package Lecture_3;

import java.util.*;
public class GreetingsIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press any button (1. Hello, 2. Salaam, 3. Bonjour): ");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        }
        else if (button == 2){
            System.out.println("Salaam");
        }
        else if (button == 3) {
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Wrong button");
        }
        sc.close();
    }
}

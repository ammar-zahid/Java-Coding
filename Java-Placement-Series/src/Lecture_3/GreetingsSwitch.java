package Lecture_3;

import java.util.*;
public class GreetingsSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press a button (1. Hello, 2. Salaam, 3. Bonjour): ");
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Salaam");
            break;

            case 3: System.out.println("Bonjour");
            break;

            default: System.out.println("Wrong button");
        }
        
        sc.close();
    }
}

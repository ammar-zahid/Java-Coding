package Codes;
import java.util.Scanner;

class Cars{
    String name;
    String model;
    String company;

    public void Info(){
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.company);
    }
}
public class ClassesAndObjectsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cars car1 = new Cars();
        System.out.print("What is the name of the car? ");
        car1.name = sc.nextLine();

        System.out.print("What is the model of the car? ");
        car1.model = sc.nextLine();

        System.out.print("What is the company name of the car? ");
        car1.company = sc.nextLine();

        Cars car2 = new Cars();
        System.out.print("What is the name of the car? ");
        car2.name = sc.nextLine();

        System.out.print("What is the model of the car? ");
        car2.model = sc.nextLine();

        System.out.print("What is the company name of the car? ");
        car2.company = sc.nextLine();

        car1.Info();
        sc.close();
    }
}

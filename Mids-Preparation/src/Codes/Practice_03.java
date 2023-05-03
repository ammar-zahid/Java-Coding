package Codes;

import java.util.Scanner;

class  car {
    String name;
    int model;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  int getModel(){
        return model;
    }
    public void setModel(int model){
        this.model = model;
    }
}

public class Practice_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        car car1 = new car();
        System.out.print("Enter name for car 1: ");
        car1.setName(input.next());
        System.out.print("Enter model for car 1: ");
        car1.setModel(input.nextInt());

        car car2 = new car();
        System.out.print("Enter name for car 2: ");
        car2.setName(input.next());
        System.out.print("Enter model for car 2: ");
        car2.setModel(input.nextInt());

        // Printing Information

        System.out.println("Car 1 details");
        System.out.println("Name: " + car1.getName());
        System.out.println("Model: " + car1.getName());

        System.out.println("Car 2 details");
        System.out.println("Name: " + car2.getName());
        System.out.println("Model: " + car2.getModel());

        input.close();

    }
}

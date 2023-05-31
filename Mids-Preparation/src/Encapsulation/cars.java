package Encapsulation;

import java.util.Scanner;
class CarDetails {
    public String name;
    public String model;
    public int year;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
}

public class cars{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarDetails car1 = new CarDetails();
        System.out.print("Enter car1 name: ");
        car1.setName(sc.nextLine());
        System.out.print("Enter car1 model: ");
        car1.setModel(sc.nextLine());
        System.out.print("Enter car1 year: ");
        car1.setYear(sc.nextInt());

        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.year);
        sc.close();
    }
}

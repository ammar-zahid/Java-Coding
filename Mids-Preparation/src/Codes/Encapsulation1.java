package Codes;

import java.util.Scanner;

 class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 }
    public class Encapsulation1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Enter name: ");
        person.setName(scanner.nextLine());
        System.out.print("Enter age: ");
        person.setAge(scanner.nextInt());
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        scanner.close();
    }
}


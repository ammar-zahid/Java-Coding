package Codes;

import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Practice_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee();
        System.out.print("Enter employee 1 name: ");
        employee1.setName(sc.next());

        System.out.print("Enter employee 1 age: ");
        employee1.setAge(sc.nextInt());

        System.out.print("Enter employee 1 sallary: ");
        employee1.setSalary(sc.nextDouble());

        Employee employee2 = new Employee();
        System.out.print("Enter employee 1 name: ");
        employee2.setName(sc.next());

        System.out.print("Enter employee 1 age: ");
        employee2.setAge(sc.nextInt());

        System.out.print("Enter employee 1 sallary: ");
        employee2.setSalary(sc.nextDouble());

        System.out.println("Employees Details");
        System.out.println("Employee 1");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Age: " + employee1.getAge());
        System.out.println("Salary: " + employee1.getSalary());

        System.out.println("Employee 2");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Age: " + employee2.getAge());
        System.out.println("Salary: " + employee2.getSalary());

        sc.close();
    }
}
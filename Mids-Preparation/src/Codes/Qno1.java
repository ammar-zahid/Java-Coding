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

public class Qno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the first employee
        Employee employee1 = new Employee();
        System.out.print("Enter name for employee 1: ");
        employee1.setName(scanner.nextLine());
        System.out.print("Enter age for employee 1: ");
        employee1.setAge(scanner.nextInt());
        System.out.print("Enter salary for employee 1: ");
        employee1.setSalary(scanner.nextDouble());
        scanner.nextLine(); // Consume the remaining newline character

        // Create the second employee
        Employee employee2 = new Employee();
        System.out.print("Enter name for employee 2: ");
        employee2.setName(scanner.nextLine());
        System.out.print("Enter age for employee 2: ");
        employee2.setAge(scanner.nextInt());
        System.out.print("Enter salary for employee 2: ");
        employee2.setSalary(scanner.nextDouble());
        scanner.nextLine(); // Consume the remaining newline character

        // Create the third employee
        Employee employee3 = new Employee();
        System.out.print("Enter name for employee 3: ");
        employee3.setName(scanner.nextLine());
        System.out.print("Enter age for employee 3: ");
        employee3.setAge(scanner.nextInt());
        System.out.print("Enter salary for employee 3: ");
        employee3.setSalary(scanner.nextDouble());
        scanner.nextLine(); // Consume the remaining newline character

        // Display information about the employees
        System.out.println("\nEmployee 1: ");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Age: " + employee1.getAge());
        System.out.println("Salary: $" + employee1.getSalary());

        System.out.println("\nEmployee 2: ");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Age: " + employee2.getAge());
        System.out.println("Salary: $" + employee2.getSalary());

        System.out.println("\nEmployee 3: ");
        System.out.println("Name: " + employee3.getName());
        System.out.println("Age: " + employee3.getAge());
        System.out.println("Salary: $" + employee3.getSalary());

        scanner.close();
    }
}

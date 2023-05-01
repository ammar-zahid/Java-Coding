package Codes;

import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int rollNo;

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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class Qno2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the first student
        Student student1 = new Student();
        System.out.print("Enter name for student 1: ");
        student1.setName(scanner.nextLine());
        System.out.print("Enter age for student 1: ");
        student1.setAge(scanner.nextInt());
        System.out.print("Enter roll number for student 1: ");
        student1.setRollNo(scanner.nextInt());
        scanner.nextLine(); // Consume the remaining newline character

        // Create the second student
        Student student2 = new Student();
        System.out.print("Enter name for student 2: ");
        student2.setName(scanner.nextLine());
        System.out.print("Enter age for student 2: ");
        student2.setAge(scanner.nextInt());
        System.out.print("Enter roll number for student 2: ");
        student2.setRollNo(scanner.nextInt());
        scanner.nextLine(); // Consume the remaining newline character

        // Create the third student
        Student student3 = new Student();
        System.out.print("Enter name for student 3: ");
        student3.setName(scanner.nextLine());
        System.out.print("Enter age for student 3: ");
        student3.setAge(scanner.nextInt());
        System.out.print("Enter roll number for student 3: ");
        student3.setRollNo(scanner.nextInt());
        scanner.nextLine(); // Consume the remaining newline character

        // Display information about the students
        System.out.println("\nStudent 1: ");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Roll Number: " + student1.getRollNo());

        System.out.println("\nStudent 2: ");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Roll Number: " + student2.getRollNo());

        System.out.println("\nStudent 3: ");
        System.out.println("Name: " + student3.getName());
        System.out.println("Age: " + student3.getAge());
        System.out.println("Roll Number: " + student3.getRollNo());

        scanner.close();
    }
}

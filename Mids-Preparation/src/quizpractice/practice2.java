package quizpractice;
import java.util.Scanner;

class Employee {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.println("Enter employee name");
        e1.setName(sc.nextLine());
        System.out.println("Enter employee age");
        e1.setAge(sc.nextInt());

        System.out.println("Employee Details");
        System.out.println("Employee 1 name : " + e1.getName());
        System.out.println("Employee 1 age : " + e1.getAge());
    }
}
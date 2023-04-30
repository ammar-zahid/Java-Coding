package OOPs_In_One_Shot;

class Students {
    String name;
    int age;

    public void StudentsInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students(String name, int age){ // --> Parameterized Constructor
        this.name = name;
        this.age = age;
    }
}

public class Part_3 {
    public static void main(String[] args) {
        Students s1 = new Students("ammar", 19); // Parameters in Constructor
        s1.StudentsInfo();
    }
}

package OOPs_In_One_Shot;

class Student{
    String name;
    int age;

    public void Info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Part_2 {
    public static void main(String[] args) {
        Student s1 = new Student(); //--> special types of Functions called Constructors
        s1.name = "Ammar";
        s1.age = 19;
        s1.Info();

        Student s2 = new Student();
        s2.name = "Denly";
        s2.age = 22;
        s2.Info();
    }
}

// Constructors constructs the objects and they dont have return type
// Types
//      1- Non parameterized Constructors

// Properties of Constructors
        // 1- Name of Constructor and name of class must be same 
        // 2- Constructors dont return anything like functions
        // 3- Constructors can only be called once for one object
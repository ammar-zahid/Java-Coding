package OOPs_In_One_Shot;

class Studentt{
    String name;
    int age;

    public void StudentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Studentt(){

    }

    Studentt(Studentt s2){  // --> copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class Part_4 {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.name = "Ammar";
        s1.age = 19;

        Studentt s2 = new Studentt(s1);
        s2.StudentInfo();

    }
}

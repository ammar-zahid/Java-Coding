package Codes;

public class one {
    public void display(){
        System.out.println("I am A");
    }
}

class B extends one {
    public void print(){
        System.out.println("I am B");
    }

    public static void main(String[] args) {
        B objB = new B();
        objB.display();
        objB.print();
    }
}

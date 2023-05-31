package Overloading;

class Maths {
    public int operation (int x,int y) {
        return x+y;
    }
    public double operation (int x, int y, int z){
        return (x*y)/z;
    }
}

public class Question {
    public static void main(String[] args) {
        Maths math = new Maths();
        System.out.println(math.operation(2, 5));
        System.out.println(math.operation(5, 2, 2));
    }
}

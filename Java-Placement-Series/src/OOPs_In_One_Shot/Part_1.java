package OOPs_In_One_Shot;

class Pen{
    String color;
    String type; // ballpoint, gel pen etc...

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class Part_1{
    public static void main(String[] args) {
        Pen pen1 = new Pen();

        pen1.color = "Blue";
        pen1.type = "gelpen";

        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "Green";
        pen2.type = "ballpoint";

        pen2.write();
        pen2.printColor();
    }
}

// String color, String type are data or properties
// public void wirte() is members or functions
package Lecture_5;

public class BinaryTriangle{
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= i + 1; j++) {
                if ((i + j) % 2 == 0){
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
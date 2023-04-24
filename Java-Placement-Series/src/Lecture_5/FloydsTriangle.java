package Lecture_5;

public class FloydsTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

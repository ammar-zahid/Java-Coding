package Lecture_5;

public class BoxPattern {
    public static void main(String[] args) {
        int rows = 5;
        int colomns = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= colomns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
package quizpractice;

class Operations {
    int sum(int a, int b) {
        return a + b;
    }


   int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Practice1 {
    public static void main(String[] args) {
        Operations op = new Operations();
        int answer = op.sum(4, 5);
        System.out.println(answer);

        Operations op2 = new Operations();
        int answer2 = op2.sum(4, 2, 3);
        System.out.println(answer2);
    }
}

package quizpractice;

class chocolates {
    String name;
    public void taste() {
        System.out.println("Chocolate is yummy");
    }
}

class black extends chocolates {
    public void details() {
        System.out.println("Chocolate name is " + name);
    }
}

class practice3 {
    public static void main(String[] args) {
        black chocolate1 = new black();
        chocolate1.name = "Dairy Milk";
        chocolate1.details();
        chocolate1.taste();
    }
}
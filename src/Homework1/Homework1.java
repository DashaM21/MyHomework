package Homework1;

public class Homework1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        b = a + b -  (a = b);
        System.out.println("значение а " + a);
        System.out.println("значение b " + b);
    }
}


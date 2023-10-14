public class Homework1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = b;
        System.out.println(a);
        b = --a - a/--a;
        System.out.println(b);
    }
}
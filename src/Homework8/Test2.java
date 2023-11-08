package Homework8;

public class Test2 {
    public static void main(String[] args) {
        Converter converter = new Converter("Ihor");
        System.out.println(converter.convertToInt(5.4));
        System.out.println(converter.convertToDouble(123));
        System.out.println(converter.convertToString(3.5F));
    }
}

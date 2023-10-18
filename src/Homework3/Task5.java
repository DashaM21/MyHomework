package Homework3;

import java.util.Scanner;

public class Task5 {
    /* 5)Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа и
    символ – или + или % или / или *. На экран выводится результат действия над двумя введенными числами. Если
    пользователь ввел что-то кроме данных символов, то необходимо вывести 0. */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = x.nextInt();
        System.out.println("Введите второе число");
        int b = x.nextInt();
        System.out.println("Введите символ операции");
        String s = x.next();
        double result1 = s.equals("+") ? a + b : s.equals("-") ? a - b : s.equals("%")? a % b :s.equals("/") ? (double) a / b : s.equals("*" )? a * b :0;
        System.out.println(result1);

    }
}

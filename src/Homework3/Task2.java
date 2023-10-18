package Homework3;

import java.util.Scanner;

public class Task2 {
    /*Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли из этих
    сторон построить треугольник. (необходимо вспомнить правило построения треугольника по трем сторонам).
     */
    public static void main (String[] args) {
        Scanner triangel = new Scanner(System.in);
        System.out.println("Введите первое значение:");
        int a = triangel.nextInt();
        System.out.println("Введите второе значение:");
        int b = triangel.nextInt();
        System.out.println("Введите третье значение:");
        int c = triangel.nextInt();
        boolean result = (a+b)>c;
        System.out.println(result);

    }
}

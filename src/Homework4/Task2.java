package Homework4;

import java.util.Scanner;

public class Task2 {
    /* Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет, является она
    полиндромом или нет. И выводит данную информацию на экран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " является палиндромом.");
        } else {
            System.out.println(originalNumber + " не является палиндромом.");
        }
    }
}

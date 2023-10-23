package Homework4;
import java.util.Scanner;
import java.util.Random;
public class Task5 {
    public static void main(String[] args) {
        /* Есть одномерный массив из 10 элементов, заполненный случайными числами. Пользователь вводит с клавиатуры
        число. Программа показывает есть ли такое число в созданном до этого массиве.
         */
        int[] array = new int[10];
        Random x = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt(100);
        }
        System.out.print("Массив: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите число: ");
        int searchNumber = scanner.nextInt();
        boolean value = false;

        for (int number : array) {
            if (number == searchNumber) {
                value = true;
                break;
            }
        }
        if (value) {
            System.out.println(" Найдено в массиве.");
        } else {
            System.out.println(" Не найдено в массиве.");
        };
    }
}

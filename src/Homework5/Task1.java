package Homework5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    /* За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100] та пропонує гравцеві через
    консоль ввести своє ім’я, яке зберігається в змінній name. • Перед початком на екран виводиться текст: Let the
    game begin! • Сам процес гри обробляється у нескінченному циклі. • Гравцеві пропонується ввести число в консоль,
    після чого програма порівнює загадану кількість з тим, що ввів користувач. • Якщо введене число менше загаданого,
    програма виводить на екран текст: Your number is too small. Please, try again.. Якщо введене число більше за
    загадане, то програма виводить на екран текст: Your number is too big. Please, try again.. • Якщо введене число
    відповідає загаданому, то програма виводить текст: Congratulations, {name}! • Завдання повинно бути виконане за
    допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        Random x = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt(100);
        }
        Scanner y = new Scanner(System.in);
        System.out.println("Введіть своє ім'я:");
        String name = y.next();
        System.out.println("Let the game begin!");
        while (true) {
            System.out.println("Введіть число:");
            int guessNumber = y.nextInt();
            if (guessNumber < array[0]){
                System.out.println("Your number is too small. Please, try again..");
            }
            else if (guessNumber > array[0]) {
                System.out.println("Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations," +name + "!");
                break;
            }

        }
    }
}

package Homework3;

import java.util.Scanner;

public class Task1 {
    /* 1) У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.
      Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить
      перемнным типа String следующие значения: string1 = Я string2 = тестирую string3 = замечательно
      string4 = Что еще нужно? Помимо string1, string2, string3, string4 новых переменных создавать нельзя.*/
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string1 = a.next();
        System.out.println(string1);
        String string2 = a.next();
        System.out.println(string2);
        String string3 = a.next();
        System.out.println(string3);
        String string4 = a.next() + " " + a.next() + " " + a.next();
        System.out.println(string4);

    }
}

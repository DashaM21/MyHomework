package Homework4;
import java.util.Arrays;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        /* 4) Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”.
        Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20. Третий будет содержать следующие
        значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”. Пользователь вводит три
        числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов. Пример1. после ввода
        3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00” Пример2. после ввода
        1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”
         */
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        System.out.println("Введите три числa от 0 до 6:");
        Scanner x = new Scanner(System.in);
        int index1 = x.nextInt();
        int index2 = x.nextInt();
        int index3 = x.nextInt();
        String name = names[index1];
        int time = times[index2];
        String place = places[index3];
        System.out.println(name + " будет идти в " + time + " в " + place);

    }
}


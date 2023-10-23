package Homework4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Task6 {
    public static void main(String[] args) {
        /*Заполнить массив на 45 элементов случайными числами от -50 до +50. Найти минимальный элемент и вывести
        его на консоль. Найти максимальный элемент и вывести его на консоль.
         */
        int[] newArray = new int[45];
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(newArray));
       int min=newArray[0];;
       int max=newArray[0];
        for (int i = 0; i < newArray.length; i++) {
                if (newArray[i] < min) {
                    min = newArray[i];
                } else if (newArray[i] > max) {
                    max = newArray[i];
                }
            }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        }
    }


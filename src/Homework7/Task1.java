package Homework7;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
    /* Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа
    списком, a также нечетные числа списком. */
                int[] evenNumbers = new int[arr.length];
                int evenCount = 0;
                int[] oddNumbers = new int[arr.length];
                int oddCount = 0;

                for (int num : arr) {
                    if (num % 2 == 0) {
                        evenNumbers[evenCount] = num;
                        evenCount++;
                    } else {
                        oddNumbers[oddCount] = num;
                        oddCount++;
                    }
                }

                System.out.print("Четные числа: ");
                for (int i = 0; i < evenCount; i++) {
                    System.out.print(evenNumbers[i] + " ");
                }
                System.out.println();

                System.out.print("Нечетные числа: ");
                for (int i = 0; i < oddCount; i++) {
                    System.out.print(oddNumbers[i] + " ");
                }
                System.out.println();
            }


    }
}
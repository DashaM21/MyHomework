package lesson5;

import java.util.Scanner;

public class lesson5 {
   /*  Создать бесконечный цикл, который будет спрашивать ввести у пользователя
    с клавиатуры число, и суммировать все введенные пользователем числа до тех пор,
    пока он не введет с клавиатуры слово FINAL.
    Конечную сумму программа должна вывести в консоль после завершения цикла.*/
   public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       System.out.println("Введите число:");
       String value = x.nextLine();
       int result = 0;
       while (!value.equals("FINAL")) {
           result = result + Integer.parseInt(value);
           System.out.println("Введите число:");
           value = x.nextLine();


       }
       System.out.println(result);

   }
}
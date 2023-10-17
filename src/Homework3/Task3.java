package Task1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


    /* 3)При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
        и всегда отнимать от большего меньшее. Вывести эту разность в консоль.  */

            Scanner x = new Scanner(System.in);
            System.out.println("Enter first number");
            int num1 = x.nextInt();
            System.out.println("Enter first number");
            int num2 = x.nextInt();
            int result = (num1 > num2) ? (num1 - num2) : (num2 - num1);
            System.out.println(result);
    }
}

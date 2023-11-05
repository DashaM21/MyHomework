package Homework7;

public class Task2 {
    /* Написать перегруженный метод, который может:

•	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
•	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
•	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
•	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
•	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа: "Ваше
сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно. */
    public static void main(String[] args) {
        printMessage();
        printMessage("Autumn");
        printMessage(new String[]{"Spring", "Winter", "Summer"});
        printMessage(new int[]{4, 56,202,13});
        printMessage("Zhenya",90);
    }
    public static void printMessage() {
        System.out.println("Я пустой");
    }
    public static void printMessage(String message){
        System.out.println(message);
    }
    public static void printMessage(String[] messages){
        String result = String.join(" ",messages);
        System.out.println(result);
    }
    public static void printMessage(int[] numbers){
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            sum +=numbers[i];
        }
        System.out.println(sum);
    }
    public static void printMessage(String str, int num) {
        System.out.println("Ваше сообщение - " + str + " ваше число - " + num);
    }

}


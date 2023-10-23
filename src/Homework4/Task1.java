package Homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова,
        и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP. Все слова
        введенные до этого должны отобразится в консоли одним предложением. */
        Scanner words = new Scanner(System.in);
        String sentence = "";

        String a = "";
        while (!a.equals("STOP")) {
            System.out.println("Введите слова:");
            a = words.next();
            if(!a.equals("STOP")) {
                sentence += " " + a;
                System.out.println(sentence);
            }



        }


    }
}

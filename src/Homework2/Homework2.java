package Homework2;

public class Homework2 {
   /* 1) Создать переменную string1 = “This line that i want to cut, cause it is too long”
    Создать строку string2 в которой должно быть помещено значение строки string1
    Обрезанное до “This line that i want to cut, cause”.
    Создать строку string3 на основе string2 которое будет содержать значение
    “This line that don’t want to cut, cause it is perfect”.
    Вывести на консоль каждое сообщение и его длину. */

    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1 + " " + string1.length());
        String string2 = string1.substring(0, 35);
        System.out.println(string2 + " " + string2.length());
        String string3 = string2.concat("it is perfect");
        System.out.println(string3 + " " + string3.length());


    /* 2) . Создать строку string = "Testing, is my favourite job" Вывести на экран отдельно
    каждое слово и длину этого слова в след виде:
    Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
    Cлово2 = (значение слова), Длина этого слова = (значение длины слов).и т.д.
    Вывести на консоль true, если первое слово длиннее остальных, в противном случае вывести false. */

        String string = "Testing, is my favourite job";
        String word1 = string.substring(0,7);
        String word2 = string.substring(9,11);
        String word3 = string.substring(12,14);
        String word4 = string.substring(15,24);
        String word5 = string.substring(25,28);
        System.out.println(word1 + " " + word1.length());
        System.out.println(word2 + " " + word2.length());
        System.out.println(word3 + " " + word3.length());
        System.out.println(word4 + " " + word4.length());
        System.out.println(word5 + " " + word5.length());
        boolean result1 = word1.length() > word2.length();
        boolean result2 = word1.length() > word3.length();
        boolean result3 = word1.length() > word4.length();
        boolean result4 = word1.length() > word5.length();
        System.out.println(result1==result2==result3==result4);
    /* 3)При применении к массиву строк поля length, можно узнать сколько
    элементов находится в массиве. Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
    то при вызове поля lenth int size = arrayOfString.length; можно получить какое количество символов
    находится в данном массиве. Попробовать вывести на экран какое количество раз символ ‘a’ встречается
    в строке: “Completely random text in English. In it, we just need to determine how many times the
    character ‘a’ occurs there. And we can use the split method and the length method.”
    используя метод split и информацию по поводу поля length Решить данную задачу с учетов верхнего и
    нижнего регистра символа ‘a’. */

    }
}
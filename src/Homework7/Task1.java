package Homework7;
import java.util.ArrayList;
import java.util.List;
    public class Task1 {
        /*Написать метод, принимающий в качестве параметра массив целых чисел.
         И выводит на экран все четные числа списком, a также нечетные числа списком.*/
        public void arrayOut(int[] array) {
            String chetString = "";
            String neChetString = "";
            List<Integer> chetArrayList = new ArrayList<>();
            List<Integer> neChetArrayList = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    chetArrayList.add(array[i]);
                    chetString = chetString + array[i] + " ";
                } else {
                    neChetArrayList.add(array[i]);
                    neChetString = neChetString + array[i] + " ";
                }
            }
            System.out.println("Четные числа из массива: " + chetArrayList);
            System.out.println("Нечетные числа из массива: " + neChetArrayList);

            System.out.println("Четные числа из массива: " + chetString);
            System.out.println("Нечетные числа из массива: " + neChetString);
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 4, 2, 5, 235, 232423, 54, 3, 234, 212, 245, 23};
            new Task1().arrayOut(array);
        }
    }

package Homework10;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            double result = generateAndDivide();
            System.out.println("Результат деления: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите корректное значение.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: введенный индекс выходит за пределы массива.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль. Первый элемент массива равен нулю.");
        } catch (CustomException e) {
            System.out.println("Пользователь ввел отрицательное значение индекса.");
        }
    }

    private static double generateAndDivide() throws CustomException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[random.nextInt(30) + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31);
        }

        System.out.print("Введите индекс массива: ");
        int index = scanner.nextInt();

        if (index < 0) {
            throw new CustomException("Отрицательный индекс недопустим.");
        }

        return array[index] / (double) array[0];
    }
}

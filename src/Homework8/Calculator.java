package Homework8;
import java.util.Scanner;
/* 4)Создать класс калькулятор.
В нем создать методы:
summ, minus, multiply, division.
Сложение, вычитание, умножение и деление соответственно.
Каждый метод принимает в качестве параметров два значения типа double.
И выводит в консоль результат действия.

Также в классе есть метод старт. Который выводит сообщение в консоль, что
калькулятор запущен. И предлагает ввести действие в вашей консоли.

Калькулятор должен принимать только следующие типы действий:
2+4;    - пример синтаксиса сложения;
5-6;    - пример синтаксиса вычитания;
25*3;   - пример синтаксиса умножения;
34/3;   - пример синтаксиса деления;

После ввода действия на консоль выводится ответ этого действия.
И после снова выводится сообщение о предложении ввести действие.

В случае ввода другого синтаксисана консоль возвращается сообщение:
"Введите корректное действие".
И после снова выводится сообщение о предложении ввести действие.

Программа закрывается после ввода команды Stop.
Перед закрытием на консоль должно выводится сообщение:
"Калькулятор закрыт".*/

public class Calculator {
    public static void summ(double firstValue, double secondValue) {
        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
    }
    public static void minus(double firstValue, double secondValue) {
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
    }
    public static void multiply(double firstValue, double secondValue) {
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
    }
    public static void division(double firstValue, double secondValue) {
        System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
    }
    private boolean isValidAction(String action) {
        return action.matches("\\d+([-+*/])\\d+");
    }
    public void start() {
        System.out.println("Калькулятор запущен. Введите действие:");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String action = scanner.next();

            if (action.equals("Stop")) {
                System.out.println("Калькулятор закрыт");
                break;
            }

            if (isValidAction(action)) {
                String operator = action.substring(0, 1);
                double operand1 = Double.parseDouble(action.substring(1, action.indexOf(" ")));
                double operand2 = Double.parseDouble(action.substring(action.indexOf(" ") + 1));

                switch (operator) {
                    case "+":
                        summ(operand1, operand2);
                        break;
                    case "-":
                        minus(operand1, operand2);
                        break;
                    case "*":
                        multiply(operand1, operand2);
                        break;
                    case "/":
                        division(operand1, operand2);
                        break;
                }
            } else {
                System.out.println("Введите корректное действие");
            }
        }
    }
}

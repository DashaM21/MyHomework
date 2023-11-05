package Homework6;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        /* Массив заполняется случайными числами от 0 до 1000.
Необходимо создать одномерный массив, состоящий из максимальных значений
каждого отдельного массива входящего в двумерный.
Новый полученный массив вывести на экран.
           Технічні вимоги:

• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
• Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
• Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
         */
            int[][] field = new int[5][5];
            Random random = new Random();
            int targetX = random.nextInt(5);
            int targetY = random.nextInt(5);

            System.out.println("All Set. Get ready to rumble!");
            boolean won = false;

            while (!won) {
                // Вывод игрового поля
                for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field[i].length; j++) {
                        if (field[i][j] == -1) {
                            System.out.print("* ");
                        } else if (i == targetX && j == targetY) {
                            System.out.print("x ");
                        } else {
                            System.out.print("_ ");
                        }
                    }
                    System.out.println();
                }

                // Ввод координат выстрела
                System.out.print("Введите номер линии: ");
                Scanner scanner = new Scanner(System.in);
                int line = scanner.nextInt();
                System.out.print("Введите номер столбца: ");
                int column = scanner.nextInt();

                // Проверка ввода
                if (line < 1 || line > 5 || column < 1 || column > 5){
                    System.out.println("Некорректный ввод. Повторите попытку.");
                    continue;
                }

                // Обработка выстрела
                if (line - 1 == targetX && column - 1 == targetY) {
                    System.out.println("You have won!");
                    won = true;
                } else {
                    System.out.println("You missed the target!");
                    field[line - 1][column - 1] = -1; // Отмечаем промах -1
                }
            }
        }
    }


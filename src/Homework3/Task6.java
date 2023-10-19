package Homework3;
import java.util.Scanner;
public class Task6 {
    /* 6)Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
    Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows. Программа должна
    спросить пользователя какая программа ему интересна, также спросить какую ОС он использует, а после вывести в
    консоль необходимую ссылку. Если программа с таким названием не существует выводит сообщение в консоль, о том
    что такой программы не существует. Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том ч
    то такой ОС не существует. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая программа вам интересна?");
        String x = scanner.next();
        System.out.println("Какую ОС Ви используете?");
        String y = scanner.next();
        switch (x) {
            case ("IntelliJ IDEA"):
                switch (y) {
                    case ("Linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case ("macOS"):
                        System.out.println("https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case ("Windows"):
                        System.out.println("https://www.jetbrains.com/idea/download/#section=windows");
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                return;}
            case ("Git"):
                switch (y) {
                    case ("Linux"):
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    case ("macOS"):
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    case ("Windows"):
                        System.out.println("https://git-scm.com/download/mac\n");
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                return;}
            case ("Java"):
                switch (y) {
                    case ("Linux"):
                        System.out.println("https://www.java.com/en/download/manual.jsp");
                        break;
                    case ("macOS"):
                        System.out.println("https://www.java.com/en/download/manual.jsp");
                        break;
                    case ("Windows"):
                        System.out.println("https://www.java.com/en/download/manual.jsp");
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                return;}
            default:
                System.out.println("Такой программы не существует");
        return;}
    }
}
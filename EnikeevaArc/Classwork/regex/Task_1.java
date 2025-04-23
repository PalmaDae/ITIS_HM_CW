import java.util.regex.*;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ".*\\d.*";  // Регулярное выражение для поиска цифры в строке
                                  // \\d — ищет любую цифру (0-9)
                                  // .* — обозначает любое количество символов до и после цифры
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);  // Компиляция регулярного выражения в объект Pattern
                                                  // Pattern используется для работы с регулярными выражениями
        Matcher matcher = pattern.matcher(input);  // Создание объекта Matcher, который будет искать совпадения в строке input

        if (matcher.find()) {  // Проверка, найдена ли хотя бы одна цифра в строке
            System.out.println("В строке есть цифра");
        } else {
            System.out.println("В строке нет цифры");
        }
    }
}

import java.util.Scanner;
import java.util.regex.*;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[+-]?\\d+";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);  // Компиляция регулярного выражения в объект Pattern
        Matcher matcher = pattern.matcher(input);   // Создание объекта Matcher для поиска совпадений в строке

        if (matcher.matches()) {  // Проверка, соответствует ли вся строка целому числу
            System.out.println("Строка является целым числом");  // Если соответствует, выводим сообщение
        } else {
            System.out.println("Никак нет!");  // Если не соответствует, выводим сообщение
        }

    }
}
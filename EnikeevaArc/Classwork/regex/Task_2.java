import java.util.Scanner;
import java.util.regex.*;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\(?\\d{3}\\)?[- ]\\d{3}[- ]\\d{4}";

        System.out.println("Введи номера, код будет реагировать на номера такого формата:");
        System.out.println("(123) 456-7890 или 123-456-7890");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);  // Компиляция регулярного выражения в объект Pattern
        Matcher matcher = pattern.matcher(input);   // Создание объекта Matcher для поиска совпадений

        while (matcher.find()) {  // Цикл находит все совпадения в строке
            System.out.println("Номер: " + matcher.group());  // Вывод найденного телефонного номера
        }
    }
}

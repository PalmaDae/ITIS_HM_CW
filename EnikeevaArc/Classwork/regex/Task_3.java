import java.util.Scanner;
import java.util.regex.*;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b\\w+\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);  // Компиляция регулярного выражения в объект Pattern
        Matcher matcher = pattern.matcher(input);   // Создание объекта Matcher для поиска совпадений в строке

        String longestWord = "";  // Переменная для хранения самого длинного слова

        while (matcher.find()) {  // Цикл перебора всех найденных слов в строке
            String word = matcher.group();  // Получаем найденное слово
            if (word.length() > longestWord.length()) {  // Если текущее слово длиннее сохранённого, обновляем longestWord
                longestWord = word;  // Обновляем самое длинное слово
            }
        }

        System.out.println(longestWord);  // Вывод самого длинного слова
    }
}

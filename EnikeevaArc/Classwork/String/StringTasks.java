package ClassWork;

import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Определение четности длины названия города
        String city = scanner.nextLine();  // Чтение названия города
        System.out.println(city.length() % 2 == 0 ? "Четное" : "Нечетное");  // Проверка четности длины названия города

        // 2. Вывод самого длинного из двух слов
        String word1 = scanner.next();  // Чтение первого слова
        String word2 = scanner.next();  // Чтение второго слова
        System.out.println(word1.length() > word2.length() ? word1 : word2);  // Сравнение длин слов и вывод самого длинного

        // 3. Определение самого длинного и самого короткого города из трех
        String city1 = scanner.next();  // Чтение первого города
        String city2 = scanner.next();  // Чтение второго города
        String city3 = scanner.next();  // Чтение третьего города
        String longest = city1.length() >= city2.length() && city1.length() >= city3.length() ? city1 :
                         city2.length() >= city3.length() ? city2 : city3;  // Поиск самого длинного города
        String shortest = city1.length() <= city2.length() && city1.length() <= city3.length() ? city1 :
                          city2.length() <= city3.length() ? city2 : city3;  // Поиск самого короткого города
        System.out.println("Самое длинное: " + longest);  // Вывод самого длинного города
        System.out.println("Самое короткое: " + shortest);  // Вывод самого короткого города

        // 4. Вывод символа строки по индексу
        String word = scanner.next();  // Чтение слова
        int k = scanner.nextInt();  // Чтение индекса
        System.out.println(word.charAt(k - 1));  // Вывод символа строки по индексу (индекс вводится с 1)

        // 5. Проверка второго и четвертого символов
        word = scanner.next();  // Чтение слова
        System.out.println(word.length() >= 4 && word.charAt(1) == word.charAt(3) ? "Да" : "Нет");  // Проверка второго и четвертого символов


        // 6. Проверка, совпадают ли первый и последний символы
        word = scanner.next();  // Чтение слова
        System.out.println(word.length() > 0 && word.charAt(0) == word.charAt(word.length() - 1) ? "Да" : "Нет");  // Проверка совпадения первого и последнего символа

        // 7. Проверка, совпадает ли последний символ первого слова с первым символом второго
        word1 = scanner.next();  // Чтение первого слова
        word2 = scanner.next();  // Чтение второго слова
        System.out.println(word1.charAt(0) == word2.charAt(word2.length() - 1) ? "Да" : "Нет");  // Проверка совпадения символов

        // 8. Вывод второго и четвертого символов, если длина >= 4
        word = scanner.next();  // Чтение слова
        System.out.println(word.length() >= 4 ? "" + word.charAt(1) + word.charAt(3) : "Ошибка");  // Вывод символов при достаточной длине слова

        // 9. Вывод первой половины слова, если длина четная
        word = scanner.next();  // Чтение слова
        System.out.println(word.length() % 2 == 0 ? word.substring(0, word.length() / 2) : "Ошибка");  // Вывод первой половины при чётной длине

        // 10. Подсчет суммы и максимальной цифры в строке
        String text = scanner.next();  // Чтение строки
        int sum = 0, maxDigit = -1;  // Переменные для суммы и максимальной цифры
        for (char c : text.toCharArray()) {  // Перебор всех символов строки
            if (Character.isDigit(c)) {  // Если символ является цифрой
                int digit = c - '0';  // Преобразование символа в цифру
                sum += digit;  // Добавление цифры к сумме
                if (digit > maxDigit) maxDigit = digit;  // Поиск максимальной цифры
            }
        }
        System.out.println("Сумма цифр: " + sum);  // Вывод суммы цифр
        System.out.println("Максимальная цифра: " + maxDigit);  // Вывод максимальной цифры

        // 11. Извлечение всех цифр из строки
        text = scanner.next();  // Чтение строки
        String digitsOnly = text.replaceAll("\\D", "");  // Замена всех нецифровых символов на пустую строку
        System.out.println(digitsOnly);  // Вывод извлечённых цифр

        // 12. Вывод подстрок из слова "яблоко"
        String apple = "яблоко";  // Строка для работы
        System.out.println(apple.substring(1, 5));  // Вывод подстроки с 1 по 5 индекс
        System.out.println(apple.substring(3, 6));  // Вывод подстроки с 3 по 6 индекс

        // 13. Вывод подстрок из слова "информатика"
        String informatics = "информатика";  // Строка для работы
        System.out.println(informatics.substring(2, 6));  // Вывод подстроки с 2 по 6 индекс
        System.out.println(informatics.substring(7));  // Вывод подстроки начиная с 7 индекса

        // 14. Перемещение первой половины слова в конец, если длина четная
        word = scanner.next();  // Чтение слова
        if (word.length() % 2 == 0) {  // Проверка чётности длины
            System.out.println(word.substring(word.length() / 2) + word.substring(0, word.length() / 2));  // Перемещение первой половины в конец
        }

        // 15. Сдвиг первых k символов в конец слова
        word = scanner.next();  // Чтение слова
        k = scanner.nextInt();  // Чтение числа k
        System.out.println(word.substring(k) + word.substring(0, k));  // Сдвиг первых k символов в конец


        // 16. Вывод символов строки по одному в строку
        word = scanner.next();  // Чтение слова
        for (char c : word.toCharArray()) System.out.println(c);  // Перебор каждого символа в строке и вывод в новой строке

        // 17. Вывод строки в обратном порядке
        word = scanner.next();  // Чтение слова
        for (int i = word.length() - 1; i >= 0; i--) System.out.print(word.charAt(i));  // Перебор символов с конца и вывод их в обратном порядке
        System.out.println();  // Печать новой строки после завершения вывода

        // 18. Вывод символов строки с нечетными индексами
        word = scanner.next();  // Чтение слова
        for (int i = 0; i < word.length(); i += 2) System.out.print(word.charAt(i));  // Перебор символов с нечетными индексами и вывод их
        System.out.println();  // Печать новой строки после завершения вывода

        // 19. Вывод заданного символа count раз
        char symbol = scanner.next().charAt(0);  // Чтение символа
        int count = scanner.nextInt();  // Чтение количества повторений
        System.out.println("".repeat(count).replace(" ", "" + symbol));  // Повторение символа count раз и вывод

        // 20. Обрамление слова символами ++++ и -----
        word = scanner.next();  // Чтение слова
        System.out.println("++++" + word + "-----");  // Обрамление слова и вывод

        // 24. Подсчет количества вхождений подстроки в строку
        String sentence;
        sentence = scanner.nextLine();  // Чтение строки
        String substring = "ро";  // Подстрока для поиска
        System.out.println((sentence.length() - sentence.replace(substring, "").length()) / substring.length());  // Подсчет количества вхождений подстроки
        substring = scanner.next();  // Чтение новой подстроки
        System.out.println((sentence.length() - sentence.replace(substring, "").length()) / substring.length());  // Подсчет количества вхождений подстроки
        substring = scanner.next();  // Чтение следующей подстроки
        System.out.println((sentence.length() - sentence.replace(substring, "").length()) / substring.length());  // Подсчет количества вхождений подстроки

        // 25. Вывод части строки до первого вхождения запятой
        sentence = scanner.nextLine();  // Чтение строки
        int commaIndex = sentence.indexOf(",");  // Поиск индекса первой запятой
        if (commaIndex != -1) System.out.println(sentence.substring(0, commaIndex));  // Если запятая найдена, выводим подстроку до неё
        else System.out.println("Запятых нет");  // Если запятая не найдена, выводим сообщение

        // 26. Вывод индексов первого и последнего вхождения символа 'е'
        sentence = scanner.nextLine();  // Чтение строки
        System.out.println(sentence.indexOf('е'));  // Индекс первого вхождения 'е'
        System.out.println(sentence.lastIndexOf('е'));  // Индекс последнего вхождения 'е'

        // 27. Замена всех вхождений "да" на "не"
        sentence = scanner.nextLine();  // Чтение строки
        System.out.println(sentence.replace("да", "не"));  // Замена и вывод строки

        // 28. Замена одного слова на другое в строке
        sentence = scanner.nextLine();  // Чтение строки
        String s1 = scanner.next();  // Чтение первого слова для замены
        String s2 = scanner.next();  // Чтение второго слова, на которое заменим
        System.out.println(sentence.replace(s1, s2));  // Замена слова и вывод строки


        // 29. Инвертирование строки
        word = scanner.next();  // Чтение строки
        char[] arr = word.toCharArray();  // Преобразование строки в массив символов
        for (int i = 0; i < arr.length / 2; i++) {  // Перебор первых половины массива
            char temp = arr[i];  // Сохранение текущего символа в временную переменную
            arr[i] = arr[arr.length - 1 - i];  // Замена символа с начала на символ с конца
            arr[arr.length - 1 - i] = temp;  // Замена символа с конца на символ с начала
        }
        System.out.println(new String(arr));  // Вывод инвертированной строки

        // 30. Инвертирование части строки между двумя индексами
        word = scanner.next();  // Чтение строки
        k = scanner.nextInt();  // Чтение первого индекса
        int s = scanner.nextInt();  // Чтение второго индекса
        System.out.println(word.substring(0, k) + new StringBuilder(word.substring(k, s)).reverse().toString() + word.substring(s));  // Составление строки с инвертированной частью

        // 31. Подсчет максимальной длины последовательности одинаковых символов
        sentence = scanner.nextLine();  // Чтение строки
        int maxCount = 0;  // Переменная для хранения максимальной длины
        count = 1;  // Переменная для хранения текущей длины последовательности
        for (int i = 1; i < sentence.length(); i++) {  // Перебор символов строки
            if (sentence.charAt(i) == sentence.charAt(i - 1)) count++;  // Если текущий символ равен предыдущему, увеличиваем длину последовательности
            else {  // Если символы разные, обновляем максимальную длину и сбрасываем текущую
                maxCount = Math.max(maxCount, count);  // Обновление максимальной длины
                count = 1;  // Сброс текущей длины
            }
        }
        System.out.println(Math.max(maxCount, count));  // Вывод максимальной длины последовательности

        // 32. Проверка наличия символов первого слова во втором
        word1 = scanner.next();  // Чтение первого слова
        word2 = scanner.next();  // Чтение второго слова
        for (char c : word1.toCharArray()) {  // Перебор символов первого слова
            System.out.print(word2.indexOf(c) != -1 ? "да " : "нет ");  // Проверка наличия символа во втором слове и вывод результата
        }
        System.out.println();  // Печать новой строки после вывода всех результатов

        // 33. Разделение строки на слова и вывод их
        String[] words = scanner.nextLine().split(" ");  // Чтение строки и разделение её на слова
        for (String w : words) System.out.println(w);  // Вывод каждого слова на новой строке

        // 34. Проверка наличия слов первого массива во втором
        String[] words1 = scanner.nextLine().split(" ");  // Чтение первого массива слов
        String[] words2 = scanner.nextLine().split(" ");  // Чтение второго массива слов
        for (String w : words1) {  // Перебор слов первого массива
            boolean found = false;  // Флаг, указывающий на нахождение совпадения
            for (String w2 : words2) {  // Перебор слов второго массива
                if (w.equals(w2)) {  // Если слово из первого массива совпало со словом из второго
                    found = true;  // Устанавливаем флаг в true
                    break;  // Выход из второго цикла, так как совпадение найдено
                }
            }
            System.out.print(found ? "да " : "нет ");  // Вывод результата поиска
        }

        System.out.println();
    }
}
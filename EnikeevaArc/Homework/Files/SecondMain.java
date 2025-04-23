import java.io.*;
import java.util.regex.*;

public class SecondMain {

    // Определяем базовую папку для файлов
    private static final String BASE_PATH = "C:\\Users\\RedmiBook\\Desktop\\text_files\\";

    // Задание 1: Подсчет количества слов в файле
    public static int countWordsInFile(String filePath) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Чтение файла построчно
            while ((line = reader.readLine()) != null) {
                // Разделяем строку на слова по пробелам
                String[] words = line.split("\\s+");
                wordCount += words.length; // Добавляем количество слов из строки
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return wordCount; // Возвращаем общее количество слов
    }

    // Задание 2: Заменить слово или выражение в файле
    public static void replaceWordInFile(String inputFilePath, String oldWord, String newWord, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            // Чтение файла построчно
            while ((line = reader.readLine()) != null) {
                // Заменяем все вхождения старого слова на новое
                line = line.replace(oldWord, newWord);
                writer.write(line);
                writer.newLine(); // Переход на новую строку в выходном файле
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
        }
    }

    // Задание 3: Деление двух чисел с обработкой исключений
    public static void divideNumbers() {
        try {
            // Пример ввода двух чисел
            String input = "10 0"; // Пример ввода с двумя числами
            String[] numbers = input.split(" "); // Разделяем строку на числа
            int num1 = Integer.parseInt(numbers[0]); // Преобразуем первое число
            int num2 = Integer.parseInt(numbers[1]); // Преобразуем второе число

            // Выполняем деление
            int result = num1 / num2;
            System.out.println("Результат деления: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа: " + e.getMessage()); // Ошибка преобразования строки в число
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e.getMessage()); // Ошибка деления на ноль
        }
    }

    // Задание 4: Обработка исключений при чтении файла и преобразовании строк в числа
    public static class EmptyFileException extends Exception {
        public EmptyFileException(String message) {
            super(message);
        }
    }

    public static void readFileAndProcess(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            boolean isFileEmpty = true;
            while ((line = reader.readLine()) != null) {
                isFileEmpty = false; // Файл не пустой
                try {
                    Integer.parseInt(line); // Пытаемся преобразовать строку в число
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка в строке " + lineNumber + ": Строка не является числом");
                }
                lineNumber++;
            }

            if (isFileEmpty) {
                throw new EmptyFileException("Файл пустой!"); // Бросаем исключение, если файл пустой
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage()); // Обрабатываем пустой файл
        }
    }

    // Задание 5: Регулярное выражение для проверки номеров телефонов и их сохранение в файл
    public static void findPhoneNumbers(String inputFilePath, String outputFilePath) {
        String phonePattern = "\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            // Компилируем регулярное выражение
            Pattern pattern = Pattern.compile(phonePattern);
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                // Если совпадение найдено, записываем его в новый файл
                while (matcher.find()) {
                    writer.write(matcher.group());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файла: " + e.getMessage());
        }
    }

    // Задание 6: Извлечение дат из строки
    public static void extractDates(String filePath) {
        String datePattern = "\\b\\d{2}\\.\\d{2}\\.\\d{4}\\b";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Компилируем регулярное выражение
            Pattern pattern = Pattern.compile(datePattern);
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                // Если совпадение найдено, выводим его
                while (matcher.find()) {
                    System.out.println("Найдено совпадение: " + matcher.group());
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // Задание 7: Поиск слов, начинающихся с заглавной буквы
    public static void findWordsWithUppercase(String filePath) {
        String uppercasePattern = "\\b[A-ZА-Я][a-zа-я]*\\b";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Компилируем регулярное выражение
            Pattern pattern = Pattern.compile(uppercasePattern);
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                // Если совпадение найдено, выводим его
                while (matcher.find()) {
                    System.out.println("Найдено слово с заглавной буквы: " + matcher.group());
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // Задание 8: Проверка, состоит ли строка только из цифр
    public static void checkIfOnlyDigits(String filePath) {
        String digitPattern = "\\d+";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Компилируем регулярное выражение
            Pattern pattern = Pattern.compile(digitPattern);
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                // Если строка состоит только из цифр, выводим её
                if (matcher.matches()) {
                    System.out.println("Строка состоит только из цифр: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Пример путей к файлам для выполнения заданий
        String filePath = BASE_PATH + "example.txt"; // Пример файла для заданий
        String inputFilePath = BASE_PATH + "contacts.txt"; // Входной файл для номеров телефонов
        String outputFilePath = BASE_PATH + "output.txt"; // Выходной файл для результатов

        // Задание 1: Подсчет слов
        System.out.println("Количество слов в файле: " + countWordsInFile(filePath));

        // Задание 2: Заменить слова в файле
        replaceWordInFile(inputFilePath, "старое", "новое", outputFilePath);

        // Задание 3: Деление чисел
        divideNumbers();

        // Задание 4: Обработка ошибок при чтении файла
        readFileAndProcess(filePath);

        // Задание 5: Поиск и сохранение номеров телефонов
        findPhoneNumbers(inputFilePath, BASE_PATH + "phones.txt");

        // Задание 6: Извлечение дат
        extractDates(filePath);

        // Задание 7: Поиск слов с заглавными буквами
        findWordsWithUppercase(filePath);

        // Задание 8: Проверка, состоит ли строка только из цифр
        checkIfOnlyDigits(filePath);
    }
}

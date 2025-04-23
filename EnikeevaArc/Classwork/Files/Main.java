import java.io.*;
import java.util.regex.*;

public class Main {
    // 1. Чтение файла и вывод его содержимого в консоль
    public static void printFileContent(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Читаем файл построчно
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Выводим каждую строку файла в консоль
            }
        } catch (IOException e) {
            // Если файл не найден или произошла ошибка при чтении
            System.out.println("Не удалось открыть файл: " + e.getMessage());
        }
    }

    // 2. Подсчёт количества строк в файле
    public static int getLineCount(String filePath) {
        int lineCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Проходим по каждой строке в файле
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++; // Увеличиваем счётчик строк
            }
        } catch (IOException e) {
            // Если файл не найден или произошла ошибка при чтении
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
        return lineCount; // Возвращаем количество строк
    }

    // 3. Чтение файла с добавлением номеров строк
    public static void printFileWithLineNumbers(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1; // Счётчик строк
            // Читаем файл построчно и добавляем номер строки
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(lineNumber + ") " + line); // Выводим строку с номером
                lineNumber++; // Увеличиваем номер строки
            }
        } catch (IOException e) {
            // Если файл не найден или произошла ошибка при чтении
            System.out.println("Файл не найден или повреждён.");
        }
    }

    // 4. Подсчёт вхождений слова в файле
    public static int countWordOccurrences(String filePath, String searchWord) {
        int occurrences = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Читаем файл построчно
            while ((line = bufferedReader.readLine()) != null) {
                // Разбиваем строку на слова и считаем вхождения
                occurrences += line.split("\\b" + searchWord + "\\b").length - 1;
            }
        } catch (IOException e) {
            // Если файл не найден или произошла ошибка при чтении
            System.out.println("Ошибка при чтении файла.");
        }
        return occurrences; // Возвращаем количество вхождений слова
    }

    // 5. Копирование содержимого одного файла в другой
    public static void duplicateFile(String sourceFile, String destinationFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            // Читаем исходный файл построчно и записываем в новый файл
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line); // Записываем строку в новый файл
                bufferedWriter.newLine(); // Добавляем перевод строки
            }
        } catch (IOException e) {
            // Если произошла ошибка при чтении или записи
            System.out.println("Ошибка при копировании файла.");
        }
    }

    // 6. Подсчёт слов в файле
    public static int getWordCount(String filePath) {
        int wordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Читаем файл построчно
            while ((line = bufferedReader.readLine()) != null) {
                // Разбиваем строку на слова и увеличиваем счётчик
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            // Если файл не найден или произошла ошибка при чтении
            System.out.println("Файл не удалось обработать.");
        }
        return wordCount; // Возвращаем общее количество слов
    }

    // 7. Поиск и замена слова в файле с сохранением в новый файл
    public static void replaceTextInFile(String filePath, String targetWord, String replacementWord, String outputFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            // Читаем исходный файл построчно
            while ((line = bufferedReader.readLine()) != null) {
                // Заменяем целевое слово на новое
                bufferedWriter.write(line.replace(targetWord, replacementWord));
                bufferedWriter.newLine(); // Добавляем новую строку в файл
            }
        } catch (IOException e) {
            // Если произошла ошибка при чтении или записи
            System.out.println("Ошибка при обработке данных.");
        }
    }

    // 8. Деление двух чисел с обработкой деления на ноль
    public static void divideSafely(int num1, int num2) {
        try {
            // Пытаемся выполнить деление
            System.out.println("Результат деления: " + (num1 / num2));
        } catch (ArithmeticException e) {
            // Если деление на ноль, выводим сообщение об ошибке
            System.out.println("Ошибка: попытка деления на ноль.");
        }
    }

    // 14. Поиск email в файле
    public static void findEmails(String filePath) {
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        // Ищем все email в файле
        findPatternInFile(filePath, emailPattern);
    }

    // 15. Поиск телефонных номеров в файле и запись валидных номеров в другой файл
    public static void findPhoneNumbers(String inputFile, String outputFile) {
        String phonePattern = "\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}";
        // Ищем все номера телефонов в файле и записываем их в новый файл
        findPatternInFile(inputFile, phonePattern, outputFile);
    }

    // 16. Поиск дат в формате DD.MM.YYYY
    public static void extractDatesFromFile(String filePath) {
        String datePattern = "\\b\\d{2}\\.\\d{2}\\.\\d{4}\\b";
        // Ищем все даты в указанном формате в файле
        findPatternInFile(filePath, datePattern);
    }

    // 17. Поиск слов с заглавной буквы
    public static void findWordsWithCapitalLetter(String filePath) {
        String capitalizedPattern = "\\b[A-ZА-Я][a-zа-я]*\\b";
        // Ищем все слова с заглавной буквы
        findPatternInFile(filePath, capitalizedPattern);
    }

    // 18. Проверка, состоит ли строка только из цифр
    public static void checkIfStringIsNumber(String filePath) {
        String digitsPattern = "\\d+";
        // Ищем все строки, состоящие только из цифр
        findPatternInFile(filePath, digitsPattern);
    }

    // Метод для поиска и вывода шаблона в файле
    private static void findPatternInFile(String filePath, String regex) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Компилируем регулярное выражение
            Pattern pattern = Pattern.compile(regex);
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                // Если находим совпадение, выводим его
                while (matcher.find()) {
                    System.out.println("Найдено совпадение: " + matcher.group());
                }
            }
        } catch (IOException e) {
            // Если произошла ошибка при чтении файла
            System.out.println("Ошибка при обработке файла.");
        }
    }

    // Метод для поиска шаблона и записи результата в файл
    private static void findPatternInFile(String inputFile, String regex, String outputFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            // Компилируем регулярное выражение
            Pattern pattern = Pattern.compile(regex);
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                // Если находим совпадение, записываем его в новый файл
                while (matcher.find()) {
                    bufferedWriter.write(matcher.group());
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            // Если произошла ошибка при чтении или записи
            System.out.println("Ошибка при работе с файлами.");
        }
    }

    // Функция main
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\RedmiBook\\Desktop\\text_files\\";
        printFileContent(folderPath + "example.txt");
        System.out.println("Количество строк: " + getLineCount(folderPath + "example.txt"));
        printFileWithLineNumbers(folderPath + "example.txt");
        System.out.println("Слово встречается: " + countWordOccurrences(folderPath + "example.txt", "пример") + " раз(а)");
        duplicateFile(folderPath + "example.txt", folderPath + "copy.txt");
        System.out.println("Общее число слов: " + getWordCount(folderPath + "example.txt"));
        replaceTextInFile(folderPath + "example.txt", "старое", "новое", folderPath + "output.txt");
        divideSafely(10, 0);
        findEmails(folderPath + "emails.txt");
        findPhoneNumbers(folderPath + "phones.txt", folderPath + "valid_phones.txt");
        extractDatesFromFile(folderPath + "dates.txt");
        findWordsWithCapitalLetter(folderPath + "text.txt");
        checkIfStringIsNumber(folderPath + "numbers.txt");
    }
}

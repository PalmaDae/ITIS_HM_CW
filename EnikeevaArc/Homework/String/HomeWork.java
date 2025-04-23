package HomeWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1. Вводим матрицу
        int n = scanner.nextInt();  // Ввод размера матрицы
        int[][] matrix = new int[n][n];  // Создание матрицы размером n x n
        for (int i = 0; i < n; i++) {  // Перебор строк матрицы
            for (int j = 0; j < n; j++) {  // Перебор столбцов матрицы
                matrix[i][j] = scanner.nextInt();  // Ввод элементов матрицы
            }
        }

        // A) Строки с нулями
        System.out.println("Строки с нулями:");
        for (int i = 0; i < n; i++) {  // Перебор строк матрицы
            boolean allZeroes = true;  // Флаг, указывающий, что все элементы строки равны нулю
            for (int j = 0; j < n; j++) {  // Перебор элементов строки
                if (matrix[i][j] != 0) {  // Если встречен не нулевой элемент
                    allZeroes = false;  // Меняем флаг на false
                    break;  // Прерываем цикл
                }
            }
            if (allZeroes) System.out.println(i + 1);  // Выводим индекс строки (нумерация с 1)
        }

        // Б) Строки с одинаковыми элементами
        System.out.println("Строки с одинаковыми элементами:");
        for (int i = 0; i < n; i++) {  // Перебор строк матрицы
            boolean allEqual = true;  // Флаг, указывающий, что все элементы строки одинаковые
            for (int j = 1; j < n; j++) {  // Перебор элементов строки начиная с второго
                if (matrix[i][j] != matrix[i][0]) {  // Если элемент не равен первому
                    allEqual = false;  // Меняем флаг на false
                    break;  // Прерываем цикл
                }
            }
            if (allEqual) System.out.println(i + 1);  // Выводим индекс строки (нумерация с 1)
        }

        // В) Строки с нечётными элементами
        System.out.println("Строки с нечётными элементами:");
        for (int i = 0; i < n; i++) {  // Перебор строк матрицы
            boolean allOdd = true;  // Флаг, указывающий, что все элементы строки нечётные
            for (int j = 0; j < n; j++) {  // Перебор элементов строки
                if (matrix[i][j] % 2 == 0) {  // Если встречен чётный элемент
                    allOdd = false;  // Меняем флаг на false
                    break;  // Прерываем цикл
                }
            }
            if (allOdd) System.out.println(i + 1);  // Выводим индекс строки (нумерация с 1)
        }

        // Г) Монотонные строки
        System.out.println("Монотонные строки:");
        for (int i = 0; i < n; i++) {  // Перебор строк матрицы
            boolean isIncreasing = true, isDecreasing = true;  // Флаги для монотонности строки
            for (int j = 1; j < n; j++) {  // Перебор элементов строки начиная с второго
                if (matrix[i][j] < matrix[i][j - 1]) isIncreasing = false;  // Если элемент меньше предыдущего, строка не возрастающая
                if (matrix[i][j] > matrix[i][j - 1]) isDecreasing = false;  // Если элемент больше предыдущего, строка не убывающая
            }
            if (isIncreasing || isDecreasing) System.out.println(i + 1);  // Выводим индекс строки (нумерация с 1) если строка монотонная
        }

        // Д) Палиндромы
        System.out.println("Палиндромы:");
        for (int i = 0; i < n; i++) {  // Перебор строк матрицы
            boolean isPalindrome = true;  // Флаг, указывающий, что строка является палиндромом
            for (int j = 0; j < n / 2; j++) {  // Перебор первых половины строки
                if (matrix[i][j] != matrix[i][n - 1 - j]) {  // Если элементы с начала и конца не равны
                    isPalindrome = false;  // Меняем флаг на false
                    break;  // Прерываем цикл
                }
            }
            if (isPalindrome) System.out.println(i + 1);  // Выводим индекс строки (нумерация с 1)
        }

        // Задача 2. Вводим матрицу с вещественными числами
        n = scanner.nextInt();  // Ввод размера матрицы
        double[][] realMatrix = new double[n][n];  // Создание матрицы с вещественными числами
        for (int i = 0; i < n; i++) {  // Перебор строк матрицы
            for (int j = 0; j < n; j++) {  // Перебор столбцов матрицы
                realMatrix[i][j] = scanner.nextDouble();  // Ввод элементов матрицы
            }
        }

        // Суммы элементов
        System.out.println("Суммы элементов:");
        for (int i = 0; i < n; i++) {  // Перебор строк матрицы
            if (realMatrix[i][0] < 0) {  // Если первый элемент строки меньше нуля
                double sumAbove = 0, sumBelow = 0, sumDiagonal = 0;  // Переменные для сумм
                for (int j = 0; j < n; j++) {  // Перебор элементов строки
                    if (i < j) sumAbove += realMatrix[i][j];  // Элементы выше главной диагонали
                    if (i > j) sumBelow += realMatrix[i][j];  // Элементы ниже главной диагонали
                    if (i == j) sumDiagonal += realMatrix[i][j];  // Элементы на главной диагонали
                }
                System.out.printf("Строка %d - выше: %.2f, ниже: %.2f, на диагонали: %.2f\n", i + 1, sumAbove, sumBelow, sumDiagonal);  // Выводим суммы
            }
        }

        // Задача 3. Количество букв 'о' в первом слове
        scanner.nextLine();  // очищаем буфер после предыдущего ввода
        String sentence = scanner.nextLine().trim();  // Ввод строки
        String firstWord = sentence.split(" ")[0];  // Разделение строки на слова и взятие первого
        long count = firstWord.chars().filter(c -> c == 'о').count();  // Подсчет букв 'о' в первом слове
        System.out.println("Количество букв 'о' в первом слове: " + count);

        // Задача 4. Даны два слова. Определяем количество одинаковых символов в начале
        String sequence = scanner.next();  // Ввод первого слова
        int countSame = 0;  // Счетчик одинаковых символов на начале слова

        // Случай 1: не все символы последовательности одинаковые
        while (countSame < sequence.length() && sequence.charAt(countSame) == sequence.charAt(0)) {  // Перебор символов, пока они одинаковы
            countSame++;  // Увеличиваем счетчик
        }
        System.out.println("Количество одинаковых символов в начале: " + countSame);  // Выводим количество одинаковых символов

        // Случай 2: все символы могут быть одинаковыми
        if (countSame == sequence.length()) {  // Если все символы одинаковы
            System.out.println("Все символы одинаковые.");  // Выводим сообщение
        }

        // Задача 5. Найти порядковый номер максимальной цифры
        String text = scanner.nextLine();  // Ввод строки с пробелами и цифрами
        text = text.trim();  // Убираем начальные и конечные пробелы
        int maxDigit = -1;  // Переменная для хранения максимальной цифры
        int maxIndex = -1;  // Порядковый номер максимальной цифры

        for (int i = 0; i < text.length(); i++) {  // Перебираем символы строки
            char ch = text.charAt(i);  // Берём текущий символ
            if (Character.isDigit(ch)) {  // Если это цифра
                int digit = ch - '0';  // Преобразуем символ в число
                if (digit > maxDigit) {  // Если цифра больше текущего максимума
                    maxDigit = digit;  // Обновляем максимальную цифру
                    maxIndex = i + 1;  // Запоминаем её порядковый номер (нумерация с 1)
                }
            }
        }

        System.out.println("Порядковый номер максимальной цифры: " + maxIndex);  // Выводим результат

        // Задача 6. Проверить, является ли слово "перевертышем"
        String word = scanner.next();  // Ввод слова
        boolean isPalindrome = true;  // Флаг, указывающий, что слово — палиндром

        for (int i = 0; i < word.length() / 2; i++) {  // Проверяем до середины слова
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {  // Если символы не совпадают
                isPalindrome = false;  // Меняем флаг на false
                break;  // Прерываем цикл
            }
        }

        System.out.println(isPalindrome ? "Слово - перевертыш" : "Слово - не перевертыш");  // Выводим результат

        // Задача 7. Количество букв 'о' в первом слове
        scanner.nextLine();  // Очищаем буфер после предыдущего ввода
        sentence = scanner.nextLine().trim();  // Ввод предложения и удаление пробелов по краям
        firstWord = sentence.split("\\s+")[0];  // Получаем первое слово
        long countO = firstWord.chars().filter(c -> c == 'о').count();  // Подсчитываем буквы 'о'

        System.out.println("Количество букв 'о' в первом слове: " + countO);  // Выводим результат

        // Задача 8. Поменять местами трети слова из 12 букв
        String twelveLetterWord = scanner.next();  // Ввод слова из 12 букв
        if (twelveLetterWord.length() == 12) {  // Проверяем, что длина слова равна 12
            int part = 4;  // Размер каждой трети

            // Вариант а) Первая треть на место третьей, вторая на место первой, третья на место второй
            String rearrangedA = twelveLetterWord.substring(part, 2 * part) +
                                twelveLetterWord.substring(2 * part) +
                                twelveLetterWord.substring(0, part);
            System.out.println("Вариант а: " + rearrangedA);

            // Вариант б) Первая треть на место второй, вторая на место третьей, третья на место первой
            String rearrangedB = twelveLetterWord.substring(2 * part) +
                                twelveLetterWord.substring(0, part) +
                                twelveLetterWord.substring(part, 2 * part);
            System.out.println("Вариант б: " + rearrangedB);
        } else {
            System.out.println("Ошибка: слово должно содержать ровно 12 букв");
        }

        scanner.nextLine();  // Очищаем буфер перед следующим вводом

        // Задача 9. Определить количество слов в предложении
        String inputSentence = scanner.nextLine();  // Ввод предложения

        // Случай 1: начальные и конечные пробелы отсутствуют
        int wordCount1 = inputSentence.split("\\s+").length;  // Разбиваем по пробелам и считаем слова
        System.out.println("Количество слов (без начальных и конечных пробелов): " + wordCount1);

        // Случай 2: начальные и конечные пробелы имеются
        int wordCount2 = inputSentence.trim().split("\\s+").length;  // Очищаем пробелы и считаем слова
        System.out.println("Количество слов (с удалением пробелов): " + wordCount2);
    }
}

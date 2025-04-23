import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5_B {

    // Функция для создания и заполнения квадратной матрицы случайными числами от -10 до 10
    public static int[][] fillMatrix(int size) {
        Random random = new Random(); // Создаём объект для генерации случайных чисел
        int[][] matrix = new int[size][size]; // Создаём квадратную матрицу размером size x size

        // Двойной цикл для заполнения матрицы случайными значениями
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(-10, 11); // Генерируем случайное число от -10 до 10
            }
        }
        return matrix; // Возвращаем заполненную матрицу
    }

    // Функция для вывода матрицы в консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Проходим по строкам матрицы
            System.out.println(Arrays.toString(row)); // Выводим строку в виде массива
        }
    }

    // Функция для обмена двух строк в матрице
    public static int[][] changeRow(int[][] matrix, int rowFirst, int rowSecond) {
        // Цикл проходит по всем элементам строк
        for (int i = 0; i < matrix.length; i++) {
            int base = matrix[rowFirst][i]; // Сохраняем элемент первой строки
            matrix[rowFirst][i] = matrix[rowSecond][i]; // Меняем местами элементы строк
            matrix[rowSecond][i] = base; // Записываем сохранённое значение во вторую строку
        }

        return matrix; // Возвращаем изменённую матрицу
    }

    // Функция для обмена двух столбцов в матрице
    public static int[][] changeColumn(int[][] matrix, int columnFirst, int columnSecond) {
        // Цикл проходит по всем строкам матрицы
        for (int i = 0; i < matrix.length; i++) {
            int base = matrix[i][columnFirst]; // Сохраняем элемент первого столбца
            matrix[i][columnFirst] = matrix[i][columnSecond]; // Меняем местами элементы столбцов
            matrix[i][columnSecond] = base; // Записываем сохранённое значение во второй столбец
        }

        return matrix; // Возвращаем изменённую матрицу
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём объект для считывания ввода

        int[][] matrix = fillMatrix(5); // Создаём матрицу размером 5x5 и заполняем её случайными числами

        System.out.println("Изначальная матрица");
        printMatrix(matrix); // Выводим матрицу на экран

        // Ввод индексов строк для замены
        System.out.println("Введите индекс первой строки");
        int rowFirst = scanner.nextInt();
        System.out.println("Введите индекс второй строки");
        int rowSecond = scanner.nextInt();

        // Проверяем, что индексы строк находятся в пределах массива
        if (rowFirst < 0 || rowFirst >= matrix.length || rowSecond < 0 || rowSecond >= matrix.length) {
            System.out.println("Ошибка индексов"); // Выводим сообщение об ошибке
            return; // Завершаем выполнение программы
        }

        System.out.println("С подменой строк");
        printMatrix(changeRow(matrix, rowFirst, rowSecond)); // Меняем строки и выводим матрицу

        // Выводим текущую матрицу после обмена строк
        System.out.println("Изначальная матрица");
        printMatrix(matrix);

        // Ввод индексов столбцов для замены
        System.out.println("Введите индекс первого столбца");
        int columnFirst = scanner.nextInt();
        System.out.println("Введите индекс второго столбца");
        int columnSecond = scanner.nextInt();

        // Проверяем, что индексы столбцов находятся в пределах массива
        if (columnFirst < 0 || columnFirst >= matrix.length || columnSecond < 0 || columnSecond >= matrix.length) {
            System.out.println("Ошибка индексов"); // Выводим сообщение об ошибке
            return; // Завершаем выполнение программы
        }

        System.out.println("С подменой столбцов");
        printMatrix(changeColumn(matrix, columnFirst, columnSecond)); // Меняем столбцы и выводим матрицу
    }
}

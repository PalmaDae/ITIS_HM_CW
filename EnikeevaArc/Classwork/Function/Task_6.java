import java.util.Arrays;
import java.util.Random;

public class Task_6 {

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

    // Функция для вывода одномерного массива в консоль
    public static void printArray(int[] array) {
        for (int arr : array) { // Проходим по всем элементам массива
            System.out.println(arr); // Выводим элемент в новой строке
        }
    }

    // Функция для нахождения первого чётного элемента в каждом столбце
    public static int[] firstEvenInColumns(int[][] matrix) {
        int[] array = new int[matrix.length]; // Создаём массив для хранения результатов

        // Проходим по каждому столбцу
        for (int j = 0; j < matrix.length; j++) {
            array[j] = 0; // Если чётное число не найдётся, останется 0
            // Проходим по строкам в текущем столбце
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] % 2 == 0) { // Проверяем, является ли число чётным
                    array[j] = matrix[i][j]; // Запоминаем первое найденное чётное число
                    break; // Прерываем цикл, так как нашли первое чётное число
                }
            }
        }
        return array; // Возвращаем массив с первыми чётными числами в столбцах
    }

    // Функция для нахождения последнего нечётного элемента в каждой строке
    public static int[] lastOddInRows(int[][] matrix) {
        int[] array = new int[matrix.length]; // Создаём массив для хранения результатов

        // Проходим по каждой строке
        for (int i = 0; i < matrix.length; i++) {
            array[i] = 0; // Если нечётное число не найдётся, останется 0
            // Проходим по элементам строки справа налево
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (matrix[i][j] % 2 != 0) { // Проверяем, является ли число нечётным
                    array[i] = matrix[i][j]; // Запоминаем последнее найденное нечётное число
                    break; // Прерываем цикл, так как нашли последнее нечётное число
                }
            }
        }
        return array; // Возвращаем массив с последними нечётными числами в строках
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(5); // Создаём матрицу размером 5x5 и заполняем её случайными числами
        printMatrix(matrix); // Выводим матрицу в консоль

        // Выводим массив первых чётных элементов из каждого столбца
        System.out.println("Массив из чётных элементов");
        printArray(firstEvenInColumns(matrix));

        // Выводим массив последних нечётных элементов из каждой строки
        System.out.println("Массив из нечётных элементов");
        printArray(lastOddInRows(matrix));
    }
}

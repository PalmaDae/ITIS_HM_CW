import java.util.Arrays;
import java.util.Random;

public class Task_8 {

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

    // Функция для подсчёта количества элементов выше главной диагонали
    public static int[] valuesAboveDiagonal(int[][] matrix) {
        int cnt = 0;

        // Подсчёт количества элементов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                cnt++;
            }
        }

        int[] array = new int[cnt]; // Создаём массив нужного размера
        int index = 0;

        // Заполняем массив элементами выше главной диагонали
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                array[index++] = matrix[i][j];
            }
        }

        return array; // Возвращаем массив значений
    }

    // Функция для получения элементов ниже главной диагонали
    public static int[] valuesBelowDiagonal(int[][] matrix) {
        int cnt = 0;

        // Подсчёт количества элементов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                cnt++;
            }
        }

        int[] array = new int[cnt]; // Создаём массив нужного размера
        int index = 0;

        // Заполняем массив элементами ниже главной диагонали
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                array[index++] = matrix[i][j];
            }
        }

        return array; // Возвращаем массив значений
    }

    // Функция для вывода массива в консоль
    public static void printArray(int[] array) {
        for (int arr : array) { // Проходим по всем элементам массива
            System.out.println(arr); // Выводим значение
        }
    }

    // Функция для получения элементов выше побочной диагонали
    public static int[] valuesAbovePovDiagonal(int[][] matrix) {
        int cnt = 0;

        // Подсчёт количества элементов выше побочной диагонали
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                cnt++;
            }
        }

        int[] array = new int[cnt]; // Создаём массив нужного размера
        int index = 0;

        // Заполняем массив элементами выше побочной диагонали
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                array[index++] = matrix[i][j];
            }
        }

        return array; // Возвращаем массив значений
    }

    // Функция для получения элементов ниже побочной диагонали
    public static int[] valuesBelowPovDiagonal(int[][] matrix) {
        int cnt = 0;

        // Подсчёт количества элементов ниже побочной диагонали
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                cnt++;
            }
        }

        int[] array = new int[cnt]; // Создаём массив нужного размера
        int index = 0;

        // Заполняем массив элементами ниже побочной диагонали
        for (int i = 1; i < matrix.length; i++) {
            for (int j = matrix.length - i; j < matrix.length; j++) {
                array[index++] = matrix[i][j];
            }
        }
        return array; // Возвращаем массив значений
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(5); // Создаём матрицу 5x5 и заполняем случайными числами
        int[] array = valuesBelowPovDiagonal(matrix); // Получаем элементы ниже побочной диагонали

        printMatrix(matrix); // Выводим матрицу
        printArray(array); // Выводим массив значений ниже побочной диагонали
    }
}

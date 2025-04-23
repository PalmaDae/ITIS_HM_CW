import java.util.Arrays;
import java.util.Random;

public class Task_9 {

    // Функция для создания и заполнения квадратной матрицы случайными числами от -10 до 10
    public static int[][] fillMatrix(int size) {
        Random random = new Random(); // Создаём объект для генерации случайных чисел
        int[][] matrix = new int[size][size]; // Создаём квадратную матрицу

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

    // Функция для нахождения элементов, кратных 3
    public static int[] valuesMultiplesOf3(int[][] matrix) {
        int cnt = 0;

        // Подсчитываем количество элементов, делящихся на 3
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] % 3 == 0) { // Проверяем делимость на 3
                    cnt++;
                }
            }
        }

        int[] array = new int[cnt]; // Создаём массив нужного размера
        int index = 0;

        // Заполняем массив значениями, которые делятся на 3
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] % 3 == 0) {
                    array[index++] = matrix[i][j];
                }
            }
        }

        return array; // Возвращаем массив значений
    }

    // Функция для разделения элементов на положительные и отрицательные
    public static void valuesPositiveAndNegative(int[][] matrix) {
        int cntOfPos = 0;
        int cntOfNeg = 0;

        // Подсчитываем количество положительных и отрицательных элементов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] >= 0) {
                    cntOfPos++;
                } else {
                    cntOfNeg++;
                }
            }
        }

        int[] arrayOfPos = new int[cntOfPos]; // Создаём массив для положительных чисел
        int[] arrayOfNeg = new int[cntOfNeg]; // Создаём массив для отрицательных чисел
        int indexOfPos = 0;
        int indexOfNeg = 0;

        // Заполняем массивы значениями из матрицы
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] >= 0) {
                    arrayOfPos[indexOfPos++] = matrix[i][j];
                } else {
                    arrayOfNeg[indexOfNeg++] = matrix[i][j];
                }
            }
        }

        // Выводим положительные и отрицательные элементы
        System.out.println("Положительные элементы:");
        System.out.println(Arrays.toString(arrayOfPos));
        System.out.println("Отрицательные элементы:");
        System.out.println(Arrays.toString(arrayOfNeg));
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(5); // Создаём и заполняем матрицу 5x5 случайными числами

        printMatrix(matrix); // Выводим матрицу

        valuesPositiveAndNegative(matrix); // Разделяем элементы на положительные и отрицательные
    }
}

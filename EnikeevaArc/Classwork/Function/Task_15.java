import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_15 {

    // Функция для бинарного поиска элемента в отсортированном массиве
    public static int binarySearch(int[] row, int target) {
        int left = 0;  // Левая граница поиска
        int right = row.length - 1;  // Правая граница поиска

        // Пока диапазон поиска не сузится до невозможности
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Находим середину

            if (row[mid] == target) { // Если элемент найден, возвращаем его индекс
                return mid;
            }

            if (row[mid] < target) {
                left = mid + 1; // Ищем в правой половине
            } else {
                right = mid - 1; // Ищем в левой половине
            }
        }
        return -1;  // Если элемент не найден
    }

    // Функция для генерации отсортированной матрицы
    public static int[][] generateSortedMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        // Заполняем строки матрицы случайными числами и сортируем их
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(1, 100); // Генерируем случайное число от 1 до 99
            }
            Arrays.sort(matrix[i]); // Сортируем строку для бинарного поиска
        }

        return matrix;
    }

    // Функция для вывода матрицы в консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row)); // Выводим каждую строку массива
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества строк и столбцов
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] matrix = generateSortedMatrix(rows, cols); // Генерация и заполнение матрицы
        printMatrix(matrix); // Вывод матрицы

        // Ввод числа для поиска
        System.out.print("Введите число для поиска: ");
        int target = scanner.nextInt();

        int index = -1;
        // Ищем число в каждой строке с помощью бинарного поиска
        for (int i = 0; i < rows; i++) {
            index = binarySearch(matrix[i], target);  // Поиск в текущей строке
            if (index != -1) {
                // Если найдено, выводим его позицию
                System.out.println("Элемент " + target + " найден в строке " + i + ", столбце " + index);
                break;
            }
        }

        // Если число не найдено
        if (index == -1) {
            System.out.println("Элемент " + target + " не найден");
        }
    }
}

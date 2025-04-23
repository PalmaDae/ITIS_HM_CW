import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_14 {

    // Функция для линейного поиска числа в матрице
    public static int linearSearch(int[][] matrix, int target) {
        // Проходим по строкам
        for (int i = 0; i < matrix.length; i++) {
            // Проходим по элементам строки
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return i * matrix[i].length + j;  // Преобразуем 2D-индексы в одно число
                }
            }
        }
        return -1;  // Если элемент не найден
    }

    // Функция для создания и заполнения матрицы случайными числами от 1 до 100
    public static int[][] fillMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        // Заполняем матрицу случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(1, 100); // Генерируем случайное число от 1 до 99
            }
        }
        return matrix;
    }

    // Функция для вывода матрицы в консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row)); // Выводим строку массива
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества строк и столбцов
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] matrix = fillMatrix(rows, cols); // Создаём и заполняем матрицу
        printMatrix(matrix); // Выводим матрицу в консоль

        // Ввод искомого числа
        System.out.print("Введите число для поиска: ");
        int target = scanner.nextInt();

        int index = linearSearch(matrix, target); // Поиск числа в матрице

        if (index != -1) {
            int row = index / cols; // Вычисляем строку
            int col = index % cols; // Вычисляем столбец
            System.out.println("Элемент " + target + " найден в строке " + row + ", столбце " + col);
        } else {
            System.out.println("Элемент " + target + " не найден");
        }
    }
}

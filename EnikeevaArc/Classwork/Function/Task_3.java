import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_3 {

    // Заполняет квадратную матрицу случайными числами от 5 до 11
    public static int[][] fillMatrix(int size) {
        Random random = new Random();
        int[][] matrix = new int[size][size];

        // Два вложенных цикла для заполнения матрицы случайными числами
        for (int i = 0; i < size; i++) { // Проход по строкам
            for (int j = 0; j < size; j++) { // Проход по столбцам
                matrix[i][j] = random.nextInt(5, 12); // Генерируем число в диапазоне [5, 11]
            }
        }

        return matrix;
    }

    // Выводит матрицу на экран
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Перебираем каждую строку
            System.out.println(Arrays.toString(row)); // Выводим её в формате массива
        }
    }

    // Возвращает сумму элементов указанного столбца
    public static int getColumnSum(int[][] matrix, int s) {
        int sum = 0;

        // Проход по всем строкам, собираем элементы нужного столбца
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][s]; // Прибавляем к сумме элемент столбца s в строке i
        }
        return sum;
    }

    // Возвращает сумму элементов указанной строки
    public static int getRowSum(int[][] matrix, int k) {
        int sum = 0;

        // Проход по всем элементам строки k
        for (int i = 0; i < matrix[k].length; i++) {
            sum += matrix[k][i]; // Прибавляем к сумме элемент строки k в столбце i
        }
        return sum;
    }

    // Определяет максимальную сумму между строкой и столбцом
    public static int findMaxSum(int rowSum, int columnSum) {
        return Math.max(rowSum, columnSum); // Возвращаем большее из двух значений
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = fillMatrix(4); // Создаём матрицу размером 4x4

        printMatrix(matrix); // Выводим матрицу

        // Запрашиваем у пользователя номер строки
        System.out.println("Введите строку:");
        int k = scanner.nextInt();

        // Запрашиваем у пользователя номер столбца
        System.out.println("Введите столбец:");
        int s = scanner.nextInt();

        int rowSum = getRowSum(matrix, k); // Считаем сумму строки k
        int columnSum = getColumnSum(matrix, s); // Считаем сумму столбца s
        int maxSum = findMaxSum(rowSum, columnSum); // Определяем максимум

        System.out.println("Строка");
        System.out.println(rowSum); // Выводим сумму строки
        System.out.println("Столбец");
        System.out.println(columnSum); // Выводим сумму столбца
        System.out.println("Максимум");
        System.out.println(maxSum); // Выводим наибольшее значение из двух
    }
}

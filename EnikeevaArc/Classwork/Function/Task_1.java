import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task_1 {

    // Заполняет квадратную матрицу случайными числами от 5 до 11
    public static int[][] fillMatrix(int size) {
        Random random = new Random();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) { // Перебираем строки
            for (int j = 0; j < size; j++) { // Перебираем столбцы
                matrix[i][j] = random.nextInt(5, 12); // Генерируем случайное число в диапазоне [5, 11]
            }
        }
        return matrix;
    }

    // Выводит матрицу в консоль в удобочитаемом виде
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Перебираем каждую строку
            System.out.println(Arrays.toString(row)); // Выводим строку как массив
        }
    }

    // Запрашивает у пользователя номер строки и проверяет его корректность
    public static int getRowIndex(Scanner scanner, int matrixSize) {
        System.out.print("Введите номер строки (начиная с 0): ");
        int rowIndex = scanner.nextInt();

        // Проверяем, входит ли номер строки в допустимый диапазон
        if (rowIndex < 0 || rowIndex >= matrixSize) {
            System.out.println("Ошибка: номер строки вне диапазона матрицы.");
            return -1; // Возвращаем -1, если номер некорректен
        }

        return rowIndex;
    }

    // Запрашивает у пользователя пороговое значение
    public static int getTargetValue(Scanner scanner) {
        System.out.print("Введите пороговое значение: ");
        return scanner.nextInt(); // Читаем целое число от пользователя
    }

    // Считает сумму элементов в указанной строке матрицы
    public static int getRowSum(int[][] matrix, int rowIndex) {
        int sum = 0;

        if (rowIndex >= 0 && rowIndex < matrix.length) { // Проверяем корректность индекса
            for (int value : matrix[rowIndex]) { // Перебираем элементы строки
                sum += value; // Суммируем значения
            }
        }

        return sum;
    }

    // Проверяет, больше ли сумма строки заданного порога
    public static boolean isSumGreaterThan(int sum, int target) {
        return sum > target;
    }

    // Перемножает элементы второго столбца матрицы
    public static int getProduct(int[][] matrix) {
        int product = 1;

        for (int i = 0; i < matrix.length; i++) { // Перебираем строки
            product *= matrix[i][1]; // Умножаем элементы второго столбца (индекс 1)
        }
        return product;
    }

    // Проверяет, является ли произведение трёхзначным числом
    public static boolean isThreeDigit(int product) {
        return product >= 100 && product <= 999; // Проверяем диапазон [100, 999]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = fillMatrix(3); // Создаём матрицу 3x3
        printMatrix(matrix); // Выводим матрицу в консоль

        int product = getProduct(matrix); // Вычисляем произведение второго столбца
        boolean isThreeDigit = isThreeDigit(product); // Проверяем, трёхзначное ли оно
        System.out.println(product); // Выводим произведение
        System.out.println(isThreeDigit); // Выводим результат проверки

        int rowIndex = getRowIndex(scanner, matrix.length); // Запрашиваем номер строки
        if (rowIndex == -1) return; // Если номер строки некорректный, завершаем программу

        int target = getTargetValue(scanner); // Запрашиваем пороговое значение

        int rowSum = getRowSum(matrix, rowIndex); // Вычисляем сумму элементов строки
        boolean result = isSumGreaterThan(rowSum, target); // Проверяем, превышает ли сумма порог

        System.out.println(rowSum); // Выводим сумму
        System.out.println(result); // Выводим результат проверки
    }
}
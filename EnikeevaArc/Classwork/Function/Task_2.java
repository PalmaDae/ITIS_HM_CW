import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task_2 {

    // Заполняет квадратную матрицу случайными числами от 5 до 11
    public static int[][] fillMatrix(int size) {
        Random random = new Random();
        int[][] matrix = new int[size][size];

        // Два вложенных цикла: внешний проходит по строкам, внутренний по столбцам
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(5, 12); // Генерируем случайное число в диапазоне [5, 11]
            }
        }
        return matrix;
    }

    // Выводит матрицу на экран в виде строк массива
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Перебираем каждую строку матрицы
            System.out.println(Arrays.toString(row)); // Выводим строку в формате [x, y, z, ...]
        }
    }

    // Возвращает сумму элементов указанной строки
    public static int getRowSum(int[][] matrix, int rowIndex) {
        int sum = 0;

        // Проверяем, что индекс строки находится в допустимых границах
        if (rowIndex >= 0 && rowIndex < matrix.length) {
            for (int value : matrix[rowIndex]) { // Перебираем элементы строки
                sum += value; // Прибавляем каждый элемент к сумме
            }
        }

        return sum;
    }

    // Запрашивает у пользователя номер столбца и проверяет его корректность
    public static int getColumnIndex(Scanner scanner, int matrixSize) {
        System.out.print("Введите номер столбца (начиная с 0): ");
        int columnIndex = scanner.nextInt(); // Читаем индекс

        // Проверяем, входит ли индекс в диапазон допустимых значений
        if (columnIndex < 0 || columnIndex >= matrixSize) {
            System.out.println("Ошибка: номер столбца вне диапазона матрицы.");
            return -1; // Если индекс неверный, возвращаем -1
        }

        return columnIndex;
    }

    // Вычисляет произведение элементов указанного столбца
    public static int getColumnProduct(int[][] matrix, int columnIndex) {
        int product = 1;

        // Проходим по всем строкам матрицы и перемножаем элементы указанного столбца
        for (int i = 0; i < matrix.length; i++) {
            product *= matrix[i][columnIndex];
        }

        return product;
    }

    // Проверяет, является ли число двузначным (от 10 до 99 включительно)
    public static boolean isTwoDigit(int number) {
        return number >= 10 && number <= 99;
    }

    // Запрашивает у пользователя пороговое значение
    public static int getTargetValue(Scanner scanner) {
        System.out.print("Введите пороговое значение: ");
        return scanner.nextInt();
    }

    // Проверяет, больше ли произведение столбца, чем заданный порог
    public static boolean isProductGreaterThan(int product, int target) {
        return product > target;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = fillMatrix(4); // Создаём матрицу размером 4x4
        printMatrix(matrix); // Выводим матрицу

        int rowSum = getRowSum(matrix, 3); // Вычисляем сумму 3-й строки
        boolean isTwoDigit = isTwoDigit(rowSum); // Проверяем, двузначная ли сумма

        System.out.println(rowSum); // Выводим сумму строки
        System.out.println(isTwoDigit); // Выводим результат проверки

        int columnIndex = getColumnIndex(scanner, matrix.length);
        if (columnIndex == -1) return; // Если столбец некорректный, завершаем программу

        int target = getTargetValue(scanner); // Запрашиваем пороговое значение
        int columnProduct = getColumnProduct(matrix, columnIndex); // Вычисляем произведение столбца
        boolean result = isProductGreaterThan(columnProduct, target); // Проверяем, больше ли оно порога

        System.out.println(columnProduct); // Выводим произведение столбца
        System.out.println(result); // Выводим результат сравнения
    }
}
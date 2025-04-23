import java.util.Arrays;
import java.util.Random;

public class Task_7 {

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

    // Функция для сложения двух матриц
    public static int[][] thirdMatrixA(int[][] matrixFirst, int[][] matrixSecond) {
        int[][] matrix = new int[matrixFirst.length][matrixSecond.length]; // Создаём матрицу-результат

        // Проходим по строкам
        for (int i = 0; i < matrix.length; i++) {
            // Проходим по столбцам
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrixFirst[i][j] + matrixSecond[i][j]; // Складываем соответствующие элементы
            }
        }
        return matrix; // Возвращаем итоговую матрицу
    }

    // Функция для замены значений на 100 или 0 в зависимости от знаков чисел
    public static int[][] thirdMatrixB(int[][] matrixFirst, int[][] matrixSecond) {
        int[][] matrix = new int[matrixFirst.length][matrixSecond.length]; // Создаём матрицу-результат

        // Проходим по строкам
        for (int i = 0; i < matrix.length; i++) {
            // Проходим по столбцам
            for (int j = 0; j < matrix.length; j++) {
                // Если оба числа положительные или оба отрицательные, ставим 100, иначе 0
                if ((matrixFirst[i][j] >= 0 && matrixSecond[i][j] >= 0) || (matrixFirst[i][j] < 0 && matrixSecond[i][j] < 0)) {
                    matrix[i][j] = 100;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix; // Возвращаем итоговую матрицу
    }

    public static void main(String[] args) {
        int[][] matrixFirst = fillMatrix(5); // Создаём первую матрицу размером 5x5 и заполняем её случайными числами
        System.out.println("Первая исходная матрица");
        printMatrix(matrixFirst); // Выводим первую матрицу

        int[][] matrixSecond = fillMatrix(5); // Создаём вторую матрицу размером 5x5 и заполняем случайными числами
        System.out.println("Вторая исходная матрица");
        printMatrix(matrixSecond); // Выводим вторую матрицу

        System.out.println("Итоговая матрица по первому заданию (сложение матриц)");
        printMatrix(thirdMatrixA(matrixFirst, matrixSecond)); // Выводим сумму матриц

        System.out.println("Итоговая матрица по второму заданию (замена значений)");
        printMatrix(thirdMatrixB(matrixFirst, matrixSecond)); // Выводим матрицу с заменёнными значениями
    }
}

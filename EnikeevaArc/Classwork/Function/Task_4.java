import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_4 {

    // Заполняет квадратную матрицу случайными числами от -10 до 10
    public static int[][] fillMatrix(int size) {
        Random random = new Random();
        int[][] matrix = new int[size][size];

        // Два вложенных цикла для заполнения матрицы случайными числами
        for (int i = 0; i < size; i++) { // Проход по строкам
            for (int j = 0; j < size; j++) { // Проход по столбцам
                matrix[i][j] = random.nextInt(-10, 11); // Генерируем число в диапазоне [-10, 10]
            }
        }
        return matrix;
    }

    // Выводит матрицу в консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Перебираем каждую строку
            System.out.println(Arrays.toString(row)); // Выводим её в формате массива
        }
    }

    // Проверяет, есть ли в матрице столбец, состоящий только из нулей
    public static boolean haveZero(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) { // Проход по столбцам
            boolean flag = true;
            for (int i = 0; i < matrix.length; i++) { // Проверяем каждый элемент столбца
                if (matrix[i][j] != 0) { // Если хотя бы один элемент не 0, то столбец не подходит
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true; // Если столбец целиком из нулей, возвращаем true
            }
        }
        return false; // Если таких столбцов нет, возвращаем false
    }

    // Проверяет, есть ли в матрице столбец, все элементы которого принадлежат интервалу [0, b]
    public static boolean haveInterval(int[][] matrix, int b) {
        for (int j = 0; j < matrix.length; j++) { // Проход по столбцам
            boolean flag = true;
            for (int i = 0; i < matrix.length; i++) { // Проверяем каждый элемент столбца
                if (!(matrix[i][j] >= 0 && matrix[i][j] <= b)) { // Если элемент не в диапазоне, то столбец не подходит
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    // Проверяет, есть ли в матрице столбец, состоящий только из четных чисел
    public static boolean isEven(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) { // Проход по столбцам
            boolean flag = true;
            for (int i = 0; i < matrix.length; i++) { // Проверяем каждый элемент столбца
                if (matrix[i][j] % 2 != 0) { // Если хотя бы одно число нечетное, столбец не подходит
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    // Проверяет, есть ли в матрице столбец с равным количеством четных и нечетных элементов
    public static boolean isEquality(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) { // Проход по столбцам
            int cntEven = 0, cntOdd = 0;
            for (int i = 0; i < matrix.length; i++) { // Подсчитываем четные и нечетные элементы в столбце
                if (matrix[i][j] % 2 == 0) {
                    cntEven++;
                } else {
                    cntOdd++;
                }
            }
            if (cntEven == cntOdd) { // Если количество четных и нечетных одинаково
                return true;
            }
        }
        return false;
    }

    // Проверяет, есть ли в матрице столбец, в котором все элементы одинаковые
    public static boolean isSame(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) { // Проход по столбцам
            boolean flag = true;
            int firstElement = matrix[0][j]; // Берем первый элемент столбца
            for (int i = 1; i < matrix.length; i++) { // Проверяем, одинаковые ли все остальные элементы
                if (matrix[i][j] != firstElement) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    // Находит минимальное значение в матрице
    public static int minValueOfMatrix(int[][] matrix) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) { // Проход по строкам
            for (int j = 0; j < matrix.length; j++) { // Проход по столбцам
                if (matrix[i][j] < minValue) { // Обновляем минимальное значение, если нашли меньшее
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    // Проверяет, есть ли в матрице столбец, содержащий минимум три минимальных элемента
    public static boolean isHasThreeMinValues(int[][] matrix) {
        int minValue = minValueOfMatrix(matrix);

        for (int j = 0; j < matrix.length; j++) { // Проход по столбцам
            int cnt = 0;
            for (int i = 0; i < matrix.length; i++) { // Подсчитываем количество минимальных значений в столбце
                if (matrix[i][j] == minValue) {
                    cnt++;
                }
            }
            if (cnt >= 3) { // Если таких элементов 3 или больше, возвращаем true
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = fillMatrix(10); // Создаём матрицу 10x10
        System.out.println("Сгенерированная матрица:");
        printMatrix(matrix);

        System.out.println("Введите до какого числа брать интервал:");
        int interval = scanner.nextInt(); // Ввод интервала

        // Вызываем методы и сохраняем результаты
        boolean result = haveZero(matrix);
        boolean resultSecond = haveInterval(matrix, interval);
        boolean resultThird = isEven(matrix);
        boolean resultFourth = isEquality(matrix);
        boolean resultFifth = isSame(matrix);
        boolean resultSixth = isHasThreeMinValues(matrix);

        // Вывод результатов
        System.out.println(result
            ? "В матрице есть столбец, состоящий только из нулей"
            : "В матрице нет столбца, состоящего только из нулей");

        System.out.println(resultSecond
            ? "В матрице есть столбец, элементы которого принадлежат заданному интервалу"
            : "В матрице нет столбца, элементы которого принадлежат заданному интервалу");

        System.out.println(resultThird
            ? "В матрице есть столбец, состоящий только из четных элементов"
            : "В матрице нет столбца, состоящего только из четных элементов");

        System.out.println(resultFourth
            ? "В матрице есть столбец с равным количеством четных и нечетных элементов"
            : "В матрице нет столбца с равным количеством четных и нечетных элементов");

        System.out.println(resultFifth
            ? "В матрице есть столбец, в котором все элементы одинаковые"
            : "В матрице нет столбца, в котором все элементы одинаковые");

        System.out.println(resultSixth
            ? "В матрице есть столбец, содержащий как минимум три минимальных элемента"
            : "В матрице нет столбца, содержащего как минимум три минимальных элемента");
    }
}

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_10 {

    // Функция для получения количества столбцов для каждой строки от пользователя
    public static int[] getColumns(int rows, Scanner scanner) {
        int[] cols = new int[rows]; // Создаём массив для хранения количества столбцов в каждой строке
        System.out.println("Введите количество столбцов для каждой строки:");

        // Цикл для ввода количества столбцов для каждой строки
        for (int i = 0; i < rows; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            cols[i] = scanner.nextInt(); // Считываем количество столбцов для текущей строки
        }
        return cols; // Возвращаем массив с количеством столбцов
    }

    // Функция для создания ступенчатого массива с заданным количеством строк и столбцов
    public static int[][] createJaggedArray(int rows, int[] cols) {
        Random random = new Random(); // Объект для генерации случайных чисел
        int[][] jaggedArray = new int[rows][]; // Создаём ступенчатый массив

        // Заполняем ступенчатый массив случайными числами от 0 до 100
        for (int i = 0; i < rows; i++) {
            jaggedArray[i] = new int[cols[i]]; // Выделяем память для строки с заданным количеством столбцов
            for (int j = 0; j < cols[i]; j++) {
                jaggedArray[i][j] = random.nextInt(101); // Генерируем случайное число от 0 до 100
            }
        }

        return jaggedArray; // Возвращаем заполненный массив
    }

    // Функция для вывода ступенчатого массива в консоль
    public static void printJaggedArray(int[][] jaggedArray) {
        for (int[] row : jaggedArray) { // Перебираем строки массива
            System.out.println(Arrays.toString(row)); // Выводим строку в виде массива
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём объект Scanner для ввода данных

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt(); // Считываем количество строк

        int[] cols = getColumns(rows, scanner); // Получаем количество столбцов для каждой строки
        int[][] jaggedArray = createJaggedArray(rows, cols); // Создаём ступенчатый массив

        System.out.println("Сгенерированный ступенчатый массив:");
        printJaggedArray(jaggedArray); // Выводим массив в консоль
    }
}

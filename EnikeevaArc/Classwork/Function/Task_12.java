import java.util.Random;

public class Task_12 {

    // Функция для вычисления суммы всех элементов ступенчатого массива
    public static int sumJaggedArray(int[][] jaggedArray) {
        int sum = 0; // Переменная для хранения суммы

        // Проходим по всем строкам массива
        for (int[] row : jaggedArray) {
            for (int value : row) {
                sum += value; // Добавляем значение к сумме
            }
        }

        return sum; // Возвращаем итоговую сумму
    }

    // Функция для заполнения ступенчатого массива случайными числами от 1 до 9
    public static int[][] fillJaggedArray(int rows) {
        Random random = new Random(); // Объект для генерации случайных чисел
        int[][] jaggedArray = new int[rows][]; // Создаём массив с заданным количеством строк

        for (int i = 0; i < rows; i++) {
            jaggedArray[i] = new int[i + 1]; // Количество столбцов в строке равно (i + 1)

            for (int j = 0; j <= i; j++) {
                jaggedArray[i][j] = random.nextInt(1, 10); // Заполняем случайными числами от 1 до 9
            }
        }

        return jaggedArray; // Возвращаем заполненный массив
    }

    // Функция для вывода ступенчатого массива в консоль
    public static void printJaggedArray(int[][] jaggedArray) {
        for (int[] row : jaggedArray) { // Перебираем строки массива
            for (int value : row) { // Перебираем элементы строки
                System.out.print(value + "\t"); // Выводим элемент с табуляцией
            }
            System.out.println(); // Переход на новую строку
        }
    }

    public static void main(String[] args) {
        int rows = 4; // Устанавливаем количество строк в массиве
        int[][] jaggedArray = fillJaggedArray(rows); // Создаём и заполняем массив

        printJaggedArray(jaggedArray); // Выводим массив в консоль
        System.out.println("Сумма всех элементов: " + sumJaggedArray(jaggedArray)); // Выводим сумму элементов
    }
}

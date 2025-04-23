package Task_5;

import static Task_5.ArrayUtils.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 4, 4, 5, 6};

        System.out.println("Сумма: " + getSum(numbers));
        System.out.println("Среднее арифметическое: " + average(numbers));
        System.out.println("Максимальное значение: " + max_value(numbers));
        System.out.println("Минимальное значение: " + min_value(numbers));
        System.out.println("Самое частое число: " + mode(numbers));

        int[] sortedNumbers = sort_ascending(numbers);
        System.out.println("Отсортированный массив: ");
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }
}

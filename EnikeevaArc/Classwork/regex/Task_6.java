import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[+-]?\\d+\\.\\d+";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Вещественное число");
        } else {
            System.out.println("Невещественное число");
        }
    }
}

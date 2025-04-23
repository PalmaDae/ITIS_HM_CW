import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Za-z]\\d+complete$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}

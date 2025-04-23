import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^ .+exit$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}

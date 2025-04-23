import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Za-z].*done$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Да");
        } else {
            System.out.println("нет");
        }
    }
}

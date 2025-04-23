import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^Start.*\\.$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Строка подходит: " + input);
        } else {
            System.out.println("Не");
        }
    }
}

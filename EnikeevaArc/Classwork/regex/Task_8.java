import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Za-z].*\\?$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Строка подходит: " + input);
        } else {
            System.out.println("Строка не подходит");
        }
    }
}

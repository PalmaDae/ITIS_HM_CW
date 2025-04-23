import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[0-9].*end$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Начинается c числа и кончается с end");
        } else {
            System.out.println("Никак нет!");
        }
    }
}

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^Hello There.*!$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}

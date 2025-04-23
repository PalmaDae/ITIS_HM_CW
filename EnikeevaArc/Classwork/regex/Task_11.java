import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-ZА-Я].*!$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Подходит");
        } else {
            System.out.println("Не");
        }
    }
}

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Za-zА-Яа-я\\s]+$";
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Полходит");
        } else {
            System.out.println("не");
        }
    }
}

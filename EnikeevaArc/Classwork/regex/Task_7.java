import java.util.Scanner;


public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^.{6,}\\?$";
        String input = scanner.nextLine();

        if  (input.matches(regex)) {
            System.out.println("Данная строка подходит: " + input);
        } else {
            System.out.println("Строка не подходит");
        }
    }
}

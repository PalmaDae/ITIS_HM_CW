import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Создание массива
		int length = scanner.nextInt();
		
		int array[] = new int[length];
		
		//Ввод элементов массива
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int matrix = new int[length][length];
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
	}
}
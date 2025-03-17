import java.util.Scanner;

public class Task2 {
	public static double sum(int n, double x) {
		double sum = 0;
		int factorial = 1;
		double degree = 1;
		
		
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			degree = degree * x;
			sum = sum + (degree / factorial);
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double x = scanner.nextDouble();
		
		System.out.println(sum(n, x));
	}
}
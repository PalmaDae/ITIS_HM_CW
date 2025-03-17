import java.util.Scanner;

public class FirstTask {
	
	public static int sum(int n) {
		int sum = 0;
		
		while (n > 0) {
			sum += n % 10;
			n/=10;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		System.out.println(sum(n));
	}
}
import java.util.Scanner;

public class Main {
	public static boolean isPrime(int n) {
		if (n <= 1 || n % 2 == 0) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}
		
		for (int i = 3; i <= Math.sqrt(n);) {
			if (n % i == 0) {
				return false;
			}
			i += 2;
		}
		
		return true;
	}
	
	public static int naOtr(int a, int b) {
		int cnt = 0;
		
		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				cnt += 1;
			}
		}
		
		return cnt;
	}
	
	public static int resheto(int a, int b) {
		boolean[] array = new boolean[b+1];
		int cnt = 0;
		
		
		for (int i = 2; i <= b; i ++) {
			array[i] = true;
		}
		
		for (int i = 2; i <= Math.sqrt(b); i++) {
			int krat = 2;
			while (i * krat <= b) {
				array[i * krat] = false;
				krat++;
			}
		}
		
		for (int i = a; i <= b; i++) {
			if (array[i]) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		
		// int n = scanner.nextInt();
		
		// System.out.println(isPrime(n));
		
		System.out.println(naOtr(1,5));
		
		System.out.println(resheto(1,6));
	}
}
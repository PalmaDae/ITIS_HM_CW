import java.util.Scanner;
import java.util.Arrays;

public class Main{
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
/* 		//1.a
		int[] array = new int[15];
		
		System.out.println("Введите 15 элементов массива:");
		for (int i = 0; i <15; i++){
			array[i] = scanner.nextInt();
		}
		
		for (int i =0; i<4; i++){
			int base = array[8-i];
			array[8-i] = array[2+i];
			array[2+i] = base;
		}
		
		for (int arr : array){
			System.out.println(arr);
		}
		 */
		/* 
		int[] array = new int[15];
		
/* 		//1.б
		System.out.println("Введите 15 элементов массива:");
		for (int i = 0; i <15; i++){
			array[i] = scanner.nextInt();
		}
		System.out.println("Введите числа k и s");
		int k =scanner.nextInt();
		int s = scanner.nextInt()-2;
		int m = (s-k)/2;
		
		for (int i =0; i<m; i++){
			int base = array[s-i];
			array[s-i] = array[k+i];
			array[k+i] = base;
		}
		for (int arr : array){
			System.out.println(arr);
		} */
		 
		//2
	/* 	System.out.println("Введите кол-во элементов массива:");
		int length = scanner.nextInt();
		int[] arr = new int[length];
		
		System.out.println("Введите элементы массива");
		for(int i = 0; i <length; i++){
			arr[i] =scanner.nextInt();
		}

		int firstIndex = -1;
		int lastIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				firstIndex = i;
				break;
			}
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > 0) {
				lastIndex = i;
				break;
			}
		}
		if (firstIndex != -1 && lastIndex != -1) {
			int temp = arr[firstIndex];
			arr[firstIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
		} */
		
	/* 	// 4
		double[][] matrix = {
			{1.2, 3.5, 2.1},
			{4.7, 0.9, 8.2},
			{3.1, 6.6, 2.5}
		};

		
		double sum = 0;

		
		for (int i = 0; i < matrix.length; i++) {
			double maxInRow = matrix[i][0];
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][j] > maxInRow) {
					maxInRow = matrix[i][j];
				}
			}
			sum += maxInRow;
		}
		System.out.println("Сумма наибольших значений строк: " + sum);
 */
		
	 	//5
		System.out.println("Введите число n");
		int n = scanner.nextInt();
		
		String b = String.valueOf(n);
		
		int length = b.length();
		
		if (n>999999 || n<=0){
			System.out.println("Ваше число вышло за лимит 999999, либо оно меньше 0 или равно ему");
			return;
		}
		
		int[] array = new int[length];
		
		for (int i = 0; i <length; i++){
			array[i] = n % 10;
			n/=10;
		}
		
		for (int arr : array){
			System.out.println(arr);
		}
		
	}
}
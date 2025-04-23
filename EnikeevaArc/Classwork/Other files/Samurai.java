	import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Samurai{
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
/*  		//381
		int[][] matrix = new int[10][10];
		
		int maxInt = Integer.MIN_VALUE;
		
		System.out.println("Введите элементы матрицы построчно:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("Элемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
				if (matrix[i][j] >= maxInt){
					maxInt = matrix[i][j];
				}
            }
        }
		
		
		
		for (int i = 0; i <10; i++){
			for (int j = 0; j<10; j++){
				if(matrix[i][j] == maxInt){
					matrix[i][j] = 0;
				}
			}
		}
		
		System.out.println("Введённая матрица:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } */
		
/*  		//382
		int[][] matrix = new int[6][9];
		
		int maxInt = Integer.MIN_VALUE;
		int minInt = Integer.MAX_VALUE;
		
		System.out.println("Введите элементы матрицы построчно:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("Элемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
				if (matrix[i][j] > maxInt){
					maxInt = matrix[i][j];
				}
				if (matrix[i][j]<minInt){
					minInt = matrix[i][j];
				}
            }
        }
		
		System.out.println((maxInt+minInt)/2); */
		
/* 		//383
		System.out.println("Введите число n");
		int maxInt = Integer.MIN_VALUE;
		int n = scanner.nextInt();
		int indexIod = -1;
		int indexJod = -1;
		int[][] matrix = new int[18][n];
		
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Элемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
				if (Math.abs(matrix[i][j]) > maxInt){
					maxInt = Math.abs(matrix[i][j]);
					indexIod = i;
					indexJod = j;
				}
			}
				
		}
		
		System.out.println(maxInt + " " + indexIod + " " + indexJod); */
		
/*  		//384
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] matrix = new int[n][m];
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++){
			int maxRows = 0;
			for (int j = 0; j<m; j++){
				System.out.printf("Элемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
				if(matrix[i][j] > maxRows){
					maxRows = matrix[i][j];
				}
			}
			array[i] = maxRows;
		}
		
		for (int arr : array){
			System.out.println(arr);
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println(sum); */
		
/* 		//385
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		int intMin = Integer.MAX_VALUE;
		int indexIod = -1;
		
		for (int i = 0; i<n; i++){
			for (int j = 0; j<n; j++){
				System.out.printf("Элемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
				if (matrix[i][j] < intMin){
					intMin = matrix[i][j];
					indexIod = i;
				}
			}
		}
		int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += matrix[indexIod][j];
        }
		System.out.println(sum); */
		
/*  		//388
		int[][] matrix = new int[17][17];
		int maxInt = Integer.MIN_VALUE;
		int lenght = 0;
		
		for (int i = 0; i<17; i++){
			for (int j = 0; j<17; j++){
				System.out.printf("Элемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
				if(matrix[i][j] > maxInt){
					maxInt = matrix[i][j];
				}
			}
		}
		
		for (int i = 0; i<17; i++){
			for (int j = 0; j<17; j++){
				if(matrix[i][j] == maxInt){
					lenght++;
				}
			} 
		}
		
		String[] array = new String[lenght];
		int index = 0;
		
		for (int i = 0; i<17; i++){
			for (int j = 0; j<17; j++){
				if(matrix[i][j] == maxInt){
					array[index] = i + " " + j;
					index++;
				}
			}
			System.out.println(array[i]);
		} */
		
		
/*  	//389
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[][] matrix = new int[n][m];
		int[] array = new int[n];
		
		for (int i =0; i<n; i++){
			int minRow = Integer.MAX_VALUE;
			for (int j = 0; j<m; j++){
				System.out.printf("Элемент [%d][%d]: ", i, j);
				matrix[i][j] = scanner.nextInt();
				if (matrix[i][j] < minRow){
					minRow = matrix[i][j];
					
				}
				
			}
			array[i] = minRow;
		}
		
		for(int arr : array){
			System.out.println(arr);
		} */
		
		 
/*   	//392
		int n =8;
		int[][] matrix = new int[n][n];
		int[] array = new int[n];
		
		for (int i = 0; i <n; i++){
			for (int j = 0; j<n; j++){
				System.out.printf("Элемент [%d][%d]: ", i, j);
				matrix[i][j] = scanner.nextInt();
				
			}
		}
		
		int[] array2 = new int[n];
		
		for (int j = 0; j <n; j++){
			int sum = 0;
			int minInt = Integer.MAX_VALUE;
			for (int i = 0; i<n; i++){
				sum+= matrix[i][j];
				if (matrix[i][j] < minInt){
					minInt = matrix[i][j];
				}
			}
			array[j] = Math.abs(sum);
			array2[j] = minInt;
		}
		
		int maxValueInArray = 0;
		
		int valueIndex = 0;
		
		for (int i = 0; i < array.lenght; i++) {
			if (array[i] >= maxValueInArray) {
				maxValueInArray = array[i];
			}
		}
		
		for (int i = 0; i<n; i++){
			if (array[i] == maxValueInArray){
				valueIndex = i;
			}

		}
		
		for (int i = 0; i<n; i++){
			if (i == valueIndex){
				System.out.println(array2[i]);
			}
		} */

		//4.	Вводится n чисел. Проверить, что среди них существует ровно два таких числа, что длина (количество цифр) 
		//каждого из них равна 3 или 5, а их цифры либо все четные, либо все нечетные.
		
		int count = 0;
		
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			int len = String.valueOf(Math.abs(num)).lenght();
			if (len == 3 || len == 5) {
				boolean even = true;
				boolean odd = true;
				int temp = Math.abs(num);
				while (temp > 0) {
					int digit = temp % 10;
					if (digit % 2 == 0) {
						odd = false;
					}else {
						even = false;
					}
					temp /= 10;
				}
				if (even || odd) {
					count++
				}
			}
		}
		
		System.out.println(count==2);
		
	}
}
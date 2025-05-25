import java.util.*;

public class Fibo {
	public static int fibTub(int number) {
		int[] array = new int[2];
		
		array[0] = 1;
		array[1] = 1;
		
		for (int i = 0; i <= number; i++) {
			array[1] = array[1] + array[0];
			array[0] = array[1];
		}
		
		return array[1];
	}
	
	public static void main(String[] args) {
		System.out.println(fibTub(5));
	}
}
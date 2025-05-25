public class Grasshopper {
	public static int grasshopper(int n) {
		int[] array = new int[n+1];
		
		array[0] = 1;
		
		for (int i = 1; i <= n; i++) {
			if ((i - 1) >= 0) {
				array[i] += array[i - 1];
			}
			
			if ((i - 2) >= 0) {
				array[i] += array[i - 2];
			}
			
			if ((i - 3) >= 0) {
				array[i] += array[i - 3];
			}
		}
		
		return array[n];
	}
	
	public static void main(String[] args) {
		System.out.println(grasshopper(8));
	}
}
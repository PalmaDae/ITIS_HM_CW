public class Task3 {
	
	public static boolean isEqual(int[] a, int[] b) {
		int lengthFirst = a.length;
		int lengthSecond = b.length;
		
		if (lengthFirst != lengthSecond) {
			return false;
		}
		
		for (int i = 0; i < lengthFirst; i++) {
			if (a[i] !=  b[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3};
		int[] array2 = {1,2,3};
		
		System.out.println(isEqual(array, array2));
	}
}
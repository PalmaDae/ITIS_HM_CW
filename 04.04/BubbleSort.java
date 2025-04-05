public class BubbleSort {
	public void swap(int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
	
	public void sort(int[] array) {
		int length = array.length;
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i-1; j++) {
				if (array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
			}
 		}
	}
}
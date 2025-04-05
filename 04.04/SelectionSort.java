public class SelectionSort {
	public void swap(int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
	
	public void sort(int[] array) {
		int length = array.length;
		
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			
			for (int j = i + 1; j < length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			
			if (minIndex != i) {
				swap(array, i, minIndex);
			}
		}
	}
}
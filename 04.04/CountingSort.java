public class CountingSort {
	public void sort(int[] array) {
		int max = array[0];
		int min = array[0];
		
		for (int arr : array) {
			if (arr < min) {
				min = arr;
			}
			
			if (arr > max) {
				max = arr;
			}
		}
		
		int[] count = new int[max - min + 1];
		
		for (int arr : array) {
			count[arr-min]++;
		}
		
		int index = 0;
		
		int length = count.length;
		
		for (int i = 0; i < length; i++) {
			while (count[i] > 0) {
				array[index++] = i + min;
				count[i]--;
			}
		}
	}
}
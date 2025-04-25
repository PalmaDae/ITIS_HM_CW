public class MergeSort {
	public void sort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        sort(left);
        sort(right);

        merge(arr, left, right);
    }

	private void merge(int[] array, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		while (i < left.length) {
			array[k++] = left[i++];
		}

		while (j < right.length) {
			array[k++] = right[j++];
		}
	}
}

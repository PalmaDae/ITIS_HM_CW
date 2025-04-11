public class Runner{
	public static void main(String[] args) {
		int[] arrayFirst = {3,5,1,6,7,3,10};
		
		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSort.sort(arrayFirst);
		
		for (int arr : arrayFirst) {
			System.out.println(arr);
		}
		
		System.out.println("-");
		
		int[] arraySecond = {4,23,24,214,1,23,4,3};
		
		SelectionSort selectionSort = new SelectionSort();
		
		selectionSort.sort(arraySecond);
		
		for (int arr : arraySecond) {
			System.out.println(arr);
		}
		
		System.out.println("-");
		
		int[] arrayThird = {32,4,214,13,21,4,56,787,8,7645,653};
		
		CountingSort countingSort = new CountingSort();
		
		countingSort.sort(arrayThird);
		
		for (int arr : arrayThird) {
			System.out.println(arr);
		}
		
		MergeSort mergeSort = new MergeSort();
		
		int[] arrayFourth = {32,43,51,23,23,24,5,6,76,21,31,453,5,6,7,13,2,536,53432,-3,213,-321};
		
		mergeSort.sort(arrayFourth);
		
		for (int arr : arrayFourth) {
			System.out.println(arr);
		}
	}
}
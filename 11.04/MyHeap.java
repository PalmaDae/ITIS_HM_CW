public class MyHeap {
	int capacity = 1000;
	int size = 0;
	int[] heap = new int[capacity];
	
	public MyHeap(int[] heap) {
		this.heap = heap;
		
		size = heap.length;
	}
	
	public void newShkaph() {
		int heapSecond = new int[heap.length * 2];
		
		for (int i = 0; i < size; i++) {
			heapSecond[i] = heap[i];
		}
		
		heap = heapSecond;
		
		capacity *= 2;
	}
	
	public void swap(int firstIndex, int secondIndex) {
		int temp = heap[firstIndex];
		heap[firstIndex] = heap[secondIndex];
		heap[secondIndex] = temp;
	}
	
	public void add(int element) {
		if (size == capacity) {
			newShkaph();
		}
		
		heap[size] = element;
		size++;
		
		int index = s - 1;
		
		while
	}
	
	public void remove(int index) {
		
	}
	
}
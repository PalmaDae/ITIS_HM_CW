public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Дерево переполненно");
        }
        heap[size] = value;
        siftUp(size);
        size++;
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Дерево пустое");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return max;
    }

    public void buildHeapFloyd(int[] array) {
        if (array.length > capacity) {
            throw new IllegalArgumentException("Массив слишком большой для кучи");
        }
        System.arraycopy(array, 0, heap, 0, array.length);
        size = array.length;
        for (int i = (size / 2) - 1; i >= 0; i--) {
            siftDown(i);
        }
    }

    public void buildHeapNaive(int[] array) {
        for (int value : array) {
            insert(value);
        }
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap[parent] >= heap[index]) {
                break;
            }
            swap(parent, index);
            index = parent;
        }
    }

    private void siftDown(int index) {
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }

            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest == index) {
                break;
            }

            swap(index, largest);
            index = largest;
        }
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
	
	public static void heapSort(int[] array) {
		MaxHeap heap = new MaxHeap(array.length);

		heap.buildHeapFloyd(array);

		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = heap.extractMax();
		}
	}

}
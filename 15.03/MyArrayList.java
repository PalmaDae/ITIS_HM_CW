public class MyArrayList implements MyIntList{
	private int[] array;
	private int size;
	
	public MyArrayList() {
		array = new int[1000];
		
		size = 0;
	}
	
	@Override
	public void add(int x) {
		if (size == array.length) {
			newShkaph();
		}
		array[size] = x;
		
		size += 1;
	}
	
	public void newShkaph() {
		int[] arraySecond = new int[array.length * 2];
		
		for (int i = 0; i < array.length; i++) {
			arraySecond[i] = array[i];
		}
		
		array = arraySecond;
	}
	
	public int get(int i) {
		if (i < 0 || i >= size) {
			throw new IllegalArgumentException("Индекс отрицательный");
		}
		
		int element = array[i];
		
		return element;
	}
	
	public void remove(int i) {
		if (i < 0 || i >= size) {
			throw new IllegalArgumentException("Индекс отрицательный");
		}
		
		for (int j = i; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
		size -= 1;
	}
	
	public void delete(int x) {
		for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                remove(i);
                return;
            }
		}
	}
	
	public int size() {
		return size;
	}
	
	public void set(int x, int i) {
		if (i < 0 || i >= size) {
			throw new IllegalArgumentException("Индекс отрицательный");
		}
		array[i] = x;
	}
	
	public void clear() {
		size = 0;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for (int i = 0; i < size; i++) {
			result += Integer.toString(array[i]) + " ";
		}
		
		return result;
	}

	@Override
	public void addAll(MyArrayList list) {
		int newSize = list.size() + size;
		
		while (array.length < newSize) {
			newShkaph();
		}
		
		for (int i = 0; i < list.size; i++) {
			array[size + i] = list.get(i);
		}
		
		size = newSize;
	}
	
	@Override
	public boolean equals(MyArrayList list) {	
		if (size != list.size) {
			return false;
		}
		
		for (int i = 0; i < size; i++) {
			if (array[i] != list.array[i]) {
				return false;
			}
		}
		
		return true;
	}
}
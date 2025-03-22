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
	
	@Override
	public int get(int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		int element = array[i];
		
		return element;
	}
	
	@Override
	public void remove(int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		for (int j = i; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
		size -= 1;
	}
	
	@Override
	public void delete(int x) {
		for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                remove(i);
                return;
            }
		}
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void set(int x, int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		array[i] = x;
	}
	
	@Override
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
	public void addAll(MyIntList list) {
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
	public boolean equals(MyIntList list) {	
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
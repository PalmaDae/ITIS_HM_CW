public class MyArrayList<T> implements MyList<T>{
	private Object[] array;
	private int size;
	
	public MyArrayList() {
		array = new Object[1000];
		
		size = 0;
	}
	
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		Object element = array[index];
		
		return element;
	}
	
	@Override
	public void set(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		array[index] = element;
	}
	
	@Override
	public void add(T element) {
		if (size == array.length) {
			newShkaph();
		}
		array[size] = element;
		
		size++;
	}
	
	public void newShkaph() {
		Object[] arraySecond = new Object[array.length * 2];
		
		for (int i = 0; i < array.length; i++) {
			arraySecond[i] = array[i];
		}
		
		array = arraySecond;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
	}
	
	@Override
	public void delete(T element) {
		
	}
	
	@Override
	public void clear() {
		size = 0;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for (int i = 0; i < size; i++) {
			result += array[i] + " || ";
		}

		return result;
	}
	
	@Override
	public void addAll(MyList list) {
		
	}
	
	@Override
	public boolean equals(MyList list) {
		if (size != list.size) {
			return false;
		}
		
		for (int i = 0; i < size; i++) {
			if (array[i] != list.get(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<>();
		list.add("First message");
		list.add("Second message");
		
		System.out.println(list);
	}
}
public class MyArrayList<T> implements MyList<T>{
	private Object[] array;
	private int size;
	
	public MyArrayList() {
		array = new Object[1000];
		
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		return (T) array[index];
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
		
		for (int j = index; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
		size -= 1;
	}
	
	@Override
	public void delete(T element) {
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				remove(i);
				return;
			}
		}
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
	public void addAll(MyList<T> list) {
		for (int i = 0; i < list.size(); i++) {
			this.add(list.get(i));
		}
	}	
	
	@Override
	public boolean equals(MyList<T> list) {
		if (size != list.size()) {
			return false;
		}
		
		for (int i = 0; i < size; i++) {
			if (!array[i].equals(list.get(i))) {
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
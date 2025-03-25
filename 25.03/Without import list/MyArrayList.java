public class MyArrayList<T> implements MyList<T>{
	private Object[] array;
	private int size;
	
	public MyArrayList() {
		array = new Object[1000];
		
		size = 0;
	}
	
	// @Override
	// public T get(int index) {
		// return answear;
	// }
	
	public void newShkaf() {
		
	}
	
	@Override
	public void set(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
	}
	
	@Override
	public void add(T element) {
		
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
		
		return result;
	}
	
	@Override
	public void addAll(MyList list) {
		
	}
	
	@Override
	public boolean equals(MyList list) {
		return true;
	}
	
	public static void main(String[] args) {
		
	}
}
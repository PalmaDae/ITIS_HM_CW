public class MyIntLinkedList implements MyIntList{
	private Elem head;
	private int size;
	
	public MyIntLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	@Override
	public int get(int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		
	}
	
	@Override
	public void set(int x, int i) {
		
	}
	
	// int get(int i);
	// void set(int x, int i);
	// void add(int x);
	// int size();
	// void remove(int i);
	// void delete(int x);
	// void clear();
	// String toString();
	
	// void addAll(MyArrayList list);
	// boolean equals(MyArrayList list);
	
	public void add(int x) {
		
	}
	
	
}
public class MyIntLinkedList implements MyIntList{
	private MyIntLinkedList head;
	private int size;
	private int value;
	
	public MyIntLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	@Override
	public int get(int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		MyIntLinkedList elem = this.next;
		
		for (int k = 0; k < i; k++) {
			elem = elem.next;
		}
		
		return elem.value
	}
	
	@Override
	public void set(int x, int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		MyIntLinkedList elem = this.next;
		
		for (int k = 0; k < i; k++) {
			elem = elem.next;
		}
		
		elem.value = x;
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
	
	@Override
	public void add(int x) {
		
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public remove(int i) {
		
	}
	
	@Override
	public void delete(int x) {
		
	}
	
	@Override
	public void clear() {
		
	}
	
	@Override
	public void addAll(MyIntLinkedList list) {
		
	}
	
	@Override
	public boolean equals(MyIntLinkedList list) {
		return info;
	}
	
	@Override
	public String toString() {
		return string;
	}
}
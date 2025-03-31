public class MyIntLinkedList implements MyIntList{
	public Elem head;
	public int size;
	public Elem end;
	
	public MyIntLinkedList() {
		this.head = null;
		this.end = null;
		this.size = 0;
	}
	
	@Override
	public int get(int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		Elem elem = head;
		
		for (int k = 0; k < i; k++) {
			elem = elem.next;
		}
		
		return elem.value;
	}
	
	@Override
	public void set(int x, int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		Elem elem = head;
		
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
		Elem newElem = new Elem(x, null);
		
		// if (head == null) {
			// head = newElem;
		// } else {
			// Elem p = head;
			// while (p.next != null) {
				// p = p.next;
			// }
			// p.next = newElem;
		// }
		
		// size++;
		
		if (head == null) {
			head = newElem;
			end = newElem;
		}else {
			end.next = newElem;
			end = newElem;
		}
		
		size++;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void remove(int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		Elem p = head;
		
		for (int k = 0; k < i - 1; k++) {
			p = p.next;
		}
		
		p.next = p.next.next;
		
		if (p.next == null) {
			end = p;
		}
		
		size--;
	}
	
	@Override
	public void delete(int x) {
		Elem p = head;
		Elem perem = head.next;
		
		while (perem != null) {
			if (perem.value == x) {
				p.next = perem.next;
				size--;
				return;
			}
			p = perem;
			perem = perem.next;
		}
		
		end = head;
	}
	
	@Override
	public void clear() {
		head = null;
		end = null;
		size = 0;
	}
	
	@Override
	public void addAll(MyIntLinkedList list) {
		Elem p = list.head;
		
		while (p != null) {
			this.add(p.value);
			p = p.next;
		}
	}
	
	@Override
	public boolean equals(MyIntLinkedList list) {
		Elem p1 = this.head;
		Elem p2 = list.head;
		
		if (this.size != list.size) {
			return false;
		}
		
		while(p1 != null) {
			if(p1.value != p2.value) {
				return false;
			}
			
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		String result = "";
		Elem p = head;
		
		while (p != null) {
			result += Integer.toString(p.value) + " ";
			p = p.next;
		}
		
		return result;
	}
}
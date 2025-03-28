public class MyLinkedList<T> implements MyList<T> {
	public Elem<T> head;
	public int size;
	public Elem<T> end;
	
	public MyLinkedList() {
		this.head = null;
		this.end = null;
		this.size = 0;
	}
	
	@Override
	public void set(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		Elem<T> elem = head;
		
		for (int k = 0; k < index; k++) {
			elem = elem.next;
		}
		
		elem.value = element;
	}
	
	@Override
	public void add(T element) {
		Elem<T> newElem = new Elem<>(element, null);
		
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
	public void clear() {
		head = null;
		end = null;
		size = 0;
	}
	
	@Override
	public void addAll(MyList<T> list) {
		for (int i = 0; i < list.size(); i++) {
			this.add(list.get(i));
		}
	}	
	
	public Elem<T> getHead() {
		return head;
	}
	
	@Override
    public boolean equals(MyList<T> list) {
        Elem<T> p1 = this.head;
        Elem<T> p2 = ((MyLinkedList<T>)list).getHead();

        if (this.size != list.size()) {
            return false;
        }

        while (p1 != null) {
            if (!p1.value.equals(p2.value)) {
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
		Elem<T> p = head;
		
		while (p != null) {
			result += p.value + " ";
			p = p.next;
		}
		
		return result;
	}
	
	@Override
	public void delete(T element) {
        Elem<T> p = head;
        
        if (head != null && head.value.equals(element)) {
            head = head.next;
            size--;
            return;
        }
	}
	
	// T get(int index);
    // void set(int index, T element);
    // void add(T element);
    // int size();
    // void remove(int index);
    // void delete(T element);
    // void clear();
    // String toString();

    // void addAll(MyList<T> list);
    // boolean equals(MyList<T> list);
	
	@Override
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		Elem<T> p = head;
		
		for (int k = 0; k < index - 1; k++) {
			p = p.next;
		}
		
		p.next = p.next.next;
		
		if (p.next == null) {
			end = p;
		}
		
		size--;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Ошибка индекса");
		}
		
		Elem<T> elem = head;
		
		for (int k = 0; k < index; k++) {
			elem = elem.next;
		}
		
		return elem.value;
	}
}
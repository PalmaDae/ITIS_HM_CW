import java.util.*;

public class MyArrayList<T> implements List<T>{
	private Object[] array;
	private int size;
	
	public MyArrayList() {
		array = new Object[1000];
		
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		return (T) array[index];
	}
	
	
	public void set(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		array[index] = element;
	}
	
	public boolean add(T e) {
		array[size] = e;
		size++;
		return true;
	}
	
	public void add(int index, T element) {
		
	}
	
	public void newShkaph() {
		Object[] arraySecond = new Object[array.length * 2];
		
		for (int i = 0; i < array.length; i++) {
			arraySecond[i] = array[i];
		}
		
		array = arraySecond;
	}
	
	
	public int size() {
		return size;
	}
	
	
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		for (int j = index; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
		size -= 1;
	}
	
	
	public void delete(T element) {
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				remove(i);
				return;
			}
		}
	}
	
	
	public void clear() {
		size = 0;
	}
	
	
	public String toString() {
		String result = "";
		
		for (int i = 0; i < size; i++) {
			result += array[i] + " || ";
		}

		return result;
	}
	
	
	public boolean addAll(Collection<? extends T> c) {
		boolean f = false;
		for (T x : c) {
			f = f | add(c);
		}
		return f;
	}
	
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}	
	
	
	public boolean equals(List<T> list) {
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
	
	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		
	}
	
	@Override
	public ListIterator<T> listIterator(int x) {
		return null;
	}

	@Override
	public ListIterator<T> listIterator() {
		return null;
	}
	
	public boolean contains(Object o) {
		return false;
	}
	
	public boolean containsAll(Collection<?> c) {
		return false;
	}
	
	public int hashCode() {
		return 0;
	}
	public int indexOf(Object o) {
		return 0;
	}
	public boolean isEmpty() {
		return false;
	}
	public Iterator<T> iterator() {
		return null;
	}
	
	public boolean remove(Object o) {
		return false;
	}
	public boolean removeAll(Collection<?> c) {
		return false;
	}
	public boolean retainAll(Collection<?> c) {
		return false;
	}
	
	public Object[] toArray() {
		return null;
	}
	
	public <E> E[] toArray(E[] a) {
		return null;
	}
}
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
	
	@Override
	public T set(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		array[index] = element;
		
		return null;
	}
	
	@Override
	public boolean add(T element) {	
		if (size == array.length) {
			newShkaph();
		}
	
		array[size] = element;
		size++;
		return true;
	}
	
	@Override
	public void add(int index, T element) {
		
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
	public T remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Индекс отрицательный");
		}
		
		for (int j = index; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
		size -= 1;
		
		return null;
	}
	
	public void delete(T element) {
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				remove(i);
				return;
			}
		}
	}
	
	@Override
	public int lastIndexOf(Object x) {
		return 0;
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
	public boolean addAll(Collection<? extends T> c) {
		boolean f = false;
		for (T x : c) {
			f |= add(x);
		}
		return f;
	}
	
	@Override
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
	public ListIterator<T> listIterator() {
		return new MyListIterator<>(array, size);
	}


	@Override
	public ListIterator<T> listIterator(int index) {
		return null;
	}
	
	@Override
	public boolean contains(Object o) {
		return false;
	}
	
	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
	
	@Override
	public int indexOf(Object o) {
		return 0;
	}
	
	@Override
	public boolean isEmpty() {
		return false;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(array, size);
	}
	
	@Override
	public boolean remove (Object o) {
		return true;
	}
	
	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}
	
	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}
	
	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		for (int i = 0; i < size; i++) {
			result[i] = array[i];
		}
		return result;
	}
	
	@Override
	public <E> E[] toArray(E[] a) {
		return null;
	}
	
	
	//Не такой, какой нужен
	@Override
	public MyArrayList<T> subList(int fromIndex, int toIndex) {
		if (fromIndex < 0 || toIndex >= size) {
			throw new IndexOutOfBoundsException("Индекс не подходит");
		}
		
		MyArrayList<T> sublist = new MyArrayList<>();
		
		for (int i = fromIndex; i < toIndex; i++) {
			sublist.add(get(i));
		}
		
		return sublist;
	}
	
	// public static void main(String[] args) {
		// MyArrayList<Integer> list = new MyArrayList<>();
		
		// for (int i = 0; i < 16; i++) {
			// list.add(i);
			// System.out.println(list);
		// }
		
		// System.out.println(list);
		
		// MyArrayList<Integer> listSecond = list.subList(3, 12);
		
		// System.out.println("-");
		
		// System.out.println(listSecond);
		
		// System.out.println("-");
		
		// listSecond.delete(8);
		
		// System.out.println(list);
		
		// System.out.println("-");
		
		// System.out.println(listSecond);
		
	// }
}
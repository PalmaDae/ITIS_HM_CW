import java.util.*;

public class MyLinkedList<T> implements List<T> {
    private Elem<T> head;
    private Elem<T> end;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.end = null;
        this.size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Ошибка индекса");
        }
        Elem<T> elem = head;
        for (int i = 0; i < index; i++) {
            elem = elem.next;
        }
        return elem.value;
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Ошибка индекса");
        }
        Elem<T> elem = head;
        for (int i = 0; i < index; i++) {
            elem = elem.next;
        }
        T oldValue = elem.value;
        elem.value = element;
        return oldValue;
    }

    @Override
    public boolean add(T element) {
        Elem<T> newElem = new Elem<>(element, null);
        if (head == null) {
            head = newElem;
            end = newElem;
        } else {
            end.next = newElem;
            end = newElem;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
		
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Ошибка индекса");
        }
        if (index == 0) {
            T value = head.value;
            head = head.next;
            size--;
            return value;
        }
        Elem<T> prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        T value = prev.next.value;
        prev.next = prev.next.next;
        if (prev.next == null) {
            end = prev;
        }
        size--;
        return value;
    }

    @Override
    public boolean remove(Object o) {
        return true;
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
    public String toString() {
        StringBuilder result = new StringBuilder();
        Elem<T> p = head;
        while (p != null) {
            result.append(p.value).append(" -> ");
            p = p.next;
        }
        result.append("null");
        return result.toString();
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <E> E[] toArray(E[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return true;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

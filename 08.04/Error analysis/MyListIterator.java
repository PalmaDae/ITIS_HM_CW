import java.util.ListIterator;

public class MyListIterator<T> implements ListIterator<T> {
    private Object[] array;
    private int size;
    private int index;

    public MyListIterator(Object[] array, int size) {
        this.array = array;
        this.size = size;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

	@SuppressWarnings("unchecked")
    @Override
    public T next() {
        return (T) array[index++];
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }
	
	@SuppressWarnings("unchecked")
    @Override
    public T previous() {
        return (T) array[--index];
    }

    @Override
    public int nextIndex() {
        return index;
    }

    @Override
    public int previousIndex() {
        return index - 1;
    }

    @Override
    public void remove() {
    }

	@SuppressWarnings("unchecked")
    @Override
    public void add(T t) {
    }
	
	@SuppressWarnings("unchecked")
	@Override
    public void set(T t) {
        if (index == 0) {
            throw new IndexOutOfBoundsException("");
        }
        array[index - 1] = t;
    }
}

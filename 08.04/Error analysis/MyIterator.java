import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private Object[] array;
    private int size;
    private int index;

    public MyIterator(Object[] array, int size) {
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
}

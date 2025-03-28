interface MyList<T> {
    T get(int index);
    void set(int index, T element);
    void add(T element);
    int size();
    void remove(int index);
    void delete(T element);
    void clear();
    String toString();

    void addAll(MyList<T> list);
    boolean equals(MyList<T> list);
}

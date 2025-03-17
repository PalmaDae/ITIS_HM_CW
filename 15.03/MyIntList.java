interface MyIntList {
	int get(int i);
	void set(int x, int i);
	void add(int x);
	int size();
	void remove(int i);
	void delete(int x);
	void clear();
	String toString();
	
	void addAll(MyArrayList list);
	boolean equals(MyArrayList list);
}
import java.util.*;

// class MyEntry<K,V> implements Map.Entry<K,V> {
	// K key;
	// V value;
	// public MyEntry(K key, V value) {
		// this.key = key;
		// this.value = value;
	// }
	
	// @Override
	// public V setValue(V value) {
		// return null;
	// }
	
	// @Override
	// public V getValue() {
		// return null;
	// }
	
	// @Override
	// public K getKey() {
		// return null;
	// }
	
	// @Override
	// public boolean equals(Object o) {
		// return true;
	// }
	
	// @Override
	// public int hashCode() {
		// return 0;
	// }
// }

class MyEntry {
	Object key;
	Object value;
	public MyEntry(Object key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "<" + key.toString() + ", " + value.toString() + ">";
	}
}

public class MyArrayMap<K,V> implements Map<K,V>{
	int capacity = 100;
	int size = 0;
	
	public MyArrayMap() {
		
	}
	
	@Override
	public Set<Map.Entry<K,V>> entrySet() {
		return null;
	}
	
	@Override
	public Collection<V> values() {
		return null;
	}
	
	@Override
	public Set<K> keySet() {
		return null;
	}
	
	@Override
	public void clear() {
	}
	
	@Override
	public void putAll(Map<? extends K,? extends V> m) {
	}
	
	@Override
	public V remove(Object key) {
		return null;
	}
	
	@Override
	public V put(K key, V value) {
		if (key == null) {
			return null;
		}
		
		int index = find(key);
		
		if (index == -1) {
			MyEntry entry = new MyEntry(key, value);
			
			entries[size] = entry;
			
			size++;
			return null;
		} else {
			MyEntry entry = entries[index];
			V oldValue = (V) entry.value;
			entry.value = value;
			return oldValue;
		}
	}
	
	public int find(K key) {
		for (int i = 0; i < size; i++) {
			if (entries[i].key.equals(key)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public V get(Object key) {
		int index = find((K) key);
		if (index == -1) {
			return
		} else {
			
		}
	}
	
	@Override
	public boolean containsValue(Object key) {
		return true;
	}
	
	@Override
	public boolean containsKey(Object key) {
		return true;
	}
	
	@Override
	public boolean isEmpty() {
		return true;
	}
	
	@Override
	public int size() {
		return 0;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for (int i = 0; i < size; i++) {
			result += entries[i].toString() + " | ";
		}
		
		return result;
	}
}
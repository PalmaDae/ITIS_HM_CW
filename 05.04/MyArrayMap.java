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
}

public class MyArrayMap<K,V> implements Map<K,V>{
	int capacity;
	int size;
	
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
		return null;
	}
	
	public V get(Object key) {
		return null;
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
}
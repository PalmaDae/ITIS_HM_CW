import java.util.*;

public class MyTreeMap<K,V> implements Map<K,V>{
	Comparator<> myComparator = new TreeComparator();
	
	public MyTreeMap() {
		
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
import java.util.*;

class TreeElem() {
	Object value;
	Object key;
	TreeElem left;
	TreeElem right;
	
	public TreeElem(Object key,Object value) {
		this.value = value;
		this.key = key;
	}
}

public class MyTreeMap<K,V> implements Map<K,V>{
	public TreeElem root;
	Comparator<> comparator;
	
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
		if (root == null) {
			root = new TreeElem(key,value);
		} else {
			TreeElem p = root;
			
			while(true) {
				if (key.equals(root.key)) {
					V oldValue = p.value;
					p.value = value;
					
					return oldValue;
					
				} else {
					
					if (comparator.compare(p.key, key) > 0){
						if (p.left != null) {
							p = p.left;
						} else {
							p.left = new TreeElem(key,value);
							
							return null;
						}
					} else {
						if (p.right != null) {
							p = p.right;
						} else {
							p.right = new TreeElem(key,value);
							
							return null;
						}
					}
				}
				}
			}
		}
		
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
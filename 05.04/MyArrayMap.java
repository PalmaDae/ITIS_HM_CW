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
	MyEntry[] entries = new MyEntry[capacity]; // Хранит сами значения, которые нам нужны, то есть key и value.
	
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
	public V put(K key, V value) { //Вторая часть понимания
		if (key == null) {
			return null;
		}
		
		int index = find(key); //Индекс кея, который мы нашли позднее(ранее???) в find.
		
		if (index == -1) { // Если мы такой key не нашли, значит он у нас будет новым, то есть добавляем новое значение в массив.
			MyEntry entry = new MyEntry(key, value); //Создаём, чтобы мы могли добавить в наш массив объект, который хранит и вэлью и кей.
			
			entries[size] = entry; //Присваиваем последнему значению значение и ключ, который нам нужен.
			
			size++;
			return null;
			
		} else { //Мы нашли этот key, 
			MyEntry entry = entries[index];  //Создаём объект, туда кидает данные, который мы нашли по ключу в find
			
			V oldValue = (V) entry.value; //Сохраняем вэлью, который был в нашем массиве в отдельную переменную.
			
			entry.value = value; //В наш объект закидываем значение, которое мы засунули в put
			
			return oldValue;
		}
	}
	
	public int find(K key) { //Первая часть понимания
		for (int i = 0; i < size; i++) { //Проходим по массиву наших значений
			if (entries[i].key.equals(key)) { //Если мы нашли key, который мы вбили в find, то он вернёт на каком месте он стоит.
				return i;
			}
		}
		
		return -1; //Иначе, он говорит нет, не получилось, поэтому возвращаем отрицание
	}
	
	@Override
	public V get(Object key) { //Возвращает вэлью, по нашему ключу. Третья часть
		int index = find((K) key);
		
		if (index == -1) { //Если индекс отрицательный, значит такого ключа нет, нам и нечего возвращать.
			return null;
		
		} else {
			return (V) entries[index].value; //Возвращает вэлью по индексу нашего ключа
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
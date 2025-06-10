public class Runner {
	public static void main(String[] args) {
		MyArrayMap array = new MyArrayMap();
		
		for (int i = 97; i < 108; i++) {
			char c = (char) i;
			
			array.put(c, i);
		}
		
		System.out.println(array);
		
		System.out.println(array.get('b'));
	}
}
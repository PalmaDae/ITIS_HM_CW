public class Runner {
	public static void main(String[] args) {
		MyArrayList work = new MyArrayList();
		MyArrayList testEquals = new MyArrayList();
		MyArrayList testEquals2 = new MyArrayList();
		MyArrayList testEquals3 = new MyArrayList();
		
		for (int i = 0; i < 101; i++) {
			work.add(i);
		}
		
		System.out.println(work);
		
		System.out.println(work.get(5));
		
		work.set(3, 5);
		
		System.out.println(work);
		
		work.set(5, 5);
		
		System.out.println(work.size());
		
		work.clear();
		
		System.out.println(work);
		
		for (int i = 0; i < 101; i++){
			testEquals.add(i);
			testEquals3.add(i);
		}
		
		for (int i = 0; i < 101; i++) {
			testEquals2.add(i*-1);
		}
		
		System.out.println(testEquals.equals(testEquals2));
		
		System.out.println(testEquals.equals(testEquals3));
		
		testEquals.addAll(testEquals2);
		
		System.out.println(testEquals);
		
		testEquals.remove(0);
		
		System.out.println(testEquals);
		
		for (int i = 0; i < testEquals.size(); i++) {
			if (testEquals.get(i) % 2 == 0) {
				testEquals.delete(testEquals.get(i));
			}
		}
		
		System.out.println(testEquals);
	}
}
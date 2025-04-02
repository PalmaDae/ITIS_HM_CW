import java.util.*;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		Comparator myFirstComparator = new MyIntegerComparator();
		Comparator
		
		for (int i = 15; i > 0; i--) {
			array.add(i);
		}
		
		System.out.println(array);
		
		System.out.println("---");
		
		Collections.sort(array, myFirstComparator);
		
		System.out.println(array);
	}
}
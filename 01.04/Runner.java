import java.util.*;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		Comparator myFirstComparator = new MyIntegerComparator();
		
		for (int i = 15; i > 0; i--) {
			array.add(i);
		}
		
		System.out.println(array);
		
		System.out.println("---");
		
		Collections.sort(array, myFirstComparator);
		
		System.out.println(array);
		
		System.out.println("---");
		
		ArrayList<Double> array2 = new ArrayList<>();
		Comparator mySecondComparator = new MyDoubleComparator(MyDoubleComparator.torch);
		
		for (Double i = 5.0; i > 0; i -= 0.5) {
			array2.add(i);
		}
		
		System.out.println(array2);
		
		System.out.println("---");
		
		Collections.sort(array2, mySecondComparator);
		
		System.out.println(array2);
		
		System.out.println("---");
		
		ArrayList<Stundet> array4 = new ArrayList<>();
		Comparator myFourthComparator = new MyAverageScoreComparator();
		
		System.out.println("---");
		
		
	}
}
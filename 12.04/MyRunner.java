import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.Comparator;

public class MyRunner {
	public static void main(String[] args) {
		ArrayList<String> list = MyFunctions.listOfNames();
		ArrayList<String> listOfAll = MyFunctions.allStats(list);
		ArrayList<String> uzbekList = MyFunctions.allStatsPoName(list, "Sultan");
		
		Comparator<String> myComparator = new CoincidentComparator();
		
		Collections.sort(uzbekList, myComparator);
		
		Collections.sort(listOfAll, myComparator);
		
		for (String ans : uzbekList) {
			System.out.println(ans);
		}
		
		System.out.println("\n-----\n");
		
		for (String str : listOfAll) {
			System.out.println(str);
		}
		
		System.out.println("\n-----\n");
		
		ArrayList<String> list3 = MyFunctions.recomMovie("Shlyapnik", "Arthur");
		
		for (String arr : list3) {
			System.out.println(arr);
		}
	}
}
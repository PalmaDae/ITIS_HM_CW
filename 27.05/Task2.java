import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Task2 {
	public static ArrayList<int[]> taskSolver(ArrayList<int[]> list) {
		ArrayList<int[]> result = new ArrayList<>();
		
		list.stream().map(s -> s[0]).sorted().collect(Collectors.toList());
		
		result.add(list.get(0));
		
		int last = result.get(0)[1];
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)[0] > last) {
				result.add(list.get(i));
				last = list.get(i)[1];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		ArrayList<int[]> list = new ArrayList<>();
			list.add(new int[]{0,5});
			list.add(new int[]{3,6});
			list.add(new int[]{5,9});
			list.add(new int[]{6,8});
			list.add(new int[]{8,10});
		
		ArrayList<int[]> result = taskSolver(list);
		
		System.out.println(result.size());
		
		for (int[] arr : result) {
			for (int res : arr) {
				System.out.println(res);
			}
		}
	}
}
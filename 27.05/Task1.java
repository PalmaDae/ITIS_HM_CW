import java.util.*;

public class Task1 {
	@SuppressWarnings("unchecked")
	public static ArrayList<int[]> taskSolver(ArrayList<int[]> list) {
		ArrayList<int[]> result = new ArrayList<>();
		
		// result.add(list.get(0));
		
		// int index = 0;
		
		result.add(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)[0] > result.get(i)[1]) {
				result.add(list.get(i));
			}
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<int[]> list = new ArrayList<>();
			list.add(new int[]{1,4});
			list.add(new int[]{3,5});
			list.add(new int[]{0,6});
			list.add(new int[]{5,7});
			list.add(new int[]{8,9});
			list.add(new int[]{5,9});
		
		
		ArrayList<int[]> result = taskSolver(list);
		
		System.out.println(result.size());
		
		for (int[] arr : result) {
			for (int res : arr) {
				System.out.println(res);
			}
		}
	}
}
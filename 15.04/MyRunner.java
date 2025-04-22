import java.util.*;

public class MyRunner {
	public static void main(String[] args) {
		ArrayList<String> names = MyFunctions.usersFrom("Казань");
		
		for (String str : names) {
			System.out.println(str);
		}
	}
}
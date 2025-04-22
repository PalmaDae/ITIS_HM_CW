import java.util.*;

public class MyRunner {
	public static void main(String[] args) {
		ArrayList<User> names = MyFunctions.usersFrom("Казань");
		
		// MyFunctions.printNames(names);
		
		
		ArrayList<String> list = MyFunctions.friendsFrom("Казань");
		
		for (String str : list) {
			System.out.println(str);
		}
	}
}
package dao;

import java.util.*;
import entity.*;
import database.*;

public class MyRunner {
	public static void main(String[] args) {
		ArrayList<User> names = MyFunctions.usersFrom("Казань");
		
		// MyFunctions.printNames(names);
		
		
		// ArrayList<Subscriptions> list = MyFunctions.listOfSubcribers();
		
		// for (Subscriptions str : list) {
			// System.out.println(str);
		// }
		
		// ArrayList<String> list = MyFunctions.friendsFrom("Казань");
		
		
		// for (String str : list) {
			// System.out.println(str);
		// }
	}
}
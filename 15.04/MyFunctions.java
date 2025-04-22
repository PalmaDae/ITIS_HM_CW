import java.util.*;
import java.io.*;

public class MyFunctions {
	public static ArrayList<User> listOfUsers() {
		ArrayList<User> list = new ArrayList<User>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\15.04\\Users.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] data = line.split("#");
				String id = data[0];
				String name = data[1];
				String city = data[2];
				String birthday = data[3];

				User user = new User(id, name, city, birthday);
				list.add(user);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
		
		return list;
	}
	
	public static ArrayList<Subscriptions> listOfSubcribers() {
		ArrayList<Subscriptions> list = new ArrayList<Subscriptions>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\15.04\\SubscribeId.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] data = line.split("#");
				String who = data[0];
				String onWhom = data[1];

				Subscriptions subscriber = new Subscriptions(who, onWhom);
				list.add(subscriber);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
		
		return list;
	}
	
	// public static ArrayList<String> usersFrom(String city) {
		// ArrayList<String> names = new ArrayList<String>();
		// ArrayList<User> users = listOfUsers();
		
		// for (User user : users) {
			// if (user.getCity().equals(city)) {
				// names.add(user.getName());
			// }
		// }
		
		// return names;
	// }
	
	public static ArrayList<User> usersFrom(String city) {
		ArrayList<User> userCity = new ArrayList<User>();
		ArrayList<User> users = listOfUsers();
		
		for (User user : users) {
			if (user.getCity().equals(city)) {
				names.add(user);
			}
		}
		
		return userCity;
	}
	
	public static void printNames(ArrayList<User> list) {
		for (User user : list) {
			System.out.println(user.getName());
		}
	}
	
	public static ArrayList<String> friendsFrom(String city) {
		ArrayList<Subscriptions> subs = listOfSubcribers();
		ArrayList<User> usersFromCity = usersFrom(city);
		ArrayList<String> listOfFriends = new ArrayList<String>();
		
		for (int i = 0; i < subs.size(); i++) {
			
			
			
			for (int j = i + 1; j < subs.size(); j++) {
				if (i == j) {
					continue;
				}
				
				listOfFriends.add(subs.get(i).getWho());
				listOfFriends.add(subs.get(j).getOnWhom());
			}
		}
		
		return listOfFriends;
	}

	//27 страница

	// public static ArrayList<String> allStats(ArrayList<String> list) {
		// ArrayList<String> result = new ArrayList<String>();
		
		// for (int i = 0; i < list.size(); i++) {
			// for (int j = i + 1; j < list.size(); j++) {
				// if (i == j) {
					// continue;
				// }
				
				// result.add(coincidentProcent(list.get(i), list.get(j)));
			// }
		// }
		
		// return result;
	// }
}
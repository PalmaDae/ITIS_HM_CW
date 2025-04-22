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
	
	public static ArrayList<User> usersFrom(String city) {
		ArrayList<User> userCity = new ArrayList<User>();
		ArrayList<User> users = listOfUsers();
		
		for (User user : users) {
			if (user.getCity().equals(city)) {
				userCity.add(user);
			}
		}
		
		return userCity;
	}
	
	public static void printNames(ArrayList<User> list) {
		for (User user : list) {
			System.out.println(user.getName());
		}
	}
	
	public static boolean isFollow(String who, String onWhom, ArrayList<Subscriptions> subs) {
		for (int i = 0; i < subs.size(); i++) {
			String a = subs.get(i).getWho();
			String b = subs.get(i).getOnWhom();

			if (a.equals(who) && b.equals(onWhom)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isFriends(User a, User b, ArrayList<Subscriptions> subs) {
		boolean first = isFollow(a.getID(), b.getID(), subs);
		boolean second = isFollow(b.getID(), a.getID(), subs);

		return first && second;
	}

	public static ArrayList<String> friendsFrom(String city) {
		ArrayList<Subscriptions> subs = listOfSubcribers();
		ArrayList<User> users = usersFrom(city);
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < users.size(); i++) {
			User userA = users.get(i);
			for (int j = i + 1; j < users.size(); j++) {
				User userB = users.get(j);

				if (isFriends(userA, userB, subs)) {
					list.add(userA.getName() + " <3 " + userB.getName());
				}
			}
		}

		return list;
	}


	//27 страница
}
package dao;

import java.util.*;
import entity.*;
import database.*;

public class MyFunctions {
	private static Database dbase = new Database();
	public static ArrayList<User> listUsers = dbase.getUsers();  
	private static ArrayList<Subscriptions> listSubscriptions = dbase.getSubs();  
	private static ArrayList<Group> listGroups = dbase.getGroups();  
	private static ArrayList<Message> listMessages = dbase.getMessages();
	private static ArrayList<Member> listOfMembers = dbase.getMembers();

    
	public static ArrayList<User> usersFrom(String city) {
		ArrayList<User> userCity = new ArrayList<User>();
		for (User user : listUsers) {
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

    
	public static boolean isFollow(String who, String onWhom) {
		for (Subscriptions sub : listSubscriptions) {
			if (sub.getWho().equals(who) && sub.getOnWhom().equals(onWhom)) {
				return true;
			}
		}
		return false;
	}

    
	public static boolean isFriends(User a, User b) {
		boolean first = isFollow(a.getID(), b.getID());
		boolean second = isFollow(b.getID(), a.getID());
		return first && second;
	}


	public static ArrayList<String> friendsFrom(String city) {
		ArrayList<User> users = usersFrom(city);
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < users.size(); i++) {
			User userA = users.get(i);
			for (int j = i + 1; j < users.size(); j++) {
				User userB = users.get(j);

				if (isFriends(userA, userB)) {
					list.add(userA.getName() + " <3 " + userB.getName());
				}
			}
		}

		return list;
	}

	public static User theMostLonely() {
		User theMostLonely = null;
		int cntOfSubs = 0;

		for (User userA : listUsers) {
			int following = 0;
			
			for (User userB : listUsers) {
				if (!userA.getID().equals(userB.getID())) {
					if (isFollow(userA.getID(), userB.getID())) {
						following++;
					}
				}
			}

			if (following < cntOfSubs) {
				cntOfSubs = following;
				theMostLonely = userA;
			}
		}

		return theMostLonely;
	}

	public static User theMostPopular() {
		User theMostPopular = null;
		int cntOfFollowers = 0;

		for (User userA : listUsers) {
			int followers = 0;
			
			for (User userB : listUsers) {
				if (!userA.getID().equals(userB.getID())) {
					if (isFollow(userB.getID(), userA.getID())) {
						followers++;
					}
				}
			}

			if (followers > cntOfFollowers) {
				cntOfFollowers = followers;
				theMostPopular = userA;
			}
		}

		return theMostPopular;
	}

	public static User theMostFriendlist() {
		User theMostFriendlist = null;
		int cntOfFriends = 0;

		for (User userA : listUsers) {
			int friends = 0;
			
			for (User userB : listUsers) {
				if (!userA.getID().equals(userB.getID())) {
					if (isFriends(userA, userB)) {
						friends++;
					}
				}
			}

			if (friends > cntOfFriends) {
				cntOfFriends = friends;
				theMostFriendlist = userA;
			}
		}

		return theMostFriendlist;
	}
	
	public static Map<String, Integer> mapOfCities() {
		Map<String, Integer> newMap = new HashMap<>();
		
		for (Message message : listMessages) {
			User user = message.getSender();
			
			String city = user.getCity();
			
			newMap.put(city, newMap.getOrDefault(city, 0) + 1);
		}
		
		return newMap;
	}
	//27 страница
}

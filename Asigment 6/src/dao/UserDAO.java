package dao;

import entity.*;
import java.util.*;
import database.*;

public class UserDAO {
	public static List<User> listOfUsers = getUsers();
	
	public static List<User> getUsers() {
		List<User> list = new ArrayList<>();
		for (int i = 0; i < Database.users.size(); i++) {
			String line = Database.users.get(i);
			String[] data = line.split("#");

			String id = data[0];
			String name = data[1];
			String city = data[2];
			String birthday = data[3].trim();

			User user = new User(id, name, city, birthday);
			list.add(user);
		}
		
		return list;
	}
	
	public static User returnUser(String id) {
		for (User user : listOfUsers) {
			if (user.getID().equals(id)) {
				return user;
			}
		}
		
		return null;
	}
	
	public static List<User> usersFrom(String city) {
		List<User> userCity = new ArrayList<User>();
		for (User user : listOfUsers) {
			if (user.getCity().equals(city)) {
				userCity.add(user);
			}
		}
		return userCity;
	}

    
	public static void printNames() {
		for (User user : listOfUsers) {
			System.out.println(user.getName());
		}
	}
	
	public static User theMostLonely() {
		User theMostLonely = null;
		int cntOfSubs = 0;

		for (User userA : listOfUsers) {
			int following = 0;
			
			for (User userB : listOfUsers) {
				if (!userA.getID().equals(userB.getID())) {
					if (SubscriptionsDAO.isFollow(userA.getID(), userB.getID())) {
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

		for (User userA : listOfUsers) {
			int followers = 0;
			
			for (User userB : listOfUsers) {
				if (!userA.getID().equals(userB.getID())) {
					if (SubscriptionsDAO.isFollow(userB.getID(), userA.getID())) {
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

		for (User userA : listOfUsers) {
			int friends = 0;
			
			for (User userB : listOfUsers) {
				if (!userA.getID().equals(userB.getID())) {
					if (SubscriptionsDAO.isFriends(userA, userB)) {
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
}
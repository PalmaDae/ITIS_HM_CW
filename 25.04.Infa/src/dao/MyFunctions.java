package dao;

import java.util.*;
import java.io.*;
import entity.*;
import database.*;

public class MyFunctions {
	public static Database dbase = new Database();
	
	public static ArrayList<User> listUsers = dbase.getUsers();  
	public static ArrayList<Subscriptions> listSubscriptions = dbase.getSubs();  
	public static ArrayList<Subscriptions> listGroups = dbase.getGroups();  
	
	public static ArrayList<User> usersFrom(String city) {
		ArrayList<User> userCity = new ArrayList<User>();
		ArrayList<User> users = listUsers;
		
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
		ArrayList<Subscriptions> subs = listSubscriptions;
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
	
	public static User theMostLonely() {
		ArrayList<User> users = listUsers;
		ArrayList<Subscriptions> subs = listSubscriptions;
		int cntOfSubs = 0;
		
		User theMostLonely = null;
		
		for (User userA : users) {
			int following = 0;
			
			for (User userB : users) {
				if (userA.getID() != userB.getID()) {
					if (isFollow(userA.getID(), userB.getID(), subs)) {
						following++;
					}
				}
			}
			
			if (following > cntOfSubs) {
				cntOfSubs = following;
				theMostLonely = userA;
			}
		}
		
		return theMostLonely;
	}
	
	public static User theMostPopular() {
		ArrayList<User> users = listUsers;
		ArrayList<Subscriptions> subs = listSubscriptions;
		
		int cntOfFollowers = 0;
		User theMostPopular = null;
		
		
		for (User userA : users) {
			int followers = 0;
			
			for (User userB : users) {
				if (userA.getID() != userB.getID()) {
					if (isFollow(userB.getID(), userA.getID(), subs)) {
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
		ArrayList<User> users = listUsers;
		ArrayList<Subscriptions> subs = listSubscriptions;
		
		int cntOfFriends = 0;
		User theMostFriendlist = null;
		
		
		for (User userA : users) {
			int friends = 0;
			
			for (User userB : users) {
				if (userA.getID() != userB.getID()) {
					if (isFriends(userA, userB, subs)) {
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
	
	public static void firstStudent(ArrayList<User> list) {
		
	}
	
	//27 страница
}
package dao;

import entity.*;
import java.util.*;
import database.*;

public class SubscriptionsDAO {
	public static List<Subscriptions> listOfSubs = getSubs();
	
	public static List<Subscriptions> getSubs() {
		List<Subscriptions> list = new ArrayList<>();
		
		for (String line : Database.subs) {
			String[] data = line.split("#");

			String who = data[0];
			String onWhom = data[1].trim();
			
			Subscriptions subscription = new Subscriptions(UserDAO.returnUser(who), UserDAO.returnUser(onWhom));
			list.add(subscription);
		}
		
		return list;
	}
	
	public static boolean isFollow(String who, String onWhom) {
		for (Subscriptions sub : getSubs()) {
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
		List<User> users = UserDAO.usersFrom(city);
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
	
	
}
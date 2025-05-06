package dao;

import entity.*;
import java.util.*;
import database.*;

public class SubscriptionsDAO {
	public static List<String> listOfSubs = Database.subs;
	
	public static List<Subscriptions> getSubs() {
		List<Subscriptions> list = new ArrayList<>();
		
		for (String line : listOfSubs) {
			String[] data = line.split("#");

			String who = data[0];
			String onWhom = data[1];
			
			Subscriptions subscription = new Subscriptions(UserDAO.returnUser(who), UserDAO.returnUser(onWhom));
			list.add(subscription);
		}
		
		return list;
	}
}
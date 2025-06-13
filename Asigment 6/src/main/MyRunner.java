package main;

import java.util.*;
import entity.*;
import database.*;
import dao.*;

public class MyRunner {
	public static void main(String[] args) {
		
		
		List<User> list = UserDAO.getUsers();
		
		
		List<User> firstTask = UserDAO.usersFrom("Казань");
		
		//Проверка пользователей из казани
		for (User user : firstTask) {
			System.out.println(user);
		}
		
		
		
		//Пара друзей из Казани
		ArrayList<String> secondTask = SubscriptionsDAO.friendsFrom("Казань");
		
		for (String user : secondTask) {
			System.out.println(user);
		}
		
		Map<String, Integer> map = MessageDAO.mapOfCities();
		
		//Map: Город - сообщения людей из этого города
		for (Map.Entry<String, Integer> entity : map.entrySet()) {
			String key = entity.getKey();
			Integer value = entity.getValue();
			
			System.out.println(key + " -> " + value);
		}
		
		ArrayList<Group> thirdTask = GroupDAO.topKGroups(5);
		
		//Топ k групп по кол-ву участников
		for (Group grp : thirdTask) {
			System.out.println(grp);
		}
		
		
		//- найти пользователей, у которых: наибольшее число подписок, подписчиков, друзей.
		System.out.println(UserDAO.theMostLonely());
		System.out.println(UserDAO.theMostPopular());
		System.out.println(UserDAO.theMostFriendlist());
		
		// List<Subscriptions> list2 = SubscriptionsDAO.getSubs();
		
		// for (Subscriptions sub : list2) {
			// System.out.println(sub);
		// }
		
		// String result = list.stream().map(x -> x.getName()).reduce((s1,s2) -> s1.compareTo(s2) < 0 ? s1 : s2).orElse("");
		
		// System.out.println(result);
	}
}
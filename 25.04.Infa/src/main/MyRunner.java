package main;

import java.util.*;
import entity.*;
import database.*;
import dao.*;

public class MyRunner {
	public static void main(String[] args) {
		List<User> list = UserDAO.getUsers();
		
		for (User user : list) {
			System.out.println(user);
		}
		
		List<Subscriptions> list2 = SubscriptionsDAO.getSubs();
		
		for (Subscriptions sub : list2) {
			System.out.println(sub);
		}
		
		String result = list.stream().map(x -> x.getName()).reduce((s1,s2) -> s1.compareTo(s2) < 0 ? s1 : s2).orElse("");
		
		System.out.println(result);
		
		String answ = list.stream().map(x -> )
	}
}
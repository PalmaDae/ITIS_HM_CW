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
	}
}
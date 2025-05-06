package dao;

import entity.*;
import java.util.*;
import database.*;

public class UserDAO {
	public static List<String> listOfUsers = Database.users;
	
	public static List<User> getUsers() {
		List<User> list = new ArrayList<>();
		for (int i = 0; i < listOfUsers.size(); i++) {
			String line = listOfUsers.get(i);
			String[] data = line.split("#");

			String id = data[0];
			String name = data[1];
			String city = data[2];
			String birthday = data[3];

			User user = new User(id, name, city, birthday);
			list.add(user);
		}
		
		return list;
	}
	
	public static User returnUser(String id) {
		for (User user : getUsers()) {
			if (user.getID().equals(id)) {
				return user;
			}
		}
		return null;
	}
}
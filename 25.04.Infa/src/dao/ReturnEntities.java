package dao;

import entity.*;
import database.*;
import java.util.ArrayList;

public class ReturnEntities {
	public static Database dbase = new Database();
	public static ArrayList<User> listUsers = dbase.getUsers();  
	public static ArrayList<Group> listGroups = dbase.getGroups();
	
	public static User returnUser(String id) {
		ArrayList<User> listOfUser = listUsers;
		
		
		for (User user : listOfUser) {
			if (user.getID() == id) {
				return user;
			}
		}
		
		return null;
	}
	
	public static Group returnGroup(String id) {
		for (Group group : listGroups) {
			if (group.getId() == id) {
				return group;
			}
		}
		
		return null;
	}
}
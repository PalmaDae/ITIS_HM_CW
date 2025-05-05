package dao;

import entity.*;
import database.*;
import java.util.ArrayList;

public class ReturnEntities {
	private static Database dbase;
	public static ArrayList<User> listUsers = dbase.getUsers();  
	public static ArrayList<Group> listGroups = dbase.getGroups();
	
	public static User returnUser(String id) {
		ArrayList<User> listOfUser = listUsers;
		
		
		for (User user : listOfUser) {
			if (user.getID().equals(id)	) {
				return user;
			}
		}
		
		return null;
	}
	
	public static Group returnGroup(String id) {
		for (Group group : listGroups) {
			if (group.getId().equals(id)) {
				return group;
			}
		}
		
		return null;
	}
}
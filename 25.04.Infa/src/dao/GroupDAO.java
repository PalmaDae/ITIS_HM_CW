package dao;

import entity.*;
import java.util.*;
import database.*;

public class GroupDAO {
	public static List<String> listOfGroups = Database.groups;
	
	public static List<Group> getGroups() {
		List<Group> list = new ArrayList<>();
		
		for (String line : listOfGroups) {
			String[] data = line.split("#");

			String id = data[0];
			String name = data[1];
			String city = data[2].trim();

			Group group = new Group(id, name, city);
			list.add(group);
		}
		
		return list;
	}
	
	public Group returnGroup(String id) {
		for (Group group : getGroups()) {
			if (group.getId().equals(id)) {
				return group;
			}
		}
		return null;
	}
}
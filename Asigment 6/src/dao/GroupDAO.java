package dao;

import entity.*;
import java.util.*;
import database.*;

public class GroupDAO {
	public static List<String> listOfGroups = getGroups();
	
	public static List<Group> getGroups() {
		List<Group> list = new ArrayList<>();
		
		for (String line : Database.groups) {
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
	
	private static Group findMaxGroup(Map<Group, Integer> groupCount) {
		Group maxGroup = null;
		int maxCount = 0;
		
		for (Map.Entry<Group, Integer> entry : groupCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxGroup = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		
		return maxGroup;
	}
	
	public static ArrayList<Group> topKGroups(int k) {
		Map<Group, Integer> groupCount = MemberDAO.countGroupMembers();
		ArrayList<Group> result = new ArrayList<>();
		
		for (int i = 0; i < k; i++) {
			Group maxGroup = findMaxGroup(groupCount);
			result.add(maxGroup);
			groupCount.remove(maxGroup);
		}
		
		return result;
	}
}
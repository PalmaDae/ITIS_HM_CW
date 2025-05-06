package dao;

import java.util.*;
import entity.*;
import database.*;

public class MyFunctions {
	private static Database dbase = new Database();
	public static ArrayList<User> listUsers = dbase.getUsers();  
	private static ArrayList<Subscriptions> listSubscriptions = dbase.getSubs();  
	private static ArrayList<Group> listGroups = dbase.getGroups();  
	private static ArrayList<Message> listMessages = dbase.getMessages();
	private static ArrayList<Member> listOfMembers = dbase.getMembers();
	
	public static Map<String, Integer> mapOfCities() {
		Map<String, Integer> newMap = new HashMap<>();
		
		for (Message message : listMessages) {
			User user = message.getSender();
			
			String city = user.getCity();
			
			newMap.put(city, newMap.getOrDefault(city, 0) + 1);
		}
		
		return newMap;
	}
	
	private static Map<Group, Integer> countGroupMembers() {
		Map<Group, Integer> groupCount = new HashMap<>();
		
		for (Member member : listOfMembers) {
			Group group = member.getGroup();
			groupCount.put(group, groupCount.getOrDefault(group, 0) + 1);
		}
		
		return groupCount;
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
		Map<Group, Integer> groupCount = countGroupMembers();
		ArrayList<Group> result = new ArrayList<>();
		
		for (int i = 0; i < k; i++) {
			Group maxGroup = findMaxGroup(groupCount);
			result.add(maxGroup);
			groupCount.remove(maxGroup);
		}
		
		return result;
	}
	
	public static Map<String, Integer> getGroupStats(String idOfGroupd) {
		Map<String, Integer> newMap = new HashMap<>();
		
		for (Member member : listOfMembers) {
			if (member.getGroup().getId().equals(idOfGroupd)) {
				User user = member.getUser();
				String city = user.getCity();
				
				newMap.put(city, newMap.getOrDefault(city, 0) + 1);
			}
		}
		
		return newMap;
	}
	//27 страница
}

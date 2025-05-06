package dao;

import entity.*;
import java.util.*;
import database.*;

public class MemberDAO {
	public static List<Member> listOfMembers = getMembers();
	
	public static List<Member> getMembers() {
		List<Member> list = new ArrayList<>();
		
		for (String line : Database.members) {
			String[] data = line.split("#");

			String userID = data[0];
			String groupID = data[1].trim();

			Member member = new Member(UserDAO.returnUser(userID), GroupDAO.returnGroup(groupID));
			list.add(member);
		}
		
		return list;
	}
	
	private static Map<Group, Integer> countGroupMembers() {
		Map<Group, Integer> groupCount = new HashMap<>();
		
		for (Member member : listOfMembers) {
			Group group = member.getGroup();
			groupCount.put(group, groupCount.getOrDefault(group, 0) + 1);
		}
		
		return groupCount;
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
}
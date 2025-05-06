package dao;

import entity.*;
import java.util.*;
import database.*;

public class MemberDAO {
	public static List<String> listOfMembers = Database.members;
	
	public static List<Member> getMembers() {
		List<Member> list = new ArrayList<>();
		
		for (String line : listOfMembers) {
			String[] data = line.split("#");

			String userID = data[0];
			String groupID = data[1].trim();

			Member member = new Member(UserDAO.returnUser(userID), GroupDAO.returnGroup(groupID));
			list.add(member);
		}
		
		return list;
	}
}
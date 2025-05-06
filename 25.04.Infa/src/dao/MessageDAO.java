package dao;

import entity.*;
import java.util.*;
import database.*;

public class MessageDAO {
	public static List<String> listOfMessages = getMessages();
	
	public static List<Message> getMessages() {
		List<Message> list = new ArrayList<>();
		
		for (String line : Database.messages) {
		String[] data = line.split("#");

			String sender = data[0];
			String receiver = data[1];
			String text = data[2];
			String setOn = data[3];
			String opened = data[4].trim();

			Message message = new Message(UserDAO.returnUser(sender), UserDAO.returnUser(receiver), text, Boolean.parseBoolean(setOn), Boolean.parseBoolean(opened));
			list.add(message);
		}
		
		return list;
	}
	
	public static Map<String, Integer> mapOfCities() {
		Map<String, Integer> newMap = new HashMap<>();
		
		for (Message message : listOfMessages) {
			User user = message.getSender();
			
			String city = user.getCity();
			
			newMap.put(city, newMap.getOrDefault(city, 0) + 1);
		}
		
		return newMap;
	}
}
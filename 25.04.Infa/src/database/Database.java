package database;

import java.util.*;
import java.io.*;
import entity.*;

public class Database {
	public ArrayList<User> listOfUsers = listOfUsers();
	public ArrayList<Subscriptions> listOfSubs = listOfSubcribers();
	
	public Database() {
		
	}
	
	public static ArrayList<User> listOfUsers() {
		ArrayList<User> list = new ArrayList<User>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\25.04Infa\\data\\Users.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] data = line.split("#");
				String id = data[0];
				String name = data[1];
				String city = data[2];
				String birthday = data[3];

				User user = new User(id, name, city, birthday);
				list.add(user);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
		
		return list;
	}
	
	public static ArrayList<Subscriptions> listOfSubcribers() {
		ArrayList<Subscriptions> list = new ArrayList<Subscriptions>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\25.04Infa\\data\\SubscribeId.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] data = line.split("#");
				String who = data[0];
				String onWhom = data[1];

				Subscriptions subscriber = new Subscriptions(who, onWhom);
				list.add(subscriber);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
		
		return list;
	}
	
	public ArrayList<User> getUsers() {
		return listOfUsers;
	}
	
	public ArrayList<Subscriptions> getSubs() {
		return listOfSubs;
	}
}
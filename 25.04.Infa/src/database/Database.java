package database;

import java.util.*;
import java.io.*;
import entity.*;

public class Database {
	public ArrayList<User> listOfUsers;
	public ArrayList<Subscriptions> listOfSubs;
	public ArrayList<Group> listOfGroups;
	
	public Database() {
        try {
            listOfUsers = listOfUsers();
            listOfSubs = listOfSubcribers();
			listOfGroups = listOfGroups();
        } catch (IOException e) {
            System.out.println("");
        }
	}
	
	public static ArrayList<Group> listOfGroups() throws IOException {
		ArrayList<Group> list = new ArrayList<Group>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04Infa\\data\\Groups.txt"));
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");
			
			String id = data[0];
			String name = data[1];
			String city = data[2];
			
			Group group = new Group(id, name, city);
			list.add(group);
		}
		scanner.close();
		
		return list;
	}
	
	public static ArrayList<User> listOfUsers() throws IOException {
		ArrayList<User> list = new ArrayList<User>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04Infa\\data\\Users.txt"));
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");
			
			String id = data[0];
			String name = data[1];
			String city = data[2];
			String birthday = data[3];

			User user = new User(id, name, city, birthday);
			list.add(user);
		}
		scanner.close();
		
		return list;
	}
	
	public static ArrayList<Subscriptions> listOfSubcribers() throws IOException{
		ArrayList<Subscriptions> list = new ArrayList<Subscriptions>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04Infa\\data\\SubscribeId.txt"));
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");
			
			String who = data[0];
			String onWhom = data[1];

			Subscriptions subscriber = new Subscriptions(who, onWhom);
			list.add(subscriber);
		}
		scanner.close();

		
		return list;
	}
	
	public ArrayList<User> getUsers() {
		return listOfUsers;
	}
	
	public ArrayList<Subscriptions> getSubs() {
		return listOfSubs;
	}
	
	public ArrayList<Group> getGroups() {
		return listOfGroups;
	}
}
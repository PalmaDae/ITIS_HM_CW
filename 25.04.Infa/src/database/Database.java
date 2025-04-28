package database;

import java.util.*;
import java.io.*;
import entity.*;
import dao.*;

public class Database {
	public ArrayList<User> listOfUsers;
	public ArrayList<Subscriptions> listOfSubs;
	public ArrayList<Group> listOfGroups;
	public ArrayList<Message> listOfMessages;
	public ArrayList<Member> listOfMembers;
	
	public Database() {
        try {
            listOfUsers = listOfUsers();
            listOfSubs = listOfSubcribers();
			listOfGroups = listOfGroups();
			listOfMessages = listOfMessages();
			listOfMembers = listOfMembers();
        } catch (IOException e) {
            System.out.println("");
        }
	}
	
	public static ArrayList<Message> listOfMessages() throws IOException {
		ArrayList<Message> list = new ArrayList<Message>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04Infa\\data\\Messages.txt"));
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");
			
			String sender = data[0];
			String receiver = data[1];
			String text = data[2];
			String setOn = data[3];
			String opened = data[4];
			
			Message message = new Message(ReturnEntities.returnUser(sender), ReturnEntities.returnUser(receiver), text, Boolean.parseBoolean(setOn), Boolean.parseBoolean(opened));
			list.add(message);
		}
		scanner.close();
		
		return list;
	}
	
	public static ArrayList<Member> listOfMembers() throws IOException {
		ArrayList<Member> list = new ArrayList<Member>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04Infa\\data\\Members.txt"));
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");
			
			String userID = data[0];
			String groupID = data[1];
			
			Member member = new Member(ReturnEntities.returnUser(userID) , ReturnEntities.returnGroup(groupID));
			list.add(member);
		}
		scanner.close();
		
		return  list;
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

			Subscriptions subscriber = new Subscriptions(ReturnEntities.returnUser(who), ReturnEntities.returnUser(onWhom));
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
	
	public ArrayList<Message> getMessages() {
		return listOfMessages;
	}
	
	public ArrayList<Member> getMembers() {
		return listOfMembers;
	}
}
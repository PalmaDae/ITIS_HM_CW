package database;

import entity.*;
import java.util.*;
import java.io.*;

public class Database {
	private ArrayList<User> listOfUsers;
	private ArrayList<Subscriptions> listOfSubs;
	private ArrayList<Group> listOfGroups;
	private ArrayList<Message> listOfMessages;
	private ArrayList<Member> listOfMembers;

	public Database() {
		try {
			listOfUsers = loadUsers();
			listOfSubs = loadSubscriptions();
			listOfGroups = loadGroups();
			listOfMessages = loadMessages();
			listOfMembers = loadMembers();
		} catch (IOException e) {
			System.out.println("");
		}
	}

	// Методы для загрузки данных
	private ArrayList<User> loadUsers() throws IOException {
		ArrayList<User> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\Users.txt"));

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

	private ArrayList<Subscriptions> loadSubscriptions() throws IOException {
		ArrayList<Subscriptions> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\SubscribeId.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");

			String who = data[0];
			String onWhom = data[1];

			Subscriptions subscription = new Subscriptions(returnUser(who), returnUser(onWhom));
			list.add(subscription);
		}
		scanner.close();
		return list;
	}

	private ArrayList<Group> loadGroups() throws IOException {
		ArrayList<Group> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\Groups.txt"));

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

	private ArrayList<Message> loadMessages() throws IOException {
		ArrayList<Message> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\Messages.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");

			String sender = data[0];
			String receiver = data[1];
			String text = data[2];
			String setOn = data[3];
			String opened = data[4];

			Message message = new Message(returnUser(sender), returnUser(receiver), text, Boolean.parseBoolean(setOn), Boolean.parseBoolean(opened));
			list.add(message);
		}
		scanner.close();
		return list;
	}

	private ArrayList<Member> loadMembers() throws IOException {
		ArrayList<Member> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\Member.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");

			String userID = data[0];
			String groupID = data[1];

			Member member = new Member(returnUser(userID), returnGroup(groupID));
			list.add(member);
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

	public User returnUser(String id) {
		for (User user : listOfUsers) {
			if (user.getID().equals(id)) {
				return user;
			}
		}
		return null;
	}

	
	public Group returnGroup(String id) {
		for (Group group : listOfGroups) {
			if (group.getId().equals(id)) {
				return group;
			}
		}
		return null;
	}
}

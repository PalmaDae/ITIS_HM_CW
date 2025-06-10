package database;

import java.util.*;
import java.io.*;

public class Database {
	public static List<String> users;
	public static List<String> subs;
	public static List<String> groups;
	public static List<String> messages;
	public static List<String> members;
	
	static {
		try {
			users = loadUsers();
			subs = loadSubscriptions();
			groups = loadGroups();
			messages = loadMessages();
			members = loadMembers();
		} catch (IOException e) {
			System.out.println("");
		}
	}
	
	private static List<String> loadUsers() throws IOException {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\Users.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			list.add(line);
		}
		scanner.close();
		return list;
	}

	private static List<String> loadSubscriptions() throws IOException {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\SubscribeId.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			list.add(line);
		}
		scanner.close();
		return list;
	}

	private static List<String> loadGroups() throws IOException {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\Groups.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			list.add(line);
		}
		scanner.close();
		return list;
	}

	private static List<String> loadMessages() throws IOException {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\Messages.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			list.add(line);
		}
		scanner.close();
		return list;
	}

	private static List<String> loadMembers() throws IOException {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04.Infa\\data\\Member.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			list.add(line);
		}
		scanner.close();
		return list;
	}
}

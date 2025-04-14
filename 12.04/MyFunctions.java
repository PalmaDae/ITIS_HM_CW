import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.Comparator;

public class MyFunctions {
	public static ArrayList<User> listOfUsers() {
		ArrayList<User> list = new ArrayList<User>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\12.04\\ListOfScores.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] aga = line.split("#");
				String score = aga[0];
				String name = aga[1];

				User user = new User(name, score);
				list.add(user);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
		
		return list;
	}
	
	public static User returnUserPoName(String name) {
		ArrayList<User> users = listOfUsers();
		for (User user : users) {
			if (user.getName().equals(name)) {
				return user;
			}
		}
		
		return null;
	}
	
	public static ArrayList<String> listOfNames() {
		ArrayList<User> users = listOfUsers();
		ArrayList<String> names = new ArrayList<String>();
		
		for (User user : users) {
			names.add(user.getName());
		}
		
		return names;
	}
	
	public static ArrayList<String> allStats(ArrayList<String> list) {
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (i == j) {
					continue;
				}
				
				result.add(coincidentProcent(list.get(i), list.get(j)));
			}
		}
		
		return result;
	}
	
	public static ArrayList<String> allStatsPoName(ArrayList<String> list, String name) {
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(name)) {
				result.add(coincidentProcent(name, list.get(i)));
			}
		}
		
		return result;
	}
	
	public static String coincidentProcent(String firstUserName, String secondUserName) {
		User firstUser = returnUserPoName(firstUserName);
		User secondUser = returnUserPoName(secondUserName);
		
		String firstScore = firstUser.getScore();
		String secondScore = secondUser.getScore();
		
		int length = firstScore.length();
		
		int totalFirstPlus = 0;
		int totalSecondPlus = 0;
		int coincidentPlus = 0;
		
		for (int i = 0; i < length; i++) {
			if (firstScore.charAt(i) == '+') {
				totalFirstPlus++;
			}
			
			if (secondScore.charAt(i) == '+') {
				totalSecondPlus++;
			}
			
			if (firstScore.charAt(i) == '+' && secondScore.charAt(i) == '+') {
				coincidentPlus++;
			}
		}
		
		double result = ((double) 2*coincidentPlus / (totalFirstPlus + totalSecondPlus)) * 100;
		
		int secondResult = (int) result;
		
		String answear = secondResult + "% " + firstUserName + secondUserName;
		
		return answear;
	}
}
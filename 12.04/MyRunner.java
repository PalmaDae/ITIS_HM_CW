import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class MyRunner {
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
			
		// for (User user : list) {
			// System.out.println(user);
		// }
		
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
	
	public static void coincidentProcent(String firstUserName, String secondUserName) {
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
		
		// for (int i = 0; i < users.size(); i++) {
			// if (users[i].getName() == firstUser) {
				// firstUserIndex = i;
			// }
			
			// if (users[i].getName() == secondUser) {
				// secondUserIndex = i;
			// }
		// }
		
		double result = ((double) 2*coincidentPlus / (totalFirstPlus + totalSecondPlus)) * 100;
		
		System.out.println(result + "%");
	}
	
	public static void main(String[] args) {
		coincidentProcent("Frol", "Uzbek");
	}
}
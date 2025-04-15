import java.util.*;
import java.io.*;

public class MyFunctions {
	public static ArrayList<User> listOfUsers() {
		ArrayList<User> list = new ArrayList<User>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\15.04\\Users.txt"));
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
	
	public static ArrayList<String> usersFrom(String city) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<User> users = listOfUsers();
		
		for (User user : users) {
			if (user.getCity().equals(city)) {
				names.add(user.getName());
			}
		}
		
		return names;
	}
	
	public static void main(String[] args) {
		ArrayList<String> names = usersFrom("Казань");
		
		for (String str : names) {
			System.out.println(str);
		}
	}
	
	
}
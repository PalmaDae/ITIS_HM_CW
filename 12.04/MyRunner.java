import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class MyRunner {
	public static void main(String[] args) {
		ArrayList<User> arrayOfUsers = new ArrayList<User>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\12.04\\ListOfScores.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] aga = line.split("#");
				String score = aga[0];
				String name = aga[1];

				User user = new User(name, score);
				arrayOfUsers.add(user);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
			
		for (User user : arrayOfUsers) {
			System.out.println(user);
		}
	}
}
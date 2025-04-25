import java.util.*;
import java.io.*;

public class OrderAnalysis {
	public static ArrayList<User> listOfUsers() {
		ArrayList<User> list = new ArrayList<User>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\25.04\\ListOfUsers.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] data = line.split("#");
				String id = data[0];
				String name = data[1];

				User user = new User(Integer.parseInt(id), name);
				list.add(user);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
		
		return list;
	}
	
	public static ArrayList<Product> listOfProducts() {
		ArrayList<Product> list = new ArrayList<Product>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\25.04\\ListOfProducts.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] data = line.split("#");
				String id = data[0];
				String name = data[1];

				Product product = new Product(Integer.parseInt(id), name);
				list.add(product);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
		
		return list;
	}
	
	public static User returnUser(int id) {
		ArrayList<User> listOfUser = listOfUsers();
		
		
		for (User user : listOfUser) {
			if (user.getId() == id) {
				return user;
			}
		}
		
	}
	
	
	
	public static ArrayList<Order> listOfOrders() {
		ArrayList<Order> list = new ArrayList<Order>();
		ArrayList<User> listOfUser = listOfUsers();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\25.04\\ListOfOrders.txt"));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] data = line.split("#");
				String id = data[0];
				String userId = data[1];
				String products = data[2];

				Order product = new Order(Integer.parseInt(id), returnUser(Integer.parseInt(id)), );
				list.add(product);
			}

			}	
		catch (IOException e) {
			System.out.println("");
		}
		
		return list;
	}
}
import java.util.*;
import java.io.*;

public class OrderAnalysis {
	public static ArrayList<User> listOfUsers() {
		ArrayList<User> list = new ArrayList<User>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04\\ListOfUsers.txt"));
		
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");
			String id = data[0];
			String name = data[1];

			User user = new User(Integer.parseInt(id), name);
			list.add(user);

		}
		
		return list;
	}
	
	public static ArrayList<Product> listOfProducts() {
		ArrayList<Product> list = new ArrayList<Product>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04\\ListOfProducts.txt"));
		
		while (scanner.hasNext()) {
			Scanner line = scanner.nextLine();
			String[] data = line.split("#");
			String id = data[0];
			String name = data[1];

			Product product = new Product(Integer.parseInt(id), name);
			list.add(product);
		}	
		
		return list;
	}
	
	public static User returnUser(int id) {
		ArrayList<User> listOfUser = listOfUsers();
		Scanner scanner = new Scanner()
		
		for (User user : listOfUser) {
			if (user.getId() == id) {
				return user;
			}
		}
		
	}
	
	
	
	public static ArrayList<Order> listOfOrders() {
		ArrayList<Order> list = new ArrayList<Order>();
		ArrayList<User> listOfUser = listOfUsers();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04\\ListOfOrders.txt")); 
			
		while () {
			String[] data = line.split("#");
			String id = data[0];
			String userId = data[1];
			String products = data[2];

			Order product = new Order(Integer.parseInt(id), returnUser(Integer.parseInt(id)), );
			list.add(product);
		}
		
		return list;
	}
}
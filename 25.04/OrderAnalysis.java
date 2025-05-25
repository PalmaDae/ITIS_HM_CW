import java.util.*;
import java.io.*;

public class OrderAnalysis {
	public static List<User> listOfUsers = listOfUsers();
	
	public static ArrayList<User> listOfUsers() {
		try {
			ArrayList<User> list = new ArrayList<User>();
			Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04\\ListOfUsers.txt"));
			
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] data = line.split("#");
				String id = data[0];
				String name = data[1].trim();

				User user = new User(Integer.parseInt(id), name);
				list.add(user);
			}
			
			scanner.close();
			
			return list;
		} catch(IOException e) {
			System.out.println("");
			
			return null;
		}
	}
	
	public static ArrayList<Product> listOfProducts() throws IOException{
		ArrayList<Product> list = new ArrayList<Product>();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04\\ListOfProducts.txt"));
		
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");
			String id = data[0];
			String name = data[1].trim();

			Product product = new Product(Integer.parseInt(id), name);
			list.add(product);
		}	
		
		scanner.close();
		
		return list;
	}
	
	public static User returnUser(int id) throws IOException{
		for (User user : listOfUsers) {
			if (user.getID() == id) {
				return user;
			}
		}
		
		return null;
	}
	
	public static ArrayList<Product> returnProducts(String str) throws IOException{
		ArrayList<Product> list = new ArrayList<Product>();
		ArrayList<Product> listOfProduct = listOfProducts();
		String[] ids = str.split(",");

		for (String id : ids) {
			for (Product product : listOfProduct) {
				if (product.id == Integer.parseInt(id)) {
					list.add(product);
				}
			}
		}
		
		return list;
	}
	
	public static ArrayList<Order> listOfOrders() throws IOException{
		ArrayList<Order> list = new ArrayList<Order>();
		ArrayList<User> listOfUser = listOfUsers();
		Scanner scanner = new Scanner(new File("C:\\Java_Projects\\25.04\\ListOfOrders.txt")); 
		
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] data = line.split("#");
			String id = data[0];
			String userId = data[1].trim();
			String products = data[2].trim();

			Order product = new Order(Integer.parseInt(id), returnUser(Integer.parseInt(id)), returnProducts(products));
			list.add(product);
		}
		
		scanner.close();
		
		return list;
	}
	
	public static void task1(ArrayList<Order> list) {
		Set<Product> products = new HashSet<Product>();
		
		for (Order order : list) {
			products.addAll(order.products);
		}
		
		for (Product product : products) {
			System.out.println(product);
		}
	}
	
	public static void task2(ArrayList<Order> list) {
		Map<Product, Integer> myMap = new HashMap<Product, Integer>();

		for (Order order : list) {
			for (Product product : order.products) {
				myMap.put(product, myMap.getOrDefault(product, 0) + 1);
			}
		}

		for (Map.Entry<Product, Integer> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	// public static void task3(ArrayList<Order> list) {
		// Map<Product, Set<User>> myMap = new HashMap<Product, Set<User>>();
		
		// for (Order order : list) {
			// for (Product product : order.products) {
				// Set<User> setOfUsers = new HashSet<User>();
				// setOfUsers.add(order.user);
			// }
		// }
	// }
}
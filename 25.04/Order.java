import java.util.List;

public class Order {
	public int id;
	public User user;
	public List<Product> products;
	
	public Order(int id, User user, List<Product> products) {
		this.id = id;
		this.user = user;
		this.products = products;
	}
	
	@Override
	public String toString() {
		return this.user.name;
	}
}
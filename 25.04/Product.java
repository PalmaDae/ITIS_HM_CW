public class Product {
	public int id;
	public String name;
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object element) {
		if (this == element) {
			return true;
		}
		if (element == null || getClass() != element.getClass()) {
			return false;
		}
		Product product = (Product) element;
		return id == product.id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
public class User {
	public int id;
	public String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getID() {
		return id;
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
		User user = (User) element;
		return id == user.id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
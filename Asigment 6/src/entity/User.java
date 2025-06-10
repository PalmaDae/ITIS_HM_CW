package entity;

public class User implements Comparable<User>{
	public String id;
	public String name;
	public String city;
	public String birthday;
	
	public User(String id, String name, String city, String birthday) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.birthday = birthday;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return id;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
    public int compareTo(User other) {
		int nameCompare = this.name.compareTo(other.name);
		
        if (nameCompare != 0) {
            return nameCompare;
        }
        
        return this.name.compareTo(other.name);
    }
}
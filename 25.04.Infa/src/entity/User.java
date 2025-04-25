package entity;

public class User {
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
}
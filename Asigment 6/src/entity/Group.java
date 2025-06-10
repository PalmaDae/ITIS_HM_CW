package entity;

public class Group {
	public String id;
	public String name;
	public String city;
	
	public Group(String id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
package entity;

public class Member {
	public User user;
	public Group group;
	
	public Member(User user, Group group) {
		this.user = user;
		this.group = group;
	}
}
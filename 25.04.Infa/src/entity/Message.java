package entity;

public class Message {
	public User sender;
	public User receiver;
	public String text;
	public boolean sentOn;
	public boolean opened;
	
	public Message(User sender, User receiver, String text, boolean sentOn, boolean opened) {
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
		this.sentOn = sentOn;
		this.opened = opened;
	}
	
	public User getSender() {
		return sender;
	}
}